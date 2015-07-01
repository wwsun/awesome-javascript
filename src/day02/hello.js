// var hello = function (name) {
// 	return 'Hello ' + name;
// };

var hello = function *(name) {
	yield 'Your name is ' + name; // pause
	return 'Hello ' + name;
};

// console.log(hello('weiwei'));
var gen = hello('James');
console.log(gen.next()); // { value: 'Your name is James', done: false}
console.log(gen.next()); // { value: 'Hello James', done: true}

