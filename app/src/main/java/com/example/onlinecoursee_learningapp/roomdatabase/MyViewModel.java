package com.example.onlinecoursee_learningapp.roomdatabase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MyViewModel extends AndroidViewModel {
    Repository repository;

    public MyViewModel(@NonNull Application application){
        super(application);
        repository = new Repository(application);
    }
    public  void insertusersn(User user){
        repository.insertUser(user);
    }




}
