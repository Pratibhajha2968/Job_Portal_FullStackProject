import React from "react";
import "../styles/Companies.css"
const Companies = () => {
  const companies = [
    { name: "Google", role: "Software Engineer", location: "Bangalore" },
    { name: "Amazon", role: "Frontend Developer", location: "Hyderabad" },
    { name: "Infosys", role: "Full Stack Trainee", location: "Chennai" },
    { name: "TCS", role: "Graduate Engineer", location: "Mumbai" },
    { name: "Wipro", role: "React Developer Intern", location: "Pune" },
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

            <button>Apply Now</button>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Companies;
