package arrays;

public class twoDArray {
    public static void main(String[] args){
        // 2D arrays.Array =  An array where each element is an array
        //             Useful for storing a matrix of data

//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork","beef", "fish"};

//        String[][] groceries = {{"apple", "orange", "banana"},
//                                {"potato", "onion", "carrot"},
//                                {"chicken", "pork","beef", "fish"}};
//        groceries[2][1] = "egg";
//
//        for(String[] foods : groceries){
//            for(String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }

        // Mini-Project (2D telephone number pad)
        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number +" ");
            }
            System.out.println();
        }

    }
}
