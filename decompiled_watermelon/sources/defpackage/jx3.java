package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jx3  reason: default package */
/* loaded from: classes.dex */
public final class jx3 extends fl1 {
    public final int k0;
    public final int l0;
    public yw3 m0;
    public zw3 n0;

    public jx3(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.k0 = 21;
            this.l0 = 22;
            return;
        }
        this.k0 = 22;
        this.l0 = 21;
    }

    @Override // defpackage.fl1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        rw3 rw3Var;
        int i;
        zw3 zw3Var;
        int pointToPosition;
        int i2;
        if (this.m0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                rw3Var = (rw3) headerViewListAdapter.getWrappedAdapter();
            } else {
                rw3Var = (rw3) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < rw3Var.getCount()) {
                zw3Var = rw3Var.getItem(i2);
            } else {
                zw3Var = null;
            }
            zw3 zw3Var2 = this.n0;
            if (zw3Var2 != zw3Var) {
                uw3 uw3Var = rw3Var.A;
                if (zw3Var2 != null) {
                    this.m0.v(uw3Var, zw3Var2);
                }
                this.n0 = zw3Var;
                if (zw3Var != null) {
                    this.m0.y(uw3Var, zw3Var);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        rw3 rw3Var;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.k0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i == this.l0) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                rw3Var = (rw3) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                rw3Var = (rw3) adapter;
            }
            rw3Var.A.c(false);
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setHoverListener(yw3 yw3Var) {
        this.m0 = yw3Var;
    }

    @Override // defpackage.fl1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
