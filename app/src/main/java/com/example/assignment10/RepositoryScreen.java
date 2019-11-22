package com.example.assignment10;

import android.app.Application;
import android.os.AsyncTask;

import java.util.Date;
import java.util.List;

public class RepositoryScreen {
    private DaoScreen daoScreen;

    public RepositoryScreen(Application app) {
        com.example.assignment10.Database db = Database.getDatabase(app);
        daoScreen = db.daoScreen();
    }

    List<EntityScreen> getScreenOnOff(Date timestamp) {
        return daoScreen.getScreenOnOff(timestamp);

    }

    public void insert(EntityScreen screen) {
        new insertAsyncTask(daoScreen).execute(screen);
    }

    private static class insertAsyncTask extends AsyncTask<EntityScreen, Void, Void> {
        private DaoScreen mAsyncTaskDao;

        insertAsyncTask(DaoScreen dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(EntityScreen... entityScreens) {
            mAsyncTaskDao.insert(entityScreens[0]);
            return null;
        }
    }
}
