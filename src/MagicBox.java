import java.util.Random;

public class MagicBox<T> {
    private int countItems;
    protected T[] arrBox;

    private Random random = new Random();
    public MagicBox(int item) {
        this.countItems = countItems;
        arrBox = (T[]) new Object[item];
    }

    public boolean add(T item) {
        for (T i : arrBox) {
            if (i == null) {
                arrBox[countItems] = item;
                System.out.println("В магическую коробку добавлен элемент " + item + " от " + item.getClass());
                countItems++;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < arrBox.length; i++) {
            if (arrBox[i] == null) {
                countItems--;
            }
        }

        if (arrBox.length > countItems) {
            throw new RuntimeException("ОШИБКА: магическая коробка не заполнена, найдены NULL значения в количестве: " + (arrBox.length - countItems));
        } else { return arrBox[random.nextInt(arrBox.length)];}
    }
}