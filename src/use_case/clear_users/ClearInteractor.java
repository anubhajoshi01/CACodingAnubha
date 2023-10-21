package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.clearDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    public void execute() {
        try {
            ArrayList<String> names = clearDataAccessObject.deleteAllUsers();
            ClearOutputData clearOutputData = new ClearOutputData(names);
            clearPresenter.prepareSuccessView(clearOutputData);
        } catch (Exception e){
            clearPresenter.prepareFailView(e.getMessage());
        }
    }
}
