var fs = require('fs');
var koa = require('koa');

var app = koa();

// initial version
// app.use(function*(next) {
// 	if (this.path === '/stream') {
// 		this.body = fs.createReadStream(process.argv[3]);
// 	} else if (this.path === '/json') {
// 		this.type = 'application/json; charset=utf-8';
// 		this.body = {"foo":"bar"};
// 	} else {
// 		return yield next;
// 	}
// });


// official version
app.use(function *(next) {
	if (this.path !== '/json') {
		return yield next;
	}
	this.body = { foo: 'bar'};
});

app.use(function *(next) {
	if (this.path !== '/stream') {
		return yield next;
	}
	
	this.body = fs.createReadStream(process.argv[3]);
});


var port = process.argv[2] || 3000;
app.listen(port);