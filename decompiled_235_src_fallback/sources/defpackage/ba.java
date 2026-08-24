package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba  reason: default package */
/* loaded from: classes.dex */
final class ba extends defpackage.e74 {
    public final defpackage.sa5 a;

    public ba(defpackage.sa5 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            ca r0 = new ca
            r0.<init>()
            sa5 r3 = r3.a
            r0.m0 = r3
            aa r3 = new aa
            k0 r1 = new k0
            r2 = 9
            r1.<init>(r0, r2)
            r3.<init>()
            r3.k0 = r1
            r0.R0(r3)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof defpackage.ba
            if (r0 != 0) goto L8
            goto L10
        L8:
            ba r2 = (defpackage.ba) r2
            sa5 r2 = r2.a
            sa5 r1 = r1.a
            if (r1 == r2) goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            ca r1 = (defpackage.ca) r1
            sa5 r0 = r0.a
            r1.m0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            sa5 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
