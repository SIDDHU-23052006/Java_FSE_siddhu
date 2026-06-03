function submitForm() {
    console.log("Form Submission Started");

    const userData = {
        name: "Rio",
        email: "rio@gmail.com"
    };

    console.log("User Data:", userData);

    fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        body: JSON.stringify(userData),
        headers: {
            "Content-Type": "application/json"
        }
    })
        .then(response => response.json())
        .then(data => {
            console.log("Response:", data);
        })
        .catch(error => {
            console.log("Error:", error);
        });
}

submitForm();