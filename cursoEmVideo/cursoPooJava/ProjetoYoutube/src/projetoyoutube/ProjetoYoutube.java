package projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[5];
        
        v[0] = new Video("Curso POO Java #1b");
        v[1] = new Video("Curso POO Java #2b");
        v[2] = new Video("Curso POO Java #3b");
        v[3] = new Video("Curso POO Java #4b");
        v[4] = new Video("Curso POO Java #5b");
        
        System.out.println("=========================");
        System.out.println(v[0].toString());
        System.out.println("=========================");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Neymar", 36, "M", "ney10");
        g[1] = new Gafanhoto("Messi", 39, "M", "messinho");
        
        System.out.println("=========================");
        System.out.println(g[0].toString());
        System.out.println("=========================");
        
        Visualizacao vis[] = new Visualizacao[3];
        
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        
        System.out.println("=========================");
        System.out.println(vis[0].toString());
        System.out.println("=========================");
        
        vis[1] = new Visualizacao(g[0], v[3]);
        vis[1].avaliar(8);
        
        System.out.println("=========================");
        System.out.println(vis[1].toString());
        System.out.println("=========================");
        
    }
    
}
