package com.example.assignment10;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "screen_log")
public class EntityScreen {
    @PrimaryKey(autoGenerate = true)
    int id_screen_log;
    Date timestamp;
}
