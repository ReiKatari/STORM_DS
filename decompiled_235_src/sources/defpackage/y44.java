package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y44  reason: default package */
/* loaded from: classes.dex */
public final class y44 extends mp1 {
    public final int l0;
    public final int m0;
    public n44 n0;
    public o44 o0;

    public y44(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.l0 = 21;
            this.m0 = 22;
            return;
        }
        this.l0 = 22;
        this.m0 = 21;
    }

    @Override // defpackage.mp1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        f44 f44Var;
        int i;
        o44 o44Var;
        int pointToPosition;
        int i2;
        if (this.n0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                f44Var = (f44) headerViewListAdapter.getWrappedAdapter();
            } else {
                f44Var = (f44) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < f44Var.getCount()) {
                o44Var = f44Var.getItem(i2);
            } else {
                o44Var = null;
            }
            o44 o44Var2 = this.o0;
            if (o44Var2 != o44Var) {
                i44 i44Var = f44Var.A;
                if (o44Var2 != null) {
                    this.n0.o(i44Var, o44Var2);
                }
                this.o0 = o44Var;
                if (o44Var != null) {
                    this.n0.D(i44Var, o44Var);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        f44 f44Var;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.l0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i == this.m0) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                f44Var = (f44) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                f44Var = (f44) adapter;
            }
            f44Var.A.c(false);
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setHoverListener(n44 n44Var) {
        this.n0 = n44Var;
    }

    @Override // defpackage.mp1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
