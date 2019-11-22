package com.example.assignment10;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.Date;
import java.util.List;

public class ModelScreen extends AndroidViewModel {
    private RepositoryScreen mRepository;

    public ModelScreen(@NonNull Application application) {
        super(application);
        this.mRepository = new RepositoryScreen(application);
    }

    void insert(EntityScreen screen) {
        mRepository.insert(screen);
    }

    @SuppressLint("StaticFieldLeak")
    public void showData(final RwAdapterScreen adapter, final Date date) {
        new AsyncTask<Void, Void, List<EntityScreen>>() {
            @Override
            protected List<EntityScreen> doInBackground(Void... params) {
                return mRepository.getScreenOnOff(date);
            }

            @Override
            protected void onPostExecute(List<EntityScreen> items) {
                adapter.setNameDates(items);
            }
        }.execute();
    }

}
