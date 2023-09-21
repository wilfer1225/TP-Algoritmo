public class ConvertirEspaciadoTexto4 {

    public static void main(String[] args) {
        String textoOriginal = "Hola, tú";
        String textoConEspaciado = ConvertirEspaciado(textoOriginal);
        
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto con espaciado adicional: " + textoConEspaciado);
    }

    // Función para convertir espaciado
    public static String ConvertirEspaciado(String texto) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            
            // Agregar el carácter actual al resultado
            resultado.append(caracter);
            
            // Agregar un espacio después de cada carácter, excepto el último
            if (i < texto.length() - 1) {
                resultado.append(" ");
            }
        }
        
        return resultado.toString();
    }
}
