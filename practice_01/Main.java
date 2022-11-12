package practice_01;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Atm atm = new Atm();

        int what = 0;
        while(what != 5){
            System.out.print("1.입금 2.출금 3.잔고확인 4.계좌개설 5.종료\n >> : ");
            what = scan.nextInt();
            if(what <= 0 || what > 5) {
                System.out.println("다시 확인해주세요...");
                continue;
            }
            switch (what){

                case 1 :
                    atm.input();
                    break;
                case 2 :
                    Client client = atm.auth();
                    if(client != null){
                        atm.output(client);
                    }
                    break;
                case 3 :
                    client = atm.auth();
                    if(client != null){
                        atm.showMyDeposit(client);
                    }
                    break;
                case 4 :
                    atm.regClient();
                    break;
                case 5 :
                    System.out.println("종료...");
                    break;
            }

        }
    }
}
