public class lesson_3 {
    public static void main(String[] args) {
//        try {
//            doSomething();
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Exception" + e.getMessage());
//        }

        String [][] myArray = new String[][]{{"1", "dgh", "4", "6"},{"2", "4", "5", "7"},{"1", "2", "4", "6"},{"2", "4", "5", "7"}};

        try {
            System.out.println(sumArray(myArray));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static void doSomething() throws IndexOutOfBoundsException {
        System.out.println();

    }


    private static int sumArray(String [][] argArray) throws Exception {
        int sumArr = 0;
        if (argArray.length != 4 || argArray[0].length != 4) {
            throw new myArraySizeException();
        } else {
            for (int i = 0; i < argArray.length; i++) {
                for (int j = 0; j < argArray.length; j++) {
                    try {
                        sumArr += Integer.parseInt(argArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new myArrayDataException(i, j);
                    }
                }

            }
        }
        return sumArr;

    }

    public static class myArraySizeException extends Exception {
        public myArraySizeException() {
            super("Размер массива не равен 4x4!");
        }
    }
    public static class myArrayDataException extends Exception {

        public myArrayDataException(int indexI, int indexJ) {
            super("Ячейка массива с индексами " + indexI + " "+ indexJ + " не содержит числовые данные!");

        }
    }
}
