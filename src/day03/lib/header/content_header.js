var koa = require('koa');

var app = koa();
var port = process.argv[2] || 3000;

// initial version
// app.use(function*(next) {
// 	if (this.request.is('application/json')) {
// 		this.body = { message: 'hi!'};
// 	} else {
// 		this.body = "ok";
// 	}
	
// 	return yield next;
// });


// official version
app.use(function* () {
	this.body = this.request.is('json') ?
		{message: 'hi!'} : 'ok';
});

app.listen(port);