const customers = [];

function addCustomer() {
  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const phn = document.getElementById("phn").value.trim();
  const acct = document.getElementById("acct").value;

  const nameError = document.getElementById("nameError");
  const emailError = document.getElementById("emailError");
  const contactError = document.getElementById("contactError");
  const accountError = document.getElementById("accountError");

  let isValid = true;

  nameError.textContent = "";
  emailError.textContent = "";
  contactError.textContent = "";
  accountError.textContent = "";

  if (!/^[A-Za-z\s]+$/.test(name)) {
    nameError.textContent = "Please input alphabetic characters only.";
    isValid = false;
  }

  if (!/^\S+@\S+\.\S+$/.test(email)) {
    emailError.textContent = "Please provide a valid email address.";
    isValid = false;
  }

  if (!/^[7-9]\d{9}$/.test(phn)) {
    contactError.textContent = "Please enter a valid 10-digit phone number starting with 7, 8, or 9.";
    isValid = false;
  }  

  if (!acct) {
    accountError.textContent = "Please choose an account type.";
    isValid = false;
  }

  if (isValid) {
    const customer = {
      name,
      email,
      phn,
      acct
    };

    customers.push(customer);
    console.log(customers); // Display customers array in console
    displayCustomers();
    document.getElementById("custForm").reset();
  }
}

function displayCustomers() {
  const detailsListBody = document.querySelector("#detailsList tbody");
  detailsListBody.innerHTML = "";

  customers.forEach(customer => {
    const row = document.createElement("tr");

    ['name', 'email', 'phn', 'acct'].forEach(key => {
      const cell = document.createElement("td");
      cell.textContent = customer[key];
      row.appendChild(cell);
    });

    detailsListBody.appendChild(row);
  });
}
