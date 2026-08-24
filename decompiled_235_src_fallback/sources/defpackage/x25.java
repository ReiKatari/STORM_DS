package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x25  reason: default package */
/* loaded from: classes.dex */
public final class x25 implements defpackage.wb6 {
    public final java.lang.String a;
    public final defpackage.v25 b;

    public x25(java.lang.String r1, defpackage.v25 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.wb6
    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final void b() {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Primitive descriptor "
            r1.<init>(r2)
            java.lang.String r3 = r3.a
            java.lang.String r2 = " does not have elements"
            java.lang.String r3 = defpackage.i61.n(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    @Override // defpackage.wb6
    public final int d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.b()
            r0 = 0
            throw r0
    }

    @Override // defpackage.wb6
    public final defpackage.np2 e() {
            r0 = this;
            v25 r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof defpackage.x25
            if (r0 != 0) goto L8
            goto L20
        L8:
            x25 r3 = (defpackage.x25) r3
            java.lang.String r0 = r3.a
            java.lang.String r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            v25 r2 = r2.b
            v25 r3 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // defpackage.wb6
    public final int f() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.wb6
    public final java.lang.String g(int r1) {
            r0 = this;
            r0.b()
            r0 = 0
            throw r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            v25 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.wb6
    public final java.util.List i(int r1) {
            r0 = this;
            r0.b()
            r0 = 0
            throw r0
    }

    @Override // defpackage.wb6
    public final defpackage.wb6 j(int r1) {
            r0 = this;
            r0.b()
            r0 = 0
            throw r0
    }

    @Override // defpackage.wb6
    public final boolean k(int r1) {
            r0 = this;
            r0.b()
            r0 = 0
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PrimitiveDescriptor("
            r0.<init>(r1)
            java.lang.String r2 = r2.a
            r1 = 41
            java.lang.String r2 = defpackage.lb1.q(r0, r2, r1)
            return r2
    }
}
