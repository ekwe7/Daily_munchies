// prototype

function Book(tittle, author, year) {
    this.tittle = tittle,
    this.author = author,
    this.year = year,


Book.prototype.getSummary = function() {
    return `${this.tittle} was written by ${this.author} in the year ${year}`
}

Book.prototype.revise = function (newYear) {
    let year = newYear
    book1.revised = true
    // return `this book was revised in ${year}`
}

Book.prototype.getAge = function () {
    let years = new Date().getFullYear() - this.year
    return `${tittle} is now ${years} years old`
}


}

let book1 = new Book("Gbojom Gbo", "Micky Eze", '1837')


console.log(book1.getSummary());
console.log(book1.getAge());

console.log(book1);
book1.revise("2023")
console.log(book1);



