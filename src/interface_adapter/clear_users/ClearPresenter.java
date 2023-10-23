package interface_adapter.clear_users;

import interface_adapter.login.LoginViewModel;
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


// TODO Complete me


public class ClearPresenter implements ClearOutputBoundary {
    
        private final ClearViewModel clearViewModel;
        private final LoginViewModel loginViewModel;
        private ViewManagerModel viewManagerModel;
    
        public ClearPresenter(ViewManagerModel viewManagerModel,
                            ClearViewModel clearViewModel,
                            LoginViewModel loginViewModel) {
            this.viewManagerModel = viewManagerModel;
            this.clearViewModel = clearViewModel;
            this.loginViewModel = loginViewModel;
        }

        @Override
        public void prepareSuccessView(ClearOutputData response) {
            ClearState clearState = clearViewModel.getState();
            clearState.setAllsusername(response.getallUsername());
            this.clearViewModel.setState(clearState);
            this.clearViewModel.firePropertyChanged();

        }
        @Override
        public void prepareFailView(String error) {
        }
}
