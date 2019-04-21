
public class Rotate {

    /**
     * Verschiebt alle Elemente in {@code values} um {@code offset}. Ist
     * {@code offset} positiv, werden die Elemente nach rechts verschoben.
     * Ist {@code offset} negativ, werden die Elemente nach links
     * verschoben. Überläufe werden entsprechend vorne bzw. hinten an
     * {@code values} angehängt.
     * 
     * Beispiel mit einem positiven {@code offset}:
     * 
     *     Eingabe:  values = {"lorem", "ipsum", "dolor", "sit", "amet"}
     *               offset = 3
     *     Ergebnis: values = {"dolor", "sit", "amet", "lorem", "ipsum"}
     * 
     * Beispiel mit einem negativen {@code offset}:
     * 
     *     Eingabe:  values = {"lorem", "ipsum", "dolor", "sit", "amet"}
     *               offset = -3
     *     Ergebnis: values = {"sit", "amet", "lorem", "ipsum", "dolor"}
     * 
     
     * 
     */
    public void rotate(final String[] values, final int offset) {
        String[] str = new String[values.length];
        int m = values.length % offset ;
        int n = offset;

        if(offset > 0){
            for(int i = 0; i < values.length; i++){
                if(i + m< str.length){
                    str[i] = values[i+m];
                }else {
                    str[i] = values[(i+m)-values.length];

                }
            }
        }else{
            m = offset * -1;
             for(int i = 0; i < values.length; i++){
                if(i + m< str.length){
                    str[i] = values[i+m];
                }else {
                    str[i] = values[(i+m)-values.length];

                }
            }
        
        }
        

        
        System.arraycopy( str, 0, values, 0, values.length );
    }

}
