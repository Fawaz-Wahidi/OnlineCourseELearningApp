package com.example.onlinecoursee_learningapp.roomdatabase;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "progress",
        foreignKeys = @ForeignKey(
                entity = enrollment.class, // الربط مع جدول Enrollment
                parentColumns = "enrollmentId", // العمود الرئيسي في جدول Enrollment
                childColumns = "enrollmentId", // العمود في جدول Progress
                onDelete = ForeignKey.CASCADE // حذف تلقائي عند حذف السجل المرتبط
        )
)

public class progress {
    @PrimaryKey(autoGenerate = true)
    private int progressId; // المفتاح الرئيسي

    private int enrollmentId; // المفتاح الأجنبي المرتبط بجدول Enrollment

    private String lessonName;
    private boolean isCompleted;

    // Getters and Setters
    public int getProgressId() {
        return progressId;
    }

    public void setProgressId(int progressId) {
        this.progressId = progressId;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}


