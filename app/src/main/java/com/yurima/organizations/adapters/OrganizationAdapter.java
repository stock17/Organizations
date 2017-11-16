package com.yurima.organizations.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yurima.organizations.R;

import java.util.List;

/**
 * Created by Yury on 16.11.2017.
 */

public class OrganizationAdapter extends RecyclerView.Adapter<OrganizationAdapter.ViewHolder> {

    List<String> organizations;

    public OrganizationAdapter(List<String> organizations) {
        this.organizations = organizations;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(organizations.get(position));
    }

    @Override
    public int getItemCount() {
        return organizations.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ViewHolder (View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.rv_item_title);
        }

    }
}
