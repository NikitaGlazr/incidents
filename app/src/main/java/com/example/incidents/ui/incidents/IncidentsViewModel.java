package com.example.incidents.ui.incidents;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IncidentsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public IncidentsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Это фрагмент инцидентов");
    }

    public LiveData<String> getText() {
        return mText;
    }
}