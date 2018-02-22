package projects.nyinyihtunlwin.zcar.mvp.views;

import java.util.List;

import projects.nyinyihtunlwin.zcar.data.vo.movies.MovieVO;

/**
 * Created by Dell on 2/9/2018.
 */

public interface MovieNowOnCinemaView {

    void displayMoviesList(List<MovieVO> moviesList);

    void showLoding();

    void navigateToMovieDetails(String movieId);

}
