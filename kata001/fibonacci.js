'use strict';

/* eslint-disable no-return-assign */

// exponential - simple recursion
const fiboRecur = (n) => {
	if (n <= 2) return 1;

	const res = fiboRecur(n - 1) + fiboRecur(n - 2);

	return res;
};


console.log(fiboRecur(6), ' fiboRecur(6) - 8');


// iterative with memorization - Dynamic Programming
const fiboMemoIter = (n) => {
	const arr = [];

	arr[0] = 1;
	arr[1] = 1;

	for (let i = 2; i <= n; i++)
		arr[i] = arr[i - 1] + arr[i - 2];


	return arr[n - 1];
};


console.log(fiboMemoIter(10), ' fiboDPIter(10) - 55');

// simple iterative
const fiboIter = (n) => {
	let prev = 0;
	let curr = 1;
	let next = 1;

	for (let i = 2; i <= n; i++) {
		next = prev + curr;
		prev = curr;
		curr = next;
	}
	return next;
};


console.log(fiboIter(9), ' fiboIter(9) - 34');


// memorization + recursion - intitializing array outside of the function
const memo = [];

const fiboMemoRecur = (n) => {
	if (memo[n])
		return memo[n];

	if (n <= 2)
		return 1;

	memo[n] = fiboMemoRecur(n - 1) + fiboMemoRecur(n - 2);

	return memo[n];
};

console.log(fiboMemoRecur(7), ' fiboMemoRecur(7) - 13');


// memorization + recursion + passing arr as param
const fiboMemoRecursion = (n, mem) => {
	mem = mem || [];

	if (mem[n]) return mem[n];

	if (n <= 2) return 1;

	return mem[n] = fiboMemoRecursion(n - 1, mem) + fiboMemoRecursion(n - 2, mem);
};

console.log(fiboMemoRecursion(8), ' fiboMemoRecursion(8) - 21');
