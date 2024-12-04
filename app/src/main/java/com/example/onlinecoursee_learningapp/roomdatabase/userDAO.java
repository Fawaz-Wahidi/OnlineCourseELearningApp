package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface userDAO

{
    @Insert
    void insertUser(User user);

    @Query("Select*From users_table where email = :email AND password =:password")
    User login(String email ,String password);

    @Query("Select * FROM users_table")
    LiveData<List<User>> getAllUsers();
}
