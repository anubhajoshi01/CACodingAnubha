package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {

    private final ArrayList<String> clearedNames;

    public ClearOutputData(ArrayList<String> clearedNames){
        this.clearedNames = clearedNames;
    }

    public ArrayList<String> getClearedNames(){
        return clearedNames;
    }
}
