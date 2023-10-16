function resetForm() {
    document.getElementById("surveyForm").reset();
}

function submitForm() {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = document.querySelectorAll('input[name="gender"]:checked');
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    let genderValues = '';
    for (let i = 0; i < gender.length; i++) {
        genderValues += gender[i].value;
        if (i < gender.length - 1) {
            genderValues += ', ';
        }
    }

    const popupText = `
        First Name: ${firstName}
        Last Name: ${lastName}
        Date of Birth: ${dob}
        Country: ${country}
        Gender: ${genderValues}
        Profession: ${profession}
        Email: ${email}
        Mobile Number: ${mobile}
    `;

    document.getElementById("popupText").innerHTML = popupText;
    document.getElementById("popup").style.display = "flex";
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}
