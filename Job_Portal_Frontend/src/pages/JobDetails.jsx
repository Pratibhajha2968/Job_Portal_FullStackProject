import React from "react";
import { useParams } from "react-router-dom";
import "../styles/Jobs.css";
import { allJobs } from "../pages/JobsData";

const JobDetails = () => {
  const { id } = useParams();
  const job = allJobs.find((j) => j.id === Number(id));

  if (!job) return <h2 className="jobs-container">Job Not Found</h2>;

  return (
    <div className="job-details-page">
      <h2>{job.title}</h2>
      <h3>Company: {job.company}</h3>
      <p>📍 Location: {job.location}</p>
      <p>💻 Mode: {job.mode}</p>
      <p>💰 Salary: {job.salary}</p>
      <p>🧑‍💻 Experience: {job.experience}</p>
      <p>📝 Type: {job.type}</p>
      <p>📅 Posted Date: {job.postedDate}</p>
      <p>{job.description}</p>

      <h4>Responsibilities:</h4>
      <ul>
        {job.responsibilities.map((res, i) => (
          <li key={i}>{res}</li>
        ))}
      </ul>

      <h4>Requirements:</h4>
      <ul>
        {job.requirements.map((req, i) => (
          <li key={i}>{req}</li>
        ))}
      </ul>

      <h4>Skills Required:</h4>
      <p>{job.skills.join(", ")}</p>
    </div>
  );
};

export default JobDetails;
