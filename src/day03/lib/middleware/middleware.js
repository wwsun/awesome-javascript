var koa = require('koa');

var app = koa();
var port = process.argv[2] || 3000;

// 1
app.use(responseTime());

// 2
app.use(upperCase());

// 3
app.use(function* () {
	// set 3: respond 'hello koa'
	this.body = 'hello koa';
});

function responseTime() {
	return function* (next) {
		// step 1: record start time
		var start = Date.now();
		yield next;
		// step 5: set X-Response-Time head
		this.set('X-Response-Time', Date.now() - start);
	};
}

function upperCase() {
	return function* (next) {
		// step 2: do nothing here
		yield next;
		// step 4: convert this.body to upper case
		this.body = this.body.toUpperCase();
	};
}


app.listen(port);