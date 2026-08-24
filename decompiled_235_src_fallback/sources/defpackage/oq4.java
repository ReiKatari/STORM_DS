package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq4  reason: default package */
/* loaded from: classes.dex */
final class oq4 extends defpackage.e74 {
    public final defpackage.lq4 a;

    public oq4(defpackage.lq4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            rq4 r0 = new rq4
            r0.<init>()
            lq4 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.oq4
            if (r0 == 0) goto L7
            oq4 r2 = (defpackage.oq4) r2
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            lq4 r1 = r1.a
            lq4 r2 = r2.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            rq4 r1 = (defpackage.rq4) r1
            lq4 r0 = r0.a
            r1.k0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            lq4 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
