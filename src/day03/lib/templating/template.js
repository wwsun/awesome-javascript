var koa = require('koa');
var views = require('co-views');

var app = module.exports = koa();

// setup views, appending .ejs
// when no extname is given to render()

var render = views(__dirname + '/views', {
	ext: 'ejs'
});


// dummy data
var user = {
	name: {
		first: 'Tobi',
		last: 'Holowaychuck'
	},
	species: 'ferret',
	age: 3
};

// render
app.use(function* () {
	this.body = yield render('user', {user: user});
});


app.listen(process.argv[2] || 3000);