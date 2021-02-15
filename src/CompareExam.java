public class CompareExam {
    public static void exec(Compare compare){
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        // 어떻게 구현하는지에 따라서 결과값이 달라진다.
        exec((i, j)->{
            return i - j;
        });
    }
}
