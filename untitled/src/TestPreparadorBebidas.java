public class TestPreparadorBebidas {
    public static void main(String[] args) {

        PreparadorBebidas preparador1 = new PreparadorBebidas(new Cafetera(), new Licuadora());
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();

        PreparadorBebidas preparador2 = new PreparadorBebidas(new MaquinaTe(), new Exprimidor());
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();

        PreparadorBebidas preparador3 = new PreparadorBebidas(new Cafetera(), new MaquinaTe());
        preparador3.prepararDesayuno();
        preparador3.apagarTodo();
    }
}

