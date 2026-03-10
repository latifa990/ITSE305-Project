package Latifa;

/*
 * Business Layer - Borrow Book Use Case
 * This class contains all the business rules and logic.
 * It validates a borrow request step by step before approving it.
 * It communicates with the Data Layer to read and update data.
 * It does NOT interact with the user directly.
 */
public class BBbusiness {

    // reference to the data layer to access all stored data
    private BBdata dataLayer;
    /*
     * Constructor - receives the Data Layer object.
     * This connects the Business Layer to the Data Layer.
     */
    public BBbusiness(BBdata dataLayer) {
        this.dataLayer = dataLayer;
    }

    /*
     * Main method that processes a borrow book request.
     * Applies all business rules in order before approving.
     * Returns a message describing the result of the request.
     */
    public String borrowBook(String memberId, String bookId) {

        // check if the member ID exists in the system
        if (!dataLayer.memberExists(memberId)) {
            return "Member ID " + memberId + "does not exist.";
        }

        // check if the member account is active
        if (!dataLayer.isMemberActive(memberId)) {
            String name = dataLayer.getMemberName(memberId);
            return "The account of " + name + " is inactive. Account is blocked.";
        }

        // check if the book ID exists in the system
        if (!dataLayer.bookExists(bookId)) {
            return "Book ID " + bookId + " was not found in the system.";
        }

        // check if there is at least one available copy
        int copies = dataLayer.getAvailableCopies(bookId);
        if (copies <= 0) {
            String title = dataLayer.getBookTitle(bookId);
            return "No available copies for " + title + ". Please try again later.";
        }

        // check if the member has reached the borrow limit
        int currentBorrows = dataLayer.getBorrowCount(memberId);
        int borrowLimit = dataLayer.getBorrowLimit();
        if (currentBorrows >= borrowLimit) {
            String name = dataLayer.getMemberName(memberId);
            return name + " has reached the borrow limit of " + borrowLimit + " books.";
        }

        // all checks passed so update the data
        dataLayer.decreaseCopy(bookId);
        dataLayer.increaseBorrowCount(memberId);

        // get details to show in the success message
        String memberName = dataLayer.getMemberName(memberId);
        String bookTitle  = dataLayer.getBookTitle(bookId);
        String bookAuthor = dataLayer.getBookAuthor(bookId);

        return "The book " + bookTitle + " by " + bookAuthor +
                " is now borrowed by " + memberName +
                ". Copies left: " + (copies - 1);
    }

    /*
     * Checks whether a book ID exists.
     * Used by the Presentation Layer to validate input.
     */
    public boolean isValidBook(String bookId) {
        return dataLayer.bookExists(bookId);
    }

    /*
     * Checks whether a member ID exists.
     * Used by the Presentation Layer to validate input.
     */
    public boolean isValidMember(String memberId) {
        return dataLayer.memberExists(memberId);
    }
}
