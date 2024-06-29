public class App {

    public static int Compute(Menus menu, MenuType type, boolean coffee) {
        int total = 0;
        int coffeePrice = 1;

        if(menu == null || type == null) return -1;
        switch(menu){
            case ASSIETTE_SMALL_BEVERAGE -> total = type.equals(MenuType.NORMAL) ? 17:19;
            case ASSIETTE_MEDIUM_BEVERAGE -> total =  type.equals(MenuType.NORMAL)? 18:22;
            case ASSIETTE_LARGE_BEVERAGE -> total =  21;
            case SANDWICH_SMALL_BEVERAGE -> total =  type.equals(MenuType.NORMAL) ? 12:16;
            case SANDWICH_MEDIUM_BEVERAGE -> total =  type.equals(MenuType.NORMAL) ? 13:17;
            case SANDWICH_LARGE_BEVERAGE -> total =  type.equals(MenuType.NORMAL) ? 14:18;
        }

        if (!menu.equals(Menus.ASSIETTE_MEDIUM_BEVERAGE) && !type.equals(MenuType.NORMAL) && coffee) {
            total += coffeePrice;
        }
        return total;
    }
    public enum DishType {
        ASSIETTE,
        SANDWICH,
        SMALL_BEVERAGE,
        MEDIUM_BEVERAGE,
        LARGE_BEVERAGE
        ;

    }

    public enum MenuType {
        NORMAL,
        MAX;
    }

    public enum Menus{
        ASSIETTE_SMALL_BEVERAGE(DishType.ASSIETTE, DishType.SMALL_BEVERAGE),
        ASSIETTE_MEDIUM_BEVERAGE(DishType.ASSIETTE, DishType.MEDIUM_BEVERAGE),
        ASSIETTE_LARGE_BEVERAGE(DishType.ASSIETTE, DishType.LARGE_BEVERAGE),
        SANDWICH_SMALL_BEVERAGE(DishType.ASSIETTE, DishType.SMALL_BEVERAGE),
        SANDWICH_MEDIUM_BEVERAGE(DishType.ASSIETTE, DishType.SMALL_BEVERAGE),
        SANDWICH_LARGE_BEVERAGE(DishType.ASSIETTE, DishType.SMALL_BEVERAGE);

        private final DishType mainDish;
        private final DishType beverage;
        Menus(DishType dishType, DishType beverage) {
            this.mainDish = dishType;
            this.beverage = beverage;
        }
    }

}