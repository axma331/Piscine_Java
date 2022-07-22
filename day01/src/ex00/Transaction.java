import	java.util.UUID;

public class Transaction {
	enum	Type {
		DEBIT, CREDIT
	}

	private UUID	transactionId;
	private User	recipient;
	private User	sender;
	private Type	transferCategory;
	private Integer	amount;

	Transaction(User recipient, User sender, Type transferCategory, Integer amount) {
		if (!isCorrect(recipient, sender, transferCategory, amount)) {
			System.err.println("Invalid input!");
			return;
		}
		this.recipient = recipient;
		this.sender = sender;
		this.transferCategory = transferCategory;
		this.amount = amount < 0 ? -amount : amount;
		transactionId = UUID.randomUUID();
		recipient.setBalanse(recipient.getBalanse() + amount);
		sender.setBalanse(sender.getBalanse() - amount);
	}

	private boolean isCorrect(User recipient, User sender, Type transferCategory, Integer amount) {
		return (amount > 0 && transferCategory == Type.DEBIT  && sender.getBalanse() >= amount
				|| amount < 0 && transferCategory == Type.CREDIT && recipient.getBalanse() >= -amount);
	}

	public UUID getTransactionId() {
		return transactionId;
	}

	public User getRecipient() {
		return recipient;
	}

	public User getSender() {
		return sender;
	}

	public Type getTransferCategory() {
		return transferCategory;
	}

	public Integer getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		if (recipient == null)
			return "Invalid transaction";
		return (this.transferCategory == Type.DEBIT
				? recipient.getName() + " received $" + amount + " from " + sender.getName()
				: sender.getName() + " received $" + amount + " from " + recipient.getName())
				+ " (" + transferCategory + " | " + transactionId + ")";
	}
}
