package com.example.viewmodeljava;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class viewModel extends ViewModel {

    public final MutableLiveData<Integer> colorValue = new MutableLiveData<>();

    public void setColor(int color){
       //int Color = 6;
       colorValue.setValue(color);
    }

    public LiveData<Integer> GetColor(){
        return colorValue;
    }
}
