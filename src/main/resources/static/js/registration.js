function registerUser() {
    const firstName = document.getElementById('firstname').value;
    const lastName = document.getElementById('lastname').value;
    const phoneNumber = document.getElementById('phonenumber').value;
    const email = document.getElementById('email').value;

    const formData = {
        firstname: firstName,
        lastname: lastName,
        phoneNumber: phoneNumber,
        email: email
    };

    fetch('/api/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(formData)
    })
    .then(response => {
        if (response.ok) {
            // Registration successful, you can redirect or show a success message here
            console.log('Registration successful');
            window.location.href = '/login.html';
        } else {
            // Registration failed, handle the error (e.g., display an error message)
            console.error('Registration failed');
        }
    })
    .catch(error => {
        console.error('Error:', error);
    });
}
