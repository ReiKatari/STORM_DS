package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl7  reason: default package */
/* loaded from: classes.dex */
public final class hl7 extends defpackage.fl7 {
    public final java.lang.String A;
    public final java.util.List B;
    public final int L;
    public final defpackage.f80 R;
    public final float X;
    public final defpackage.f80 Y;
    public final float Z;
    public final float d0;
    public final int e0;
    public final int f0;
    public final float g0;
    public final float h0;
    public final float i0;
    public final float j0;

    public hl7(java.lang.String r1, java.util.List r2, int r3, defpackage.f80 r4, float r5, defpackage.f80 r6, float r7, float r8, int r9, int r10, float r11, float r12, float r13, float r14) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            r0.f0 = r10
            r0.g0 = r11
            r0.h0 = r12
            r0.i0 = r13
            r0.j0 = r14
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L89
        L4:
            if (r3 == 0) goto L8b
            java.lang.Class<hl7> r0 = defpackage.hl7.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L10
            goto L8b
        L10:
            hl7 r3 = (defpackage.hl7) r3
            java.lang.String r0 = r2.A
            java.lang.String r1 = r3.A
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L8b
        L1e:
            f80 r0 = r2.R
            f80 r1 = r3.R
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L29
            goto L8b
        L29:
            float r0 = r2.X
            float r1 = r3.X
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            f80 r0 = r2.Y
            f80 r1 = r3.Y
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3c
            goto L8b
        L3c:
            float r0 = r2.Z
            float r1 = r3.Z
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            float r0 = r2.d0
            float r1 = r3.d0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            int r0 = r2.e0
            int r1 = r3.e0
            if (r0 != r1) goto L8b
            int r0 = r2.f0
            int r1 = r3.f0
            if (r0 != r1) goto L8b
            float r0 = r2.g0
            float r1 = r3.g0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            float r0 = r2.h0
            float r1 = r3.h0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            float r0 = r2.i0
            float r1 = r3.i0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            float r0 = r2.j0
            float r1 = r3.j0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8b
            int r0 = r2.L
            int r1 = r3.L
            if (r0 != r1) goto L8b
            java.util.List r2 = r2.B
            java.util.List r3 = r3.B
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L89
            goto L8b
        L89:
            r2 = 1
            return r2
        L8b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.A
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r4.B
            int r0 = defpackage.i61.b(r0, r2, r1)
            r2 = 0
            f80 r3 = r4.R
            if (r3 == 0) goto L19
            int r3 = r3.hashCode()
            goto L1a
        L19:
            r3 = r2
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            float r3 = r4.X
            int r0 = defpackage.xg6.a(r3, r0, r1)
            f80 r3 = r4.Y
            if (r3 == 0) goto L2a
            int r2 = r3.hashCode()
        L2a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r4.Z
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r4.d0
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r2 = r4.e0
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r4.f0
            int r0 = defpackage.lb1.a(r2, r0, r1)
            float r2 = r4.g0
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r4.h0
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r4.i0
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r4.j0
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r4 = r4.L
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }
}
