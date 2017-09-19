package drafts;

public class DraftClass4OOP {

    private String variable;

    public String getVariable() {
        return variable;
    }

    public DraftClass4OOP(String variable) {
        this.variable = variable;
    }

    public void setVariable(String variable) {
        if ((variable!=null)||(variable=="0")) {
            this.variable = variable;
        }
        else
        {
            this.variable = "1";
        }
    }
}
