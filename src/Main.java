import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book>list=new ArrayList<>();
        list.add(new Book("A",100,"Reco",2012));
        list.add(new Book("B",80,"Resul",2000));
        list.add(new Book("C",120,"Yahya",2013));
        list.add(new Book("D",110,"Reis",2014));
        list.add(new Book("E",70,"Ali",2015));
        list.add(new Book("F",750,"Veli",2001));
        list.add(new Book("G",130,"Anil",2016));
        list.add(new Book("H",140,"Cem",2017));
        list.add(new Book("J",150,"Batu",2018));
        list.add(new Book("K",160,"Boz",2010));
        Map<String,String> mapList=new TreeMap<>();
        list.stream().filter(book -> book.getPageNumber()>100).forEach(book -> mapList.put(book.getBookNam(),book.getAuthorName()));
        mapList.forEach((name,author)->System.out.println("Book Name: "+name+",Author Name: "+author));

    }
}
