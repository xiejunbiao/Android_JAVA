public class chird_class extends GetToken{

    public static void main(String[] args) {
        GetToken gt = new GetToken();
        gt.num = 90;
        System.out.println(gt.num);
        System.out.println(gt.get_token(12, 32));
    }
}
