package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tw3  reason: default package */
/* loaded from: classes.dex */
public final class tw3 extends android.widget.BaseAdapter {
    public int A;
    public final /* synthetic */ defpackage.uw3 B;

    public tw3(defpackage.uw3 r1) {
            r0 = this;
            r0.B = r1
            r0.<init>()
            r1 = -1
            r0.A = r1
            r0.a()
            return
    }

    public final void a() {
            r5 = this;
            uw3 r0 = r5.B
            i44 r0 = r0.L
            o44 r1 = r0.v
            if (r1 == 0) goto L22
            r0.i()
            java.util.ArrayList r0 = r0.j
            int r2 = r0.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r0.get(r3)
            o44 r4 = (defpackage.o44) r4
            if (r4 != r1) goto L1f
            r5.A = r3
            return
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            r0 = -1
            r5.A = r0
            return
    }

    public final defpackage.o44 b(int r3) {
            r2 = this;
            uw3 r0 = r2.B
            i44 r1 = r0.L
            r1.i()
            java.util.ArrayList r1 = r1.j
            r0.getClass()
            int r2 = r2.A
            if (r2 < 0) goto L14
            if (r3 < r2) goto L14
            int r3 = r3 + 1
        L14:
            java.lang.Object r2 = r1.get(r3)
            o44 r2 = (defpackage.o44) r2
            return r2
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            uw3 r0 = r2.B
            i44 r1 = r0.L
            r1.i()
            java.util.ArrayList r1 = r1.j
            int r1 = r1.size()
            r0.getClass()
            int r2 = r2.A
            if (r2 >= 0) goto L15
            return r1
        L15:
            int r1 = r1 + (-1)
            return r1
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
    public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            if (r4 != 0) goto Le
            uw3 r4 = r2.B
            android.view.LayoutInflater r4 = r4.B
            r0 = 2131623952(0x7f0e0010, float:1.887507E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
        Le:
            r5 = r4
            c54 r5 = (defpackage.c54) r5
            o44 r2 = r2.b(r3)
            r5.c(r2)
            return r4
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.a()
            super.notifyDataSetChanged()
            return
    }
}
