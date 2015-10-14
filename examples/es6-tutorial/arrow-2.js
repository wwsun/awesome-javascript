'use strict';

/**
 * 箭向函数的格式： (<arguments>) => <return statement>
 * 一个参数的情况： (x) => x * x 或 x => x * x
 * 多个参数的情况： (x, y) => x * y
 * 没有参数的情况： () => 'blah'
 */

const numbers = [1, 2, 3, 4, 5];

// 最常见的使用场景: map or reduce
const cubed = numbers.map(number => {
  const squared = number * number;

  return squared * number;
});

console.log(cubed); // [ 1, 8, 27, 64, 125 ]