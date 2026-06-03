const container = document.querySelector("#eventContainer");

const eventCard = document.createElement("div");
eventCard.textContent = "Community Music Fest";

container.appendChild(eventCard);

function updateUI(message) {
    container.innerHTML += `<p>${message}</p>`;
}

updateUI("Registration Successful");