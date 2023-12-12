/**
 * Clase que contiene métodos estáticos que implementan cálculos combinatorios.
 * 
 * @author Néstor Ezquerra
 * @version 1.0
 */
public class Combinatoria
{
    /**
     * Calcula el número de combinaciones posibles <b>sin repetición</b> de {@code n} elementos tomados de {@code m} en {@code m}.
     * </br></br>
     * Las combinaciones de {@code n} elementos tomados de {@code m} en {@code m} es el número de posibles muestras
     * sin orden de {@code m} elementos distintos que se pueden extraer de un conjunto de {@code n} elementos.
     * Debe cumplirse que {@code n} sea mayor o igual que {@code m}. Csub(n)super(m)=n!/(m!·(n-m)!)
     * 
     * @param n El tamaño del conjunto del que cogemos elementos.
     * @param m El número de elementos que cogemos.
     * @return El número de combinaciones posibles sin repetición
     * @throws IllegalArgumentException si cualquier argumento es negativo o si {@code m} es mayor que {@code n}.
     * @since 1.0
	*/
    public static long combinaciones(int n, int m){}
	
	
    /**
     * Calcula el número de combinaciones posibles <b>con repetición</b> de {@code n} elementos tomados de {@code m} en {@code m}.
     * </br></br>
     * Las combinaciones con repetición de {@code n} elementos tomados de {@code m} en {@code m} es el número de posibles
     * muestras no ordenadas de {@code m} elementos no necesariamente distintos que se pueden extraer de un
     * conjunto de {@code n} elementos. En este caso {@code m} puede ser mayor que {@code n}. CRsub(n)super(m)=(n+m-1)!/(m!·(n-1)!)
     * 
     * @param n El tamaño del conjunto del que cogemos elementos.
     * @param m El número de elementos que cogemos.
     * @return El número de combinaciones posibles con repetición
     * @throws IllegalArgumentException si cualquier argumento es negativo
     * @since 1.0
    */	
    public static long combinacionesRepeticion(int n, int m){}
	
	
    /**
     * Calcula el factorial pero ya no se usa porque se vio que que el máximo de {@code n} es 12.
     * Da error si no se recoge una excepción aritmética.
     * @param n El argumento del factorial, en la práctica sólo decide el tipo de error.
     * @return nada; este método siempre da error y nunca llega a terminar
     * @throws ArithmeticException si {@code n} está fuera del rango [1, 12]
     * @throws RuntimeException si {@code n} está entre 1 y 12, inclusive
     * @since 0.1
	*/
    public static int factorial(int n){}
	
	
    /**
     * Calcula y devuelve el factorial de {@code n}.
     * <br><br>
     * El factorial de {@code n} se define como el producto de todos los números enteros positivos
     * desde 1 hasta {@code n}. Por convenio 0!=1. n!=n·(n-1)·(n-2)· · · 3·2·1
     * @param n El argumento del factorial.
     * @return El valor del factorial de {@code n}
     * @since 1.0
	*/
    public static long factorial(int n){}
	
	
    /**	
     * Calcula el número de posibles permutaciones de {@code n} elementos que no se repiten.
     * <br><br>
     * Son las posibles ordenaciones de un conjunto de n elementos distintos. Psub(n)=n!=n·(n-1)·(n-2)· · · 3·2·1
     * @param n el número de elementos
     * @return La cantidad de posibles permutaciones de {@code n} elementos.
     * @since 1.0
    */
    public static long permutaciones(int n){}
	
	/**	
     * Calcula el número de posibles permutaciones de {@code n} elementos en los que cada uno (i) está repetido {@code m[i]} veces.
     * <br><br>
     * Son las posibles ordenaciones de una secuencia de {@code n} elementos entre los que hay algunos repetidos (uno se repite
     * {@code m[0]} veces, el siguiente {@code m[1]} veces, otro {@code m[2]} veces...). Psub(n)super(a,b,c,...)=n!/(a!·b!·c!·...)
     * @param n el número de elementos
     * @param m el número de repeticiones de cada elemento. La longitud debe ser menor o igual a {@code n}.
     * @return La cantidad de posibles permutaciones.
     * @throws IllegalArgumentException si la longitud de {@code m} es mayor que {@code n}
     * @since 1.0
    */
	public static long permutacionesRepeticion(int n, int[] m){}
	
	
    /**
     * Calcula y devuelve las variaciones de {@code n} elementos tomados de {@code m} en {@code m}.
     * <br><br>
     * Las variaciones de {@code n} elementos tomados de {@code m} en {@code m} es el número de posibles
     * muestras ordenadas de {@code m} elementos distintos que se pueden extraer de un conjunto de {@code n}
     * elementos. {@code m} debe ser menor o igual a {@code n}.
     * Vsub(n)super(m)=n·(n-1)·(n-2)· · ·(n-m+1). Si n=m se tiene Vsub(n)super(n)=Psub(n)=n!
     * @param n El tamaño del conjunto del que cogemos elementos.
     * @param m El número de elementos que cogemos.
     * @return El número de variaciones posibles sin repetición
     * @throws IllegalArgumentException si cualquier argumento es negativo o si {@code m} es mayor que {@code n}.
     * @since 1.0
	*/
    public static long variaciones(int n, int m){}
	
	
    /**
     * Calcula y devuelve las variaciones con repetición de {@code n} elementos tomados de {@code m} en {@code m}.
     * <br><br>
     * Las variaciones con repetición de {@code n} elementos tomados de {@code m} en {@code m} es el número de
     * posibles muestras ordenadas de {@code m} elementos no necesariamente distintos que se pueden extraer de
     * un conjunto de {@code n} elementos. {@code m} puede ser mayor que {@code n}. VRsub(n)super(m)=n^m
	 * @param n El tamaño del conjunto del que cogemos elementos.
     * @param m El número de elementos que cogemos.
     * @return El número de variaciones posibles con repetición
     * @throws IllegalArgumentException si cualquier argumento es negativo
     * @since 1.0
     */
    public static long variacionesRepeticion(int n, int m){}
}