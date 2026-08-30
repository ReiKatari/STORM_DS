package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h2 extends r1 {

    /* renamed from: j0  reason: collision with root package name */
    public final int f11905j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f11906k0;

    /* renamed from: l0  reason: collision with root package name */
    public e2 f11907l0;

    /* renamed from: m0  reason: collision with root package name */
    public p.n f11908m0;

    public h2(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f11905j0 = 21;
            this.f11906k0 = 22;
            return;
        }
        this.f11905j0 = 22;
        this.f11906k0 = 21;
    }

    @Override // q.r1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        p.i iVar;
        int i2;
        p.n nVar;
        int pointToPosition;
        int i10;
        if (this.f11907l0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                iVar = (p.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (p.i) adapter;
                i2 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i2) >= 0 && i10 < iVar.getCount()) {
                nVar = iVar.getItem(i10);
            } else {
                nVar = null;
            }
            p.n nVar2 = this.f11908m0;
            if (nVar2 != nVar) {
                p.l lVar = iVar.A;
                if (nVar2 != null) {
                    this.f11907l0.n(lVar, nVar2);
                }
                this.f11908m0 = nVar;
                if (nVar != null) {
                    this.f11907l0.o(lVar, nVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        p.i iVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f11905j0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i2 == this.f11906k0) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                iVar = (p.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                iVar = (p.i) adapter;
            }
            iVar.A.c(false);
            return true;
        } else {
            return super.onKeyDown(i2, keyEvent);
        }
    }

    public void setHoverListener(e2 e2Var) {
        this.f11907l0 = e2Var;
    }

    @Override // q.r1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
