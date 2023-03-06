public enum TypeofGood {
    TYPE_GADJET,
    TYPE_APPLIANCES,
    TYPE_FOTO;
    private static TypeofGood[] types = {
            TYPE_GADJET,
            TYPE_APPLIANCES,
            TYPE_FOTO
    };

    public static TypeofGood getTypeofGood(int num) {
        return types[num - 1];
    }

    public int getIndex(Goods good) {
        int buffer = 0;
        for (int i = 0; i < 6; i++) {
            if (good.getTypeofGood().equals(types[i])) buffer = i + 1;
        }
        return buffer;
    }

}
