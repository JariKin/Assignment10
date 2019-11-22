package com.example.assignment10;

import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.Date;
import java.util.List;

@Dao
public interface DaoScreen {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(EntityScreen listItem);

    @Query("SELECT * FROM screen_log WHERE timestamp = :timestamp;")
    List<EntityScreen> getScreenOnOff(Date timestamp);
}
