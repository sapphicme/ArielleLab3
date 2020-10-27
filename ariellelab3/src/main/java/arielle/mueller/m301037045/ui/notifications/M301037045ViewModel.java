package arielle.mueller.m301037045.ui.notifications;

//Arielle Mueller
//Student Number: 301037045
//Sec: 002

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class M301037045ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public M301037045ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}