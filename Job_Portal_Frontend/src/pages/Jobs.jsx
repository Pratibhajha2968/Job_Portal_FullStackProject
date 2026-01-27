import { Link ,useNavigate } from "react-router-dom";
import "../styles/Jobs.css"; // your CSS file

const Jobs = () => {
  const navigate = useNavigate();

  const jobs = [
    {
      id: 1,
      title: "Frontend Developer",
      location: "Bangalore",
      mode: "Remote",
      salary: "8 – 12 LPA",
      experience: "Fresher – 2 years",
      description:
        "Work on building responsive web UIs using React and TailwindCSS. Collaborate with backend developers.",
    },
    {
      id: 2,
      title: "Backend Developer",
      location: "Hyderabad",
      mode: "Hybrid",
      salary: "10 – 15 LPA",
      experience: "2 – 4 years",
      description:
        "Develop APIs using Node.js or Spring Boot. Work with databases and cloud infrastructure.",
    },
    {
      id: 3,
      title: "Full Stack Developer",
      location: "Chennai",
      mode: "On-site",
      salary: "12 – 18 LPA",
      experience: "1 – 3 years",
      description:
        "Build full stack applications using React, Node.js, and SQL/NoSQL databases.",
    },
    {
      id: 4,
      title: "UI/UX Designer",
      location: "Pune",
      mode: "Remote",
      salary: "6 – 10 LPA",
      experience: "Fresher – 2 years",
      description:
        "Design creative user interfaces and experiences for web and mobile applications.",
    },
    {
      id: 5,
      title: "Data Analyst",
      location: "Bangalore",
      mode: "Hybrid",
      salary: "5 – 8 LPA",
      experience: "Fresher – 2 years",
      description:
        "Analyze business data, create dashboards and reports, and assist in data-driven decisions.",
    },
    {
      id: 6,
      title: "DevOps Engineer",
      location: "Mumbai",
      mode: "On-site",
      salary: "8 – 14 LPA",
      experience: "2 – 5 years",
      description:
        "Manage CI/CD pipelines, deployment, and monitoring of applications in cloud environments.",
    },
    {
      id: 7,
      title: "Mobile App Developer",
      location: "Bangalore",
      mode: "Remote",
      salary: "7 – 12 LPA",
      experience: "Fresher – 3 years",
      description:
        "Develop mobile applications using React Native or Flutter for Android and iOS platforms.",
    },
    {
      id: 8,
      title: "Machine Learning Engineer",
      location: "Hyderabad",
      mode: "Hybrid",
      salary: "12 – 20 LPA",
      experience: "3 – 5 years",
      description:
        "Implement ML models, perform data preprocessing, and collaborate with data scientists.",
    },
    {
      id: 9,
      title: "Quality Assurance Engineer",
      location: "Chennai",
      mode: "On-site",
      salary: "5 – 9 LPA",
      experience: "Fresher – 2 years",
      description:
        "Test web and mobile applications, write test cases, and report bugs effectively.",
    },
    {
      id: 10,
      title: "Cloud Engineer",
      location: "Bangalore",
      mode: "Remote",
      salary: "10 – 18 LPA",
      experience: "2 – 5 years",
      description:
        "Design and manage cloud infrastructure, optimize costs, and implement security best practices.",
    },
    {
      id: 11,
      title: "React Developer",
      location: "Pune",
      mode: "Hybrid",
      salary: "8 – 14 LPA",
      experience: "Fresher – 3 years",
      description:
        "Develop responsive web apps using React, Redux, and modern UI libraries.",
    },
    {
      id: 12,
      title: "Node.js Developer",
      location: "Hyderabad",
      mode: "On-site",
      salary: "9 – 16 LPA",
      experience: "1 – 4 years",
      description:
        "Build RESTful APIs, integrate databases, and ensure application performance.",
    },
    {
      id: 13,
      title: "Python Developer",
      location: "Bangalore",
      mode: "Remote",
      salary: "7 – 12 LPA",
      experience: "Fresher – 3 years",
      description:
        "Develop backend services, scripts, and automation using Python and Django/Flask.",
    },
    {
      id: 14,
      title: "Data Scientist",
      location: "Mumbai",
      mode: "Hybrid",
      salary: "12 – 20 LPA",
      experience: "2 – 5 years",
      description:
        "Analyze data, build predictive models, and collaborate with cross-functional teams.",
    },
    {
      id: 15,
      title: "Software Engineer Intern",
      location: "Chennai",
      mode: "Remote",
      salary: "3 – 5 LPA",
      experience: "Fresher",
      description:
        "Assist in software development tasks, bug fixing, and learning modern development tools.",
    },
    {
      id: 16,
      title: "Java Developer",
      location: "Bangalore",
      mode: "On-site",
      salary: "9 – 15 LPA",
      experience: "1 – 3 years",
      description:
        "Work on backend services using Java, Spring Boot, and RESTful APIs.",
    },
    {
      id: 17,
      title: "Android Developer",
      location: "Hyderabad",
      mode: "Remote",
      salary: "7 – 13 LPA",
      experience: "Fresher – 2 years",
      description:
        "Develop native Android apps using Kotlin/Java and integrate with REST APIs.",
    },
    {
      id: 18,
      title: "iOS Developer",
      location: "Pune",
      mode: "Hybrid",
      salary: "8 – 14 LPA",
      experience: "1 – 3 years",
      description:
        "Develop iOS applications using Swift and maintain app performance and quality.",
    },
    {
      id: 19,
      title: "UI Developer",
      location: "Chennai",
      mode: "Remote",
      salary: "6 – 10 LPA",
      experience: "Fresher – 2 years",
      description:
        "Implement web interfaces using HTML, CSS, JavaScript, and frontend frameworks.",
    },
    {
      id: 20,
      title: "Business Analyst",
      location: "Mumbai",
      mode: "On-site",
      salary: "5 – 9 LPA",
      experience: "Fresher – 3 years",
      description:
        "Gather business requirements, create reports, and assist in project management.",
    },
  ];

  return (
    <div className="jobs-container">
      {jobs.map((job) => (
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
          <p className="job-company">{job.company}</p>
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

           {/* ✅ Read More as Link */}
          <Link
            to={`/job/${job.id}`}
            className="read-more"
            onClick={(e) => e.stopPropagation()} // prevents parent div click
          >
            Read More
          </Link>
        </div>
      ))}
    </div>
  );
};

export default Jobs;

          
  