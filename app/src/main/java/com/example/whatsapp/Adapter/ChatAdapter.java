package com.example.whatsapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.R;
import com.example.whatsapp.models.messageModel;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter{
    ArrayList<messageModel> msgmodel;
    Context context;
    int sender_type=1;
    int receiver_type=2;

    public ChatAdapter(ArrayList<messageModel> msgmodel, Context context) {
        this.msgmodel = msgmodel;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==sender_type)
        {
            View view= LayoutInflater.from(context).inflate(R.layout.sender,parent,false);
            return new senderViewHolder(view);
        }
        else
        {
            View view= LayoutInflater.from(context).inflate(R.layout.receiver,parent,false);
            return new receiverViewHolder(view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(msgmodel.get(position).getId().equals(FirebaseAuth.getInstance().getUid()))
        {
            return sender_type;
        }
        else
        {
            return receiver_type;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        messageModel mm=msgmodel.get(position);
        if(holder.getClass()==senderViewHolder.class)
        {
            ((senderViewHolder)holder).smsg.setText(mm.getMessage());
        }
        else
        {
            ((receiverViewHolder)holder).rmsg.setText(mm.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return msgmodel.size();
    }

    public class receiverViewHolder extends RecyclerView.ViewHolder{
        TextView rmsg,rtime;

        public receiverViewHolder(@NonNull View itemView) {
            super(itemView);
            rmsg=itemView.findViewById(R.id.receiver);
            rtime=itemView.findViewById(R.id.rectime);
        }
    }

    public class senderViewHolder extends RecyclerView.ViewHolder{
        TextView smsg,stime;

        public senderViewHolder(@NonNull View itemView) {
            super(itemView);
            smsg=itemView.findViewById(R.id.sender);
            stime=itemView.findViewById(R.id.sentime);
        }
    }

}
