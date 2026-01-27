import React, { useEffect, useState } from "react"; 
import { Link, useNavigate, useSearchParams } from "react-router-dom";
import "../styles/Jobs.css"; 
import { allJobs } from "../pages/JobsData"; // ✅ import shared jobs array

const Jobs = () => {
  const navigate = useNavigate();
  const [searchParams] = useSearchParams();
  const title = searchParams.get("title");
  const location = searchParams.get("location");

  // ✅ filtered jobs state
  const [filteredJobs, setFilteredJobs] = useState(allJobs);

  useEffect(() => {
    let filtered = allJobs;

    if (title) {
      filtered = filtered.filter((job) =>
        job.title.toLowerCase().includes(title.toLowerCase())
      );
    }

    if (location) {
      filtered = filtered.filter((job) =>
        job.location.toLowerCase().includes(location.toLowerCase())
      );
    }

    setFilteredJobs(filtered);
  }, [title, location]);

  return (
    <div className="jobs-container">
      {filteredJobs.map((job) => (
        <div
          key={job.id}
          className="job-card"
          onClick={() => navigate(`/job/${job.id}`)}
        >
          <div className="job-header">
            <h2>{job.title}</h2>
            <span
              className={
                job.experience.toLowerCase().includes("fresher")
                  ? "badge fresher"
                  : "badge experienced"
              }
            >
              {job.experience.toLowerCase().includes("fresher")
                ? "Fresher"
                : "Experienced"}
            </span>
          </div>
          <p className="job-info">
            📍 {job.location} | 💻 {job.mode}
          </p>
          <p className="job-info">
            💰 {job.salary} | 🧑‍💻 {job.experience}
          </p>
          <p className="job-desc">
            {job.description.length > 100
              ? job.description.substring(0, 100) + "..."
              : job.description}
          </p>

          <Link
            to={`/job/${job.id}`}
            className="read-more"
            onClick={(e) => e.stopPropagation()}
          >
            Read More
          </Link>
        </div>
      ))}
    </div>
  );
};

export default Jobs;
