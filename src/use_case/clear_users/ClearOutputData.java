package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    
    private boolean useCaseFailed;
    private String allusername;
    
    public ClearOutputData(String allusername,boolean useCaseFailed) {
        this.allusername=allusername;
        this.useCaseFailed = useCaseFailed;
    }

    public String getallUsername() {
        return allusername;
    }
   
}
