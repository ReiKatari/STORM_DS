package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g83  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g83 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.h83 B;

    public /* synthetic */ g83(defpackage.h83 r1, int r2) {
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
            h83 r1 = r1.B
            ub7 r2 = (defpackage.ub7) r2
            switch(r0) {
                case 0: goto L15;
                default: goto L9;
            }
        L9:
            r2.getClass()
            h83 r2 = (defpackage.h83) r2
            tt7 r2 = r2.l0
            r1.k0 = r2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L15:
            r2.getClass()
            h83 r2 = (defpackage.h83) r2
            tt7 r1 = r1.l0
            tt7 r0 = r2.k0
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L29
            r2.k0 = r1
            r2.S0()
        L29:
            tb7 r1 = defpackage.tb7.SkipSubtreeAndContinueTraversal
            return r1
    }
}
