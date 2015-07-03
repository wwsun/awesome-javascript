var koa = require('koa');
var parse = require('co-body');

var app = koa();
var port = process.argv[2] || 3000;

// initial solution
// app.use(function* (next){
// 	if (this.path === '/') {
// 		if (this.method = 'POST') {
// 			var data = yield parse(this);
// 			var name = data.name;
			
// 			if (name) {
// 				this.body = name.toUpperCase();
// 			} else {
// 				this.body = 'post body error: name requried!';
// 			}
// 		} else {
// 			this.body = 'hello koa';
// 		}
// 	} else {
// 		yield next;
// 	}
// });

// official solution
app.use(function* (next) {
	// only accept POST request
	if (this.method !== 'POST') return yield next;
	
	// max body size limit to 1kb
	var body = yield parse(this, {limit: '1kb'});
	
	// if body.name not exist, respond '400'
	if (!body.name) {
		this.throw(400, '.name required!');
	}
	
	this.body = body.name.toUpperCase();
	
});


app.listen(port);