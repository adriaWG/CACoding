package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String allsusername="";
    public ClearState(ClearState copy){allsusername= copy.allsusername;}
    public ClearState(){}

    public String getAllsusername(){return allsusername;}
    public void setAllsusername(String allsusername){this.allsusername=allsusername;}
}
