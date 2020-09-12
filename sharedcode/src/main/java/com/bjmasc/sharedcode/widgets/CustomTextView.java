package com.bjmasc.sharedcode.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.bjmasc.sharedcode.R;
import com.bjmasc.sharedcode.utils.UIUtils;

public class CustomTextView extends AppCompatTextView {

    public CustomTextView(Context context) {
        super(context);
        init(context, null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs,
                    R.styleable.CustomTextView, 0, 0);
            setFont(context, typedArray);
        }
    }

    private void setFont(Context context, TypedArray typedArray) {
        int fontStyle = typedArray.getInteger(R.styleable.CustomTextView_text_font, 0);
        setTypeface(UIUtils.getFont(context, fontStyle));
    }
}
