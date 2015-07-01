var weather = require('./weather'),
	runner = require('./runner');

var findTemperatures = function *() {
	var result;
	result = yield weather.getTemperatureByLocation('San Francisco, CA');
	console.log(result);
	
	result = yield weather.getTemperatureByLocation('New York, NY');
	console.log(result);
	
	result = yield weather.getTemperatureByLocation('Seattle, WA');
	console.log(result);
};

runner(findTemperatures());