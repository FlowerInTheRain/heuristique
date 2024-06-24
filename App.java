public class App {

    // calcule le prix payé par l'utilisateur dans le restaurant, en fonction de type de
    // repas qu'il prend (assiette ou sandwich), de la taille de la boisson (petit, moyen, grand), du dessert et
    // de son type (normal ou special) et si il prend un café ou pas (yes ou no).
    // les prix sont fixes pour chaque type de chose mais des réductions peuvent s'appliquer
    // si cela rentre dans une formule!
    public static int Compute(Menus menu, MenuType type, boolean coffee) {
        // prix total à payer pour le client
        int total = 0;
        int coffeePrice = 1;

        // le type ne peut être vide car le client doit déclarer au moins un repas
        if(menu == null || type == null) return -1;
        switch(menu){
            case ASSIETTE_SMALL_BEVERAGE -> {
                total = type.equals(MenuType.NORMAL) ? 17:19;
            }
            case ASSIETTE_MEDIUM_BEVERAGE -> {
                total =  type.equals(MenuType.NORMAL)? 18:22;

            }
            case ASSIETTE_LARGE_BEVERAGE -> {
                total =  21;
            }
            case SANDWICH_SMALL_BEVERAGE -> {
                total =  type.equals(MenuType.NORMAL) ? 12:16;

            }
            case SANDWICH_MEDIUM_BEVERAGE -> {
                total =  type.equals(MenuType.NORMAL) ? 13:17;

            }
            case SANDWICH_LARGE_BEVERAGE -> {
                total =  type.equals(MenuType.NORMAL) ? 14:18;
            }
        }

        if (menu.equals(Menus.ASSIETTE_MEDIUM_BEVERAGE) && type.equals(MenuType.NORMAL) && coffee) {
            System.out.print(" avec café offert!");
        } else {
            // Assume coffee costs 1 unit, adding to the total only if coffee is not included
            if (!coffee) {
                total += coffeePrice;
            }
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