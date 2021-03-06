package projects.nyinyihtunlwin.freetime.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Dell on 2/9/2018.
 */

public class ConfigUtils {

    private static final String KEY_MOVIE_NOW_ON_CINEMA_PAGE_INDEX = "KEY_MOVIE_NOW_ON_CINEMA_PAGE_INDEX";
    private static final String KEY_MOVIE_UPCOMING_PAGE_INDEX = "KEY_MOVIE_UPCOMING_PAGE_INDEX";
    private static final String KEY_MOVIE_MOST_POPULAR_PAGE_INDEX = "KEY_MOVIE_MOST_POPULAR_PAGE_INDEX";
    private static final String KEY_MOVIE_TOP_RATED_PAGE_INDEX = "KEY_MOVIE_TOP_RATED_PAGE_INDEX";

    private static final String KEY_TV_SHOW_AIRING_TODAY_PAGE_INDEX = "KEY_TV_SHOW_AIRING_TODAY_PAGE_INDEX";
    private static final String KEY_TV_SHOW_MOST_POPULAR_PAGE_INDEX = "KEY_TV_SHOW_MOST_POPULAR_PAGE_INDEX";
    private static final String KEY_TV_SHOW_ON_THE_AIR_PAGE_INDEX = "KEY_TV_SHOW_ON_THE_AIR_PAGE_INDEX";
    private static final String KEY_TV_SHOW_TOP_RATED_PAGE_INDEX = "KEY_TV_SHOW_TOP_RATED_PAGE_INDEX";

    private static final String KEY_SEARCH_RESULT_PAGE_INDEX = "KEY_SEARCH_RESULT_PAGE_INDEX";

    private SharedPreferences mSharedPreferences;

    private static ConfigUtils sObjInstance;


    private ConfigUtils(Context context) {
        mSharedPreferences = context.getSharedPreferences("ConfigUtils", Context.MODE_PRIVATE);
    }

    public static void initConfigUtils(Context context) {
        sObjInstance = new ConfigUtils(context);
    }

    public static ConfigUtils getObjInstance() {
        return sObjInstance;
    }

    public void saveMovieNowOnCinemaPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_MOVIE_NOW_ON_CINEMA_PAGE_INDEX, pageIndex).apply();
    }

    public int loadMovieNowOnCinemaPageIndex() {
        return mSharedPreferences.getInt(KEY_MOVIE_NOW_ON_CINEMA_PAGE_INDEX, 1);
    }

    public void saveUpcomingPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_MOVIE_UPCOMING_PAGE_INDEX, pageIndex).apply();
    }

    public int loadUpcomingPageIndex() {
        return mSharedPreferences.getInt(KEY_MOVIE_UPCOMING_PAGE_INDEX, 1);
    }

    public void saveMovieMostPopularPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_MOVIE_MOST_POPULAR_PAGE_INDEX, pageIndex).apply();
    }

    public int loadMovieMostPopularPageIndex() {
        return mSharedPreferences.getInt(KEY_MOVIE_MOST_POPULAR_PAGE_INDEX, 1);
    }

    public void saveMovieTopRatedPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_MOVIE_TOP_RATED_PAGE_INDEX, pageIndex).apply();
    }

    public int loadMovieTopRatedPageIndex() {
        return mSharedPreferences.getInt(KEY_MOVIE_TOP_RATED_PAGE_INDEX, 1);
    }

    public void saveSearchResultPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_SEARCH_RESULT_PAGE_INDEX, pageIndex).apply();
    }

    public int loadSearchResultPageIndex() {
        return mSharedPreferences.getInt(KEY_SEARCH_RESULT_PAGE_INDEX, 1);
    }

    // tv shows

    public void saveTvShowsAiringTodayPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_TV_SHOW_AIRING_TODAY_PAGE_INDEX, pageIndex).apply();
    }

    public int loadTvShowsAiringTodayPageIndex() {
        return mSharedPreferences.getInt(KEY_TV_SHOW_AIRING_TODAY_PAGE_INDEX, 1);
    }

    public void saveTvShowsMostPopularPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_TV_SHOW_MOST_POPULAR_PAGE_INDEX, pageIndex).apply();
    }

    public int loadTvShowsMostPopularPageIndex() {
        return mSharedPreferences.getInt(KEY_TV_SHOW_MOST_POPULAR_PAGE_INDEX, 1);
    }
    public void saveTvShowsOnTheAirPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_TV_SHOW_ON_THE_AIR_PAGE_INDEX, pageIndex).apply();
    }

    public int loadTvShowsOnTheAirPageIndex() {
        return mSharedPreferences.getInt(KEY_TV_SHOW_ON_THE_AIR_PAGE_INDEX, 1);
    }
    public void saveTvShowsTopRatedPageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_TV_SHOW_TOP_RATED_PAGE_INDEX, pageIndex).apply();
    }

    public int loadTvShowsTopRatedPageIndex() {
        return mSharedPreferences.getInt(KEY_TV_SHOW_TOP_RATED_PAGE_INDEX, 1);
    }
}
