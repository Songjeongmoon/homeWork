package diary;

import java.util.*;

public class DiaryDao implements IDiaryDao{
    ArrayList<Diary> list = new ArrayList<>();
    @Override
    public void insert(Diary diary) {
        list.add(diary);
    }

    @Override
    public ArrayList<Diary> getList() {
        return list;
    }

    @Override
    public Diary getDiary(String num) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNum().equals(num)){
                return list.get(i);
            }
        }
        return null;
    }
}
