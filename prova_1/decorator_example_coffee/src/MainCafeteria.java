// Cliente
public class MainCafeteria {
    public static void main(String[] args) {
        // Café simples com leite e chantilly
        Cafe meuCafe1 = new CafeSimples();

        Handler leite1 = new LeiteHander();
        Handler chantilly = new ChantilyHandler();

        leite1.setNext(chantilly);
        leite1.processar(meuCafe1);
        
        System.out.println(meuCafe1.getDescricao() + " - R$" + meuCafe1.getCusto());
        // Saída: Café simples (4.00) , com leite (1.50) , com chantilly (3.00) - R$8.50

        // Café expresso com caramelo e leite
        Cafe meuCafe2 = new CafeExpresso();

        Handler caramelo = new CarameloHandler();
        Handler leite2 = new LeiteHander();

        caramelo.setNext(leite2);
        caramelo.processar(meuCafe2);
        
        System.out.println(meuCafe2.getDescricao() + " - R$" + meuCafe2.getCusto());
        // Saída: Café expresso, com caramelo, com leite - R$9.0
    }
}
