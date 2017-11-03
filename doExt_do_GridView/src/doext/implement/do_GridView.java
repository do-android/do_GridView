package doext.implement;

import android.content.Context;
import android.widget.GridView;
import core.object.DoProperty;
import doext.define.do_GridView_MAbstract;
 
public class do_GridView extends GridView   {
 
	private do_GridView_MAbstract model;

	public do_GridView(Context context) {
		super(context);
	}
	public do_GridView(Context context,do_GridView_MAbstract model) {
		super(context);
		this.model = model;
		
	}
	@Override
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		try {
			DoProperty _property = model.getProperty("height");
			if (_property != null && "-1".equals(_property.getValue())) {
				heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}
 
	
}