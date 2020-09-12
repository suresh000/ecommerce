package com.bjmasc.ecommerce.categories;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bjmasc.ecommerce.R;
import com.bjmasc.ecommerce.model.categories.Category;
import com.bjmasc.ecommerce.model.categories.Child;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Map;

public class CategoriesExpandableAdapter extends BaseExpandableListAdapter {

    private Context mContext;
    private List<Category> mCategoryHeader;
    private Map<String, List<Child>> mCategoryChild;
    private String bannerImage;

    public CategoriesExpandableAdapter(Context context, List<Category> categoryHeader,
                                 Map<String, List<Child>> listChildData, String bannerImage) {
        mContext = context;
        mCategoryHeader = categoryHeader;
        mCategoryChild = listChildData;
        this.bannerImage = bannerImage;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return mCategoryChild.get(mCategoryHeader.get(groupPosition).getCategoryId())
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final Child child = (Child) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.category_child, null);
        }

        TextView txtListChild = (TextView) convertView
                .findViewById(R.id.lblListItem);

        txtListChild.setText(child.getCategoryName());
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mCategoryChild.get(mCategoryHeader.get(groupPosition).getCategoryId())
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mCategoryHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return mCategoryHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        Category header = (Category) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.category_header, null);
        }

        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
        ImageView imageView = convertView.findViewById(R.id.image);

        Picasso.get().load(bannerImage).into(imageView);

        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(header.getCategoryName());

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
