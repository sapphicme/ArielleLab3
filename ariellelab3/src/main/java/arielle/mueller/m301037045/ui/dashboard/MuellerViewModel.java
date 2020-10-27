package arielle.mueller.m301037045.ui.dashboard;

//Arielle Mueller
//Student Number: 301037045
//Sec: 002

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ArielleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ArielleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Arielle Mueller 301037045");
    }

    public LiveData<String> getText() {
        return mText;
    }
}