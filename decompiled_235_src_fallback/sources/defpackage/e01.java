package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e01  reason: default package */
/* loaded from: classes.dex */
public class e01 {
    public final defpackage.nt0 a;
    public final defpackage.nt0 b;
    public final defpackage.nt0 c;
    public final float[] d;

    public e01(defpackage.nt0 r9, defpackage.nt0 r10, int r11) {
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.q60.A(r0, r2)
            if (r0 == 0) goto L12
            nt0 r0 = defpackage.nc1.B(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.b
            boolean r1 = defpackage.q60.A(r4, r2)
            if (r1 == 0) goto L20
            nt0 r1 = defpackage.nc1.B(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            float[] r4 = defpackage.jw2.u
            r5 = 3
            if (r11 != r5) goto L6c
            long r6 = r9.b
            boolean r11 = defpackage.q60.A(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.q60.A(r6, r2)
            if (r11 == 0) goto L37
            if (r2 == 0) goto L37
            goto L6c
        L37:
            if (r11 != 0) goto L3b
            if (r2 == 0) goto L6c
        L3b:
            if (r11 == 0) goto L3e
            goto L3f
        L3e:
            r9 = r10
        L3f:
            cq5 r9 = (defpackage.cq5) r9
            ys7 r9 = r9.d
            if (r11 == 0) goto L4a
            float[] r11 = r9.a()
            goto L4b
        L4a:
            r11 = r4
        L4b:
            if (r2 == 0) goto L51
            float[] r4 = r9.a()
        L51:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r8.<init>(r10, r0, r1, r4)
            return
    }

    public e01(defpackage.nt0 r1, defpackage.nt0 r2, defpackage.nt0 r3, float[] r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public long a(long r10) {
            r9 = this;
            float r0 = defpackage.kt0.i(r10)
            float r1 = defpackage.kt0.h(r10)
            float r2 = defpackage.kt0.f(r10)
            float r7 = defpackage.kt0.e(r10)
            nt0 r10 = r9.b
            long r3 = r10.d(r0, r1, r2)
            r11 = 32
            long r5 = r3 >> r11
            int r11 = (int) r5
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r10.e(r0, r1, r2)
            float[] r0 = r9.d
            if (r0 == 0) goto L3e
            r1 = 0
            r1 = r0[r1]
            float r11 = r11 * r1
            r1 = 1
            r1 = r0[r1]
            float r3 = r3 * r1
            r1 = 2
            r0 = r0[r1]
            float r10 = r10 * r0
        L3e:
            r6 = r10
            r4 = r11
            r5 = r3
            nt0 r3 = r9.c
            nt0 r8 = r9.a
            long r9 = r3.f(r4, r5, r6, r7, r8)
            return r9
    }
}
