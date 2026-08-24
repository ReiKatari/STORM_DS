package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt  reason: default package */
/* loaded from: classes.dex */
public final class lt extends defpackage.e74 {
    public final boolean a;
    public final defpackage.qn2 b;

    public lt(defpackage.qn2 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            o51 r0 = new o51
            r0.<init>()
            boolean r1 = r2.a
            r0.k0 = r1
            qn2 r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof defpackage.lt
            if (r0 != 0) goto L8
            goto L17
        L8:
            lt r3 = (defpackage.lt) r3
            boolean r0 = r3.a
            boolean r1 = r2.a
            if (r1 == r0) goto L11
            goto L17
        L11:
            qn2 r2 = r2.b
            qn2 r3 = r3.b
            if (r2 == r3) goto L19
        L17:
            r2 = 0
            return r2
        L19:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            o51 r2 = (defpackage.o51) r2
            boolean r0 = r1.a
            r2.k0 = r0
            qn2 r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            qn2 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
