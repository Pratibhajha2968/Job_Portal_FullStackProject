import React from "react";
import { Link } from "react-router-dom";
import "./Navbar.css";

function Navbar() {
  return (
    <nav>
      <h2>Career Growth</h2>
      <div>
        <Link to="/">Home</Link>
        <Link to="/login">Login</Link>
      </div>
    </nav>
    
  );
}

export default Navbar;
