package p;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t implements b0, x, AdapterView.OnItemClickListener {
    public Rect A;

    public static int m(ListAdapter listAdapter, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    @Override // p.x
    public final boolean h(n nVar) {
        return false;
    }

    @Override // p.x
    public final boolean k(n nVar) {
        return false;
    }

    public abstract void l(l lVar);

    public abstract void n(View view);

    public abstract void o(boolean z10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        i iVar;
        int i10;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            iVar = (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            iVar = (i) listAdapter;
        }
        l lVar = iVar.A;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i2);
        if (!(this instanceof f)) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        lVar.q(menuItem, this, i10);
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z10);

    public abstract void t(int i2);

    @Override // p.x
    public final void g(Context context, l lVar) {
    }
}
