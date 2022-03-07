package cn.znpersonal.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class FullScreenVideoView extends VideoView {
    //new 出来的
    public FullScreenVideoView(Context context) {
        super(context);
    }
    //xml 构建
    public FullScreenVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //带Style或者自定义属性的 XML构建
    public FullScreenVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int width,int height) {
        setMeasuredDimension(getDefaultSize(0,width),getDefaultSize(0,height));
    }
}
