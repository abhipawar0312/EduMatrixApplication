# EduMatrixApplication
| Role          | Entity Access                      | APIs            |
| ------------- | ---------------------------------- | --------------- |
| **Admin**     | All entities                       | `/admin/**`     |
| **Reception** | `Student`, `Inquiry`               | `/reception/**` |
| **Teacher**   | `Student`, `ExamMark`, `Timetable` | `/teacher/**`   |
| **Student**   | `ExamMark`, `Timetable`, `Profile` | `/student/**`   |
| **Parent**    | `ExamMark`, `Timetable`, `Profile` | `/parent/**`    |


EduMatrix/
├── backend/
│   ├── src/main/java/com/example/EduMatrix/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── repository/
│   │   ├── service/
│   │   ├── enum class/
│   │   ├── security/
│   │   └── EduMatrixApplication.java
│   └── resources/
│       ├── application.properties
│       └── schema.sql / data.sql
│
├── frontend/
│   └── src/
│       ├── components/
│       ├── pages/
│       ├── services/
│       └── App.jsx / index.js
