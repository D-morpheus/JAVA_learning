package test4;

public class Library {
    // Add the missing implementation to this class
    Book books[] = new Book[100];
    int count = 0;
    //成员变量
    private String address;
    //成员方法
    Library(String address)
    {
        this.address = address;
    }
    public void printAddress(){
        System.out.println(this.address);
    }
    public void addBook(Book b)
    {
        books[count] = b;
        count++;
    }

    public void borrowBook(String booktitle) {
        int i = 0;
        while (books[i] != null) {
            if (books[i].title.equals(booktitle)) {
                if (books[i].borrowed == false) {
                    System.out.println("You successfully borrowed The Lord of the Rings");
                    books[i].borrowed = true;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
            i++;
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void printAvailableBooks(){
        int i = 0;
        while (books[i] != null) {
            if (books[i].borrowed == false) {
                System.out.println(books[i].title);
            }
            i++;
        }
        if(i == 0)
        {
            System.out.println("No book in catalog");
        }
    }

    public void returnBook(String booktitle){
        int i = 0;
        while (books[i] != null) {
            if (books[i].title.equals(booktitle)) {
                books[i].borrowed = false;
                System.out.println("You successfully returned The Lord of the Rings");
            }
            i++;
        }
    }

}

