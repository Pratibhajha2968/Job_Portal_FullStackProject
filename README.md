# 🧑‍💼 Job Portal – Full Stack Web Application

A **Full Stack Job Portal Web Application** where **job seekers** can search and apply for jobs, and **recruiters/admins** can post and manage job listings. This project is built to demonstrate real‑world full‑stack development skills using modern web technologies.

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

* **Node.js**
* **Express.js**
* **MongoDB**
* **Mongoose** – ODM
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
├── models/          # MongoDB schemas
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

```bash
cd job-portal-backend
npm install
npm start
```

Create a `.env` file:

```env
PORT=5000
MONGO_URI=your_mongodb_connection_string
JWT_SECRET=your_secret_key
```

### 3️⃣ Frontend Setup

```bash
cd job-portal-frontend
npm install
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
> 🔹 Future updates will include **dynamic jobs**, **Job Details page**, and **filters/search functionality**.

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
Frontend / MERN Stack Developer
GitHub: [https://github.com/Pratibhajha2968](https://github.com/Pratibhajha2968)
LinkedIn: [https://www.linkedin.com/in/pratibhajha2589](https://www.linkedin.com/in/pratibhajha2589)
   AND
 **Agalya D**  
 GitHub: 
 LinkedIn: 

---

⭐ If you like this project, don’t forget to give it a star!
 
       
