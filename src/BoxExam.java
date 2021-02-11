public class BoxExam {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();
        // Object 타입은 모든 클래스를 받을 수 있다.
        // 사용할 때는 형변환을 해주어야 한다.
        box.setObj("hello");
        String str = (String)box.getObj();
        System.out.println(str);

        box.setObj(1);
        int value = (int)box.getObj();

        // Java5 부터 추가된 Generic 을 이용하면 더 편하게 사용 가능
        BoxGeneric<Object> box2 = new BoxGeneric<>();
        box.setObj(new Object());
        Object obj2 = box.getObj();
        // 사용할 때 매번 형변환을 할 필요가 없다.
        // 대신 String 만 받을 수 있다.
        BoxGeneric<String> box3 = new BoxGeneric<>();
        box3.setObj("hello");
        String str2 = box3.getObj();

        BoxGeneric<Integer> box4 = new BoxGeneric<>();
        box4.setObj(4);
        int v2 = box4.getObj();
    }
}
