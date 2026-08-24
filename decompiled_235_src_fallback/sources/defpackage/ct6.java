package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct6  reason: default package */
/* loaded from: classes.dex */
final class ct6 extends defpackage.e74 {
    public final defpackage.on2 a;

    public ct6(defpackage.on2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            dt6 r0 = new dt6
            on2 r1 = r1.a
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ct6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ct6 r4 = (defpackage.ct6) r4
            on2 r4 = r4.a
            on2 r3 = r3.a
            if (r3 != r4) goto L13
            return r0
        L13:
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            dt6 r1 = (defpackage.dt6) r1
            on2 r0 = r0.a
            r1.m0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            on2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
