function isPrime(number) {
	if (number < 2) return false;
	else if (number === 2) return true;

	for (var i = 2; i < number; i++) {
		if (number % i === 0) {
			return false;
			break;
		}
	}

	return true;
}

var possiblePrimes = [73, 6, 99, 19, 15];
var confirmedPrimes = [];

// traditional way
// for (var i=0; i < possiblePrimes.length; i++) {
// 	if (isPrime(possiblePrimes[i])) {
// 		console.log(possiblePrimes[i]); // print the prime
// 		confirmedPrimes.push(possiblePrimes[i]);
// 	}
// }

// es6 way
for (let i of possiblePrimes) {
	if (isPrime(i)) {
		console.log(i); // print the prime
		confirmedPrimes.push(i);
	}
}


function* getNextPrime() {
	let nextNumber = 2;
	
	while(true) {
		if (isPrime(nextNumber)) {
			yield nextNumber;
		}
		nextNumber++;
	}
}

var nextPrime = getNextPrime();

console.log(nextPrime.next()); //{value: 2, done: false}
console.log(nextPrime.next()); //{value: 3, done: false}
console.log(nextPrime.next()); //{value: 5, done: false}
console.log(nextPrime.next()); //{value: 7, done: false}
console.log(nextPrime.next()); //{value: 11, done: false}

// run the code
// $ babel-node iterators.js