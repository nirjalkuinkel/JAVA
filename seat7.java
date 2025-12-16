public class seat7 {
    public static void main(String[] N) {
        String[][] seats=new String[2][3];
        seats[0][0]= "Ram";
        seats[0][1]= "Sita";
        seats[0][2] = "Hari";
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                if(seats[i][j] == null||seats[i][j].equals("")) {
                    System.out.print("[empty] ");
                } else{
                    System.out.print(seats[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
