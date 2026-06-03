$(document).ready(function () {

    $("#registerBtn").click(function () {
        alert("Registration Successful");
    });

    $("#eventCard").fadeIn(1000);

    setTimeout(() => {
        $("#eventCard").fadeOut(1000);
    }, 3000);

});

/*
Benefit of React/Vue:
They provide component-based architecture,
better state management, and faster UI updates.
*/