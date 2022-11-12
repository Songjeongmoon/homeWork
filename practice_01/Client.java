package practice_01;

public class Client {

    private String name;
    private String account;
    private String pw;
    private int input;
    private int output;
    private int deposit;

    public Client (String name, String account, String pw, int deposit) {
        this.name = name;
        this.account = account;
        this.pw = pw;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String accout) {
        this.account = account;
    }
    public String getPw() {return pw;}
    public void setPw(String pw) {
        this.pw = pw;
    }
    public int getDeposit() {
        return deposit;
    }
    public void setDeposit(int money) {
        this.deposit += money;
    }

}
