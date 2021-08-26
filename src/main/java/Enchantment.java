public class Enchantment {

    private int baseCost;
    private String name;
    private int useCount;
    private int level;
    private int finalCost;

    public Enchantment(String name,int baseCost,int level) {
        new Enchantment(name,baseCost,level,0);
    }
    public Enchantment(String name,int baseCost,int level,int useCount) {
        this.baseCost = baseCost;
        this.name = name;
        this.useCount = useCount;
        this.level=level;
        this.finalCost = baseCost*level;
    }

    public static Enchantment create(String name,int baseCost,int level){
        return new Enchantment(name,baseCost,level);
    }
    public static Enchantment create(String name,int baseCost,int level,int useCount){
        return new Enchantment(name,baseCost,level,useCount);
    }

    public int getBaseCost() {
        return baseCost;
    }

    public String getName() {
        return name;
    }

    public int getFinalCost() {
        return finalCost;
    }

    public int getUseCount() {
        return useCount;
    }
}
