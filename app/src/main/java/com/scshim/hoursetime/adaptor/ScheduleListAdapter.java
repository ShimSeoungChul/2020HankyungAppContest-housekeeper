package com.scshim.hoursetime.adaptor;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.scshim.hoursetime.R;
import com.scshim.hoursetime.ResultActivity;
import com.scshim.hoursetime.WorkEndActivity;
import com.scshim.hoursetime.domain.Work;

import java.util.ArrayList;
import java.util.List;

public class ScheduleListAdapter extends RecyclerView.Adapter<ScheduleListAdapter.ViewHolder> {

    private List<Work > mData = null ;
    Context context;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView workListIV;
        TextView workListTV,workDetailTV;

        ViewHolder(View itemView) {
            super(itemView) ;

            // 뷰 객체에 대한 참조
            workListIV = itemView.findViewById(R.id.workListIV) ;
            workListTV = itemView.findViewById(R.id.workListTV) ;
            workDetailTV = itemView.findViewById(R.id.workDetailTV);
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    public ScheduleListAdapter(List<Work> list) {
        mData = list ;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public ScheduleListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.work_list_item, parent, false) ;
        ScheduleListAdapter.ViewHolder vh = new ScheduleListAdapter.ViewHolder(view) ;

        return vh;
    }


    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(ScheduleListAdapter.ViewHolder holder, int position) {
        final String work = mData.get(position).getName();
        final int point = mData.get(position).getScore();
        final int month = mData.get(position).getMonth();
        final int day = mData.get(position).getDay();
        final int index = position;


        if(work.equals("빨래")){
            holder.workListIV.setImageResource(R.drawable.wash);
        }else if(work.equals("육아")){
            holder.workListIV.setImageResource(R.drawable.baby);
        }else if(work.equals("청소")){
            holder.workListIV.setImageResource(R.drawable.clean);
        }else if(work.equals("설거지")){
            holder.workListIV.setImageResource(R.drawable.washingdishes);
        }else{
            holder.workListIV.setImageResource(R.drawable.house);
        }
        String text = "<"+Integer.toString(month)+"월 "+Integer.toString(day)+"일> "+work+ "(" + Integer.toString(point) +"점)";
        holder.workListTV.setText(text);

        holder.workDetailTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, WorkEndActivity.class);
                intent.putExtra("month",month);
                intent.putExtra("day",day);
                intent.putExtra("work",work);
                intent.putExtra("point",point);
                intent.putExtra("index",index);
                context.startActivity(intent);//액티비티 생성
            }
        });
    }


    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size() ;
    }
}
