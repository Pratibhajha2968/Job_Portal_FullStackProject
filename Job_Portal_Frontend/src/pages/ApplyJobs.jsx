import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const ApplyJob = () => {
  const { jobId } = useParams();
  const [resume, setResume] = useState(null);
  const [message, setMessage] = useState("");

  const handleFileChange = (e) => {
    setResume(e.target.files[0]);
  };

  const ApplyJob = () => {
    const { user } = useContext(AuthContext);
    const navigate = useNavigate();

    const handleApply = async () => {
      if (!resume) {
        setMessage("Please select a resume to upload.");
        return;
      }

      try {
        ApplyJob(jobId, resume);
        setMessage("Applied successfully!");
      } catch (error) {
        console.error(error);
        setMessage("Error applying for job.");
      }
    };

    return (
      <div>
        <input type="file" onChange={handleFileChange} />
        <button onClick={handleApply}>Apply</button>
        {message && <p>{message}</p>}
      </div>
    );
  };
};

export default ApplyJob;
