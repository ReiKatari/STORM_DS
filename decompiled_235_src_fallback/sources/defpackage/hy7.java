package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy7  reason: default package */
/* loaded from: classes.dex */
public final class hy7 extends defpackage.wf5 {
    public final defpackage.f24 d;

    public hy7(defpackage.f24 r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    @Override // defpackage.wf5
    public final int a() {
            r0 = this;
            f24 r0 = r0.d
            fb0 r0 = r0.L
            int r0 = r0.Y
            return r0
    }

    @Override // defpackage.wf5
    public final void e(defpackage.wg5 r4, int r5) {
            r3 = this;
            gy7 r4 = (defpackage.gy7) r4
            f24 r3 = r3.d
            fb0 r0 = r3.L
            i74 r0 = r0.A
            int r0 = r0.L
            int r0 = r0 + r5
            android.widget.TextView r4 = r4.u
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%d"
            java.lang.String r5 = java.lang.String.format(r5, r2, r1)
            r4.setText(r5)
            android.content.Context r5 = r4.getContext()
            java.util.Calendar r1 = defpackage.uj7.b()
            r2 = 1
            int r1 = r1.get(r2)
            if (r1 != r0) goto L45
            r1 = 2131952250(0x7f13027a, float:1.9540937E38)
            java.lang.String r5 = r5.getString(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = java.lang.String.format(r5, r1)
            goto L58
        L45:
            r1 = 2131952251(0x7f13027b, float:1.954094E38)
            java.lang.String r5 = r5.getString(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = java.lang.String.format(r5, r1)
        L58:
            r4.setContentDescription(r5)
            u63 r3 = r3.Y
            java.util.Calendar r4 = defpackage.uj7.b()
            int r4 = r4.get(r2)
            if (r4 != r0) goto L6a
            java.lang.Object r3 = r3.L
            goto L6c
        L6a:
            java.lang.Object r3 = r3.B
        L6c:
            r3 = 0
            throw r3
    }

    @Override // defpackage.wf5
    public final defpackage.wg5 f(android.view.ViewGroup r2, int r3) {
            r1 = this;
            android.content.Context r1 = r2.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r3 = 2131624048(0x7f0e0070, float:1.8875265E38)
            r0 = 0
            android.view.View r1 = r1.inflate(r3, r2, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            gy7 r2 = new gy7
            r2.<init>(r1)
            return r2
    }
}
