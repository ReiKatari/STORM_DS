package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z21  reason: default package */
/* loaded from: classes.dex */
final class z21 extends defpackage.e74 {
    public final defpackage.qn2 a;

    public z21(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            a31 r0 = new a31
            r0.<init>()
            qn2 r1 = r1.a
            r0.m0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.z21
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z21 r4 = (defpackage.z21) r4
            qn2 r4 = r4.a
            qn2 r3 = r3.a
            if (r4 != r3) goto L13
            return r0
        L13:
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            a31 r2 = (defpackage.a31) r2
            qn2 r0 = r2.m0
            qn2 r1 = r1.a
            if (r1 == r0) goto La
            r2.m0 = r1
        La:
            return
    }

    public final int hashCode() {
            r0 = this;
            qn2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
