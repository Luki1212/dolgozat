public class Exam extends Grades{
    public void registGradeToSubject(String subjet,String grade){
        for (String[] gad:grades) {
            if(gad[0] == subjet){
                gad[1] = grade;
            }

        }
    }
}
