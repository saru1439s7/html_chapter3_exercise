
public class Account {
	String accountNumber;
	int balance;

	public String toString() {
		return "¥¥" + this.balance + "（口座番号：" + this.accountNumber + "）";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account) o;
			String an1 = this.accountNumber.trim();
			String an2 = this.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
			return false;
		}
	}

	public String concatPath(String folder,String file) {
		if (!folder.endsWith("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}
	public String concatPath(String folder,String file) {
		if (!folder.endsWith("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}

}
