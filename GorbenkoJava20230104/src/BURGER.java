public class BURGER {
    public static void main(String[] args) {

        String булочка;
        String мясо;
        String сир;
        String зелень;
        String майонез;
    }

    static class burgernormal extends BURGER {
        String burgernormal;

        static {
            System.out.println("булочка" + "м'ясо" + "сир" + "зелень" + "майонез");
            System.out.println("до складу бургера входять наступні інгридієнти: булочка, м'ясо, сир, зелень, маойнез");
        }

        static {
            class burgerdietary extends BURGER {
                String burgerdietary;

                static {
                    System.out.println("булочка" + "м'ясо" + "сир" + "зелень");
                    System.out.println("до складу бургера входять наступні інгридієнти: булочка, м'ясо, сир, зелень");
                }

                static {
                    class burgerdoublemeat extends BURGER {
                        String burgerdoublemeat;

                        static {
                            System.out.println("булочка" + "подвійне м'ясо" + "сир" + "зелень" + "майонез");
                            System.out.println("до складу бургера входять наступні інгридієнти: булочка, подвійне м'ясо, сир, зелень, маойнез");
                        }
                    }
                }
            }
        }

    }
}








