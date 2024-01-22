public class Main {
    public static void main(String[] args) {
        System.out.println(RootUserLazy.getInstance().toString());
        System.out.println(RootUserStatic.getInstance().toString());
        System.out.println(RootUserEnum.INSTANCE.toString());
    }
}