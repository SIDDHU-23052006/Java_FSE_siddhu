function createEvent(name = "Community Event") {
    console.log(name);
}

const event = {
    name: "Music Fest",
    date: "2026-06-15",
    seats: 50
};

const { name, date, seats } = event;

console.log(name, date, seats);

const eventList = [event];

const clonedList = [...eventList];

console.log(clonedList);

createEvent();