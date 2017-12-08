package adapter;

public class MediaAdapter implements MediaPlayer{

	
	AdvanceMediaPlayer player;
	
	
	public MediaAdapter(String type,String fileName) {
		if("vlc".equalsIgnoreCase(type)){
			player = new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(type)){
			player = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		
		assert player != null;
		
		if(audioType.equals("vlc")){
			player.playVlc(fileName);
		}else if(audioType.equals("mp4")){
			player.playMp4(fileName);
		}
	}

}
