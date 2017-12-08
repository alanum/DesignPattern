package adapter;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter adapter;

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equals("mp3")) {			// 播放 mp3 音乐文件的内置支持
			System.out.println("Playing Mp3 file name is " + fileName);
		} else if (audioType.equals("mp4") || audioType.equals("vlc")) { // mediaAdapter
																			// 提供了播放其他文件格式的支持
			adapter = new MediaAdapter(audioType, fileName);
			adapter.play(audioType, fileName);

		} else {
			System.out.println("unsupport type " + audioType);
		}
	}

}
