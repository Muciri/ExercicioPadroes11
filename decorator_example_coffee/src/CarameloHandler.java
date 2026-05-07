public class CarameloHandler extends BaseHandler{
    @Override
    public void processar(Cafe cafe) {
        cafe.setDescricao(cafe.getDescricao() + ", com caramelo");
        cafe.setCusto(cafe.getCusto() + 2.0);

        if(hasNext()) {
            next.processar(cafe);
        }
    }
}
