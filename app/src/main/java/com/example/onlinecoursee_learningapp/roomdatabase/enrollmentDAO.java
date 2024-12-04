package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface enrollmentDAO {

    @Insert
    void insertenrollment(enrollment enrollment);

    @Query("SELECT * FROM enrollments where userId =:userId")
    LiveData<List<enrollment>> getEnrollmentByUser(int userId);
}
