package com.example.parav.wordify;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Wordlist> wordlists;
    private Context context;

    public MyAdapter(List<Wordlist> wordlists, Context context) {
        this.wordlists = wordlists;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_word, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {

        Wordlist wordlist = wordlists.get(position);

        holder.word.setText(wordlist.getWord());
        holder.meaning.setText(wordlist.getMeaning());
        holder.example.setText(wordlist.getExample());
        holder.antonym.setText(wordlist.getAntonym());
        holder.synonym.setText(wordlist.getSynonym());

    }

    @Override
    public int getItemCount() {
        return wordlists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView word;
        public TextView meaning;
        public TextView example;
        public TextView antonym;
        public TextView synonym;

        public ViewHolder(View itemView) {
            super(itemView);

            word = (TextView) itemView.findViewById(R.id.word);
            meaning = (TextView) itemView.findViewById(R.id.meaning);
            example = (TextView) itemView.findViewById(R.id.example);
            antonym = (TextView) itemView.findViewById(R.id.antonym);
            synonym = (TextView) itemView.findViewById(R.id.synonym);
        }
    }
}

