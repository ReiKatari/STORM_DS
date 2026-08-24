package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: me  reason: default package */
/* loaded from: classes.dex */
public final class me extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.dh5 L;

    public /* synthetic */ me(int r1, defpackage.dh5 r2) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.B
            dh5 r2 = r2.L
            switch(r0) {
                case 0: goto L31;
                case 1: goto L1c;
                default: goto L7;
            }
        L7:
            ub7 r3 = (defpackage.ub7) r3
            r0 = r3
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            boolean r0 = r0.j0
            if (r0 == 0) goto L16
            r2.A = r3
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L1c:
            ny2 r3 = (defpackage.ny2) r3
            java.lang.Object r0 = r2.A
            if (r0 != 0) goto L29
            boolean r1 = r3.m0
            if (r1 == 0) goto L29
            r2.A = r3
            goto L2e
        L29:
            if (r0 == 0) goto L2e
            r3.getClass()
        L2e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        L31:
            vh2 r3 = (defpackage.vh2) r3
            r2.A = r3
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
    }
}
