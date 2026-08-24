package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p07  reason: default package */
/* loaded from: classes.dex */
public final class p07 implements defpackage.m07 {
    public final long A;
    public final /* synthetic */ defpackage.q07 B;

    public p07(defpackage.q07 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @Override // defpackage.m07
    public final defpackage.l07 R() {
            r0 = this;
            q07 r0 = r0.B
            l07 r0 = defpackage.hi2.w(r0)
            return r0
    }

    @Override // defpackage.m07
    public final long i(defpackage.jk3 r4) {
            r3 = this;
            q07 r0 = r3.B
            vs4 r0 = r0.n0
            java.lang.Object r0 = r0.getValue()
            jk3 r0 = (defpackage.jk3) r0
            if (r0 == 0) goto L13
            long r1 = r3.A
            long r3 = r4.J(r0, r1)
            return r3
        L13:
            java.lang.String r3 = "Tried to open context menu before the anchor was placed."
            defpackage.s53.d(r3)
            defpackage.e41.c()
            r3 = 0
            return r3
    }

    @Override // defpackage.m07
    public final defpackage.of5 l(defpackage.jk3 r3) {
            r2 = this;
            long r2 = r2.i(r3)
            r0 = 0
            of5 r2 = defpackage.kj2.b(r2, r0)
            return r2
    }
}
