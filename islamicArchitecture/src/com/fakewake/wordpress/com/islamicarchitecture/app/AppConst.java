package com.fakewake.wordpress.com.islamicarchitecture.app;

public class AppConst {

	// Number of columns of Grid View
	// by default 2 but user can configure this in settings activity
	public static final int NUM_OF_COLUMNS = 3;

	// Gridview image padding
	public static final int GRID_PADDING = 4; // in dp

	// Gallery directory name to save wallpapers
	public static final String SDCARD_DIR_NAME = "Wallpapers";

	// Picasa/Google web album username
	public static final String PICASA_USER = "fakewake8";

	// Public albums list url
	public static final String URL_PICASA_ALBUMS = "https://picasaweb.google.com/data/feed/api/user/fakewake8?kind=album&alt=json";

	// Picasa album photos url
	public static final String URL_ALBUM_PHOTOS = "https://picasaweb.google.com/data/feed/api/user/fakewake8/albumid/_ALBUM_ID_?alt=json";

	// Picasa recenlty added photos url
	public static final String URL_RECENTLY_ADDED = "https://picasaweb.google.com/data/feed/api/user/fakewake8?kind=photo&alt=json";

}
