package diary;

import java.util.*;

public class DiaryService implements IDiaryService {
    Scanner scan = new Scanner(System.in);
    DiaryDao db = new DiaryDao();

    @Override
    public void regist() {
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
    }

    @Override
    public ArrayList<Diary> selectAll() {
        return db.getList();
    }

    @Override
    public Diary selectOne() {
        System.out.print("번호를 입력해주세요.\n >> : ");
        String num = scan.nextLine();
        return db.getDiary(num);
    }
}