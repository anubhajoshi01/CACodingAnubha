package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {

    private ArrayList<String> clearedNames;
    private String clearNamesError = "";

    public ClearState(ClearState copy) {
        this.clearedNames = (ArrayList<String>) copy.clearedNames.clone();
        this.clearNamesError = copy.clearNamesError;
    }

    public ClearState() {}

    public ArrayList<String> getClearedNames() {
        return clearedNames;
    }

    public String getClearNamesError() {
        return clearNamesError;
    }

    public void setClearedNames(ArrayList<String> names) {
        clearedNames = (ArrayList<String>) names.clone();
    }

    public void setClearNamesError(String error) {
        this.clearNamesError = error;
    }
}
