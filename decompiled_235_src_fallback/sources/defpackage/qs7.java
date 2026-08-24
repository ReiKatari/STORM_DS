package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qs7  reason: default package */
/* loaded from: classes.dex */
public abstract class qs7 {
    public static final defpackage.pi2 a = null;
    public static final defpackage.pi2 b = null;
    public static final defpackage.sr2 c = null;

    static {
            oj2 r0 = defpackage.oj2.Y
            r1 = 2131296257(0x7f090001, float:1.8210426E38)
            ll5 r2 = c(r1, r0)
            oj2 r3 = defpackage.oj2.Z
            ll5 r4 = c(r1, r3)
            oj2 r5 = defpackage.oj2.d0
            ll5 r6 = c(r1, r5)
            oj2 r7 = defpackage.oj2.e0
            ll5 r1 = c(r1, r7)
            ll5[] r1 = new defpackage.ll5[]{r2, r4, r6, r1}
            pi2 r2 = new pi2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r2.<init>(r1)
            defpackage.qs7.a = r2
            r1 = 2131296256(0x7f090000, float:1.8210424E38)
            ll5 r0 = c(r1, r0)
            ll5 r2 = c(r1, r3)
            ll5 r3 = c(r1, r5)
            ll5 r4 = c(r1, r7)
            oj2 r5 = defpackage.oj2.f0
            ll5 r1 = c(r1, r5)
            ll5[] r0 = new defpackage.ll5[]{r0, r2, r3, r4, r1}
            pi2 r1 = new pi2
            java.util.List r0 = java.util.Arrays.asList(r0)
            r0.getClass()
            r1.<init>(r0)
            defpackage.qs7.b = r1
            sr2 r0 = defpackage.li2.L
            defpackage.qs7.c = r0
            return
    }

    public static final defpackage.pi2 a() {
            pi2 r0 = defpackage.qs7.a
            return r0
    }

    public static final defpackage.sr2 b() {
            sr2 r0 = defpackage.qs7.c
            return r0
    }

    public static final defpackage.ll5 c(int r4, defpackage.oj2 r5) {
            mj2 r0 = new mj2
            int r1 = r5.A
            r2 = 1
            if (r2 > r1) goto Lc
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r1 >= r2) goto Lc
            goto L1d
        Lc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "'wght' value must be in [1, 1000]. Actual: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            defpackage.q53.a(r2)
        L1d:
            lj2 r2 = new lj2
            r2.<init>(r1)
            lj2[] r1 = new defpackage.lj2[]{r2}
            r0.<init>(r1)
            ll5 r1 = new ll5
            r1.<init>(r4, r5, r0)
            return r1
    }
}
