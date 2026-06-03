const events = [
    { name: "Music Fest", seats: 20, upcoming: true },
    { name: "Past Workshop", seats: 10, upcoming: false },
    { name: "Art Show", seats: 0, upcoming: true }
];

events.forEach(event => {
    if (event.upcoming && event.seats > 0) {
        console.log(`${event.name} is available`);
    } else {
        console.log(`${event.name} is hidden`);
    }
});

function register(event) {
    try {
        if (event.seats <= 0) {
            throw new Error("No seats available");
        }
        event.seats--;
        console.log("Registration successful");
    } catch (error) {
        console.log(error.message);
    }
}

register(events[2]);