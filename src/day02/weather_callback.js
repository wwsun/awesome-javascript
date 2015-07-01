var weather = require('./weather');

weather.getTemperatureByLocation('San Francisco, CA', function (err, temp) {
	if (err) throw err;
	
	console.log(temp);
});