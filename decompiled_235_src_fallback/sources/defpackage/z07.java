package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z07  reason: default package */
/* loaded from: classes.dex */
final class z07 extends defpackage.e74 {
    public final defpackage.rr6 a;
    public final defpackage.wc0 b;
    public final defpackage.k27 c;
    public final defpackage.s51 d;

    public z07(defpackage.rr6 r1, defpackage.wc0 r2, defpackage.k27 r3, defpackage.s51 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r4 = this;
            a17 r0 = new a17
            k27 r1 = r4.c
            s51 r2 = r4.d
            rr6 r3 = r4.a
            wc0 r4 = r4.b
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L27
        L3:
            boolean r0 = r3 instanceof defpackage.z07
            if (r0 != 0) goto L8
            goto L25
        L8:
            z07 r3 = (defpackage.z07) r3
            rr6 r0 = r3.a
            rr6 r1 = r2.a
            if (r1 == r0) goto L11
            goto L25
        L11:
            wc0 r0 = r2.b
            wc0 r1 = r3.b
            if (r0 == r1) goto L18
            goto L25
        L18:
            k27 r0 = r2.c
            k27 r1 = r3.c
            if (r0 == r1) goto L1f
            goto L25
        L1f:
            s51 r2 = r2.d
            s51 r3 = r3.d
            if (r2 == r3) goto L27
        L25:
            r2 = 0
            return r2
        L27:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            a17 r3 = (defpackage.a17) r3
            rr6 r0 = r3.m0
            r1 = 0
            r0.B = r1
            rr6 r0 = r2.a
            r3.m0 = r0
            r0.B = r3
            boolean r1 = r3.j0
            if (r1 == 0) goto L14
            j87 r1 = defpackage.j87.Attached
            goto L16
        L14:
            j87 r1 = defpackage.j87.Detached
        L16:
            r0.L = r1
            wc0 r0 = r2.b
            r3.n0 = r0
            k27 r0 = r2.c
            r3.o0 = r0
            s51 r2 = r2.d
            r3.p0 = r2
            return
    }

    public final int hashCode() {
            r2 = this;
            rr6 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wc0 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            k27 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            s51 r2 = r2.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }
}
