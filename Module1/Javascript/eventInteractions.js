document.getElementById("registerBtn").onclick = function () {
    alert("Registered Successfully");
};

document.getElementById("categoryFilter").onchange = function () {
    console.log("Selected Category:", this.value);
};

document.getElementById("searchBox").addEventListener("keydown", function (event) {
    console.log("Key Pressed:", event.key);
});