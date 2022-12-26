package Music;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Bugs {
	
	DataDAO dao = DataDAO.newInstance();

	public void crawling() {

		try {
			Document doc = Jsoup.connect("https://music.bugs.co.kr/chart/track/realtime/total").get();
			Elements ranking = doc.select("div.ranking strong"); // 랭킹
			Elements name = doc.select("p.title"); // 랭킹
			Elements artist = doc.select("p.artist"); // 랭킹
			Elements album = doc.select("a.album"); // 랭킹

			for (int i = 0; i <= 100; i++) {
				try {       
					MusicVO mvo = new MusicVO();

					mvo.setRanking(ranking.get(i).text());
					mvo.setName(name.get(i).text());
					mvo.setArtist(artist.get(i).text());
					mvo.setAlbum(album.get(i + 1).text());

					dao.musicInsert(mvo);
				} catch (Exception ex) {
				}
			}

		} catch (Exception ex) {
		}finally {
			dao.disConnection();
		}
	}

}
