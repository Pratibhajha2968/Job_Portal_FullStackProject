import { BrowserRouter, Route, Routes } from "react-router-dom";

// Components
import Footer from "./components/Footer/Footer";
import Navbar from "./components/Navbar/Navbar";


// Pages
import Companies from "./pages/Companies";
import Home from "./pages/Home";
import HowItWorks from "./pages/HowItWorks";
import JobDetails from "./pages/JobDetails";
import Jobs from "./pages/Jobs"; // fixed path
import Login from "./pages/Login";
import Profile from "./pages/Profile";
import Register from "./pages/Register";
import JobPost from "./pages/JobPost";
import Search from "./pages/Search";

function App() {
  return (
    <BrowserRouter>
      <Navbar />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/jobs" element={<Jobs />} />
        <Route path="/jobdetails" element={<JobDetails />} />
        <Route path="/jobpost" element={<JobPost />} />
        <Route path="/companies" element={<Companies />} />
        <Route path="/how-it-works" element={<HowItWorks />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="profile" element={<Profile />} />
        <Route path="/search" element={<div></div>} />

      </Routes>

      <Footer />
    </BrowserRouter>
  );
}

export default App;
