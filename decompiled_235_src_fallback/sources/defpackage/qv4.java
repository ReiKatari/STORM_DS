package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv4  reason: default package */
/* loaded from: classes.dex */
public final class qv4 implements defpackage.g61 {
    public final float a;

    public qv4(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            goto L12
        L11:
            return
        L12:
            java.lang.String r0 = "The percent should be in the range of [0, 100]"
            defpackage.s53.a(r0)
            return
    }

    @Override // defpackage.g61
    public final float a(long r1, defpackage.qh1 r3) {
            r0 = this;
            float r1 = defpackage.xi6.d(r1)
            float r0 = r0.a
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            float r0 = r0 * r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.qv4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qv4 r4 = (defpackage.qv4) r4
            float r3 = r3.a
            float r4 = r4.a
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
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
            java.lang.String r2 = "%)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
