package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od1  reason: default package */
/* loaded from: classes.dex */
public final class od1 extends defpackage.z64 implements defpackage.mo1 {
    public final defpackage.r94 k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;

    public od1(defpackage.r94 r1) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r4 = this;
            w61 r0 = r4.F0()
            a6 r1 = new a6
            r2 = 15
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r11) {
            r10 = this;
            r11.b()
            zj0 r2 = r11.A
            boolean r3 = r10.l0
            if (r3 == 0) goto L22
            long r3 = defpackage.kt0.b
            r0 = 1050253722(0x3e99999a, float:0.3)
            long r3 = defpackage.kt0.c(r0, r3)
            long r5 = r2.e()
            r8 = 0
            r9 = 122(0x7a, float:1.71E-43)
            r1 = r3
            r3 = 0
            r7 = 0
            r0 = r11
            defpackage.no1.F(r0, r1, r3, r5, r7, r8, r9)
            return
        L22:
            boolean r1 = r10.m0
            if (r1 != 0) goto L2c
            boolean r0 = r10.n0
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            return
        L2c:
            long r0 = defpackage.kt0.b
            r3 = 1036831949(0x3dcccccd, float:0.1)
            long r0 = defpackage.kt0.c(r3, r0)
            long r5 = r2.e()
            r8 = 0
            r9 = 122(0x7a, float:1.71E-43)
            r3 = 0
            r7 = 0
            r1 = r0
            r0 = r11
            defpackage.no1.F(r0, r1, r3, r5, r7, r8, r9)
            return
    }
}
