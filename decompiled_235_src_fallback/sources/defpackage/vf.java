package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf  reason: default package */
/* loaded from: classes.dex */
public abstract class vf {
    public static final float a = 0.0f;

    static {
            r0 = 1103626240(0x41c80000, float:25.0)
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            r1 = 1075479162(0x401a827a, float:2.4142137)
            float r0 = r0 / r1
            defpackage.vf.a = r0
            return
    }

    public static final void a(defpackage.ok4 r9, defpackage.a74 r10, long r11, defpackage.px0 r13, int r14) {
            xq2 r13 = (defpackage.xq2) r13
            r0 = 1776202187(0x69deb1cb, float:3.3652642E25)
            r13.d0(r0)
            boolean r0 = r13.f(r9)
            r1 = 4
            if (r0 == 0) goto L11
            r0 = r1
            goto L12
        L11:
            r0 = 2
        L12:
            r0 = r0 | r14
            boolean r2 = r13.f(r10)
            if (r2 == 0) goto L1c
            r2 = 32
            goto L1e
        L1c:
            r2 = 16
        L1e:
            r0 = r0 | r2
            r0 = r0 | 128(0x80, float:1.8E-43)
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L2b
            r2 = r5
            goto L2c
        L2b:
            r2 = r4
        L2c:
            r3 = r0 & 1
            boolean r2 = r13.S(r3, r2)
            if (r2 == 0) goto L86
            r13.X()
            r2 = r14 & 1
            if (r2 == 0) goto L48
            boolean r2 = r13.B()
            if (r2 == 0) goto L42
            goto L48
        L42:
            r13.V()
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L4f
        L48:
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L4f:
            r13.q()
            r0 = r0 & 14
            if (r0 == r1) goto L57
            r5 = r4
        L57:
            java.lang.Object r1 = r13.P()
            if (r5 != 0) goto L61
            vs0 r2 = defpackage.ox0.a
            if (r1 != r2) goto L6b
        L61:
            k0 r1 = new k0
            r2 = 10
            r1.<init>(r9, r2)
            r13.l0(r1)
        L6b:
            qn2 r1 = (defpackage.qn2) r1
            a74 r1 = defpackage.ua6.a(r10, r4, r1)
            e40 r2 = defpackage.d90.R
            tf r3 = new tf
            r3.<init>(r1, r11, r4)
            r1 = -1653527038(0xffffffff9d712e02, float:-3.191987E-21)
            zv0 r1 = defpackage.n16.I(r1, r3, r13)
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            defpackage.mb3.h(r9, r2, r1, r13, r0)
        L84:
            r6 = r11
            goto L8a
        L86:
            r13.V()
            goto L84
        L8a:
            cf5 r11 = r13.t()
            if (r11 == 0) goto L9a
            i7 r3 = new i7
            r4 = r9
            r5 = r10
            r8 = r14
            r3.<init>(r4, r5, r6, r8)
            r11.d = r3
        L9a:
            return
    }

    public static final void b(defpackage.a74 r5, defpackage.px0 r6, int r7, int r8) {
            xq2 r6 = (defpackage.xq2) r6
            r0 = 694251107(0x29616e63, float:5.005578E-14)
            r6.d0(r0)
            r0 = r8 & 1
            r1 = 2
            if (r0 == 0) goto L10
            r2 = r7 | 6
            goto L1a
        L10:
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L18
            r2 = 4
            goto L19
        L18:
            r2 = r1
        L19:
            r2 = r2 | r7
        L1a:
            r3 = r2 & 3
            r4 = 1
            if (r3 == r1) goto L21
            r1 = r4
            goto L22
        L21:
            r1 = 0
        L22:
            r2 = r2 & r4
            boolean r1 = r6.S(r2, r1)
            if (r1 == 0) goto L4c
            if (r0 == 0) goto L2d
            x64 r5 = defpackage.x64.a
        L2d:
            float r0 = defpackage.vf.a
            r1 = 1103626240(0x41c80000, float:25.0)
            a74 r0 = defpackage.dj6.j(r5, r0, r1)
            py0 r1 = defpackage.n47.a
            java.lang.Object r1 = r6.j(r1)
            m47 r1 = (defpackage.m47) r1
            long r1 = r1.a
            t4 r3 = new t4
            r3.<init>(r4, r1)
            a74 r0 = defpackage.q60.x(r0, r3)
            defpackage.gi2.h(r6, r0)
            goto L4f
        L4c:
            r6.V()
        L4f:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L5c
            f5 r0 = new f5
            r0.<init>(r5, r7, r8)
            r6.d = r0
        L5c:
            return
    }
}
