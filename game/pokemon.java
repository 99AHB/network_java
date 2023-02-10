package game;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("총 마리의 포켓몬이 생성되었습니다");
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
            String menu = sc.nextLine();
            String pokemons = sc.nextLine();
            if (menu.equals("2")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (menu.equals("1")) {
                System.out.println("1) 피카츄 2) 꼬부기 3) 파이리 :");
                if(pokemons.equals("1")){
                    //피카츄 클레스 호출
                }
                else if(pokemons.equals("2")){
                    //꼬부기 클레스 호출
                }
                else if(pokemons.equals("3")){
                    //파이리 클레스 호출
                }
            } else {
                System.out.println("메뉴에서 골라 주세요");
            }
        }
    }
}


