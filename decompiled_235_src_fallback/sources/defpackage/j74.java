package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j74  reason: default package */
/* loaded from: classes.dex */
public final class j74 extends android.widget.BaseAdapter {
    public static final int R = 0;
    public static final int X = 0;
    public final defpackage.i74 A;
    public defpackage.u63 B;
    public final defpackage.fb0 L;

    static {
            r0 = 0
            java.util.Calendar r1 = defpackage.uj7.c(r0)
            r2 = 4
            int r1 = r1.getMaximum(r2)
            defpackage.j74.R = r1
            java.util.Calendar r1 = defpackage.uj7.c(r0)
            r2 = 5
            int r1 = r1.getMaximum(r2)
            java.util.Calendar r0 = defpackage.uj7.c(r0)
            r2 = 7
            int r0 = r0.getMaximum(r2)
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            defpackage.j74.X = r0
            return
    }

    public j74(defpackage.i74 r1, defpackage.fb0 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.L = r2
            r0 = 0
            throw r0
    }

    public final int a() {
            r3 = this;
            fb0 r0 = r3.L
            int r0 = r0.X
            i74 r3 = r3.A
            java.util.Calendar r1 = r3.A
            r2 = 7
            int r2 = r1.get(r2)
            if (r0 <= 0) goto L10
            goto L14
        L10:
            int r0 = r1.getFirstDayOfWeek()
        L14:
            int r2 = r2 - r0
            if (r2 >= 0) goto L1a
            int r3 = r3.R
            int r2 = r2 + r3
        L1a:
            return r2
    }

    public final java.lang.Long b(int r2) {
            r1 = this;
            int r0 = r1.a()
            if (r2 < r0) goto L29
            int r0 = r1.c()
            if (r2 <= r0) goto Ld
            goto L29
        Ld:
            int r0 = r1.a()
            int r2 = r2 - r0
            int r2 = r2 + 1
            i74 r1 = r1.A
            java.util.Calendar r1 = r1.A
            java.util.Calendar r1 = defpackage.uj7.a(r1)
            r0 = 5
            r1.set(r0, r2)
            long r1 = r1.getTimeInMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L29:
            r1 = 0
            return r1
    }

    public final int c() {
            r1 = this;
            int r0 = r1.a()
            i74 r1 = r1.A
            int r1 = r1.X
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            int r0 = defpackage.j74.X
            return r0
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Long r0 = r0.b(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            i74 r0 = r0.A
            int r0 = r0.R
            int r1 = r1 / r0
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
            r4 = this;
            android.content.Context r0 = r7.getContext()
            u63 r1 = r4.B
            if (r1 != 0) goto Lf
            u63 r1 = new u63
            r1.<init>(r0)
            r4.B = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131624039(0x7f0e0067, float:1.8875246E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            i74 r7 = r4.A
            int r2 = r7.X
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r4 = r4.b(r5)
            if (r4 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r4 = defpackage.uj7.b()
            r4.getTimeInMillis()
            r4 = 0
            throw r4
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
            r0 = this;
            r0 = 1
            return r0
    }
}
