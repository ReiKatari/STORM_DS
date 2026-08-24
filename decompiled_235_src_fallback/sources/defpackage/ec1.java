package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ec1  reason: default package */
/* loaded from: classes.dex */
public final class ec1 extends android.widget.BaseAdapter {
    public static final int R = 0;
    public final java.util.Calendar A;
    public final int B;
    public final int L;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 4
            goto L9
        L8:
            r0 = 1
        L9:
            defpackage.ec1.R = r0
            return
    }

    public ec1() {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.util.Calendar r0 = defpackage.uj7.c(r0)
            r2.A = r0
            r1 = 7
            int r1 = r0.getMaximum(r1)
            r2.B = r1
            int r0 = r0.getFirstDayOfWeek()
            r2.L = r0
            return
    }

    public ec1(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.util.Calendar r0 = defpackage.uj7.c(r0)
            r2.A = r0
            r1 = 7
            int r0 = r0.getMaximum(r1)
            r2.B = r0
            r2.L = r3
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            int r0 = r1.B
            if (r2 < r0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.L
            int r2 = r2 + r1
            if (r2 <= r0) goto Lc
            int r2 = r2 - r0
        Lc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r4 != 0) goto L18
            android.content.Context r4 = r5.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131624040(0x7f0e0068, float:1.8875248E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
        L18:
            int r4 = r2.L
            int r3 = r3 + r4
            int r4 = r2.B
            if (r3 <= r4) goto L20
            int r3 = r3 - r4
        L20:
            java.util.Calendar r2 = r2.A
            r4 = 7
            r2.set(r4, r3)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            java.util.Locale r3 = r3.locale
            int r1 = defpackage.ec1.R
            java.lang.String r3 = r2.getDisplayName(r4, r1, r3)
            r0.setText(r3)
            android.content.Context r3 = r5.getContext()
            r5 = 2131952244(0x7f130274, float:1.9540925E38)
            java.lang.String r3 = r3.getString(r5)
            r5 = 2
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getDisplayName(r4, r5, r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.setContentDescription(r2)
            return r0
    }
}
