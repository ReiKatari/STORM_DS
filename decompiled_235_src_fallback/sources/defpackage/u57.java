package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u57  reason: default package */
/* loaded from: classes.dex */
public final class u57 {
    public final int a;
    public final defpackage.rz b;
    public final defpackage.y c;
    public defpackage.u57 d;
    public long e;
    public long f;
    public long g;
    public final /* synthetic */ defpackage.v57 h;

    public u57(defpackage.v57 r1, int r2, defpackage.rz r3, defpackage.y r4) {
            r0 = this;
            r0.<init>()
            r0.h = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r1 = -9223372036854775808
            r0.g = r1
            return
    }

    public final void a(long r16, long r18, long r20, long r22, float[] r24) {
            r15 = this;
            v57 r1 = r15.h
            long r11 = r1.f
            r1 = 2
            rz r14 = r15.b
            eg4 r1 = defpackage.nc1.d0(r14, r1)
            sm3 r2 = defpackage.nc1.f0(r14)
            boolean r3 = r2.I()
            if0 r2 = r2.B0
            if (r3 != 0) goto L19
            r1 = 0
            goto L80
        L19:
            java.lang.Object r3 = r2.e
            eg4 r3 = (defpackage.eg4) r3
            if (r3 == r1) goto L70
            r3 = 32
            long r4 = r16 >> r3
            int r4 = (int) r4
            float r4 = (float) r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r16 & r5
            int r7 = (int) r7
            float r7 = (float) r7
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r8 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            r18 = r3
            long r3 = (long) r4
            long r7 = r8 << r18
            long r3 = r3 & r5
            long r3 = r3 | r7
            long r7 = r1.L
            java.lang.Object r2 = r2.e
            eg4 r2 = (defpackage.eg4) r2
            r2.getClass()
            r9 = 1
            long r1 = r2.R(r1, r3, r9)
            long r3 = defpackage.kn2.a0(r1)
            gi5 r2 = new gi5
            long r9 = r3 >> r18
            int r1 = (int) r9
            long r9 = r7 >> r18
            int r9 = (int) r9
            int r1 = r1 + r9
            long r9 = r3 & r5
            int r9 = (int) r9
            long r7 = r7 & r5
            int r7 = (int) r7
            int r9 = r9 + r7
            long r7 = (long) r1
            long r7 = r7 << r18
            long r9 = (long) r9
            long r5 = r5 & r9
            long r5 = r5 | r7
            r7 = r20
            r9 = r22
            r13 = r24
            r2.<init>(r3, r5, r7, r9, r11, r13, r14)
        L6e:
            r1 = r2
            goto L80
        L70:
            gi5 r2 = new gi5
            r3 = r16
            r5 = r18
            r7 = r20
            r9 = r22
            r13 = r24
            r2.<init>(r3, r5, r7, r9, r11, r13, r14)
            goto L6e
        L80:
            if (r1 != 0) goto L83
            return
        L83:
            y r0 = r15.c
            r0.g(r1)
            return
    }

    public final void b() {
            r9 = this;
            v57 r0 = r9.h
            p94 r1 = r0.a
            int r2 = r9.a
            java.lang.Object r3 = r1.g(r2)
            u57 r3 = (defpackage.u57) r3
            r4 = 0
            if (r3 != 0) goto L10
            goto L24
        L10:
            if (r3 == r9) goto L53
            int r5 = r1.d(r2)
            java.lang.Object[] r6 = r1.c
            r7 = r6[r5]
            int[] r1 = r1.b
            r1[r5] = r2
            r6[r5] = r3
        L20:
            u57 r1 = r3.d
            if (r1 != 0) goto L48
        L24:
            u57 r1 = r0.b
            if (r1 != r9) goto L2f
            u57 r1 = r1.d
            r0.b = r1
            r9.d = r4
            return
        L2f:
            if (r1 == 0) goto L34
            u57 r0 = r1.d
            goto L35
        L34:
            r0 = r4
        L35:
            r8 = r1
            r1 = r0
            r0 = r8
            if (r1 == 0) goto L86
            if (r1 != r9) goto L45
            if (r0 == 0) goto L42
            u57 r1 = r1.d
            r0.d = r1
        L42:
            r9.d = r4
            return
        L45:
            u57 r0 = r1.d
            goto L35
        L48:
            if (r1 != r9) goto L51
            u57 r0 = r9.d
            r3.d = r0
            r9.d = r4
            return
        L51:
            r3 = r1
            goto L20
        L53:
            u57 r0 = r9.d
            r9.d = r4
            if (r0 == 0) goto L68
            int r9 = r1.d(r2)
            java.lang.Object[] r3 = r1.c
            r4 = r3[r9]
            int[] r1 = r1.b
            r1[r9] = r2
            r3[r9] = r0
            return
        L68:
            rz r9 = r9.b
            z64 r9 = r9.A
            sm3 r9 = defpackage.nc1.f0(r9)
            boolean r0 = r9.Z
            if (r0 == 0) goto L86
            zp4 r0 = defpackage.vm3.a(r9)
            te r0 = (defpackage.te) r0
            rf5 r0 = r0.getRectManager()
            ei r0 = r0.b
            int r9 = r9.B
            r1 = 0
            r0.k(r9, r1)
        L86:
            return
    }
}
