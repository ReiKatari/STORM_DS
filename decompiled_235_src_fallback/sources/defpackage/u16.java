package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u16  reason: default package */
/* loaded from: classes.dex */
public final class u16 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
            r3 = 0
            r4 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            defpackage.mp2.c(r0, r1, r2, r3, r4)
            return
    }

    public u16(float r1, float r2, float r3, float r4, long r5, long r7, long r9, long r11) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r7
            r0.g = r9
            r0.h = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L63
        L3:
            boolean r0 = r5 instanceof defpackage.u16
            if (r0 != 0) goto L8
            goto L61
        L8:
            u16 r5 = (defpackage.u16) r5
            float r0 = r4.a
            float r1 = r5.a
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L61
        L15:
            float r0 = r4.b
            float r1 = r5.b
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L61
        L20:
            float r0 = r4.c
            float r1 = r5.c
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L2b
            goto L61
        L2b:
            float r0 = r4.d
            float r1 = r5.d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L36
            goto L61
        L36:
            long r0 = r4.e
            long r2 = r5.e
            boolean r0 = defpackage.hv.A(r0, r2)
            if (r0 != 0) goto L41
            goto L61
        L41:
            long r0 = r4.f
            long r2 = r5.f
            boolean r0 = defpackage.hv.A(r0, r2)
            if (r0 != 0) goto L4c
            goto L61
        L4c:
            long r0 = r4.g
            long r2 = r5.g
            boolean r0 = defpackage.hv.A(r0, r2)
            if (r0 != 0) goto L57
            goto L61
        L57:
            long r0 = r4.h
            long r4 = r5.h
            boolean r4 = defpackage.hv.A(r0, r4)
            if (r4 != 0) goto L63
        L61:
            r4 = 0
            return r4
        L63:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            float r0 = r4.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r4.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r4.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r4.d
            int r0 = defpackage.xg6.a(r2, r0, r1)
            long r2 = r4.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.f
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.g
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.h
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r12.a
            java.lang.String r1 = defpackage.gi2.Q(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = r12.b
            java.lang.String r2 = defpackage.gi2.Q(r2)
            r0.append(r2)
            r0.append(r1)
            float r2 = r12.c
            java.lang.String r2 = defpackage.gi2.Q(r2)
            r0.append(r2)
            r0.append(r1)
            float r1 = r12.d
            java.lang.String r1 = defpackage.gi2.Q(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            long r1 = r12.e
            long r3 = r12.f
            boolean r5 = defpackage.hv.A(r1, r3)
            r6 = 41
            java.lang.String r7 = "RoundRect(rect="
            long r8 = r12.g
            long r10 = r12.h
            if (r5 == 0) goto Lb0
            boolean r12 = defpackage.hv.A(r3, r8)
            if (r12 == 0) goto Lb0
            boolean r12 = defpackage.hv.A(r8, r10)
            if (r12 == 0) goto Lb0
            r12 = 32
            long r3 = r1 >> r12
            int r12 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r12)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L87
            java.lang.String r1 = ", radius="
            java.lang.StringBuilder r0 = defpackage.i61.t(r7, r0, r1)
            float r12 = java.lang.Float.intBitsToFloat(r12)
            java.lang.String r12 = defpackage.gi2.Q(r12)
            r0.append(r12)
            r0.append(r6)
            java.lang.String r12 = r0.toString()
            return r12
        L87:
            java.lang.String r2 = ", x="
            java.lang.StringBuilder r0 = defpackage.i61.t(r7, r0, r2)
            float r12 = java.lang.Float.intBitsToFloat(r12)
            java.lang.String r12 = defpackage.gi2.Q(r12)
            r0.append(r12)
            java.lang.String r12 = ", y="
            r0.append(r12)
            float r12 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r12 = defpackage.gi2.Q(r12)
            r0.append(r12)
            r0.append(r6)
            java.lang.String r12 = r0.toString()
            return r12
        Lb0:
            java.lang.String r12 = ", topLeft="
            java.lang.StringBuilder r12 = defpackage.i61.t(r7, r0, r12)
            java.lang.String r0 = defpackage.hv.c0(r1)
            r12.append(r0)
            java.lang.String r0 = ", topRight="
            r12.append(r0)
            java.lang.String r0 = defpackage.hv.c0(r3)
            r12.append(r0)
            java.lang.String r0 = ", bottomRight="
            r12.append(r0)
            java.lang.String r0 = defpackage.hv.c0(r8)
            r12.append(r0)
            java.lang.String r0 = ", bottomLeft="
            r12.append(r0)
            java.lang.String r0 = defpackage.hv.c0(r10)
            r12.append(r0)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            return r12
    }
}
