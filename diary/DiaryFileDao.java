package diary;
import java.io.*;
import java.util.*;
public class DiaryFileDao {
    ArrayList<Diary> list = new ArrayList<>();

    public void insert(Diary diary){
        list.add(diary);
    }

}
