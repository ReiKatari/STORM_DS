package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v51 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ v51(defpackage.p27 r1, boolean r2, int r3) {
            r0 = this;
            r3 = 0
            r0.A = r3
            r0.<init>()
            r0.L = r1
            r0.B = r2
            return
    }

    public /* synthetic */ v51(boolean r1, defpackage.eo2 r2, int r3) {
            r0 = this;
            r3 = 1
            r0.A = r3
            r0.<init>()
            r0.B = r1
            r0.L = r2
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            java.lang.Object r3 = r4.L
            boolean r4 = r4.B
            switch(r0) {
                case 0: goto L1d;
                default: goto Lc;
            }
        Lc:
            eo2 r3 = (defpackage.eo2) r3
            px0 r5 = (defpackage.px0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            int r6 = defpackage.ii2.a0(r2)
            defpackage.ln2.e(r4, r3, r5, r6)
            return r1
        L1d:
            p27 r3 = (defpackage.p27) r3
            px0 r5 = (defpackage.px0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.getClass()
            int r6 = defpackage.ii2.a0(r2)
            defpackage.hf.s(r3, r4, r5, r6)
            return r1
    }
}
