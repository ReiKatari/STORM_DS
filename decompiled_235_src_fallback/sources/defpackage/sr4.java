package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr4  reason: default package */
/* loaded from: classes.dex */
public abstract class sr4 {
    public defpackage.aj A;
    public defpackage.z40 B;
    public float L;
    public defpackage.kk3 R;

    public sr4() {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.L = r0
            kk3 r0 = defpackage.kk3.Ltr
            r1.R = r0
            return
    }

    public abstract void d(float r1);

    public abstract void e(defpackage.z40 r1);

    public void f(defpackage.kk3 r1) {
            r0 = this;
            return
    }

    public final void g(defpackage.um3 r7, long r8, float r10, defpackage.z40 r11) {
            r6 = this;
            zj0 r0 = r7.A
            float r1 = r6.L
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L9
            goto Le
        L9:
            r6.d(r10)
            r6.L = r10
        Le:
            z40 r1 = r6.B
            boolean r1 = defpackage.nb3.k(r1, r11)
            if (r1 != 0) goto L1b
            r6.e(r11)
            r6.B = r11
        L1b:
            kk3 r11 = r7.getLayoutDirection()
            kk3 r1 = r6.R
            if (r1 == r11) goto L28
            r6.f(r11)
            r6.R = r11
        L28:
            long r1 = r0.e()
            r11 = 32
            long r1 = r1 >> r11
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r11
            int r11 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r11)
            float r1 = r1 - r2
            long r2 = r0.e()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r8 = r8 & r4
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            float r2 = r2 - r9
            bt r9 = r0.B
            java.lang.Object r9 = r9.B
            os0 r9 = (defpackage.os0) r9
            r3 = 0
            r9.c0(r3, r3, r1, r2)
            int r9 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 <= 0) goto L83
            float r9 = java.lang.Float.intBitsToFloat(r11)     // Catch: java.lang.Throwable -> L76
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 <= 0) goto L83
            float r8 = java.lang.Float.intBitsToFloat(r8)     // Catch: java.lang.Throwable -> L76
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L83
            r6.i(r7)     // Catch: java.lang.Throwable -> L76
            goto L83
        L76:
            r6 = move-exception
            bt r7 = r0.B
            java.lang.Object r7 = r7.B
            os0 r7 = (defpackage.os0) r7
            float r8 = -r1
            float r9 = -r2
            r7.c0(r10, r10, r8, r9)
            throw r6
        L83:
            bt r6 = r0.B
            java.lang.Object r6 = r6.B
            os0 r6 = (defpackage.os0) r6
            float r7 = -r1
            float r8 = -r2
            r6.c0(r10, r10, r7, r8)
            return
    }

    public abstract long h();

    public abstract void i(defpackage.um3 r1);
}
