package com.example.php_connection;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.CustomViewHolder> {

    private ArrayList<PersonalData> mList = null;
    private Activity context = null;


    public UsersAdapter(Activity context, ArrayList<PersonalData> list) {
        this.context = context;
        this.mList = list;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView num;
        protected TextView id;
        protected TextView name;
        protected TextView status;
        protected TextView photo;


        public CustomViewHolder(View view) {
            super(view);
            this.num = (TextView) view.findViewById(R.id.textView_list_num);
            this.id = (TextView) view.findViewById(R.id.textView_list_id);
            this.name = (TextView) view.findViewById(R.id.textView_list_name);
            this.status = (TextView) view.findViewById(R.id.textView_list_status);
            this.photo = (TextView) view.findViewById(R.id.textView_list_photo);
        }
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewholder, int position) {

        viewholder.num.setText(mList.get(position).getMember_num());
        viewholder.id.setText(mList.get(position).getMember_id());
        viewholder.name.setText(mList.get(position).getMember_name());
        viewholder.status.setText(mList.get(position).getMember_status());
        viewholder.photo.setText(mList.get(position).getMember_photo());
    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }

}