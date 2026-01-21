import React from "react";
import { useNavigate } from "react-router-dom";

const Register = () => {
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    navigate("/login");
  };

  return (
    <div style={{ textAlign: "center" }}>
      <h1>Register dashboard</h1>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Name</label> <br />
          <input type="text" placeholder="Please enter your name" />
        </div>
        <br /><br />

        <div>
          <label>Email</label> <br />
          <input type="email" placeholder="Please enter your email" />
        </div>
        <br /><br />

        <div>
          <label>Password</label> <br />
          <input type="password" placeholder="Please enter your password" />
        </div>
        <br /><br />

        <button type="submit">Register</button>
      </form>
    </div>
  );
};

export default Register;
