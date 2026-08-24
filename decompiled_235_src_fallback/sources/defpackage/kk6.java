package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk6  reason: default package */
/* loaded from: classes.dex */
public final class kk6 {
    public final java.lang.Integer a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public /* synthetic */ kk6() {
            r8 = this;
            r6 = 0
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public kk6(java.lang.Integer r1, boolean r2, int r3, int r4, boolean r5, boolean r6, float r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public static defpackage.kk6 a(defpackage.kk6 r8, java.lang.Integer r9, boolean r10, int r11, int r12, boolean r13, boolean r14, float r15, int r16) {
            r0 = r16 & 1
            if (r0 == 0) goto L6
            java.lang.Integer r9 = r8.a
        L6:
            r1 = r9
            r9 = r16 & 2
            if (r9 == 0) goto Ld
            boolean r10 = r8.b
        Ld:
            r2 = r10
            r9 = r16 & 4
            if (r9 == 0) goto L14
            int r11 = r8.c
        L14:
            r3 = r11
            r9 = r16 & 8
            if (r9 == 0) goto L1b
            int r12 = r8.d
        L1b:
            r4 = r12
            r9 = r16 & 16
            if (r9 == 0) goto L22
            boolean r13 = r8.e
        L22:
            r5 = r13
            r9 = r16 & 32
            if (r9 == 0) goto L29
            boolean r14 = r8.f
        L29:
            r6 = r14
            r9 = r16 & 64
            if (r9 == 0) goto L30
            float r15 = r8.g
        L30:
            r7 = r15
            r8.getClass()
            kk6 r0 = new kk6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.kk6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kk6 r5 = (defpackage.kk6) r5
            java.lang.Integer r1 = r4.a
            java.lang.Integer r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L25
            return r2
        L25:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L2c
            return r2
        L2c:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L33
            return r2
        L33:
            boolean r1 = r4.f
            boolean r3 = r5.f
            if (r1 == r3) goto L3a
            return r2
        L3a:
            float r4 = r4.g
            float r5 = r5.g
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L45
            return r2
        L45:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            float r3 = r3.g
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Slot2AnalogMapping(deviceId="
            r0.<init>(r1)
            java.lang.Integer r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", useDeviceFilter="
            r0.append(r1)
            boolean r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", axisXCode="
            r0.append(r1)
            java.lang.String r1 = ", axisYCode="
            java.lang.String r2 = ", invertX="
            int r3 = r5.c
            int r4 = r5.d
            defpackage.lb1.x(r0, r3, r1, r4, r2)
            boolean r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", invertY="
            r0.append(r1)
            boolean r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", deadzone="
            r0.append(r1)
            float r5 = r5.g
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
