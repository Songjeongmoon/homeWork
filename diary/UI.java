package diary;
import java.util.*;
public class UI {
    DiaryDao db = new DiaryDao();
    Scanner scan = new Scanner(System.in);

    public void showMain(){
        while(true) {
            System.out.print("1. 일기작성 2. 일기조회 3. 종료\n >> : ");
            int select = scan.nextInt();
            scan.nextLine();
            switch (select) {
                case 1:
                    regist();
                    break;
                case 2:
                    showDiaryList();
                    break;
                case 3:
                    System.out.println("시스템이 종료됩니다...");
                    break;
                default :
                    System.out.println("잘못누르셨습니다 시스템이 종료됩니다...");
                    break;
            }
            if(select != 1 || select != 2) break;
        }
    }
    public void regist(){
        System.out.print("날짜를 입력해주세요.(yyyy,MM,dd)\n >> : ");
        String days = scan.nextLine();
        System.out.print("제목을 입력해주세요.\n >> : ");
        String title = scan.nextLine();
        System.out.print("내용을 입력해주세요.\n >> : ");
        String content = scan.nextLine();

        String[] temp = days.split(",");
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);
        Date date = new Date(year, month, day);
        Diary diary = new Diary(date, title, content);
        db.insert(diary);
        System.out.print("작성 완료... \n1. 메인화면 2.시스템종료\n >> : ");
        int select = scan.nextInt();
        scan.nextLine();
        if(select == 1){
            showMain();
            return;
        } else if(select == 2){
            System.out.println("시스템이 종료됩니다...");
            return;
        } else {
            System.out.println("잘못 누르셨습니다 메인화면으로 이동합니다...");
            showMain();
            return;
        }
    }

    public void showDiaryList(){
        ArrayList<Diary> list = db.getList();
        System.out.println("번호     :날짜     :제목");
        for(Diary e : list){
            System.out.print(e.getNum() + "|");
            System.out.print(e.getDate() + "|");
            System.out.println(e.getTitle() + "|");
        }
        System.out.print("1. 메인화면 2. 상세조회\n >> : ");
        int select = scan.nextInt();
        scan.nextLine();
        if(select == 1){
            showMain();
            return;
        } else if(select == 2){
            showDiaryOne();
            return;
        }
    }

    public void showDiaryOne(){
        ArrayList<Diary> list = db.getList();
        System.out.print("상세조회 하시려는 일기장의 번호를 입력해주세요.\n >> : ");
        String num = scan.nextLine();
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum().equals(num)) {
                System.out.println(list.get(i));
            }
        }
        System.out.print("1. 메인화면 2. 종료\n >> : ");
        int select = scan.nextInt();
        scan.nextLine();
        if(select == 1){
            showMain();
            return;
        } else if(select == 2){
            System.out.println("시스템이 종료됩니다...");
            return;
        } else {
            System.out.println("잘못 누르셨습니다 메인화면으로 이동합니다...");
            showMain();
            return;
        }
    }

}
