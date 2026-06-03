const eventName = "Community Music Fest";
const eventDate = "2026-06-15";
let availableSeats = 50;

console.log(`Event: ${eventName} | Date: ${eventDate} | Seats: ${availableSeats}`);

availableSeats--;
console.log(`Seats after registration: ${availableSeats}`);

availableSeats++;
console.log(`Seats after cancellation: ${availableSeats}`);