import React from 'react'
import { useNavigate } from "react-router-dom"

const Register = () => {
  const navigate = useNavigate();


  const handlesubmit = () => {
          
    e.preventDefault();
    // later: register logic / API call
    navigate("/login"); // redirect to login page

};



  return (
    <div  style={{ textAlign:'center' }}>
      <h1>Register dashboard</h1>

      <form action="register">

        <div>
          <label>Name</label> <br />
          <input type="text" placeholder='please enter your name' />
        </div> <br /><br />
        

        <div>
          <label>Email</label> <br />
          <input type="text" placeholder='please enter your Email' />
        </div>   <br /><br />
        

        <div>
          <label>Password</label> <br />
          <input type="text" placeholder='please enter your Password' />
        </div>  <br /><br />
        

        <button type='submit'>Register</button>


      </form>
    </div>
  )
}

export default Register

