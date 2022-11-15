package diary;

public class Diary {
    private Date date;
    private String num;
    private String title;
    private String content;

    public Diary (Date date, String title, String content){
        this.date = date;
        this.num = date.toString();
        this.title = title;
        this.content = content;
    }
    @Override
    public String toString(){
        return num + "," + date.toString() + "," + title + "," + content;
    }

    public String getDate(){
        return date.toString();
    }

    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }

    public String getNum(){
        return num;
    }

}
