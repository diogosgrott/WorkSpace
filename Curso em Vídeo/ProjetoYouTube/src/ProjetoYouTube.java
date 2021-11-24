
public class ProjetoYouTube {
	public static void main(String[] args){
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 2 de POO");
		v[2] = new Video("Aula 3 de POO");
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Diogo", 29, "M", "diogo");
		g[1] = new Gafanhoto("Muriel", 32, "M", "muriel");
		
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao (g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[1].avaliar(87.0);
		System.out.println(vis[1].toString());
		
	}
}
