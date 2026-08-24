package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yi6  reason: default package */
/* loaded from: classes.dex */
final class yi6 extends defpackage.e74 {
    public final defpackage.io6 a;

    public yi6(defpackage.io6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            bj6 r0 = new bj6
            io6 r1 = r1.a
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.yi6
            if (r0 == 0) goto L1a
            yi6 r2 = (defpackage.yi6) r2
            io6 r2 = r2.a
            io6 r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1a
            e40 r1 = defpackage.d90.L
            boolean r1 = r1.equals(r1)
            if (r1 == 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            bj6 r1 = (defpackage.bj6) r1
            io6 r0 = r0.a
            r1.l0 = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            io6 r2 = r2.a
            int r2 = r2.hashCode()
            int r2 = r2 * 31
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = java.lang.Float.hashCode(r0)
            int r1 = r1 * 31
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            return r0
    }
}
