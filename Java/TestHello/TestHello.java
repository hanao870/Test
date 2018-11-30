class Hello {
    public static void main(String[] args) {
        System.out.println("aiueo");
        System.out.println("あいうえお");

        HelloStr("World!");
        HelloForLoop();
    }

    private static void HelloStr(String w)
    {
        System.out.println("Hello " + w);
    }

    private static void HelloForLoop()
    {
        for(int i = 0; i < 10; i++)
            System.out.println(i + " : Hello");
    }
}
