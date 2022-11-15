package diary;
import java.util.*;
public interface IDiaryService {
    public void regist();
    public ArrayList<Diary> selectAll();
    public Diary selectOne();
}
