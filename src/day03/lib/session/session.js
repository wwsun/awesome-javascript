var koa = require('koa');
var session = require('koa-session');

var app = koa();
app.keys = ['secret', 'keys'];

app.use(session(app));

// official solution
app.use(function *() {
	if (this.path === '/') {
		var n = ~~this.session.view + 1;
		this.session.view = n;
		this.body = n + " views";

	} 
});


app.listen(process.argv[2] || 3000);