// inheritance

function Book (tittle, author, year) {
    this.tittle = tittle,
    this.author = author,
    this.year = year,

    this.getSummary = function () {
        return `${this.tittle} was written by ${this.author} in the year ${year}`
    }
}

// constructor
function magazine (tittle, author, year, month) {
    Book.call(this, tittle, author, year);

    this.month = month;
}


// inherite prototype
magazine.prototype = Object.create(Book.prototype)

// instanciate
const meg1 = new magazine('Dietel', 'Mazi Ozy', '2022', 'june')

// use magazine constructor instead of Book
magazine.prototype.constructor = magazine

console.log(meg1);

console.log(meg1.getSummary());
