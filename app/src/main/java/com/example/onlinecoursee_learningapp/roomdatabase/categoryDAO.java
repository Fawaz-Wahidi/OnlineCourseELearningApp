package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

public interface categoryDAO {

@Insert
void insertCategory(category category);


@Query("SELECT*From category_table")
    LiveData<List<category>> getAllCategories();
}
