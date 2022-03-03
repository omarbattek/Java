package siralama;

public class QuickSort {

    public void hizli(int[] A, int bas, int son) {
        int pivot;
        if (bas < son) {
            pivot = parcala(A, bas, son);
            hizli(A, bas, pivot - 1);
            hizli(A, pivot + 1, son);
        }
    }

    public void yerdegistir(int[] A, int i, int j) {
        int tmp;
        tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public int parcala(int[] A, int bas, int son) {
        int x = A[son], tmp;
        int i = bas - 1, j;
        for (j = bas; j < son; j++) {
            if (A[j] <= x) {
                i++;
                yerdegistir(A, i, j);
            }
        }
        yerdegistir(A, i + 1, son);
        return i + 1;
    }
}
