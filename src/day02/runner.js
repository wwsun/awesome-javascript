/**
 * A simple generator runner module
 * A better project is: tj/co
 */

var runner = function (gen, val) {
	var promise;
	var result = gen.next(val);
	
	if (!result.done) {
		promise = result.value;
		promise.then(function (foundVal) {
			runner(gen, foundVal);
		}, function (err) {
			gen.throw(err);
		});
	}
};

module.exports = runner;