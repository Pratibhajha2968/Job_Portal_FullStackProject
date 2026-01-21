import React from "react";
import JobCard from "../components/JobCard/JobCard";
import Footer from "../components/Footer/Footer";
import "./Home.css";
import logoImg from "../assets/MultiMedia/Logo.png";
import { Link } from "react-router-dom";
import { useNavigate } from "react-router-dom";

// ✅ Font Awesome imports
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faGoogle, faAmazon, faMicrosoft, faFacebook } from '@fortawesome/free-brands-svg-icons';

const Home = () => {
  return (
    <div className="home">
      {/* Navbar */}
      <header className="navbar">
        {/* Logo */}
        <div className="logo">
          <img src={logoImg} alt="CareerGate" width="150" height="60" />
        </div>
        
        {/* Nav links */}
        <nav>
          <Link to="/Jobs">Jobs</Link>  
          <Link to = "/Companies">Companies</Link>
          <Link to ="/how-it-works">How It Works</Link>
          <Link to="/login">Login</Link>
        </nav>
      </header>

      {/* Hero Section */}
      <section className="hero">
        <h1>Find Your Dream Job</h1>
        <p>Search jobs, apply instantly, and get hired fast!</p>
        <div className="search-bar">
          <input type="text" placeholder="Job title..." />
          <input type="text" placeholder="Location..." />
          <button>Search</button>
        </div>
      </section>

      {/* Featured Jobs */}
      <section className="featured-jobs">
        <h2>Featured Jobs</h2>
        <div className="job-cards">
          <JobCard title="Frontend Developer" company="Google" location="Remote" />
          <JobCard title="Backend Developer" company="Amazon" location="Bangalore" />
          <JobCard title="Fullstack Developer" company="Microsoft" location="Hyderabad" />
          <JobCard title="Data Scientist" company="Facebook" location="Mumbai" />
        </div>
      </section>

      {/* How It Works */}
      <section className="how-it-works">
        <h2>How It Works</h2>
        <div className="steps">
          <div className="step">
            <div className="icon">🔍</div>
            <p>Search Jobs</p>
          </div>
          <div className="step">
            <div className="icon">📝</div>
            <p>Apply Instantly</p>
          </div>
          <div className="step">
            <div className="icon">🎯</div>
            <p>Get Hired</p>
          </div>
        </div>
      </section>

      {/* Companies Section */}
      <section className="companies">
  <h2>Trusted By Companies</h2>
  <div className="company-logos">
    <a href="https://www.google.com" target="_blank" rel="noopener noreferrer">
      <FontAwesomeIcon icon={faGoogle} size="2x" />
    </a>
    <a href="https://www.amazon.com" target="_blank" rel="noopener noreferrer">
      <FontAwesomeIcon icon={faAmazon} size="2x" />
    </a>
    <a href="https://www.microsoft.com" target="_blank" rel="noopener noreferrer">
      <FontAwesomeIcon icon={faMicrosoft} size="2x" />
    </a>
    <a href="https://www.facebook.com" target="_blank" rel="noopener noreferrer">
      <FontAwesomeIcon icon={faFacebook} size="2x" />
    </a>
  </div>
</section>
</div>
  );
};

export default Home;
