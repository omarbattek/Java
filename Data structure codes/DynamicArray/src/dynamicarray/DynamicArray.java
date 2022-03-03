package dynamicarray;

public class DynamicArray {

    public static void main(String[] args) {
        // Dynamic array içinde eleman ekleyince ve kapasitesi dolduğu zaman uzunluğu *2 oluyor ve yeni gelen elman ekleyebilir
        Dynamic dArray = new Dynamic();
        dArray.put(4);
        System.out.println("Size:" + dArray.getSize());
        dArray.put(4);
        System.out.println("Size:" + dArray.getSize());
        dArray.put(4);
        System.out.println("Size:" + dArray.getSize());
        dArray.put(655);
        System.out.println("Size:" + dArray.getSize());
        dArray.put(4);
        System.out.println("Size:" + dArray.getSize());

        
        
    }

}
