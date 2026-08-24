package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv7  reason: default package */
/* loaded from: classes.dex */
public abstract class hv7 {
    public static final defpackage.p94 a = null;
    public static final defpackage.fv7[] b = null;

    static {
            p94 r0 = new p94
            r1 = 8
            r0.<init>(r1)
            ev7 r2 = defpackage.fv7.a
            r2.getClass()
            gv7 r2 = defpackage.ev7.g
            r3 = 1
            r0.i(r3, r2)
            gv7 r4 = defpackage.ev7.f
            r5 = 2
            r0.i(r5, r4)
            gv7 r6 = defpackage.ev7.b
            r7 = 4
            r0.i(r7, r6)
            gv7 r8 = defpackage.ev7.d
            r0.i(r1, r8)
            gv7 r9 = defpackage.ev7.h
            r10 = 16
            r0.i(r10, r9)
            gv7 r10 = defpackage.ev7.e
            r11 = 32
            r0.i(r11, r10)
            gv7 r11 = defpackage.ev7.i
            r12 = 64
            r0.i(r12, r11)
            gv7 r12 = defpackage.ev7.c
            r13 = 128(0x80, float:1.8E-43)
            r0.i(r13, r12)
            defpackage.hv7.a = r0
            r0 = 9
            fv7[] r0 = new defpackage.fv7[r0]
            r13 = 0
            r0[r13] = r2
            r0[r3] = r4
            r0[r5] = r6
            r2 = 3
            r0[r2] = r11
            r0[r7] = r9
            r2 = 5
            r0[r2] = r10
            r2 = 6
            r0[r2] = r8
            gv7 r2 = defpackage.ev7.j
            r3 = 7
            r0[r3] = r2
            r0[r1] = r12
            defpackage.hv7.b = r0
            return
    }

    public static final void a(defpackage.iz3 r6, defpackage.z53 r7, long r8, int r10, int r11) {
            r0 = -1
            boolean r0 = defpackage.bl2.u(r8, r0)
            if (r0 != 0) goto L41
            r0 = 48
            long r0 = r8 >>> r0
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = (float) r0
            r1 = 32
            long r4 = r8 >>> r1
            long r4 = r4 & r2
            int r1 = (int) r4
            float r1 = (float) r1
            r4 = 16
            long r4 = r8 >>> r4
            long r4 = r4 & r2
            int r4 = (int) r4
            int r10 = r10 - r4
            float r10 = (float) r10
            long r8 = r8 & r2
            int r8 = (int) r8
            int r11 = r11 - r8
            float r8 = (float) r11
            hy2 r9 = r7.b()
            r6.b(r9, r0)
            hy2 r9 = r7.d()
            r6.b(r9, r1)
            hy2 r9 = r7.c()
            r6.b(r9, r10)
            hy2 r7 = r7.a()
            r6.b(r7, r8)
        L41:
            return
    }
}
