package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f44  reason: default package */
/* loaded from: classes.dex */
public final class f44 extends android.widget.BaseAdapter {
    public final defpackage.i44 A;
    public int B;
    public boolean L;
    public final boolean R;
    public final android.view.LayoutInflater X;
    public final int Y;

    public f44(defpackage.i44 r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.B = r0
            r1.R = r4
            r1.X = r3
            r1.A = r2
            r1.Y = r5
            r1.a()
            return
    }

    public final void a() {
            r5 = this;
            i44 r0 = r5.A
            o44 r1 = r0.v
            if (r1 == 0) goto L20
            r0.i()
            java.util.ArrayList r0 = r0.j
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r0.get(r3)
            o44 r4 = (defpackage.o44) r4
            if (r4 != r1) goto L1d
            r5.B = r3
            return
        L1d:
            int r3 = r3 + 1
            goto L10
        L20:
            r0 = -1
            r5.B = r0
            return
    }

    public final defpackage.o44 b(int r3) {
            r2 = this;
            boolean r0 = r2.R
            i44 r1 = r2.A
            if (r0 == 0) goto Lc
            r1.i()
            java.util.ArrayList r0 = r1.j
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.l()
        L10:
            int r2 = r2.B
            if (r2 < 0) goto L18
            if (r3 < r2) goto L18
            int r3 = r3 + 1
        L18:
            java.lang.Object r2 = r0.get(r3)
            o44 r2 = (defpackage.o44) r2
            return r2
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            boolean r0 = r2.R
            i44 r1 = r2.A
            if (r0 == 0) goto Lc
            r1.i()
            java.util.ArrayList r0 = r1.j
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.l()
        L10:
            int r2 = r2.B
            if (r2 >= 0) goto L19
            int r2 = r0.size()
            return r2
        L19:
            int r2 = r0.size()
            int r2 = r2 + (-1)
            return r2
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            o44 r0 = r0.b(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.X
            int r1 = r5.Y
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            o44 r8 = r5.b(r6)
            int r8 = r8.b
            int r1 = r6 + (-1)
            if (r1 < 0) goto L1c
            o44 r1 = r5.b(r1)
            int r1 = r1.b
            goto L1d
        L1c:
            r1 = r8
        L1d:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            i44 r3 = r5.A
            boolean r3 = r3.m()
            r4 = 1
            if (r3 == 0) goto L2c
            if (r8 == r1) goto L2c
            r0 = r4
        L2c:
            r2.setGroupDividerEnabled(r0)
            r8 = r7
            c54 r8 = (defpackage.c54) r8
            boolean r0 = r5.L
            if (r0 == 0) goto L39
            r2.setForceShowIcon(r4)
        L39:
            o44 r5 = r5.b(r6)
            r8.c(r5)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.a()
            super.notifyDataSetChanged()
            return
    }
}
