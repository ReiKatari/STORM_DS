package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx1  reason: default package */
/* loaded from: classes.dex */
public final class zx1 extends defpackage.hy1 {
    public final defpackage.xq7 a;
    public final defpackage.in5 b;

    public zx1(defpackage.xq7 r1, defpackage.in5 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.zx1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zx1 r5 = (defpackage.zx1) r5
            xq7 r1 = r4.a
            xq7 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            in5 r4 = r4.b
            in5 r5 = r5.b
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            xq7 r1 = r2.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            in5 r2 = r2.b
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LoadingRom(vulkanCompileProgress="
            r0.<init>(r1)
            xq7 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", retroAchievementsLoadStage="
            r0.append(r1)
            in5 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
