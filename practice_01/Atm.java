package practice_01;
import java.util.*;

public class Atm {
    Scanner scan = new Scanner(System.in);
    Bank bank = new Bank();

    public void regClient() {
            System.out.print("이름\n >> : ");
            String name = scan.nextLine();
            System.out.print("계좌번호\n >> : ");
            String account = scan.nextLine();
            System.out.print("비밀번호\n >> : ");
            String pw = scan.nextLine();
            System.out.print("초기 입금액\n >> : ");
            int deposit = scan.nextInt();
            Client client = new Client(name, account, pw, deposit);
            bank.regClient(client);
    }
    public Client auth() {
        System.out.print("계좌번호를 입력해주세요.\n >> : ");
        String account = scan.nextLine();
        return bank.auth(account);
    }
    public void input(){
        System.out.print("입금하시려는 계좌번호를 입력해주세요.\n >> : ");
        String account = scan.nextLine();
        bank.input(account);
    }
    public void output(Client client){
        System.out.print("금액을 입력해주세요.\n >> : ");
        int money = scan.nextInt();
        bank.output(money, client);
    }

    public void showMyDeposit(Client client){
        bank.showMyDeposit(client);
    }

}
