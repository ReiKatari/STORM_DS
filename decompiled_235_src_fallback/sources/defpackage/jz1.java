package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz1  reason: default package */
/* loaded from: classes.dex */
public final class jz1 {
    public final defpackage.jq1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final defpackage.p66 h;
    public final defpackage.p66 i;

    public jz1(defpackage.jq1 r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, defpackage.p66 r8, defpackage.p66 r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4a
        L3:
            boolean r0 = r3 instanceof defpackage.jz1
            if (r0 != 0) goto L8
            goto L48
        L8:
            jz1 r3 = (defpackage.jz1) r3
            jq1 r0 = r2.a
            jq1 r1 = r3.a
            if (r0 == r1) goto L11
            goto L48
        L11:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L18
            goto L48
        L18:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L1f
            goto L48
        L1f:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L26
            goto L48
        L26:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L2d
            goto L48
        L2d:
            boolean r0 = r2.f
            boolean r1 = r3.f
            if (r0 == r1) goto L34
            goto L48
        L34:
            boolean r0 = r2.g
            boolean r1 = r3.g
            if (r0 == r1) goto L3b
            goto L48
        L3b:
            p66 r0 = r2.h
            p66 r1 = r3.h
            if (r0 == r1) goto L42
            goto L48
        L42:
            p66 r2 = r2.i
            p66 r3 = r3.i
            if (r2 == r3) goto L4a
        L48:
            r2 = 0
            return r2
        L4a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            jq1 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            r2 = 0
            p66 r3 = r4.h
            if (r3 != 0) goto L34
            r3 = r2
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            int r0 = r0 + r3
            int r0 = r0 * r1
            p66 r4 = r4.i
            if (r4 != 0) goto L3f
            goto L43
        L3f:
            int r2 = r4.hashCode()
        L43:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DualScreenPresetConfiguration(preset="
            r0.<init>(r1)
            jq1 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", integerScale="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", keepAspectRatio="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", internalFillHeight="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", internalFillWidth="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", externalFillHeight="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", externalFillWidth="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", internalAlignmentOverride="
            r0.append(r1)
            p66 r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", externalAlignmentOverride="
            r0.append(r1)
            p66 r2 = r2.i
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
