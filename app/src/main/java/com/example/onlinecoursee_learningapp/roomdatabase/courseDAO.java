package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface courseDAO
{
    @Insert
    void insertCourse(Course course);

    @Query("SELECT * FROM course_table WHERE courseid =:categoryId")
    LiveData<List<Course>> getCourseByCategory(int categoryId);
}
