package song;

public class SongApp {

		public static void main(String[] args) {
			Song s = new Song();
			
//			s.setArtist("아이유");
//			s.setTitle("좋은날");;
//			s.setAlbum("Real");
//			s.setYear(2010);
//			s.setTrack(3);
//			s.setComposer("이민수");
//			s.show();
//			System.out.println(s.toString());
			
			Song song1 = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
			Song song2 = new Song("러빙유", "씨스타");
			Song song3 = new Song("벚꽃엔딩", "버스커버스커");
			
			song1.show();
			song2.show();
			song3.show();
		}
}
