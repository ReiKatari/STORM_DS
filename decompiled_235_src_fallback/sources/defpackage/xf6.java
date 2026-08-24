package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf6  reason: default package */
/* loaded from: classes.dex */
public final class xf6 {
    public final boolean a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public xf6(boolean r1, float r2, float r3, boolean r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.xf6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf6 r5 = (defpackage.xf6) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            float r1 = r4.b
            float r3 = r5.b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L1e
            return r2
        L1e:
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L29
            return r2
        L29:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L30
            return r2
        L30:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L37
            return r2
        L37:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L3e
            return r2
        L3e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.f
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoverageFixConfigurationInputs(enabled="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", coveragePx="
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", depthBias="
            r0.append(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", applyRepeat="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", applyClamp="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", debugClearMagenta="
            r0.append(r1)
            boolean r2 = r2.f
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
