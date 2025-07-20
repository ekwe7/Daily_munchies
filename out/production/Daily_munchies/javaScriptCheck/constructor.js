// constructor

function Book (tittle, author, year) {
    this.tittle = tittle,
    this.author = author,
    this.year = year

    this.getSummary = function () {
        return `${tittle} was written by ${author} in ${year}`
    }
}

// initailize

let book1 = new Book ('Gbojom Gbo', 'Micky Eze', '2014');
let  book2 = new Book ('Eloquent JavaScript', 'Ekpe Kelvin', '2016')

// console.log(Book);

console.log(book1.getSummary());
console.log(book2.getSummary());

