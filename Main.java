package lista_encadeada;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    private static Iterator<Integer> it;
    private static Scanner input = new Scanner(System.in);
    private static LinkedList<Integer> list;

    private static LinkedList<Integer> createList() {
        LinkedList<Integer> l = new LinkedList<>();
        System.out.print("Enter with a number: ");
        int n = input.nextInt();
        while(n >= 0) {
            l.add(n);
            System.out.print("Enter with a number: ");
            n = input.nextInt();
        }
        Collections.sort(l);
        return l;
    }

    private static void showList() {
        if(list == null) {
            System.out.println("\n\nThe linked list is empty!");
        }
        else {
            it = list.iterator();
            while(it.hasNext()) {
                System.out.print(it.next() + "->");
            }
        }
    }

    private static void removeElement() {
        System.out.print("\n\nEnter with a number to delete from the list: ");
        int n = input.nextInt();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == n) {
                list.remove(n);
                break;
            }
        }
    }

    public static void main(String[] args) {
        list = createList();
        showList();
        removeElement();
        showList();
    }
}
