package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv6  reason: default package */
/* loaded from: classes.dex */
public final class bv6 {
    public final int a;
    public final int b;
    public final boolean c;
    public final defpackage.in7 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final android.util.Range i;
    public final boolean j;

    public bv6(int r1, int r2, boolean r3, defpackage.in7 r4, boolean r5, boolean r6, boolean r7, boolean r8, android.util.Range r9, boolean r10) {
            r0 = this;
            r4.getClass()
            r9.getClass()
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
            r0.j = r10
            return
    }

    public static defpackage.bv6 a(defpackage.bv6 r11, boolean r12, android.util.Range r13, int r14) {
            int r1 = r11.a
            int r2 = r11.b
            boolean r3 = r11.c
            in7 r4 = r11.d
            boolean r5 = r11.e
            boolean r6 = r11.f
            boolean r7 = r11.g
            r14 = r14 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L14
            android.util.Range r13 = r11.i
        L14:
            r9 = r13
            boolean r10 = r11.j
            r4.getClass()
            r9.getClass()
            bv6 r0 = new bv6
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L55
        L3:
            boolean r0 = r3 instanceof defpackage.bv6
            if (r0 != 0) goto L8
            goto L53
        L8:
            bv6 r3 = (defpackage.bv6) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 == r1) goto L11
            goto L53
        L11:
            int r0 = r2.b
            int r1 = r3.b
            if (r0 == r1) goto L18
            goto L53
        L18:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L1f
            goto L53
        L1f:
            in7 r0 = r2.d
            in7 r1 = r3.d
            if (r0 == r1) goto L26
            goto L53
        L26:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L2d
            goto L53
        L2d:
            boolean r0 = r2.f
            boolean r1 = r3.f
            if (r0 == r1) goto L34
            goto L53
        L34:
            boolean r0 = r2.g
            boolean r1 = r3.g
            if (r0 == r1) goto L3b
            goto L53
        L3b:
            boolean r0 = r2.h
            boolean r1 = r3.h
            if (r0 == r1) goto L42
            goto L53
        L42:
            android.util.Range r0 = r2.i
            android.util.Range r1 = r3.i
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L4d
            goto L53
        L4d:
            boolean r2 = r2.j
            boolean r3 = r3.j
            if (r2 == r3) goto L55
        L53:
            r2 = 0
            return r2
        L55:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            in7 r2 = r3.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.e
            int r0 = defpackage.xg6.e(r2, r0, r1)
            boolean r2 = r3.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.h
            int r0 = defpackage.xg6.e(r0, r2, r1)
            android.util.Range r2 = r3.i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.j
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FeatureSettings(cameraMode="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", requiredMaxBitDepth="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", hasVideoCapture="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", videoStabilization="
            r0.append(r1)
            in7 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", isUltraHdrOn="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", isHighSpeedOn="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", isFeatureComboInvocation="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", requiresFeatureComboQuery="
            r0.append(r1)
            boolean r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", targetFpsRange="
            r0.append(r1)
            android.util.Range r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", isStrictFpsRequired="
            r0.append(r1)
            boolean r2 = r2.j
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
