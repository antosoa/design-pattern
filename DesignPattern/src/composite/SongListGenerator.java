package composite;

public class SongListGenerator {

	public static void main(String[] args) {

		SongComponent industrialMusic = new SongGroup("Industrial", "La musica industriale, conosciuta spesso con il nome inglese "
				   									+ "industrial music (o semplicemente industrial), è uno stile di musica "
				   									+ "sperimentale nato negli anni '70 intorno all'etichetta discografica Industrial "
				   									+ "Records dei Throbbing Gristle e sviluppato da una ristretta cerchia di artisti "
				   									+ "inglesi ed americani .");
		
		SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "L'heavy metal (in lingua italiana letteralmente \"metallo pesante\"), "
													+ "detto comunemente metal (in realtà quest'ultimo termine comprende vari sottogeneri) è un "
													+ "genere musicale . Deriva dall'hard rock ed è caratterizzato da ritmi fortemente aggressivi e "
													+ "da un suono potente, ottenuto attraverso l'enfatizzazione, dell'amplificazione e della "
													+ "distorsione delle chitarre, dei bassi, e, talvolta, persino delle voci.");
		
		SongComponent dubstepMusic = new SongGroup("Dubstep", "Il Dubstep è un genere di musica elettronica nata ufficialmente a Londra nei "
											    	+ "primi anni 2000 nella scena garage del Regno Unito. Deriva dalla 2step e dal Reggae, "
											    	+ "con ritmi di batteria principalmente hip-hop a quelli classici "
												    + "(da non confondere con ritmiche sincopate) . ");
		
		SongComponent everySong = new SongGroup("Song List", "Every song available");
		
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("Fuel", "Trock" , 1980));
		industrialMusic.add(new Song("Spring", "BTS" , 2019));
		everySong.add(heavyMetalMusic);
		heavyMetalMusic.add(new Song("Fuel", "Metallica" , 1985));
		everySong.add(dubstepMusic);
		dubstepMusic.add(new Song("Tokyo", "Skrillex", 2015));
		
		Discjokey gummyHair = new Discjokey(everySong);
		
		gummyHair.getSongList();
	}

}
