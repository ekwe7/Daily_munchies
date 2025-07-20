// Object litterals

const buyBook = {
    tittle: "Is Their No Oil in Gilled",
    author: 'Udala Nwanu',
    year: '2022',
    list: ['mark of Devil', 'Eye of the gods', 'Subtle art of not giving a fvk'],

    getBookSummary: function() {
        return `${this.tittle} was written by ${this.author} in the year ${this.year}`;

    }

    getBook: function() {
        return `${this.list} are books written by ${this.author}`;
    }
};

// console.log(Object.values(buyBook));
// console.log(Object.keys(buyBook));

console.log(buyBook.getBookSummary());
console.log(buyBook.getBook);


