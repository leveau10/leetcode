//https://leetcode.com/problems/return-length-of-arguments-passed/
var argumentsLength = function (...args) {
    let count = 0;
    args.forEach((element) => count++);
    return count;
  };