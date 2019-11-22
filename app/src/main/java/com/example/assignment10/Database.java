package com.example.assignment10;


import android.content.Context;
import android.provider.ContactsContract;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@androidx.room.Database(entities = {EntityScreen.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class Database extends RoomDatabase {
    private static volatile Database INSTANCE;

    static Database getDatabase(final Context context) {
        if(INSTANCE == null) {
            synchronized (Database.class) {
                if(INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), Database.class, "database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    public abstract DaoScreen daoScreen();

}
