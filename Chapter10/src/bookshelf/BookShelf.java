package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) { //�迭�� ��� �߰�
		shelf.add(title);
	}

	@Override
	public String deQueue() {//��ó�� ��Ҹ� �迭���� �����ϰ� ��ȯ
		return shelf.remove(0);
	}

	@Override
	public int getSize() { //�迭 ��� ���� ��ȯ
		return getCount();
	}

}
