package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lj2  reason: default package */
/* loaded from: classes.dex */
public final class lj2 {
    public final int a;

    public lj2(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = "wght"
            return r0
    }

    public final float b() {
            r0 = this;
            int r0 = r0.a
            float r0 = (float) r0
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.lj2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lj2 r4 = (defpackage.lj2) r4
            int r3 = r3.a
            int r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            r0 = 113071012(0x6bd53a4, float:7.12168E-35)
            int r1 = r1.a
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FontVariation.Setting(axisName='wght', value="
            r0.<init>(r1)
            int r2 = r2.a
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
