import React, { useState } from "react";
import axios from "axios";
import {Link , useNavigate } from "react-router-dom";
import Register from "./Register";
import "../styles/Login.css";

const Login = () => {

  const [formData, setFormData] = useState({
    email: "",
    password: ""
  });

   
  const [error, setError] = useState("");
  const navigate = useNavigate();


  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };


  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const res = await axios.post("http://localhost:8080/api/auth/login", formData);

      // save token
      localStorage.setItem("token", res.data.token);
      localStorage.setItem("user", JSON.stringify(res.data.user));


      alert("Login Successful");
      navigate("/");                      //redirect to home page

    } catch (err) {
      setError(err.response?.data?.message || "Login Failed");
    }
  };




  return (
    
      <div className="login-container">
      
      <form className="login-form" onSubmit={handleSubmit}>
        <h1>Login</h1>
        
        {error && <p className="error">{error}</p>}

        <input type="email" name="email" placeholder="enter email" onChange={handleChange} required /><br /><br />
        
           <input type="password" name="password" placeholder="Enter password" onChange={handleChange} required/>

                         <div className="forgot-password">
                           <span onClick={() => navigate("/forgot-password")}>
                                 Forgot password?
                           </span>
                          </div>


        <button type="submit">Login</button>

        <p>
            Dont have an account?{" "}
             <span onClick={() => navigate("/Register")} className="Link">
            Register
          </span>
        </p>
      </form>
    </div>

  );
};

export default Login;