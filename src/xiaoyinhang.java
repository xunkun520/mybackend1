import java.util.Scanner;
public class xiaoyinhang {
   public static void main(String[] args) {
        long balance =0;
       Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.显示余额");
            System.out.println("4.退出");
            System.out.println("请输入选项前的数字");
            int num = scanner.nextInt();
            if(num==4){
                System.out.println("谢谢使用！");
                break;
            }
            switch (num) {
                case 1:
                    System.out.println("请输入存款金额");
                    long amountdeposited=scanner.nextLong();
                    if(amountdeposited>=0) {
                        balance += amountdeposited;
                        System.out.println("余额" + balance);
                    }else{
                        System.out.println("存款金额必须为正数！！！");
                    }
                    break;
                case 2:
                    System.out.println("请输入取款金额");
                    long amountwithdrawn=scanner.nextLong();
                    if(balance>=amountwithdrawn&&amountwithdrawn>=0){
                        balance-=amountwithdrawn;
                        System.out.println("余额"+balance);
                    }else if(amountwithdrawn<0){
                        System.out.println("取款金额必须为正数！！！");
                    }else if(balance<amountwithdrawn){
                        System.out.println("余额不足");
                    }
                    break;
                case 3:
                    System.out.println("余额"+balance);
                    break;
                default:
                    System.out.println("请重新输入");
                    break;
            }
        }


    }
}
