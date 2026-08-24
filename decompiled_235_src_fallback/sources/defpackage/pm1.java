package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm1  reason: default package */
/* loaded from: classes.dex */
public final class pm1 implements defpackage.g61 {
    public final float a;

    public pm1(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.g61
    public final float a(long r1, defpackage.qh1 r3) {
            r0 = this;
            float r0 = r0.a
            float r0 = r3.e0(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.pm1
            if (r0 != 0) goto L8
            goto L14
        L8:
            pm1 r2 = (defpackage.pm1) r2
            float r1 = r1.a
            float r2 = r2.a
            boolean r1 = defpackage.om1.b(r1, r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CornerSize(size = "
            r0.<init>(r1)
            float r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ".dp)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
