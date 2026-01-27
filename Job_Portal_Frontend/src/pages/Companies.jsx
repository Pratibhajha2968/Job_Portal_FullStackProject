import React from "react";
import "../styles/Companies.css"
const Companies = () => {
  const companies = [
  { name: "Google", role: "Software Engineer", location: "Bangalore", applyLink: "https://www.example.com/apply/google" },
  { name: "Amazon", role: "Frontend Developer", location: "Hyderabad", applyLink: "https://www.example.com/apply/amazon" },
  { name: "Infosys", role: "Full Stack Trainee", location: "Chennai", applyLink: "https://www.example.com/apply/infosys" },
  { name: "TCS", role: "Graduate Engineer", location: "Mumbai", applyLink: "https://www.example.com/apply/tcs" },
  { name: "Wipro", role: "React Developer Intern", location: "Pune", applyLink: "https://www.example.com/apply/wipro" },
  { name: "Zomato", role: "Backend Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/zomato" },
  { name: "Swiggy", role: "Data Engineer", location: "Bangalore", applyLink: "https://www.example.com/apply/swiggy" },
  { name: "Freshworks", role: "Frontend Developer", location: "Chennai", applyLink: "https://www.example.com/apply/freshworks" },
  { name: "Razorpay", role: "Software Engineer Intern", location: "Bangalore", applyLink: "https://www.example.com/apply/razorpay" },
  { name: "Byju's", role: "Full Stack Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/byjus" },
  { name: "Ola Electric", role: "Embedded Systems Engineer", location: "Pune", applyLink: "https://www.example.com/apply/ola-electric" },
  { name: "Unacademy", role: "React Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/unacademy" },
  { name: "Cure.fit", role: "Mobile App Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/curefit" },
  { name: "Dream11", role: "Backend Developer", location: "Mumbai", applyLink: "https://www.example.com/apply/dream11" },
  { name: "Meesho", role: "Frontend Developer Intern", location: "Bangalore", applyLink: "https://www.example.com/apply/meesho" },
  { name: "Urban Company", role: "Software Engineer", location: "Delhi", applyLink: "https://www.example.com/apply/urban-company" },
  { name: "DailyHunt", role: "Full Stack Developer", location: "Noida", applyLink: "https://www.example.com/apply/dailyhunt" },
  { name: "Postman", role: "QA Engineer", location: "Bangalore", applyLink: "https://www.example.com/apply/postman" },
  { name: "Microsoft", role: "Cloud Engineer", location: "Hyderabad", applyLink: "https://www.example.com/apply/microsoft" },
  { name: "Adobe", role: "Frontend Developer", location: "Noida", applyLink: "https://www.example.com/apply/adobe" },
  { name: "Flipkart", role: "Full Stack Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/flipkart" },
  { name: "Paytm", role: "Software Engineer", location: "Noida", applyLink: "https://www.example.com/apply/paytm" },
  { name: "PhonePe", role: "Mobile Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/phonepe" },
  { name: "Intuit", role: "Frontend Developer", location: "Pune", applyLink: "https://www.example.com/apply/intuit" },
  { name: "Capgemini", role: "Graduate Engineer Trainee", location: "Mumbai", applyLink: "https://www.example.com/apply/capgemini" },
  { name: "Goldman Sachs", role: "Backend Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/goldman-sachs" },
  { name: "Uber", role: "React Native Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/uber" },
  { name: "LinkedIn", role: "Frontend Engineer", location: "Bangalore", applyLink: "https://www.example.com/apply/linkedin" },
  { name: "CoinDCX", role: "Blockchain Developer", location: "Mumbai", applyLink: "https://www.example.com/apply/coindcx" },
  { name: "CRED", role: "React Developer", location: "Bangalore", applyLink: "https://www.example.com/apply/cred" },
];


  return (
    <div className="companies-container">
      <h1>Hiring Companies</h1>

      <div className="companies-grid">
        {companies.map((c, index) => (
          <div key={index} className="company-card">
            <h2>{c.name}</h2>
            <p><strong>Role:</strong> {c.role}</p>
            <p><strong>Location:</strong> {c.location}</p>

            <button onClick={() => window.open(c.applyLink, "_blank")}>Apply Now</button>

          </div>
        ))}
      </div>
    </div>
  );
};

export default Companies;
