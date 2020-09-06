package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if(first > second && first > third){
             result = first;
        }else if(second > first && second > third){
             result = second;
        }else if(third > first && third > second){
            result = third;
        }
        return result;
    }

    public static void main(String[] args){
        int check = MultiMax.max(4,5,8);
        System.out.println(check);
    }
}
