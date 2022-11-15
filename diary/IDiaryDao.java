package diary;
import java.util.*;
public interface IDiaryDao {
    public void insert(Diary diary);
    public ArrayList<Diary> getList();
    public Diary getDiary(String num);
}
