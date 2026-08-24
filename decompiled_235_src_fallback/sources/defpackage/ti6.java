package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ti6  reason: default package */
/* loaded from: classes.dex */
public abstract class ti6 {
    public static final defpackage.io6 a = null;

    static {
            r0 = 0
            r1 = 7
            r2 = 0
            io6 r0 = defpackage.ge7.U(r2, r2, r0, r1)
            defpackage.ti6.a = r0
            return
    }

    public static final defpackage.pp6 a(long r8, defpackage.sc7 r10, defpackage.px0 r11, int r12, int r13) {
            r0 = r13 & 2
            if (r0 == 0) goto L6
            io6 r10 = defpackage.ti6.a
        L6:
            r2 = r10
            r10 = r13 & 4
            if (r10 == 0) goto Lf
            java.lang.String r10 = "ColorAnimation"
        Ld:
            r4 = r10
            goto L12
        Lf:
            java.lang.String r10 = "switch_track"
            goto Ld
        L12:
            nt0 r10 = defpackage.kt0.g(r8)
            r5 = r11
            xq2 r5 = (defpackage.xq2) r5
            boolean r10 = r5.f(r10)
            java.lang.Object r11 = r5.P()
            if (r10 != 0) goto L27
            vs0 r10 = defpackage.ox0.a
            if (r11 != r10) goto L3d
        L27:
            nt0 r10 = defpackage.kt0.g(r8)
            ne r11 = defpackage.ne.n0
            mc r13 = new mc
            r0 = 8
            r13.<init>(r10, r0)
            wc7 r10 = new wc7
            r10.<init>(r11, r13)
            r5.l0(r10)
            r11 = r10
        L3d:
            r1 = r11
            wc7 r1 = (defpackage.wc7) r1
            kt0 r0 = new kt0
            r0.<init>(r8)
            int r8 = r12 << 3
            r8 = r8 & 896(0x380, float:1.256E-42)
            int r9 = r12 << 6
            r10 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            r6 = r8 | r9
            r7 = 8
            r3 = 0
            pp6 r8 = defpackage.in.c(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
