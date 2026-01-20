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


🧠 BACKEND FLOW (FIRST UNDERSTAND THIS)

Client (React)  ->  Controller( receives Http request) -> Service(Buisness logic) ->Repository(database operations) -> database(MySQL)
 

🗂️ FOLDER-WISE EXPLANATION (SHORT)
📁 controller

➡ Handles HTTP requests from frontend (React/Postman)

AuthController.java → Login & register APIs

UserController.java → User-related APIs

JobController.java → Job-related APIs

📁 dto

➡ Used to transfer data safely (no direct entity exposure)

LoginRequest.java → Email + password for login

RegisterRequest.java → User registration data

JobResponse.java → Job data sent to frontend

📁 exception

➡ Handles errors globally

GlobalExceptionHandler.java → Central error handling

📁 model

➡ Database entities (tables)

User.java → users table

Job.java → jobs table

JobApplication.java → applied_jobs table

📁 repository

➡ Direct database operations

UserRepository.java → User DB queries

📁 security

➡ JWT authentication & authorization

JwtUtil.java → Create & validate token

JwtFilter.java → Intercepts requests

SecurityConfig.java → Security rules

📁 service

➡ Business logic layer

AuthService.java → Login/Register logic

UserService.java → User operations

JobService.java → Job operations


frontend --- npm create vite@latest

        --employee_boot

        --react -- javascript

        cd employee_boot

        npm install axios react-router-dom bootstrap

        npm run dev
