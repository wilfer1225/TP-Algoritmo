public class TextoCentrado1 {

    public static void main(String[] args) {
        String texto = "Texto centrado en pantalla";
        EscribirCentrado(texto);
    }

    public static void EscribirCentrado(String texto) {
        int longitudTexto = texto.length();
        int espaciosAntes = (40 - longitudTexto / 2);
        
        // Imprimir espacios antes del texto
        for (int i = 0; i < espaciosAntes; i++) {
            System.out.print(" ");
        }
        
        // Imprimir el texto centrado
        System.out.println(texto);
        
        // Imprimir la línea de subrayado
        for (int i = 0; i < 80; i++) {
            System.out.print("=");
        }
    }
}
