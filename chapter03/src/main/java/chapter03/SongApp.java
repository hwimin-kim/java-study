package chapter03;

public class SongApp {

	public static void main(String[] args) {
//		Song song = new Song();	
//		song.setAlbum("Real");
//		song.setArtist("아이유");
//		song.setComposer("이민수");
//		song.setTitle("좋은날");
//		song.setTrack(3);
//		song.setYear(2010);
//		song.show();
		
		Song song = new Song("좋은날", "아이유","이민수","real", 2010, 3);	
		song.show();
		
		Song song1 = new Song("봄여름가을겨울", "빅뱅");
		song1.show();
	}

}
