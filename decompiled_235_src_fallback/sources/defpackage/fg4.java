package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg4  reason: default package */
/* loaded from: classes.dex */
public abstract class fg4 {
    public static final defpackage.y94 a = null;

    static {
            y94 r0 = defpackage.th4.a
            y94 r0 = new y94
            r0.<init>()
            defpackage.fg4.a = r0
            return
    }

    public static final void a(defpackage.z64 r3, int r4, int r5) {
            boolean r0 = r3 instanceof defpackage.zg1
            if (r0 == 0) goto L1b
            r0 = r3
            zg1 r0 = (defpackage.zg1) r0
            int r1 = r0.k0
            r2 = r1 & r4
            b(r3, r2, r5)
            int r3 = ~r1
            r3 = r3 & r4
            z64 r4 = r0.l0
        L12:
            if (r4 == 0) goto L1a
            a(r4, r3, r5)
            z64 r4 = r4.Y
            goto L12
        L1a:
            return
        L1b:
            int r0 = r3.L
            r4 = r4 & r0
            b(r3, r4, r5)
            return
    }

    public static final void b(defpackage.z64 r11, int r12, int r13) {
            if (r13 != 0) goto La
            boolean r0 = r11.G0()
            if (r0 != 0) goto La
            goto L1be
        La:
            r0 = r12 & 2
            r1 = 2
            if (r0 == 0) goto L22
            boolean r0 = r11 instanceof defpackage.jm3
            if (r0 == 0) goto L22
            r0 = r11
            jm3 r0 = (defpackage.jm3) r0
            defpackage.xk2.w(r0)
            if (r13 != r1) goto L22
            eg4 r0 = defpackage.nc1.d0(r11, r1)
            r0.k1()
        L22:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2f
            if (r13 == r1) goto L2f
            sm3 r0 = defpackage.nc1.f0(r11)
            r0.E()
        L2f:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r12
            r2 = 0
            if (r0 == 0) goto L3e
            if (r13 == r1) goto L3e
            sm3 r0 = defpackage.nc1.f0(r11)
            r0.U(r2)
        L3e:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L9b
            boolean r0 = r11 instanceof defpackage.ks2
            if (r0 == 0) goto L9b
            if (r13 == r4) goto L59
            if (r13 == r1) goto L4d
            goto L63
        L4d:
            sm3 r0 = defpackage.nc1.f0(r11)
            int r5 = r0.J0
            int r5 = r5 + (-1)
            r0.a0(r5)
            goto L63
        L59:
            sm3 r0 = defpackage.nc1.f0(r11)
            int r5 = r0.J0
            int r5 = r5 + r4
            r0.a0(r5)
        L63:
            if (r13 == r1) goto L9b
            sm3 r0 = defpackage.nc1.f0(r11)
            int r5 = r0.J0
            if (r5 == 0) goto L9b
            boolean r5 = r0.p()
            if (r5 != 0) goto L9b
            boolean r5 = r0.q()
            if (r5 != 0) goto L9b
            boolean r5 = r0.I0
            if (r5 == 0) goto L7e
            goto L9b
        L7e:
            zp4 r5 = defpackage.vm3.a(r0)
            te r5 = (defpackage.te) r5
            a34 r6 = r5.U0
            ap3 r6 = r6.e
            r6.getClass()
            int r7 = r0.J0
            if (r7 <= 0) goto L98
            java.lang.Object r6 = r6.B
            ua4 r6 = (defpackage.ua4) r6
            r6.b(r0)
            r0.I0 = r4
        L98:
            r5.C(r3)
        L9b:
            r0 = r12 & 4
            if (r0 == 0) goto La9
            boolean r0 = r11 instanceof defpackage.mo1
            if (r0 == 0) goto La9
            r0 = r11
            mo1 r0 = (defpackage.mo1) r0
            defpackage.f04.I(r0)
        La9:
            r0 = r12 & 8
            if (r0 == 0) goto Lb7
            boolean r0 = r11 instanceof defpackage.va6
            if (r0 == 0) goto Lb7
            sm3 r0 = defpackage.nc1.f0(r11)
            r0.n0 = r4
        Lb7:
            r0 = r12 & 64
            if (r0 == 0) goto Ld2
            boolean r0 = r11 instanceof defpackage.xs4
            if (r0 == 0) goto Ld2
            r0 = r11
            xs4 r0 = (defpackage.xs4) r0
            sm3 r0 = defpackage.nc1.f0(r0)
            wm3 r0 = r0.C0
            d34 r5 = r0.p
            r5.m0 = r4
            rz3 r0 = r0.q
            if (r0 == 0) goto Ld2
            r0.s0 = r4
        Ld2:
            r0 = r12 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L18a
            boolean r0 = r11 instanceof defpackage.kh2
            if (r0 == 0) goto L18a
            r0 = r11
            kh2 r0 = (defpackage.kh2) r0
            defpackage.jj0.b = r3
            jj0 r5 = defpackage.jj0.a
            r0.A(r5)
            java.lang.Boolean r5 = defpackage.jj0.b
            if (r5 == 0) goto L18a
            z64 r0 = (defpackage.z64) r0
            z64 r5 = r0.A
            boolean r5 = r5.j0
            if (r5 != 0) goto Lf5
            java.lang.String r5 = "visitChildren called on an unattached node"
            defpackage.p53.c(r5)
        Lf5:
            ua4 r5 = new ua4
            r6 = 16
            z64[] r7 = new defpackage.z64[r6]
            r5.<init>(r7)
            z64 r0 = r0.A
            z64 r7 = r0.Y
            if (r7 != 0) goto L108
            defpackage.nc1.z(r5, r0)
            goto L10b
        L108:
            r5.b(r7)
        L10b:
            int r0 = r5.L
            if (r0 == 0) goto L18a
            int r0 = r0 + (-1)
            java.lang.Object r0 = r5.l(r0)
            z64 r0 = (defpackage.z64) r0
            int r7 = r0.R
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 != 0) goto L121
            defpackage.nc1.z(r5, r0)
            goto L10b
        L121:
            if (r0 == 0) goto L10b
            int r7 = r0.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L187
            r7 = r3
        L12a:
            if (r0 == 0) goto L10b
            boolean r8 = r0 instanceof defpackage.vh2
            if (r8 == 0) goto L14c
            vh2 r0 = (defpackage.vh2) r0
            zp4 r8 = defpackage.nc1.g0(r0)
            te r8 = (defpackage.te) r8
            ah2 r8 = r8.getFocusOwner()
            eh2 r8 = (defpackage.eh2) r8
            xg2 r8 = r8.d
            ka4 r9 = r8.c
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L182
            r8.a()
            goto L182
        L14c:
            int r8 = r0.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L182
            boolean r8 = r0 instanceof defpackage.zg1
            if (r8 == 0) goto L182
            r8 = r0
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = r2
        L15c:
            if (r8 == 0) goto L17f
            int r10 = r8.L
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L17c
            int r9 = r9 + 1
            if (r9 != r4) goto L16a
            r0 = r8
            goto L17c
        L16a:
            if (r7 != 0) goto L173
            ua4 r7 = new ua4
            z64[] r10 = new defpackage.z64[r6]
            r7.<init>(r10)
        L173:
            if (r0 == 0) goto L179
            r7.b(r0)
            r0 = r3
        L179:
            r7.b(r8)
        L17c:
            z64 r8 = r8.Y
            goto L15c
        L17f:
            if (r9 != r4) goto L182
            goto L12a
        L182:
            z64 r0 = defpackage.nc1.A(r7)
            goto L12a
        L187:
            z64 r0 = r0.Y
            goto L121
        L18a:
            r0 = r12 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L1ae
            boolean r0 = r11 instanceof defpackage.rg2
            if (r0 == 0) goto L1ae
            r0 = r11
            rg2 r0 = (defpackage.rg2) r0
            zp4 r2 = defpackage.nc1.g0(r0)
            te r2 = (defpackage.te) r2
            ah2 r2 = r2.getFocusOwner()
            eh2 r2 = (defpackage.eh2) r2
            xg2 r2 = r2.d
            ka4 r3 = r2.d
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L1ae
            r2.a()
        L1ae:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r12 = r12 & r0
            if (r12 == 0) goto L1be
            boolean r12 = r11 instanceof defpackage.a53
            if (r12 == 0) goto L1be
            if (r13 != r1) goto L1be
            a53 r11 = (defpackage.a53) r11
            r11.f0()
        L1be:
            return
    }

    public static final void c(defpackage.z64 r2) {
            boolean r0 = r2.j0
            if (r0 != 0) goto L9
            java.lang.String r0 = "autoInvalidateUpdatedNode called on unattached node"
            defpackage.p53.c(r0)
        L9:
            r0 = -1
            r1 = 0
            a(r2, r0, r1)
            return
    }

    public static final int d(defpackage.y64 r2) {
            boolean r0 = r2 instanceof defpackage.hm3
            if (r0 == 0) goto L6
            r0 = 3
            goto L7
        L6:
            r0 = 1
        L7:
            boolean r1 = r2 instanceof defpackage.lo1
            if (r1 == 0) goto Ld
            r0 = r0 | 4
        Ld:
            boolean r1 = r2 instanceof defpackage.lt
            if (r1 == 0) goto L13
            r0 = r0 | 8
        L13:
            boolean r1 = r2 instanceof defpackage.ws4
            if (r1 == 0) goto L19
            r0 = r0 | 64
        L19:
            boolean r2 = r2 instanceof defpackage.o70
            if (r2 == 0) goto L21
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r0
            return r2
        L21:
            return r0
    }

    public static final int e(defpackage.z64 r4) {
            int r0 = r4.L
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class r0 = r4.getClass()
            y94 r1 = defpackage.fg4.a
            int r2 = r1.d(r0)
            if (r2 < 0) goto L16
            int[] r4 = r1.c
            r4 = r4[r2]
            return r4
        L16:
            boolean r2 = r4 instanceof defpackage.jm3
            if (r2 == 0) goto L1c
            r2 = 3
            goto L1d
        L1c:
            r2 = 1
        L1d:
            boolean r3 = r4 instanceof defpackage.mo1
            if (r3 == 0) goto L23
            r2 = r2 | 4
        L23:
            boolean r3 = r4 instanceof defpackage.va6
            if (r3 == 0) goto L29
            r2 = r2 | 8
        L29:
            boolean r3 = r4 instanceof defpackage.yy4
            if (r3 == 0) goto L2f
            r2 = r2 | 16
        L2f:
            boolean r3 = r4 instanceof defpackage.c74
            if (r3 == 0) goto L35
            r2 = r2 | 32
        L35:
            boolean r3 = r4 instanceof defpackage.xs4
            if (r3 == 0) goto L3b
            r2 = r2 | 64
        L3b:
            boolean r3 = r4 instanceof defpackage.kj3
            if (r3 == 0) goto L44
            r3 = 4194432(0x400080, float:5.877651E-39)
            r2 = r2 | r3
            goto L4a
        L44:
            boolean r3 = r4 instanceof defpackage.j34
            if (r3 == 0) goto L4a
            r2 = r2 | 128(0x80, float:1.8E-43)
        L4a:
            boolean r3 = r4 instanceof defpackage.ks2
            if (r3 == 0) goto L50
            r2 = r2 | 256(0x100, float:3.59E-43)
        L50:
            boolean r3 = r4 instanceof defpackage.cf6
            if (r3 == 0) goto L56
            r2 = r2 | 512(0x200, float:7.17E-43)
        L56:
            boolean r3 = r4 instanceof defpackage.vh2
            if (r3 == 0) goto L5c
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L5c:
            boolean r3 = r4 instanceof defpackage.kh2
            if (r3 == 0) goto L62
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L62:
            boolean r3 = r4 instanceof defpackage.rg2
            if (r3 == 0) goto L68
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        L68:
            boolean r3 = r4 instanceof defpackage.bh3
            if (r3 == 0) goto L6e
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L6e:
            boolean r3 = r4 instanceof defpackage.ie
            if (r3 == 0) goto L74
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
        L74:
            boolean r3 = r4 instanceof defpackage.fy0
            if (r3 == 0) goto L7c
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r3
        L7c:
            boolean r3 = r4 instanceof defpackage.ub7
            if (r3 == 0) goto L83
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r3
        L83:
            boolean r3 = r4 instanceof defpackage.o70
            if (r3 == 0) goto L8a
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r3
        L8a:
            boolean r3 = r4 instanceof defpackage.a53
            if (r3 == 0) goto L91
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r3
        L91:
            boolean r4 = r4 instanceof defpackage.sp3
            if (r4 == 0) goto L98
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 | r4
        L98:
            r1.g(r2, r0)
            return r2
    }

    public static final int f(defpackage.z64 r2) {
            boolean r0 = r2 instanceof defpackage.zg1
            if (r0 == 0) goto L15
            zg1 r2 = (defpackage.zg1) r2
            int r0 = r2.k0
            z64 r2 = r2.l0
        La:
            if (r2 == 0) goto L14
            int r1 = f(r2)
            r0 = r0 | r1
            z64 r2 = r2.Y
            goto La
        L14:
            return r0
        L15:
            int r2 = e(r2)
            return r2
    }

    public static final boolean g(int r4) {
            r0 = r4 & 128(0x80, float:1.8E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r3 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r3
            if (r4 == 0) goto Lf
            r1 = r2
        Lf:
            r4 = r0 | r1
            return r4
    }
}
