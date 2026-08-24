package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ah3  reason: default package */
/* loaded from: classes.dex */
final class ah3 extends defpackage.e74 {
    public final defpackage.qn2 a;
    public final defpackage.qn2 b;

    public ah3(defpackage.qn2 r1, defpackage.qn2 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            ch3 r0 = new ch3
            r0.<init>()
            qn2 r1 = r2.a
            r0.k0 = r1
            qn2 r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ah3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ah3 r5 = (defpackage.ah3) r5
            qn2 r1 = r5.a
            qn2 r3 = r4.a
            if (r3 == r1) goto L13
            return r2
        L13:
            qn2 r4 = r4.b
            qn2 r5 = r5.b
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            ch3 r2 = (defpackage.ch3) r2
            qn2 r0 = r1.a
            r2.k0 = r0
            qn2 r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            qn2 r1 = r2.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            qn2 r2 = r2.b
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
        L15:
            int r1 = r1 + r0
            return r1
    }
}
