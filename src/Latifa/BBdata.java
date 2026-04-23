package Latifa;

/*
 * Data Layer - Borrow Book Use Case
 * This class is responsible for storing and managing all system data.
 * It simulates a database by storing books and members in arrays.
 * It provides methods to search, update, and retrieve data.
 */
public class BBdata {

    // book data arrays - each index represents one book
    private String[] bookIds     = {"B001", "B002", "B003", "B004"};
    private String[] bookTitles  = {"Clean Code", "Design Patterns", "Python Crash Course", "The Pragmatic Programmer"};
    private String[] bookAuthors = {"Robert C. Martin", "Gang of Four", "Eric Matthes", "Andrew Hunt"};
    private int[]    bookCopies  = {2, 0, 3, 1};

    // member data arrays - each index represents one member
    private String[]  memberIds    = {"M001", "M002", "M003", "M004"};
    private String[]  memberNames  = {"Latifa Yousif", "Noor Hasan", "Hasan Ali", "Nasser Abdullah"};
    private boolean[] memberActive = {true, true, false, true};
    private int[]     borrowCount  = {0, 0, 0, 0};

    // maximum books a member can borrow at one time
    private int borrowLimit = 3;

    /*
     * Searches for a book by its ID and returns its title.
     * Returns null if the book ID does not exist.
     */
    public String getBookTitle(String id) {
        for (int i = 0; i < bookIds.length; i++) {
            if (bookIds[i].equals(id)) {
                return bookTitles[i];
            }
        }
        return null;
    }

    /*
     * Returns the author name of a book by its ID.
     * Returns null if the book is not found.
     */
    public String getBookAuthor(String id) {
        for (int i = 0; i < bookIds.length; i++) {
            if (bookIds[i].equals(id)) {
                return bookAuthors[i];
            }
        }
        return null;
    }

    /*
     * Returns the number of available copies for a specific book.
     * Returns -1 if the book ID is not found.
     */
    public int getAvailableCopies(String id) {
        for (int i = 0; i < bookIds.length; i++) {
            if (bookIds[i].equals(id)) {
                return bookCopies[i];
            }
        }
        return -1;
    }

    /*
     * Decreases the available copies of a book by 1.
     * Called when a borrow request is successfully approved.
     */
    public void decreaseCopy(String id) {
        for (int i = 0; i < bookIds.length; i++) {
            if (bookIds[i].equals(id)) {
                bookCopies[i]--;
                return;
            }
        }
    }

    /*
     * Checks whether a given book ID exists in the system.
     * Returns true if found, false otherwise.
     */
    public boolean bookExists(String id) {
        for (String bookId : bookIds) {
            if (bookId.equals(id)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Searches for a member by their ID and returns their name.
     * Returns null if the member ID does not exist.
     */
    public String getMemberName(String id) {
        for (int i = 0; i < memberIds.length; i++) {
            if (memberIds[i].equals(id)) {
                return memberNames[i];
            }
        }
        return null;
    }

    /*
     * Checks if a member account is currently active.
     * Returns false if the member is not found or account is inactive.
     */
    public boolean isMemberActive(String id) {
        for (int i = 0; i < memberIds.length; i++) {
            if (memberIds[i].equals(id)) {
                return memberActive[i];
            }
        }
        return false;
    }

    /*
     * Returns how many books a member has currently borrowed.
     * Returns -1 if the member is not found.
     */
    public int getBorrowCount(String id) {
        for (int i = 0; i < memberIds.length; i++) {
            if (memberIds[i].equals(id)) {
                return borrowCount[i];
            }
        }
        return -1;
    }

    /*
     * Increases the borrow count of a member by 1.
     * Called when a borrow request is successfully approved.
     */
    public void increaseBorrowCount(String id) {
        for (int i = 0; i < memberIds.length; i++) {
            if (memberIds[i].equals(id)) {
                borrowCount[i]++;
                return;
            }
        }
    }

    /*
     * Returns the maximum number of books a member is allowed to borrow.
     */
    public int getBorrowLimit() {
        return borrowLimit;
    }

    /*
     * Checks whether a given member ID exists in the system.
     * Returns true if found, false otherwise.
     */
    public boolean memberExists(String id) {
        for (String memberId : memberIds) {
            if (memberId.equals(id)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Prints all books with their ID, title, author and available copies.
     */
    public void printAllBooks() {
        System.out.println("Books in the Library:");
        for (int i = 0; i < bookIds.length; i++) {
            String status = (bookCopies[i] > 0) ? "Available" : "Not Available";
            System.out.println("ID: " + bookIds[i]);
            System.out.println("Title: " + bookTitles[i]);
            System.out.println("Author: " + bookAuthors[i]);
            System.out.println("Copies: " + bookCopies[i] + " " + status);
            System.out.println();
        }
    }

    /*
     * Prints all members with their ID, name, status and borrow count.
     */
    public void printAllMembers() {
        System.out.println("Registered Members:");
        for (int i = 0; i < memberIds.length; i++) {
            String status = memberActive[i] ? "Active" : "Inactive";
            System.out.println("ID: " + memberIds[i]);
            System.out.println("Name: " + memberNames[i]);
            System.out.println("Status: " + status);
            System.out.println("Currently Borrowing: " + borrowCount[i] + " out of " + borrowLimit);
            System.out.println();
        }
    }
}
