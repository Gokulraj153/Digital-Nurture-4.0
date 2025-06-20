public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("image1.jpg");
        Image img2 = new ProxyImage("image2.jpg");

        System.out.println("\n--- First time loading image1 ---");
        img1.display();

        System.out.println("\n--- Second time loading image1 ---");
        img1.display();

        System.out.println("\n--- First time loading image2 ---");
        img2.display();
    }
}