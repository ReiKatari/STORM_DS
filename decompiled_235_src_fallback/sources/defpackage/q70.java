package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q70  reason: default package */
/* loaded from: classes.dex */
final class q70 extends defpackage.e74 {
    public final defpackage.s70 a;

    public q70(defpackage.s70 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            t70 r0 = new t70
            r0.<init>()
            s70 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L15
            boolean r0 = r2 instanceof defpackage.q70
            if (r0 == 0) goto L13
            q70 r2 = (defpackage.q70) r2
            s70 r2 = r2.a
            s70 r1 = r1.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            t70 r2 = (defpackage.t70) r2
            s70 r0 = r2.k0
            if (r0 == 0) goto Lb
            ua4 r0 = r0.a
            r0.j(r2)
        Lb:
            s70 r1 = r1.a
            if (r1 == 0) goto L14
            ua4 r0 = r1.a
            r0.b(r2)
        L14:
            r2.k0 = r1
            return
    }

    public final int hashCode() {
            r0 = this;
            s70 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
