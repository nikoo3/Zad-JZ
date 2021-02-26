package sda.zadENUM.ex2;

public enum PackageSize {
    SMALL(5,10),
    MEDIUM(10,15),
    LARGE(15,20);

    private final int maxSize;
    private final int minSize;

    PackageSize(int minSize, int maxSize){
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    static PackageSize getPackageSize(int minSize, int maxSize){
        for (PackageSize packageSize : values()){
            if(minSize >= packageSize.minSize && maxSize <= packageSize.maxSize)
                return packageSize;
        }
        return null;
    }
}
