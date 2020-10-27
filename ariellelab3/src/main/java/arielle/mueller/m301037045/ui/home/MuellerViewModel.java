package arielle.mueller.m301037045.ui.home;

//Arielle Mueller
//Student Number: 301037045
//Sec: 002

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MuellerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MuellerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}