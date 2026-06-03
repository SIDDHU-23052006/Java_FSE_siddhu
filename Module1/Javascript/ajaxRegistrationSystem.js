function registerUser() {
    const user = {
        name: "Rio",
        email: "rio@gmail.com"
    };

    setTimeout(() => {
        fetch("https://jsonplaceholder.typicode.com/posts", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(user)
        })
            .then(response => response.json())
            .then(data => {
                console.log("Registration Success", data);
            })
            .catch(error => {
                console.log("Registration Failed", error);
            });
    }, 2000);
}

registerUser();