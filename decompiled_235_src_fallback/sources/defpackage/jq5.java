package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq5  reason: default package */
/* loaded from: classes.dex */
public abstract class jq5 {
    public static final defpackage.py0 a = null;
    public static final defpackage.kq5 b = null;
    public static final defpackage.kq5 c = null;
    public static final defpackage.eq5 d = null;
    public static final defpackage.eq5 e = null;
    public static final defpackage.eq5 f = null;

    static {
            pi3 r0 = new pi3
            r1 = 29
            r0.<init>(r1)
            py0 r1 = new py0
            r1.<init>(r0)
            defpackage.jq5.a = r1
            kq5 r0 = new kq5
            long r1 = defpackage.kt0.h
            r3 = 2143289344(0x7fc00000, float:NaN)
            r4 = 1
            r0.<init>(r3, r1, r4)
            defpackage.jq5.b = r0
            kq5 r0 = new kq5
            r4 = 0
            r0.<init>(r3, r1, r4)
            defpackage.jq5.c = r0
            eq5 r0 = new eq5
            r1 = 1042536202(0x3e23d70a, float:0.16)
            r2 = 1047904911(0x3e75c28f, float:0.24)
            r3 = 1034147594(0x3da3d70a, float:0.08)
            r0.<init>(r1, r2, r3, r2)
            defpackage.jq5.d = r0
            eq5 r0 = new eq5
            r1 = 1039516303(0x3df5c28f, float:0.12)
            r2 = 1025758986(0x3d23d70a, float:0.04)
            r0.<init>(r3, r1, r2, r1)
            defpackage.jq5.e = r0
            eq5 r0 = new eq5
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r0.<init>(r3, r1, r2, r4)
            defpackage.jq5.f = r0
            return
    }

    public static defpackage.kq5 a(int r3, long r4, boolean r6) {
            r0 = r3 & 1
            if (r0 == 0) goto L5
            r6 = 1
        L5:
            r0 = r3 & 2
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto Ld
            r0 = r1
            goto Lf
        Ld:
            r0 = 1103101952(0x41c00000, float:24.0)
        Lf:
            r3 = r3 & 4
            if (r3 == 0) goto L15
            long r4 = defpackage.kt0.h
        L15:
            boolean r3 = defpackage.om1.b(r0, r1)
            if (r3 == 0) goto L2b
            long r1 = defpackage.kt0.h
            boolean r3 = defpackage.kt0.d(r4, r1)
            if (r3 == 0) goto L2b
            if (r6 == 0) goto L28
            kq5 r3 = defpackage.jq5.b
            return r3
        L28:
            kq5 r3 = defpackage.jq5.c
            return r3
        L2b:
            kq5 r3 = new kq5
            r3.<init>(r0, r4, r6)
            return r3
    }
}
