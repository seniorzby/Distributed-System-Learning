public class SingleServerCrash {
    static int stock = 10;
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                if (stock > 0) {
                    try { Thread.sleep(10);  } catch (Exception e) {}
                    stock--;
                }
            }).start();
        }
        Thread.sleep(2000); 
        System.out.println(" 最终库存：" + stock);
    }
}
