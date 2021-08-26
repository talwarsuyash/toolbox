public class Anvil {

    public static void main(String args[]){

        Enchantment mending = Enchantment.create("Mending",2,1);
        Enchantment sharpness5 = Enchantment.create("Sharpness",1,5);
    }

    private Enchantment combine(Enchantment one, Enchantment second){
        return  Enchantment.create(one.getName()+"+"+second.getName(),one.getFinalCost()+second.getFinalCost(),1,Math.max(one.getUseCount(),second.getUseCount())+1);
    }


}
