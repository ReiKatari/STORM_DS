package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un  reason: default package */
/* loaded from: classes.dex */
final class un<S> extends defpackage.e74 {
    public final defpackage.w97 a;
    public final defpackage.qa4 b;
    public final defpackage.yn c;

    public un(defpackage.w97 r1, defpackage.qa4 r2, defpackage.yn r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            xn r0 = new xn
            r1 = 1
            r0.<init>(r1)
            w97 r1 = r3.a
            r0.l0 = r1
            qa4 r1 = r3.b
            r0.m0 = r1
            yn r3 = r3.c
            r0.n0 = r3
            r1 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            r0.o0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.un
            if (r0 == 0) goto L1c
            un r3 = (defpackage.un) r3
            w97 r0 = r3.a
            w97 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L1c
            qa4 r3 = r3.b
            qa4 r2 = r2.b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            xn r2 = (defpackage.xn) r2
            w97 r0 = r1.a
            r2.l0 = r0
            qa4 r0 = r1.b
            r2.m0 = r0
            yn r1 = r1.c
            r2.n0 = r1
            return
    }

    public final int hashCode() {
            r2 = this;
            yn r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            w97 r1 = r2.a
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            qa4 r2 = r2.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }
}
