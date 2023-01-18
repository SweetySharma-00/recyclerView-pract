package com.example.pract;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<Model> userList;
    Context context;
    private RecyclerViewClick recyclerViewClick;

    public Adapter(List<Model>userList,RecyclerViewClick recyclerViewClick){

        this.userList=userList;
        this.recyclerViewClick=recyclerViewClick;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
          int resource=userList.get(position).getImage1();
          String name=userList.get(position).getText1();
        String Message=userList.get(position).getText3();
        String Time=userList.get(position).getText2();
        String line =userList.get(position).getDivider();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerViewClick.onItemClick(userList.get(position));

            }
        });

        holder.setData(resource,name,Message,Time,line);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView image1;
        private TextView Text1;
        private TextView Text2;
        private TextView Text3;
        private TextView divider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1=itemView.findViewById(R.id.image1);
            Text1=itemView.findViewById(R.id.Text1);
            Text2=itemView.findViewById(R.id.Text2);
            Text3=itemView.findViewById(R.id.Text3);
            divider=itemView.findViewById(R.id.divider);


        }

        public void setData(int resource, String name, String message, String time,String line) {
            image1.setImageResource(resource);
            Text1.setText(name);
            Text3.setText(message);
            Text2.setText(time);
            divider.setText(line);


//            Text1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent =new Intent(context,Temp.class);
//                    intent.putExtra("name",temp.getText1());
//                    intent.putExtra("image1",temp.getImage1());
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    context.startActivity(intent);
//                }
//        });
        }
    }
}
