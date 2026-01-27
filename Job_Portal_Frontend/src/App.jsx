import { BrowserRouter, Route, Routes } from "react-router-dom";

// Components
import Footer from "./components/Footer/Footer";
import Navbar from "./components/Navbar/Navbar";

// Pages
import Companies from "./pages/Companies";
import Home from "./pages/Home";
import HowItWorks from "./pages/HowItWorks";

import JobDetails from "./pages/JobDetails";
import JobPost from "./pages/JobPost";
import Jobs from "./pages/Jobs"; // fixed path
import Profile from "./pages/Profile";
import Register from "./pages/Register";

function App() {
  return (
    <BrowserRouter>
      {/* Navbar without login */}
      <Navbar />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/jobs" element={<Jobs />} />
        <Route path="/job/:id" element={<JobDetails />} />

        {/* <Route path="/jobdetails" element={<JobDetails />} /> */}

        <Route path="/jobpost" element={<JobPost />} />
        <Route path="/companies" element={<Companies />} />
        <Route path="/how-it-works" element={<HowItWorks />} />
        <Route path="/register" element={<Register />} />
        <Route path="/profile" element={<Profile />} />
        <Route path="/search" element={<div></div>} />
      </Routes>

      <Footer />
    </BrowserRouter>
  );
}

export default App;
