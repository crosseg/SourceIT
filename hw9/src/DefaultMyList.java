public class DefaultMyList implements MyList {
    private Object[] arrayList = new Object[1];
    private int count = 0;

    @Override
    public void add(Object e) {
        Object[] arrayL = new Object[count + 1];
        for (int i = 0; i < arrayList.length; i++) {
            arrayL[i] = arrayList[i];
        }
        arrayList = arrayL;
        arrayList[count] = e;
        count++;

    }

    @Override
    public void clear() {
        arrayList = new Object[2];

    }

    @Override
    public boolean remove(Object o) {

        Object[] arr1 = new Object[arrayList.length - 1];
        int count = 0;

            if (o != null) {
                for (int i = 0; i < arrayList.length; i++) {
                    if (!arrayList[i].equals(o)) {
                        arr1[count] = arrayList[i];
                        count++;
                    }
                }
                arrayList = arr1;
                return true;
            }


        return false;
    }

    @Override
    public Object[] toArray() {
        return arrayList;
    }

    @Override
    public int size() {
        return arrayList.length;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i].equals(o)) {
                return true;
            }

        } return false;
    }
    @Override
        public boolean containsAll (MyList c){

            Object[] receivedArray = c.toArray();
            int count = 0;

            for (int i = 0; i < arrayList.length; i++) {
                for (int j = 0; j < receivedArray.length; j++) {
                    if (arrayList[i].equals(receivedArray[j])) {
                        count++;
                    }
                }
                if (count == receivedArray.length) {
                    return true;
                }
            }

            return false;
        }


}



