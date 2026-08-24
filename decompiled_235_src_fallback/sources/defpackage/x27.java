package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x27  reason: default package */
/* loaded from: classes.dex */
final class x27 extends defpackage.e74 {
    public final defpackage.s47 a;

    public x27(defpackage.s47 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            y27 r0 = new y27
            s47 r1 = r1.a
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.x27
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            x27 r2 = (defpackage.x27) r2
            s47 r2 = r2.a
            s47 r1 = r1.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r4) {
            r3 = this;
            y27 r4 = (defpackage.y27) r4
            r4.getClass()
            sm3 r0 = defpackage.nc1.f0(r4)
            kk3 r0 = r0.v0
            s47 r3 = r3.a
            s47 r3 = defpackage.gi2.N(r3, r0)
            nq6 r0 = defpackage.ky0.k
            java.lang.Object r0 = defpackage.hf.K(r4, r0)
            ki2 r0 = (defpackage.ki2) r0
            r4.R0(r3, r0)
            w27 r0 = r4.m0
            if (r0 == 0) goto L2a
            r1 = 23
            r2 = 0
            defpackage.w27.a(r0, r2, r2, r3, r1)
            defpackage.xk2.w(r4)
            return
        L2a:
            java.lang.String r3 = "Min size state is not set."
            ug r3 = defpackage.lb1.c(r3)
            throw r3
    }

    public final int hashCode() {
            r0 = this;
            s47 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
