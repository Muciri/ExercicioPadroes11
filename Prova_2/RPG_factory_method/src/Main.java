public class Main {
    public static void main(String[] args) {
        Invoker invoker = new DragaoInvoker();
        System.out.println("mana no Invoker: " + invoker.getMana());

        System.out.println("\n-=-=-=-=-=\n");

        System.out.println("Dragão invocado!");
        invoker.atacar();
        invoker.habilidadeEspecial();
        System.out.println("mana restante no Invoker: " + invoker.getMana());

        System.out.println("\n-=-=-=-=-=\n");

        invoker = new FenixInvoker(invoker.getMana());

        System.out.println("Fênix invocada!");
        invoker.atacar();
        invoker.habilidadeEspecial();
        System.out.println("mana restante no Invoker: " + invoker.getMana());

        System.out.println("\n-=-=-=-=-=\n");

        invoker = new IronGolenInvoker(invoker.getMana());

        System.out.println("Golem invocado!");
        invoker.atacar();
        invoker.habilidadeEspecial();
        System.out.println("mana restante no Invoker: " + invoker.getMana());

        System.out.println("\n-=-=-=-=-=\n");

        System.out.println("ops...acabou a mana, tenho de recarregar......");
        invoker.setMana(10);
        System.out.println("agora sim....lá vai!");
        invoker.habilidadeEspecial();
    }
}
