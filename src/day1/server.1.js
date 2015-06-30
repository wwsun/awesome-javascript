var express = require('express'),
	co = require('co'),
	weather = require('./weather'),
	population = require('./population'),
	location = require('./location');
	
var app = express();

// using ES6 generators
app.get('/:zipcode', function (req, res) {
	var zipcode, city, state, temperature, people, info;
	zipcode = req.params.zipcode;
	
	co(function *() {
		try {
			var results = yield {
				foundLocation: location.findLocationByZipcode(zipcode),
				foundPopulation: location.findPopulationByZipcode(zipcode)
			};
			
			if (results && results.foundLocation && results.foundPopulation) {
				var foundTemperature = yield weather.getTemperatureByLatLong(results.foundLocation.latitude, results.foundLocation.longtitude);
				city = results.foundLocation.city;
				state = results.foundLocation.state;
				temperature = foundTemperature;
				people = results.foundPopulation;
				
				info = 'Location: ' + city + ', ' + state;
				info += ', Temperature: ' + temperature + ' F';
				info += ', Population: ' + people;
			} else {
				res.status(500).send('Ouch, we had a problem!');
			}
			
		} catch(err) {
			res.status(500).send('Ouch, we had a problem!');
		}
	})();
});

app.listen(3000);