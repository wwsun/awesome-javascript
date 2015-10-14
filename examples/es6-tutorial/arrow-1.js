'use strict';

/**
 * 箭向函数的this是词法（作用域）绑定的：
 * 也就是说，箭向函数没有它自己的this值
 * 箭向函数的this值继承自它所处的外围作用域
 */
const a = 2;

//const multiply = function (num) {
//  return num * a;
//}.bind(this);

const multiply = num => num * a;

console.log(multiply(3));