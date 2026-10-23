public class TestAnalisis {
    public static void main(String[] args) {

        PreparadorBebidas preparador = new PreparadorBebidas(new Cafetera(), new Licuadora());
        preparador.prepararDesayuno();
        preparador.apagarTodo();
        System.out.println("El preparador depende directamente de cafetera y licuadora");

    }
}
