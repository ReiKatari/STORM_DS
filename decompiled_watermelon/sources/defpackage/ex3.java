package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ex3  reason: default package */
/* loaded from: classes.dex */
public abstract class ex3 implements y56, mx3, AdapterView.OnItemClickListener {
    public Rect A;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // defpackage.mx3
    public final boolean b(zw3 zw3Var) {
        return false;
    }

    @Override // defpackage.mx3
    public final boolean e(zw3 zw3Var) {
        return false;
    }

    public abstract void l(uw3 uw3Var);

    public abstract void n(View view);

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        rw3 rw3Var;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            rw3Var = (rw3) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            rw3Var = (rw3) listAdapter;
        }
        uw3 uw3Var = rw3Var.A;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof yi0)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        uw3Var.q(menuItem, this, i2);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);

    @Override // defpackage.mx3
    public final void i(Context context, uw3 uw3Var) {
    }
}
