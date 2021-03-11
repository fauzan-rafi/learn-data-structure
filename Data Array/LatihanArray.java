public class LatihanArray {
    private int[] array;
    private int index;

    // constuctor
    public LatihanArray(int max) {
        array = new int[max];
        index = 0;
    }

    // mencari data
    public boolean findArray(int element) {
        boolean result = true; 
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == element) {
                break;
            }
        }
        if (i == array.length) {
                result =  false;
        }else{
            result = true;
        }
        return result;
    }

    // memasukan data ke array
    public void inputArrar(int element) {
        array[index] = element;
        index++;
    }

    // menghapus array
    public boolean delArray(int element) {
        boolean result = true;
        int i;
        for ( i = 0; i < array.length; i++) {
            if (array[i] == element) {
                break;
            }
        }

        if (i == array.length) {
            result = false;
        }else{
            for (int j = i; j < array.length-1; j++) {
                array[j] = array[j+1];
            }
            index--;
            result = true;
        }
        return result;
    }

    //menampilkan data array
    public void showArray() {
        for (int i : array) {
            System.out.print(i + " ");
            System.out.println();
        }
    }

}