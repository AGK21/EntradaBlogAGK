package entradabloagk;


/**
 * @author tony
 *
 */

public class EntradaBlogAGK {
	
	
	/**
	 * separador es el ccarácter que separa ENTRADA DE del
	 * nombre del autor 
	 */
	
	
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
	
	/**
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public  EntradaBlogAGK(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	
	
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * @return devuelve id
	 */
	public int getId(){
		return this.id;
	}
	
	
	/**
	 * @return devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * @return devuelve el nombre del autor de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * @param args No tiene porqué tener argumentos (Metodo MAIN)
	 */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogAGK e1=new EntradaBlogAGK (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
