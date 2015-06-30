var express = require('express'),
	async = require('async'),
	weather = require('./weather'),
	population = require('./population'),
	location = require('./location');
	
var app = express();

// callback hell
app.get('/:zipcode', function (req, res) {
	var zipcode, city, state, temperature, people, info;
	zipcode = req.params.zipcode;
	async.parallel(
		[
			function(callback) {
				location.findLocationByZipcode(zipcode, callback);
			},
			function(callback) {
				population.findPopulationByZipcode(zipcode, callback);
			}
		],
		
		function (err, results) {
			if (err) {
				res.status(500).send('Ouch, we had a problem!');
			} else {
				var foundLocation, foundPopulation;
				if (results && results.length > 1) {
					foundLocation = results[0];
					foundPopulation = results[1];
				}
				
				if (foundLocation && foundPopulation) {
					weather.getTemperatureByLatLong(foundLocation.latitude, foundLocation.longtitude,
						function (err, foundTemperature) {
							if (err) {
								res.status(500).send('Ouch, we had a problem');
							} else {
								if (foundTemperature) {
									city = foundLocation.city;
									state = foundLocation.state;
									temperature = foundTemperature;
									people = foundPopulation;
									
									info = 'Location: ' + city + ', ' + state;
									info += ', Temperature: ' + temperature + ' F';
									info += ', Population: ' + people;
								} else {
									res.status(500).send('Ouch, we had a problem');
								}
							}
						});
				}
			}
		}	
		
	);
});

app.listen(3000);