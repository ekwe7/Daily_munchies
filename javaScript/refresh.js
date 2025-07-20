
// function armstrongNumber(numberCheck) {
//     let armstrongValue = 0;
//     let number = numberCheck;
//     while (number > 0) {
//         let digit = number % 10;
//         armstrongValue += digit ** 3;
//         number = Math.floor(number / 10);
//     }
//     return armstrongValue === numberCheck;
// }
// let numberCheck = 153;
// if (armstrongNumber(numberCheck)) {
// } else {
// }

// console.log(armstrongNumber(numberCheck));


let numberCheck = 154;
function armstrongNumber(numberCheck) {
    let sum = 0;
    let number = numberCheck.toString();
    let power = number.length;

    for (let index = 0; index < number.length; index++) {
        let digit = parseInt(number[index]);
        sum += digit ** power;
    }
    return sum === numberCheck;
}

if (armstrongNumber(numberCheck)) {
} else {

}
console.log(armstrongNumber(numberCheck));
    

let statement = "Welcome to Semicolon";
function findLargestWord(text) {
    let words = text.split(" ");
    let largest = "";

    for (let index = 0; index < words.length; index++) {
        if (words[index].length > largest.length) {
            largest = words[index];
        }
    }

    return largest;
}

let largestWord = findLargestWord(statement);
console.log(largestWord);

