'use strict';

// 类中还可以包括被计算后的方法名(computed method names)
// 例如：getter和setter，生成器函数等

class Rectangle {

  constructor(width, height) {
    this.width = width;
    this.height = height;
  }

  ['perimeter']() {
    return (this.width * 2) + (this.height * 2);
  }

  get ['area']() {
    return this.width * this.height;
  }

  * dimensions() {
    yield this.width;
    yield this.height;
  }
}

const r = new Rectangle(3, 5);
console.log(r.perimeter()); // 16
console.log(r.area); // 15

for (let x of r.dimensions()) {
  console.log(x);
  // 3
  // 5
}