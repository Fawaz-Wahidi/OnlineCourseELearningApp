package com.example.onlinecoursee_learningapp.roomdatabase;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public class Repository {

    categoryDAO categoryDAO;
    enrollmentDAO enrollmentDAO;
    userDAO userDAO;
    courseDAO courseDAO;
    progressDAO progressDAO;

    public Repository(Application application){
        MyRoomDataBase db= MyRoomDataBase.getInstance(application);

        categoryDAO =db.categoryDao();
        enrollmentDAO= db.enrollmentDao();
        userDAO= db.userDao();
        courseDAO= db.courseDao();
        progressDAO= db.progressDao();
    }
//Category DAO 1
    LiveData<List<category>> getAllCategories(){
        return (LiveData<List<category>>) categoryDAO.getAllCategories();
    }

  public   void insertCategory(category category){
        MyRoomDataBase.databasewriteExcutor.execute(new Runnable() {
            @Override
            public void run() {
                categoryDAO.insertCategory(category);
            }
        });

  }
// Enrollment DAO 2


   public void insertenrollment(enrollment enrollment){
        MyRoomDataBase.databasewriteExcutor.execute(new Runnable() {
            @Override
            public void run() {
                enrollmentDAO.insertenrollment(enrollment);
            }
        });
   }

    LiveData<List<enrollment>> getEnrollmentByUser(int userId){
return   (LiveData<List<enrollment>>)enrollmentDAO.getEnrollmentByUser(userId);
    }

//user DAO 3


   public void insertUser(User user){
       MyRoomDataBase.databasewriteExcutor.execute(new Runnable() {
           @Override
           public void run() {
               userDAO.insertUser(user);
           }
       });
   }

     User login(String email ,String password){
        return login(email, password);
    }

    LiveData<List<User>> getAllUsers(){
        return (LiveData<List<User>>) userDAO.getAllUsers();
    }
//course DAO 4

  public   void insertCourse(Course course){
        MyRoomDataBase.databasewriteExcutor.execute(new Runnable() {
            @Override
            public void run() {
                courseDAO.insertCourse(course);
            }
        });
  }


    LiveData<List<Course>> getCourseByCategory(int categoryId){
        return (LiveData<List<Course>>) getCourseByCategory(categoryId);
    }
//    progressDAO 5



   public void insertProgress(progress progress){
        MyRoomDataBase.databasewriteExcutor.execute(new Runnable() {
            @Override
            public void run() {
                progressDAO.insertProgress(progress);
            }
        });
   }

    void updateProgress(progress progress){
        MyRoomDataBase.databasewriteExcutor.execute(new Runnable() {
            @Override
            public void run() {
                progressDAO.updateProgress(progress);

            }
        });
    }


}
