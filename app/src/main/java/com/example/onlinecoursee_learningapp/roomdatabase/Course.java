package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity (tableName = "course_table",
        foreignKeys = @ForeignKey(
        entity = category.class,
        parentColumns = "categoryId",
        childColumns = "categoryId",
        onDelete = ForeignKey.CASCADE
)


)
public class Course {
//    id,title,description,price

    @PrimaryKey
    private long courseid ;

    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private String price;

    public Course(){

    }

    public long getCourseid() {
        return courseid;
    }

    public void setCourseid(long courseid) {
        this.courseid = courseid;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    @NonNull
    public String getPrice() {
        return price;
    }

    public void setPrice(@NonNull String price) {
        this.price = price;
    }

    public Course(long courseid, @NonNull String title, @NonNull String description, @NonNull String price) {
        this.courseid = courseid;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}
