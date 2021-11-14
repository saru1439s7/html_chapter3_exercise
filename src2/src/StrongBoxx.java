
public class StrongBoxx<E> {
	private KeyType keytype;
	private E item;
	private long count;

	public StrongBox(KeyType key) {
		this.keytype.type=key;
	}

	public void put(E i) {
		this.item = i;
	}

	public E get() {
		this.count++;
		switch (this.kyeType) {
		case PADLOCK:
			if (count < 1024)
				return null;
			break;
		case BUTTON:
			if (count < 1000)
				return null;
			break;
		case DIAL:
			if (count < 3000)
				return null;
			break;
		case FINGER:
			if (count < 10000)
				return null;
			break;
		}
		this.count=0;
		return this.item;
	}
}
