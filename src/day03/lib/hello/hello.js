/// <reference path="../../typings/node/node.d.ts"/>
var koa = require('koa');
var app = koa();

// handlers here
app.use(handlers);

var port = process.argv[2] || 3000;

app.listen(port);


function* handlers() {
	this.body = "hello koa";
}