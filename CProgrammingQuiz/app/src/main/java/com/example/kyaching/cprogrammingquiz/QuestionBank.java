package com.example.kyaching.cprogrammingquiz;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    List<Question> list=new ArrayList<>();
    MyDatabaseHelper myDataBaseHelper;

    public int getLength(){return list.size();}
    public String getQuestion(int a){return list.get(a).getQuestion();}
    public String getChoice(int index,int num){return list.get(index).getChoice(num-1);}
    public String getCorrectAnswer(int a){return list.get(a).getAnswer();}

    public void initQuestions(Context context){
        myDataBaseHelper = new MyDatabaseHelper(context);
        list=myDataBaseHelper.getAllQuestionsList();

        if(list.isEmpty()){
            myDataBaseHelper.addInitialQuestion(new Question("1.When  id Google acuire Android ?",new
            String[]{"2001","2002","2005","2004"},"2005"));
            myDataBaseHelper.addInitialQuestion(new Question("2.When fid Google acuire Android ?",new
                    String[]{"2001","2002","2005","2004"},"2005"));
            myDataBaseHelper.addInitialQuestion(new Question("3.When fid Google acuire Android ?",new
                    String[]{"2001","2002","2005","2004"},"2005"));
            myDataBaseHelper.addInitialQuestion(new Question("4.When fid Google acuire Android ?",new
                    String[]{"2001","2002","2005","2004"},"2005"));

            list=myDataBaseHelper.getAllQuestionsList();
        }
    }

}
