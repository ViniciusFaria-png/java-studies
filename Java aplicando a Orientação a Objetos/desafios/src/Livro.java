public class Livro {
    private String title;
    private String autor;

    public String getAutor(){
        return autor;
    }

    public String getTitle(){
        return title;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.getTitle());
        System.out.println("Autor: " + this.getAutor());
    }
}
