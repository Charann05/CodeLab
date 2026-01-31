//This program performs basic array operations on an array of cities.

let cities = ["New York", "Los Angeles", "Chicago", "Miami", "Houston"];
console.log("Total number of cities : "+cities.length);

console.log("Intial Cities are : "+cities);

cities.push("San Fransisco");
console.log("Cities after performing push operation : "+cities);

cities.shift();
console.log("Cities after performing push operation : "+cities);

let index = cities.indexOf("Miami");

console.log("The index of Miami is : ",index);
