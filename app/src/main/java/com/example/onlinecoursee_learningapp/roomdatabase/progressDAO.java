package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface progressDAO {


    @Insert
    void insertProgress(progress progress);

    // تحديث تقدم موجود
    @Update
    void updateProgress(progress progress);




}
