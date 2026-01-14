Job_Portal_FullStackProject

🧠 What is a Job Portal?

A Job Portal is a web application where:

Recruiters post jobs

Job Seekers search & apply for jobs

Admins manage users, jobs, and reports

Examples: Naukri, Indeed, LinkedIn Jobs

👥 User Roles
1️⃣ Admin

Manage users (job seekers & recruiters)

Approve / block job posts

View reports (jobs, applications)

2️⃣ Recruiter

Post new jobs

Update job details

View applicants

Download resumes

3️⃣ Job Seeker

Register & login

Create profile

Upload resume

Search & apply for jobs

Track application status

🧩 Core Features (Must Have)
🔐 Authentication & Security

User registration & login

JWT-based authentication

Role-based authorization

Password encryption (BCrypt)

💼 Job Management

Create / update / delete jobs

Job categories (IT, Finance, HR)

Job filters:

Location

Experience

Salary

Job type (Full-time / Intern)

📄 Application Management

Apply for jobs

Resume upload (PDF)

Application status:

Applied

Shortlisted

Rejected

🔍 Search & Filter

Keyword-based job search

Filter by:

Location

Salary

Experience

Job type

⭐ Advanced Features (Optional but Impressive)

Email notifications

Job recommendations

Admin analytics dashboard

Pagination & sorting

Save jobs (wishlist)

Forgot password (OTP / email)

job-portal-frontend/
│
├── public/
│   ├── index.html
│   └── favicon.ico
│
├── src/
│   ├── assets/
│   │   ├── images/
│   │   └── icons/
│   │
│   ├── components/
│   │   ├── Navbar/
│   │   │   ├── Navbar.jsx
│   │   │   └── Navbar.css
│   │   │
│   │   ├── Footer/
│   │   │   ├── Footer.jsx
│   │   │   └── Footer.css
│   │   │
│   │   └── JobCard.jsx
│   │
│   ├── pages/
│   │   ├── Home.jsx
│   │   ├── Login.jsx
│   │   ├── Register.jsx
│   │   ├── Jobs.jsx
│   │   ├── JobDetails.jsx
│   │   ├── PostJob.jsx
│   │   ├── Profile.jsx
│   │   └── Dashboard.jsx
│   │
│   ├── services/
│   │   ├── authService.js
│   │   ├── jobService.js
│   │   └── api.js
│   │
│   ├── context/
│   │   └── AuthContext.js
│   │
│   ├── routes/
│   │   └── AppRoutes.jsx
│   │
│   ├── utils/
│   │   └── PrivateRoute.jsx
│   │
│   ├── styles/
│   │   └── global.css
│   │
│   ├── App.js
│   └── index.js
│
├── package.json
└── README.md

job-portal-backend/
│
├── src/main/java/com/jobportal/
│   │
│   ├── controller/
│   │   ├── AuthController.java
│   │   ├── JobController.java
│   │   └── UserController.java
│   │
│   ├── service/
│   │   ├── AuthService.java
│   │   ├── JobService.java
│   │   └── UserService.java
│   │
│   ├── repository/
│   │   ├── UserRepository.java
│   │   ├── JobRepository.java
│   │   └── ApplicationRepository.java
│   │
│   ├── model/
│   │   ├── User.java
│   │   ├── Job.java
│   │   └── JobApplication.java
│   │
│   ├── dto/
│   │   ├── LoginRequest.java
│   │   ├── RegisterRequest.java
│   │   └── JobResponse.java
│   │
│   ├── security/
│   │   ├── JwtUtil.java
│   │   ├── JwtFilter.java
│   │   └── SecurityConfig.java
│   │
│   ├── exception/
│   │   └── GlobalExceptionHandler.java
│   │
│   └── JobPortalApplication.java
│
├── src/main/resources/
│   ├── application.properties
│   └── data.sql
│
├── pom.xml
└── README.md

