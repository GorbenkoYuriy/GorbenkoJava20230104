public class BURGER {

    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayonnaise;
}

class burgernormal extends BURGER {
    String burgernormal;

    {
        System.out.println("bun" + "meat" + "cheese" + "greenery" + "mayonnaise");
        System.out.println("в состав бургера входят следующие ингридиенты: булочка, мясо, сыр, зелень, маойнез");
    }

    {
        class burgerdietary extends BURGER {
            String burgerdietary;

            {
                System.out.println("bun" + "meat" + "cheese" + "greenery");
                System.out.println("в состав диетического бургера входят следующие ингридиенты: булочка, мясо, сыр, зелень");
            }

            {
                class burgerdoublemeat extends BURGER {
                    String burgerdoublemeat;

                    {
                        System.out.println("bun" + "doublemeat" + "cheese" + "greenery" + "mayonnaise");
                        System.out.println("в состав диетического бургера входят следующие ингридиенты: булочка, двойное мясо, сыр, зелень, майонез");
                    }
                }
            }
        }
    }
}








