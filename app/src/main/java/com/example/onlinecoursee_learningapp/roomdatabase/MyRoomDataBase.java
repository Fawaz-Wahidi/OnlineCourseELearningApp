package com.example.onlinecoursee_learningapp.roomdatabase;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = {enrollmentDAO.class, userDAO.class,progressDAO.class,categoryDAO.class,courseDAO.class} ,version = 1,exportSchema = false)
public  abstract  class MyRoomDataBase  extends RoomDatabase {

    private static MyRoomDataBase instance;
    public abstract userDAO userDao();
    public abstract categoryDAO categoryDao();
    public abstract courseDAO courseDao();
    public abstract enrollmentDAO enrollmentDao();
    public abstract progressDAO progressDao();


    private static volatile MyRoomDataBase INSTANCE;

    private static final int NUMBER_OF_THREADS=4;

    static final ExecutorService databasewriteExcutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);



    public static MyRoomDataBase getInstance( final Context context) {
        if (INSTANCE == null) {
            synchronized (MyRoomDataBase.class) {
                if (INSTANCE == null) {
                }
                INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),MyRoomDataBase.class,"my_room_database"
                ).build();
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db){
            super.onCreate(db);
            databasewriteExcutor.execute(()->{

            });
        }
    };
}
