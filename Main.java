public class Main {

    public static void main(String[] args) {
        // pour tester, lancer en ligne de commande :
        // java Program "assiette" "couscous" "coca" "moyen" "baba" "normal" "yes"
        // Note: Make sure the class name matches the file name when compiling and running in Java.
        App.Menus menu = App.Menus.valueOf(args[0]);
        App.MenuType menuType = App.MenuType.valueOf(args[1]);
        boolean coffee = args[2].equals("coffee");
        int price = App.Compute(menu, menuType, coffee);
        System.out.println("Prix à payer : " + price + "€");
    }
}