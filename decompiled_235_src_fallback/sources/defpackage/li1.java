package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: li1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class li1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.oi1 B;

    public /* synthetic */ li1(defpackage.oi1 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            oi1 r1 = r1.B
            switch(r0) {
                case 0: goto L25;
                case 1: goto L19;
                default: goto L7;
            }
        L7:
            jk4 r2 = (defpackage.jk4) r2
            jj1 r2 = r1.i0
            boolean r2 = r2.b
            if (r2 == 0) goto L16
            on2 r1 = r1.l0
            if (r1 == 0) goto L16
            r1.c()
        L16:
            jg7 r1 = defpackage.jg7.a
            return r1
        L19:
            gl1 r2 = (defpackage.gl1) r2
            r2.getClass()
            mi1 r2 = new mi1
            r0 = 1
            r2.<init>(r1, r0)
            return r2
        L25:
            gl1 r2 = (defpackage.gl1) r2
            r2.getClass()
            android.view.WindowManager r2 = r1.j0
            android.view.WindowManager$LayoutParams r0 = r1.k0
            r2.addView(r1, r0)
            mi1 r2 = new mi1
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }
}
