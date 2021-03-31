public class Student {
    public static void main(String[] args){
    Score[] score;
    score = new Score[100]; 
   

    for(int i=0;i<100;i++){
        double s = Math.random() * 100;
        score[i]= new Score();
        score[i].setScore(s);
    }   
    for(int i=0;i<100;i++){
        System.out.println(score[i].getScore());
    }
    }
}