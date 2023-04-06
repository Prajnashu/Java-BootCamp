package week2.customCollection.question6;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CustomHashSetEquality {

    public static void printSets(HashSet<Document> h1, HashSet<Document> h2) {
        System.out.println("HashSet1");
        for(Document d: h1) {
            System.out.println(d.getDocumentId());
        }
        System.out.println("HashSet2");
        for(Document d: h2) {
            System.out.println(d.getDocumentId());
        }
    }

    public static void addToSet(HashSet<Document> h) {
        Random rand = new Random();
        int r = rand.nextInt(6);
        System.out.println("documentId " + r + " added.");
        h.add(new Document(r));
    }

    public static void main(String[] args) {
        HashSet<Document> hSetDocuments1 = new HashSet<Document>();
        Scanner sc = new Scanner(System.in);

        hSetDocuments1.add(new Document(1));
        hSetDocuments1.add(new Document(2));
        hSetDocuments1.add(new Document(3));
 
        HashSet<Document> hSetDocuments2 = new HashSet<Document>();
        
        hSetDocuments2.add(new Document(1));
        hSetDocuments2.add(new Document(2));
        hSetDocuments2.add(new Document(3));

        System.out.println("""
                Enter 1 to show both the hashSets
                Enter 2 to add to hashSet1
                Enter 3 to add to hashSset2
                Enter 4 to check if they are equal
                Enter 0 to exit
                """);

        int option = -1;
        while(option != 0) {
            System.out.println("Enter your choice");
            if(sc.hasNextInt())
                option = sc.nextInt();
            switch(option) {
                case 1:
                    printSets(hSetDocuments1, hSetDocuments2);
                    break;
                case 2:
                    addToSet(hSetDocuments1);
                    break;
                case 3:
                    addToSet(hSetDocuments2);
                    break;
                case 4:
                    System.out.println("Are the sets equal ? : " + hSetDocuments1.equals(hSetDocuments2));
                    break;
                case 0: 
                    return;
                default: 
                    System.out.println("Invalid choice");
        }
    
    }
            
    }
    
}

class Document{
    
    private int documentId;
    
    public Document(int documentId){
        this.documentId = documentId;
    }
    
    public String toString(){
        return "Document: " + documentId;
    }

    public int getDocumentId() {
        return this.documentId;
    }
 
    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + documentId;
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Document other = (Document) obj;
        if (documentId != other.documentId)
            return false;
        return true;
    }    
}