package com.bjmasc.ecommerce.categories;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.ExpandableListView;

import com.bjmasc.ecommerce.apiclient.ApiError;
import com.bjmasc.ecommerce.apiclient.RetrofitClient;
import com.bjmasc.ecommerce.apiclient.categories.CategoriesApi;
import com.bjmasc.ecommerce.base.BaseViewModel;
import com.bjmasc.ecommerce.model.categories.CategoriesResponse;
import com.bjmasc.ecommerce.model.categories.Category;
import com.bjmasc.ecommerce.model.categories.Child;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoriesViewModel extends BaseViewModel {

    private Context mContext;
    private ExpandableListView mExpandableListView;

    protected CategoriesViewModel(Context context, ExpandableListView expandableListView) {
        super(context);
        mContext = context;
        mExpandableListView = expandableListView;

        categoryApi();
    }

    private void categoryApi() {
        ProgressDialog progressDialog = showProgressDialog("Please wait...");
        CategoriesApi api = new CategoriesApi();
        api.call(new RetrofitClient.Listener<CategoriesResponse, ApiError>() {
            @Override
            public void onResponse(CategoriesResponse categories) {
                progressDialog.dismiss();

                List<Category> categoryList = categories.getCategories();
                Map<String, List<Child>> map = new HashMap<>();
                if (categoryList != null && categoryList.size() > 0) {
                    for (Category category : categoryList) {
                        map.put(category.getCategoryId(), category.getChild());
                    }
                }

                CategoriesExpandableAdapter adapter = new CategoriesExpandableAdapter(mContext, categoryList,
                        map, categories.getBannerImage());

                mExpandableListView.setAdapter(adapter);
            }

            @Override
            public void onError(ApiError error) {
                progressDialog.dismiss();
            }
        });
    }

}
