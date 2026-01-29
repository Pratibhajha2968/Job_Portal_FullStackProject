# 🧑‍💼 Job Portal – Full Stack Web Application

A **Full Stack Job Portal Web Application** where **job seekers** can search and apply for jobs, and **recruiters/admins** can post and manage job listings. This project is built to demonstrate real‑world full‑stack development skills using modern web technologies.

🏗️ Job Portal – System Design

You are building:

Candidate → Login → View Jobs → Apply → Upload Resume → Save Profile

---

## 🚀 Features

### 👤 User (Job Seeker)

* User registration & login (JWT authentication)
* Browse all available jobs
* Search & filter jobs by title, location, and category
* View job details
* Apply for jobs
* View applied jobs

### 🧑‍💻 Recruiter / Admin

* Admin login
* Post new job openings
* Update & delete job postings
* View applicants for a job

### 🔐 Authentication & Security

* JWT-based authentication
* Role-based access control (User / Admin)
* Secure API routes

---

## 🛠️ Tech Stack

### Frontend

* **React.js**
* **React Router DOM** – routing
* **Axios** – API calls
* **CSS / Tailwind (if used)** – styling

### Backend

* Spring
* SpringBoot
* Spring Security
* **JWT** – authentication
* **bcrypt.js** – password hashing

---

## 📁 Project Structure

### Frontend (`job-portal-frontend`)

```
job-portal-frontend/
│
├── public/
│   └── index.html
│
├── src/
│   ├── assets/          # Images, icons
│   ├── components/      # Reusable components (Navbar, Footer, JobCard)
│   ├── pages/           # Pages (Home, Login, Register, Jobs, JobDetails)
│   ├── services/        # API service files
│   ├── styles/          # Global styles
│   ├── App.jsx
│   └── main.jsx
│
└── package.json
```

### Backend (`job-portal-backend`)

```
job-portal-backend/
│
├── controllers/     # Business logic
├── models/          # SpringBoot
├── routes/          # API routes
├── middleware/      # Auth & error middleware
├── config/          # DB configuration
├── server.js        # Entry point
└── package.json
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/job-portal.git
```

### 2️⃣ Backend Setup

Project: Maven

Language: Java

Spring Boot: Default (latest stable)

Group: com.yourname

Artifact: backend (or jobportal-backend)

Packaging: Jar

Java: 17 (or 11 if your system supports only that)

Create a `.env` file:

```env
PORT=8080
JWT_SECRET=your_secret_key
```

### 3️⃣ Frontend Setup

```bash
cd your directory_name
npm  create  vite@latest
project_name
package_name
cd your project_name
npm install axios react-router-dom
npm run dev
```
# 🚀 Job Portal Frontend

This is the **frontend part of a Job Portal** project, built with **React.js**.  

---

## 🎯 Features Implemented (So Far)

- 🏠 **Home Page**
  - Displays a list of **job cards** (currently static).  
  - Basic **hover effects** and card styling for better user experience.  
- 🧩 **Reusable Components**
  - `JobCard` component to display individual job information.  
  - `Footer` component for consistent layout.  
- 🛠 **React Router Setup**
  - Prepared for future navigation like **Job Details page**.  

---

## 💻 Tech Stack

- **Frontend:** React.js  
- **Styling:** CSS  
- **Routing:** react-router-dom  

---

> 🔹 Currently, only the **Home page** is implemented.  
> 🔹  updated all **dynamic jobs**, **Job Details page**, and **filters/search functionality**.

---

## 🔗 API Endpoints (Sample)

### Auth

* `POST /api/auth/register`
* `POST /api/auth/login`

### Jobs

* `GET /api/jobs`
* `POST /api/jobs` (Admin)
* `PUT /api/jobs/:id`
* `DELETE /api/jobs/:id`

### Applications

* `POST /api/apply/:jobId`
* `GET /api/applications`

---



## 🎯 Future Enhancements

* Resume upload feature
* Company profiles
* Email notifications
* Admin analytics dashboard
* Pagination & advanced filters

---

## 📚 Learning Outcomes

* Full stack application development
* REST API design
* Authentication & authorization
* Frontend–backend integration
* Clean folder structure & best practices

---


## 👩‍💻 Author

**Pratibha Priya Jha**
Frontend / MERN Stack Developer / Java FullStack Developer
GitHub: [https://github.com/Pratibhajha2968]
LinkedIn: [https://www.linkedin.com/in/pratibhajha2589]
   AND
 **Agalya D**  
 GitHub: [https://github.com/agalya12-tech] 
 LinkedIn: [https://www.linkedin.com/in/agalya-d-437248306/]
 

 User opens Job List Page
        |
        v
User clicks "Apply" on Job (jobId = 101)
        |
        v
Apply Page opens
(User uploads resume)
        |
        v
User clicks "Submit Application"
        |
        v
System checks: Is user logged in?
        |
   YES / NO
    |     |
    |     v
    |  Redirect to Login Page
    |        |
    |        v
    |   User logs in
    |        |
    +--------+
        |
        v
Frontend sends request to backend:
------------------------------------------------
POST /api/jobApplications/101
FormData:
- jobId = 101
- userId = 55
- name = "Pratibha"
- email = "pratibha@gmail.com"
- resume = resume.pdf
------------------------------------------------
        |
        v
Spring Boot Backend receives:
- @PathVariable jobId
- @RequestParam userId
- @RequestParam MultipartFile resume
        |
        v
Backend logic:
1. Save resume file → /uploads/170000_resume.pdf
2. Create JobApplication entity
3. Set:
   jobId = 101
   userId = 55
   resumePath = "/uploads/170000_resume.pdf"
   status = "APPLIED"
4. Save to database
        |
        v
Database Table: job_applications
------------------------------------------------
id | job_id | user_id | resume_path | status
------------------------------------------------
1  | 101    | 55      | /uploads/...| APPLIED
------------------------------------------------
        |
        v
Backend returns:
"Application submitted successfully"
        |
        v
Frontend shows success message


---

⭐ If you like this project, don’t forget to give it a star!
 
       
