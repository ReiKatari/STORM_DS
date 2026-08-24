package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq4  reason: default package */
/* loaded from: classes.dex */
final class mq4 extends defpackage.e74 {
    public final defpackage.lq4 a;

    public mq4(defpackage.lq4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            nq4 r0 = new nq4
            r0.<init>()
            lq4 r1 = r1.a
            r0.m0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.mq4
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            mq4 r2 = (defpackage.mq4) r2
            lq4 r2 = r2.a
            lq4 r1 = r1.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            nq4 r2 = (defpackage.nq4) r2
            lq4 r0 = r2.m0
            lq4 r1 = r1.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L11
            r2.m0 = r1
            r2.S0()
        L11:
            return
    }

    public final int hashCode() {
            r0 = this;
            lq4 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
