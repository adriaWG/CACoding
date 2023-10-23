package use_case.clear_users;

// TODO Complete me

import interface_adapter.clear_users.ClearPresenter;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter= clearOutputBoundary;
    }

    public void execute(ClearInputData clearInputData) {

        ClearOutputData clearOutputData=new ClearOutputData(userDataAccessObject.getallusername(),false);
        userDataAccessObject.clearUsers();
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
