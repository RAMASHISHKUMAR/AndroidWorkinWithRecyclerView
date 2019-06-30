package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private final List<Movie> moviList;



    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView title,genre,year;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.txtview1_title);
            genre = (TextView)itemView.findViewById(R.id.txtview2_genre);
            year = (TextView)itemView.findViewById(R.id.txtview3_year);
        }
    }

    public MoviesAdapter(List<Movie>movieList){
        this.moviList = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.movie_list_row, viewGroup, false);

        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Movie movie = moviList.get(i);
        myViewHolder.title.setText(movie.getTitle());
        myViewHolder.genre.setText(movie.getGenre());
        myViewHolder.year.setText(movie.getYear());

    }
    @Override
    public int getItemCount() {
        return moviList.size();
    }


}
