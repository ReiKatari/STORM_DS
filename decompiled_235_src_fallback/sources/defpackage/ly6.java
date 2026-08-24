package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly6  reason: default package */
/* loaded from: classes.dex */
public abstract class ly6 {
    static {
            v71 r0 = defpackage.ir1.a
            r1 = 2
            r2 = 250(0xfa, float:3.5E-43)
            r3 = 0
            defpackage.ge7.Y(r2, r3, r0, r1)
            return
    }

    public static final void a(int r16, defpackage.a74 r17, long r18, long r20, defpackage.fo2 r22, defpackage.eo2 r23, defpackage.zv0 r24, defpackage.px0 r25, int r26) {
            r1 = r16
            r10 = r25
            xq2 r10 = (defpackage.xq2) r10
            r0 = 113221600(0x6bf9fe0, float:7.208113E-35)
            r10.d0(r0)
            boolean r0 = r10.d(r1)
            r2 = 2
            if (r0 == 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = r2
        L16:
            r0 = r26 | r0
            r0 = r0 | 48
            r3 = r18
            boolean r5 = r10.e(r3)
            if (r5 == 0) goto L25
            r5 = 256(0x100, float:3.59E-43)
            goto L27
        L25:
            r5 = 128(0x80, float:1.8E-43)
        L27:
            r0 = r0 | r5
            r5 = r20
            boolean r7 = r10.e(r5)
            if (r7 == 0) goto L33
            r7 = 2048(0x800, float:2.87E-42)
            goto L35
        L33:
            r7 = 1024(0x400, float:1.435E-42)
        L35:
            r0 = r0 | r7
            r7 = 221184(0x36000, float:3.09945E-40)
            r0 = r0 | r7
            r7 = 599187(0x92493, float:8.3964E-40)
            r7 = r7 & r0
            r8 = 599186(0x92492, float:8.39638E-40)
            r9 = 0
            if (r7 == r8) goto L46
            r7 = 1
            goto L47
        L46:
            r7 = r9
        L47:
            r8 = r0 & 1
            boolean r7 = r10.S(r8, r7)
            if (r7 == 0) goto Lab
            r10.X()
            r7 = r26 & 1
            if (r7 == 0) goto L67
            boolean r7 = r10.B()
            if (r7 == 0) goto L5d
            goto L67
        L5d:
            r10.V()
            r13 = r17
            r14 = r22
            r15 = r23
            goto L7a
        L67:
            hy6 r7 = new hy6
            r7.<init>(r1)
            r8 = 1896966245(0x71116865, float:7.200245E29)
            zv0 r7 = defpackage.n16.I(r8, r7, r10)
            zv0 r8 = defpackage.nc1.g
            x64 r11 = defpackage.x64.a
            r14 = r7
            r15 = r8
            r13 = r11
        L7a:
            r10.q()
            r76 r7 = new r76
            r7.<init>(r2)
            a74 r2 = defpackage.ua6.a(r13, r9, r7)
            iy6 r7 = new iy6
            r8 = r24
            r7.<init>(r8, r15, r14, r9)
            r9 = -638448612(0xffffffffd9f20c1c, float:-8.5162823E15)
            zv0 r9 = defpackage.n16.I(r9, r7, r10)
            r7 = r0 & 896(0x380, float:1.256E-42)
            r11 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r11
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r7 | r0
            r12 = 50
            r3 = 0
            r8 = 0
            r6 = r5
            r4 = r18
            defpackage.ej2.c(r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r2 = r13
            r7 = r14
            r8 = r15
            goto Lb4
        Lab:
            r10.V()
            r2 = r17
            r7 = r22
            r8 = r23
        Lb4:
            cf5 r11 = r10.t()
            if (r11 == 0) goto Lc9
            jy6 r0 = new jy6
            r3 = r18
            r5 = r20
            r9 = r24
            r10 = r26
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r11.d = r0
        Lc9:
            return
    }
}
