package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;



@Entity(
        tableName = "enrollment_table",
        foreignKeys = {
                @ForeignKey(entity = User.class, parentColumns = "userId", childColumns = "userId", onDelete = ForeignKey.CASCADE),
                @ForeignKey(entity = Course.class, parentColumns = "courseId", childColumns = "courseId", onDelete = ForeignKey.CASCADE)
        }
)

public class enrollment {
//    id,userID,courseID,Date


    @PrimaryKey(autoGenerate = true)
    private int enrollmentId;
@NonNull
    private int userId;
@NonNull
    private int courseId;
@NonNull
    private Date date;

public enrollment(){

}

    public enrollment(int id, int userId, int courseId, @NonNull Date date) {
        this.enrollmentId = enrollmentId;
        this.userId = userId;
        this.courseId = courseId;
        this.date = date;
    }

    public int getId() {
        return enrollmentId;
    }

    public void setId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @NonNull
    public Date getDate() {
        return date;
    }

    public void setDate(@NonNull Date date) {
        this.date = date;
    }

}
