const form = document.getElementById("registrationForm");

form.addEventListener("submit", function (event) {
    event.preventDefault();

    const name = form.elements["name"].value;
    const email = form.elements["email"].value;
    const selectedEvent = form.elements["event"].value;

    if (name === "" || email === "") {
        document.getElementById("error").textContent =
            "All fields are required";
        return;
    }

    console.log(name, email, selectedEvent);
});