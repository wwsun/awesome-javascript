'use strict';

/**
 * 和函数不同的是，类的声明不会被提升（其实类也是函数的hack）
 *  所以也有类声明、类表达式的概念
 *  ES6的类支持`super`, `constructor`, `get`, `set`, `static`等关键字
 *  可以使用`extends`关键字实现继承
 */

class Rectangle {

  // 构造器，一个类只能有一个，用于类的实例化
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }

  get color() {
    return this.color;
  }

  set color(c) {
    this.color = c;
  }

  get dimensions() {
    return "height: " + this.height + ", width: " + this.width;
  }

  // 静态方法
  // 无需对类进行实例化，使用类名即可访问的方法
  // 静态方法常被用于作为工具函数
  static area(rectangle) {
    return rectangle.width * rectangle.height;
  }
}

// 使用extends关键字创建子类
// super关键字可以用来调用其父类的构造器或者类方法
class Square extends Rectangle {
  constructor(width) {
    super(width, width);
  }
}

const s = new Square(10);
console.log(s.width); // 10
console.log(s.dimensions); // height: 10, width: 10
console.log(Rectangle.area(s)); // 100