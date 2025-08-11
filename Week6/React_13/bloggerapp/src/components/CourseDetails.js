import React from 'react';

const CourseDetails = ({ show }) => {
  if (!show) return null; // Conditional Rendering using if statement

  const courses = [
    { name: "Angular", date: "4/5/2021" },
    { name: "React", date: "6/3/20201" }
  ];

  return (
    <div>
      <h2>Course Details</h2>
      {courses.map((course, i) => (
        <div key={i}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;
