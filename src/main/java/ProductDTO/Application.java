package ProductDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Map<Integer, Product> pMap = new HashMap<>() {};
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====== 상품 관리 프로그램 ======");
            System.out.println("1. 상품 등록");
            System.out.println("2. 상품 조회");
            System.out.println("3. 상품 수정");
            System.out.println("4. 상품 삭제");
            System.out.println("5. 전체 상품 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("원하는 번호를 입력하세요. ");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.print("상품 등록을 시작합니다.");
                    System.out.print("상품 번호를 입력하세요.");
                    int code = sc.nextInt();
                    sc.nextLine();
                    System.out.print("상품명을 입력하세요. ");
                    String name = sc.nextLine();
                    System.out.print("제조사를 입력하세요.");
                    String brand = sc.nextLine();
                    System.out.print("중고상품인가요? (true/false): ");
                    boolean isUsed = sc.nextBoolean();

                    controller.addProduct(code, name, brand, isUsed);
                    break;
                case 2:
                    System.out.print("조회할 상품의 번호를 입력하세요. ");
                    code = sc.nextInt();
                    controller.getProduct(code);
                    break;
                case 3:
                    System.out.print("수정할 상품의 번호를 입력하세요.");
                    code = sc.nextInt();
                    System.out.print("새로운 상품명 : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("새로운 제조사 : ");
                    brand = sc.nextLine();

                    controller.updateProduct(code, name, brand);
                    break;
                case 4:
                    System.out.print("삭제할 상품의 번호를 입력하세요.");
                    code = sc.nextInt();
                    controller.deleteProduct(code);
                    break;
                case 5:
                    System.out.print("전체 상품을 조회합니다.");
                    controller.getAllProducts();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }

}