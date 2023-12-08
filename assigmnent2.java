public class assigmnent2 {
    public static void main(String args[]){
        Answer a=new Answer(10,"mcq");
    }
}
class Answer{
     void Answer(){
        System.out.println("you got nothing");   
    }
     void Answer(int marks,String type){
System.out.println(this);
        System.out.println("you got"+marks+"for an"+type);
    }
}
