package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y44  reason: default package */
/* loaded from: classes.dex */
public final class y44 extends defpackage.mp1 {
    public final int l0;
    public final int m0;
    public defpackage.n44 n0;
    public defpackage.o44 o0;

    public y44(android.content.Context r3, boolean r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r4 = 1
            int r3 = r3.getLayoutDirection()
            r0 = 22
            r1 = 21
            if (r4 != r3) goto L1b
            r2.l0 = r1
            r2.m0 = r0
            return
        L1b:
            r2.l0 = r0
            r2.m0 = r1
            return
    }

    @Override // defpackage.mp1, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r5) {
            r4 = this;
            n44 r0 = r4.n0
            if (r0 == 0) goto L5a
            android.widget.ListAdapter r0 = r4.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L19
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            f44 r0 = (defpackage.f44) r0
            goto L1c
        L19:
            f44 r0 = (defpackage.f44) r0
            r1 = 0
        L1c:
            int r2 = r5.getAction()
            r3 = 10
            if (r2 == r3) goto L43
            float r2 = r5.getX()
            int r2 = (int) r2
            float r3 = r5.getY()
            int r3 = (int) r3
            int r2 = r4.pointToPosition(r2, r3)
            r3 = -1
            if (r2 == r3) goto L43
            int r2 = r2 - r1
            if (r2 < 0) goto L43
            int r1 = r0.getCount()
            if (r2 >= r1) goto L43
            o44 r1 = r0.b(r2)
            goto L44
        L43:
            r1 = 0
        L44:
            o44 r2 = r4.o0
            if (r2 == r1) goto L5a
            i44 r0 = r0.A
            if (r2 == 0) goto L51
            n44 r3 = r4.n0
            r3.o(r0, r2)
        L51:
            r4.o0 = r1
            if (r1 == 0) goto L5a
            n44 r2 = r4.n0
            r2.D(r0, r1)
        L5a:
            boolean r4 = super.onHoverEvent(r5)
            return r4
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
            r4 = this;
            android.view.View r0 = r4.getSelectedView()
            androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
            r1 = 1
            if (r0 == 0) goto L29
            int r2 = r4.l0
            if (r5 != r2) goto L29
            boolean r5 = r0.isEnabled()
            if (r5 == 0) goto L28
            o44 r5 = r0.getItemData()
            boolean r5 = r5.hasSubMenu()
            if (r5 == 0) goto L28
            int r5 = r4.getSelectedItemPosition()
            long r2 = r4.getSelectedItemId()
            r4.performItemClick(r0, r5, r2)
        L28:
            return r1
        L29:
            if (r0 == 0) goto L4d
            int r0 = r4.m0
            if (r5 != r0) goto L4d
            r5 = -1
            r4.setSelection(r5)
            android.widget.ListAdapter r4 = r4.getAdapter()
            boolean r5 = r4 instanceof android.widget.HeaderViewListAdapter
            if (r5 == 0) goto L44
            android.widget.HeaderViewListAdapter r4 = (android.widget.HeaderViewListAdapter) r4
            android.widget.ListAdapter r4 = r4.getWrappedAdapter()
            f44 r4 = (defpackage.f44) r4
            goto L46
        L44:
            f44 r4 = (defpackage.f44) r4
        L46:
            i44 r4 = r4.A
            r5 = 0
            r4.c(r5)
            return r1
        L4d:
            boolean r4 = super.onKeyDown(r5, r6)
            return r4
    }

    public void setHoverListener(defpackage.n44 r1) {
            r0 = this;
            r0.n0 = r1
            return
    }

    @Override // defpackage.mp1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setSelector(r1)
            return
    }
}
