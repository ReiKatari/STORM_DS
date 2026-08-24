package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh4  reason: default package */
/* loaded from: classes.dex */
public final class jh4 implements defpackage.gg3 {
    public final defpackage.gg3 a;
    public final defpackage.xb6 b;

    public jh4(defpackage.gg3 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.a = r2
            xb6 r0 = new xb6
            wb6 r2 = r2.e()
            r0.<init>(r2)
            r1.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r2) {
            r1 = this;
            boolean r0 = r2.M()
            if (r0 == 0) goto Lf
            gg3 r1 = r1.a
            gg3 r1 = (defpackage.gg3) r1
            java.lang.Object r1 = r2.k(r1)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            if (r2 == 0) goto La
            gg3 r0 = r0.a
            gg3 r0 = (defpackage.gg3) r0
            r1.j(r0, r2)
            return
        La:
            r1.f()
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            xb6 r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1e
            java.lang.Class<jh4> r2 = defpackage.jh4.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1e
        L10:
            jh4 r5 = (defpackage.jh4) r5
            gg3 r4 = r4.a
            gg3 r5 = r5.a
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L1d
            return r1
        L1d:
            return r0
        L1e:
            return r1
    }

    public final int hashCode() {
            r0 = this;
            gg3 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
