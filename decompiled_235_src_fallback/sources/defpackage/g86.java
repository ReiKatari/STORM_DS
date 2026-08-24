package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g86  reason: default package */
/* loaded from: classes.dex */
public final class g86 extends defpackage.e74 {
    public final defpackage.s76 a;
    public final boolean b;

    public g86(defpackage.s76 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            n76 r0 = new n76
            r0.<init>()
            s76 r1 = r2.a
            r0.k0 = r1
            boolean r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.g86
            if (r0 != 0) goto L5
            goto L19
        L5:
            g86 r3 = (defpackage.g86) r3
            s76 r0 = r3.a
            s76 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L19
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 != r3) goto L19
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            n76 r2 = (defpackage.n76) r2
            s76 r0 = r1.a
            r2.k0 = r0
            boolean r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r3 = this;
            s76 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.b
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }
}
