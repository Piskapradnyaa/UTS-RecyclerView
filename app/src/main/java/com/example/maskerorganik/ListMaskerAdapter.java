package com.example.maskerorganik;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMaskerAdapter extends RecyclerView.Adapter<ListMaskerAdapter.ListViewHolder> {
    private ArrayList<MaskerOrganik> listMaskerOrganik;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onOnItemClickCallback) {
        this.onItemClickCallback = onOnItemClickCallback;
    }

    public ListMaskerAdapter(ArrayList<MaskerOrganik>list) {
        this.listMaskerOrganik = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_masker, parent, false);
         return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        MaskerOrganik club = listMaskerOrganik.get(position);
        Glide.with(holder.itemView.getContext())
                .load(club.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(club.getName());
        holder.tvDetail.setText(club.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listMaskerOrganik.get(holder.getAdapterPosition()));
            }
        });


    }

    @Override
    public int getItemCount() {
        return listMaskerOrganik.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_msk);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(MaskerOrganik masker);
    }
}
