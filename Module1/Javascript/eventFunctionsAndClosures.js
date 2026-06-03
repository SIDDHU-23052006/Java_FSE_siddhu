const events = [];

function addEvent(name, category) {
    events.push({ name, category });
}

function registerUser(user, eventName) {
    console.log(`${user} registered for ${eventName}`);
}

function filterEventsByCategory(category, callback) {
    const result = events.filter(event => event.category === category);
    callback(result);
}

function registrationCounter() {
    let count = 0;

    return function () {
        count++;
        return count;
    };
}

const musicCounter = registrationCounter();

addEvent("Music Fest", "Music");
addEvent("Dance Show", "Dance");

registerUser("Rio", "Music Fest");

console.log(musicCounter());
console.log(musicCounter());

filterEventsByCategory("Music", data => console.log(data));