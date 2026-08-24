package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl3  reason: default package */
/* loaded from: classes.dex */
final class zl3 extends defpackage.e74 {
    public final defpackage.fo2 a;

    public zl3(defpackage.fo2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            im3 r0 = new im3
            r0.<init>()
            fo2 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.zl3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zl3 r4 = (defpackage.zl3) r4
            fo2 r4 = r4.a
            fo2 r3 = r3.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            im3 r1 = (defpackage.im3) r1
            fo2 r0 = r0.a
            r1.k0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            fo2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
