public class LeiteHander extends BaseHandler{
    @Override
    public void processar(Cafe cafe) {
        cafe.setDescricao(cafe.getDescricao() + ", com leite");
        cafe.setCusto(cafe.getCusto() + 1.5);

        if(hasNext()) {
            next.processar(cafe);
        }
    }
}
