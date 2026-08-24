package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t44  reason: default package */
/* loaded from: classes.dex */
public abstract class t44 implements defpackage.lh6, defpackage.b54, android.widget.AdapterView.OnItemClickListener {
    public android.graphics.Rect A;

    public static int m(android.widget.ListAdapter r10, android.content.Context r11, int r12) {
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r3 = r10.getCount()
            r4 = 0
            r5 = r0
            r6 = r5
            r7 = r4
            r8 = r7
        L12:
            if (r0 >= r3) goto L37
            int r9 = r10.getItemViewType(r0)
            if (r9 == r6) goto L1c
            r8 = r4
            r6 = r9
        L1c:
            if (r7 != 0) goto L23
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r11)
        L23:
            android.view.View r8 = r10.getView(r0, r8, r7)
            r8.measure(r1, r2)
            int r9 = r8.getMeasuredWidth()
            if (r9 < r12) goto L31
            return r12
        L31:
            if (r9 <= r5) goto L34
            r5 = r9
        L34:
            int r0 = r0 + 1
            goto L12
        L37:
            return r5
    }

    @Override // defpackage.b54
    public final boolean f(defpackage.o44 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final boolean h(defpackage.o44 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void k(android.content.Context r1, defpackage.i44 r2) {
            r0 = this;
            return
    }

    public abstract void l(defpackage.i44 r1);

    public abstract void n(android.view.View r1);

    public abstract void o(boolean r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r2 == 0) goto L14
            r2 = r1
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
            f44 r2 = (defpackage.f44) r2
            goto L17
        L14:
            r2 = r1
            f44 r2 = (defpackage.f44) r2
        L17:
            i44 r2 = r2.A
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0 instanceof defpackage.gl0
            if (r3 != 0) goto L25
            r3 = 0
            goto L26
        L25:
            r3 = 4
        L26:
            r2.q(r1, r0, r3)
            return
    }

    public abstract void p(int r1);

    public abstract void q(int r1);

    public abstract void r(android.widget.PopupWindow.OnDismissListener r1);

    public abstract void s(boolean r1);

    public abstract void t(int r1);
}
