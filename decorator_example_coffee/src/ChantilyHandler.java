public class ChantilyHandler extends BaseHandler{
    @Override
    public void processar(Cafe cafe) {
        cafe.setDescricao(cafe.getDescricao() + ", com chantily");
        cafe.setCusto(cafe.getCusto() + 3.0);

        if(hasNext()) {
            next.processar(cafe);
        }
    }
}
