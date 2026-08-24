package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh2  reason: default package */
/* loaded from: classes.dex */
final class gh2 extends defpackage.e74 {
    public final defpackage.jh2 a;

    public gh2(defpackage.jh2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            lh2 r0 = new lh2
            r0.<init>()
            jh2 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.gh2
            if (r0 != 0) goto L8
            goto L14
        L8:
            gh2 r2 = (defpackage.gh2) r2
            jh2 r1 = r1.a
            jh2 r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            lh2 r1 = (defpackage.lh2) r1
            jh2 r0 = r0.a
            r1.k0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            jh2 r0 = r0.a
            qn2 r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FocusPropertiesElement(scope="
            r0.<init>(r1)
            jh2 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
