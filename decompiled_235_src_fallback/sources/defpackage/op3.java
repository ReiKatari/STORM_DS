package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op3  reason: default package */
/* loaded from: classes.dex */
final class op3 extends defpackage.e74 {
    public final defpackage.tp3 a;
    public final defpackage.p70 b;
    public final defpackage.lo4 c;

    public op3(defpackage.tp3 r1, defpackage.p70 r2, defpackage.lo4 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            sp3 r0 = new sp3
            r0.<init>()
            tp3 r1 = r2.a
            r0.k0 = r1
            p70 r1 = r2.b
            r0.l0 = r1
            lo4 r2 = r2.c
            r0.m0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.op3
            if (r0 != 0) goto L8
            goto L26
        L8:
            op3 r3 = (defpackage.op3) r3
            tp3 r0 = r3.a
            tp3 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L26
        L15:
            p70 r0 = r2.b
            p70 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            lo4 r2 = r2.c
            lo4 r3 = r3.c
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            sp3 r2 = (defpackage.sp3) r2
            tp3 r0 = r1.a
            r2.k0 = r0
            p70 r0 = r1.b
            r2.l0 = r0
            lo4 r1 = r1.c
            r2.m0 = r1
            return
    }

    public final int hashCode() {
            r3 = this;
            tp3 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            p70 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            int r0 = defpackage.xg6.e(r2, r0, r1)
            lo4 r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }
}
