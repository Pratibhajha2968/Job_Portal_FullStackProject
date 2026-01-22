import React from "react";
import JobCard from "../components/JobCard/JobCard";
import "../styles/Jobs.css";

const Jobs = () => {
  return (
    <div className="jobs-page">
      <h1>Available Jobs</h1>

      <div className="jobs-list">
        <JobCard title="Frontend Developer" company="Google" location="Remote" />
        <JobCard title="Backend Developer" company="Amazon" location="Bangalore" />
        <JobCard title="Fullstack Developer" company="Microsoft" location="Hyderabad" />
        <JobCard title="Data Scientist" company="Facebook" location="Mumbai" />
      </div>
    </div>
  );
};

export default Jobs;
