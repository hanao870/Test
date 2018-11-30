class Hello {
    public static void main(String[] args) {
        System.out.println("aiueo");
        System.out.println("あいうえお");

        HelloForLoop();
    }

    private static void HelloForLoop()
    {
        for(int i = 0; i < 10; i++)
            System.out.println(i + " : Hello");
    }
}
