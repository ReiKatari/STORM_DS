package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot6  reason: default package */
/* loaded from: classes.dex */
public final class ot6 extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.pt6 L;

    public /* synthetic */ ot6(defpackage.pt6 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.B
            jg7 r1 = defpackage.jg7.a
            pt6 r3 = r3.L
            switch(r0) {
                case 0: goto L4b;
                case 1: goto L38;
                default: goto L9;
            }
        L9:
            sm3 r4 = (defpackage.sm3) r4
            pt6 r5 = (defpackage.pt6) r5
            st6 r5 = r3.a
            gn3 r0 = r4.D0
            if (r0 != 0) goto L1a
            gn3 r0 = new gn3
            r0.<init>(r4, r5)
            r4.D0 = r0
        L1a:
            r3.b = r0
            gn3 r4 = r3.a()
            r4.h()
            gn3 r3 = r3.a()
            st6 r4 = r3.L
            if (r4 == r5) goto L37
            r3.L = r5
            r4 = 0
            r3.i(r4)
            sm3 r3 = r3.A
            r5 = 7
            defpackage.sm3.V(r3, r4, r5)
        L37:
            return r1
        L38:
            sm3 r4 = (defpackage.sm3) r4
            eo2 r5 = (defpackage.eo2) r5
            gn3 r3 = r3.a()
            java.lang.String r0 = r3.l0
            cn3 r2 = new cn3
            r2.<init>(r3, r5, r0)
            r4.c0(r2)
            return r1
        L4b:
            sm3 r4 = (defpackage.sm3) r4
            zx0 r5 = (defpackage.zx0) r5
            gn3 r3 = r3.a()
            r3.B = r5
            return r1
    }
}
