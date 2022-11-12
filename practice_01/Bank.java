package practice_01;
import java.util.*;

public class Bank {
    Scanner scan = new Scanner(System.in);
    ArrayList<Client> list = new ArrayList<>();

    public void regClient(Client client){
        list.add(client);
    }
    public Client auth(String account){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAccount().equals(account)){
                System.out.print("비밀번호를 입력해주세요.\n >> : ");
                String pw = scan.nextLine();
                if(list.get(i).getPw().equals(pw)) {
                    return list.get(i);
                }
            }
        }
        System.out.println("계좌번호를 확인해주세요.");
        return null;
    }
    public void input(String account) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAccount().equals(account)){
                System.out.print("입금 금액\n >> : ");
                int money = scan.nextInt();
                list.get(i).setDeposit(money);
                System.out.println(money + "원 입금완료 되었습니다.");
                return;
            }
        }
        System.out.println("계좌번호를 다시 확인해주세요.");

    }
    public void output(int money, Client client) {
        client.setDeposit(-money);
    }
    public void showMyDeposit(Client client){
        System.out.print(client.getName() + "님의 현재 잔금은\n >> : " + client.getDeposit() + "원 입니다.");
    }


}
