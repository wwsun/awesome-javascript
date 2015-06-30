## Iterators

Behind the scenes, this kind of iteration is making of ES6's bright and shiny
'Symbol.iterator()' method. When called,
returns a JavaScript object `{next: value, done: false|true}`

## Generators

Also called "iterator factories", they give you
special, self-defined ways to loop over stuff.

`yield` is roughly equivalent to `return` but it keeps
the state of the function instead of rerunning
everything whenever you call it.
It "remembers" its place while running so the next
time you call it, it carries on where it left off.


### References

1. http://www.sitepoint.com/ecmascript-2015-generators-and-iterators