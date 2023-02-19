// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
// заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.

package Homework.Seminar_01;

public class Task_04 {
    public static void main(String[] args) {
        String xyz="2?+?5=69";
        solution(xyz);
    }

    public static void solution(String xyz) {
        int a1,a2,b1,b2,c1,c2=0;
        boolean[]compr=new boolean[]{false,false,false,false,false,false};
        boolean isSol=false;

        if (xyz.charAt(0)=='?') compr[0]=true;
        if (xyz.charAt(1)=='?') compr[1]=true;
        if (xyz.charAt(3)=='?') compr[2]=true; 
        if (xyz.charAt(4)=='?') compr[3]=true;       
        if (xyz.charAt(6)=='?') compr[4]=true; 
        if (xyz.charAt(7)=='?') compr[5]=true; 

        for (int ia = 0; ia < 100; ia++) {
            for (int ib = 0; ib < 100; ib++) {
                for (int ic = 0; ic < 100; ic++) {

                    a1=ia/10;
                    a2=ia%10;
                    b1=ib/10;
                    b2=ib%10;
                    c1=ic/10;
                    c2=ic%10;

                    if (compr[0]==false) a1=Character.getNumericValue(xyz.charAt(0));
                    if (compr[1]==false) a2=Character.getNumericValue(xyz.charAt(1));
                    if (compr[2]==false) b1=Character.getNumericValue(xyz.charAt(3));
                    if (compr[3]==false) b2=Character.getNumericValue(xyz.charAt(4));
                    if (compr[4]==false) c1=Character.getNumericValue(xyz.charAt(6));
                    if (compr[5]==false) c2=Character.getNumericValue(xyz.charAt(7));

                        if (a1*10+a2+b1*10+b2==c1*10+c2){
                            System.out.println(""+a1+a2+" + "+b1+b2+" = "+c1+c2);
                            ia=100;
                            ib=100;
                            ic=100;
                            isSol=true;
                        break;}
                } 
            }
        }
        if (!isSol) System.out.println("нет решений");
    }

}