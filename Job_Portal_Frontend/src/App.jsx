import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";

// Components
import Navbar from "./components/Navbar/Navbar";
import Footer from "./components/Footer/Footer";
import JobCard from "./components/JobCard/JobCard"; // fixed path

// Pages
import Home from "./pages/Home";
import Jobs from "./pages/Jobs";           // fixed path
import Companies from "./pages/Companies";
import HowItWorks from "./pages/HowItWorks";
import Login from "./pages/Login";

function App() {
  return (
    <BrowserRouter>
      <Navbar />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/jobs" element={<Jobs />} />
        <Route path="/companies" element={<Companies />} />
        <Route path="/how-it-works" element={<HowItWorks />} />
        <Route path="/login" element={<Login />} />
      </Routes>

      <Footer />
    </BrowserRouter>
  );
}

export default App;
