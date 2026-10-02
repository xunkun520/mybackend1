import java.util.Scanner;
public class xiaoyinhang {
    static void main(String[] args) {
        long je =0;
        while(true){
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.显示余额");
            System.out.println("4.退出");
            System.out.println("请输入选项前的数字");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if(num==4){
                System.out.println("谢谢使用！");
                break;
            }
            switch (num) {
                case 1:
                    System.out.println("请输入存款金额");
                    long jia=scanner.nextLong();
                    je+=jia;
                    System.out.println("余额"+je);
                    break;
                case 2:
                    System.out.println("请输入取款金额");
                    long qu=scanner.nextLong();
                    if(je>=qu){
                        je-=qu;
                        System.out.println("余额"+je);
                    }else{
                        System.out.println("余额不足");
                    }
                    break;
                case 3:
                    System.out.println("余额"+je);
                    break;
                default:
                    System.out.println("请重新输入");
                    break;
            }
        }


    }
}
