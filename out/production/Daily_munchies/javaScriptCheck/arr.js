const prompt = require("prompt-sync")();


let arr = ["Mazi", "Laz", "Rose", "Uche", "Ozy"]
arr.push("Kate", "RAlph")
let gray = ["game", "jay", "wort"]

// splice is used to remove and add element from array
let name = ["Mazi", "Laz", "Rose", "Uche", "Ozy", "James"]
let nameArr = [...name]
nameArr.splice(4, 2, "Jerry", "Uzoma", "Udoka")

// flat is used to flattine out levels of array
let number = [33, 6, 77, 89, [54, 21, [56,[77], 76],67, 89], 99]
let flat = number.flat(3)



let names = ["James", "Okey", "Izu", "Mark", "Sulty"];

for(let index = 0; index < names.length; index++){

    let collect = prompt("Enter the word: ");

	if (names[index].includes(collect)) {
	console.log("Available");
	}else
    if (names[index] !== collect) {
        console.log("not available");
    }
	
	
}

// pop used to remove element from the last index
// gray.pop(1)
let namesString = arr.join("and")
let cas = arr.concat(gray)
let fiz = cas.toString()

console.log(cas)
console.log(fiz);
//console.log(arr)

// console.log(name);

console.log(nameArr);
let count = 0
nameArr.forEach((nums) => {
    console.log(nums);
    count++
})
for(let i = 0; i < nameArr.length; i++){
    console.log(nameArr[i]);
    
}
// console.log(count);
console.log(flat);

