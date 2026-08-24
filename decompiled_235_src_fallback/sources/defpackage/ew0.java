package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ew0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ew0 implements defpackage.ko2 {
    @Override // defpackage.ko2
    public final java.lang.Object m(java.lang.Object r3, java.lang.Boolean r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, defpackage.xq2 r8, java.lang.Integer r9) {
            r2 = this;
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r4.booleanValue()
            r4 = r5
            i41 r4 = (defpackage.i41) r4
            fo2 r6 = (defpackage.fo2) r6
            on2 r7 = (defpackage.on2) r7
            int r5 = r9.intValue()
            r9 = r5 & 6
            r0 = r5
            x64 r5 = defpackage.x64.a
            if (r9 != 0) goto L24
            boolean r9 = r8.f(r5)
            if (r9 == 0) goto L21
            r9 = 4
            goto L22
        L21:
            r9 = 2
        L22:
            r9 = r9 | r0
            goto L25
        L24:
            r9 = r0
        L25:
            r1 = r0 & 48
            if (r1 != 0) goto L35
            boolean r1 = r8.f(r2)
            if (r1 == 0) goto L32
            r1 = 32
            goto L34
        L32:
            r1 = 16
        L34:
            r9 = r9 | r1
        L35:
            r1 = r0 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L45
            boolean r1 = r8.g(r3)
            if (r1 == 0) goto L42
            r1 = 256(0x100, float:3.59E-43)
            goto L44
        L42:
            r1 = 128(0x80, float:1.8E-43)
        L44:
            r9 = r9 | r1
        L45:
            r1 = r0 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L55
            boolean r1 = r8.f(r4)
            if (r1 == 0) goto L52
            r1 = 2048(0x800, float:2.87E-42)
            goto L54
        L52:
            r1 = 1024(0x400, float:1.435E-42)
        L54:
            r9 = r9 | r1
        L55:
            r1 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L65
            boolean r1 = r8.h(r6)
            if (r1 == 0) goto L62
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L64
        L62:
            r1 = 8192(0x2000, float:1.148E-41)
        L64:
            r9 = r9 | r1
        L65:
            r1 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L76
            boolean r0 = r8.h(r7)
            if (r0 == 0) goto L73
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L75
        L73:
            r0 = 65536(0x10000, float:9.1835E-41)
        L75:
            r9 = r9 | r0
        L76:
            r0 = 599187(0x92493, float:8.3964E-40)
            r0 = r0 & r9
            r1 = 599186(0x92492, float:8.39638E-40)
            if (r0 == r1) goto L81
            r0 = 1
            goto L82
        L81:
            r0 = 0
        L82:
            r1 = r9 & 1
            boolean r0 = r8.S(r1, r0)
            if (r0 == 0) goto La0
            int r0 = r9 >> 3
            r0 = r0 & 1022(0x3fe, float:1.432E-42)
            int r1 = r9 << 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r9
            r0 = r0 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r1
            r9 = r9 | r0
            defpackage.n41.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto La3
        La0:
            r8.V()
        La3:
            jg7 r2 = defpackage.jg7.a
            return r2
    }
}
