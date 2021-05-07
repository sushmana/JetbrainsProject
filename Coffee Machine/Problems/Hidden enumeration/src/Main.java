public class Main {

//    enum Secret{
//        STAR, CRASH, START
//    }

    public static void main(String[] args) {
        int count=0;
        for(Secret s:Secret.values()){
            if(s.toString().startsWith("STAR")){
                count++;}
        }
        System.out.println(count);
    }
}
