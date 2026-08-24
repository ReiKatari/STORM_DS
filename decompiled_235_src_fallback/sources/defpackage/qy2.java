package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy2  reason: default package */
/* loaded from: classes.dex */
final class qy2 extends defpackage.e74 {
    public final defpackage.r94 a;

    public qy2(defpackage.r94 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            uy2 r0 = new uy2
            r0.<init>()
            r94 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.qy2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qy2 r4 = (defpackage.qy2) r4
            r94 r4 = r4.a
            r94 r3 = r3.a
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            uy2 r2 = (defpackage.uy2) r2
            r94 r0 = r2.k0
            r94 r1 = r1.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L11
            r2.T0()
            r2.k0 = r1
        L11:
            return
    }

    public final int hashCode() {
            r0 = this;
            r94 r0 = r0.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }
}
