package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z08  reason: default package */
/* loaded from: classes.dex */
public final class z08 extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn {
    private static final defpackage.z08 zbb = null;
    private int zbd;
    private int zbe;
    private java.lang.Object zbf;
    private defpackage.q18 zbg;
    private boolean zbh;
    private defpackage.h28 zbi;
    private defpackage.g28 zbj;
    private defpackage.l18 zbk;
    private int zbl;
    private byte zbm;

    static {
            z08 r0 = new z08
            r0.<init>()
            defpackage.z08.zbb = r0
            java.lang.Class<z08> r1 = defpackage.z08.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbD(r1, r0)
            return
    }

    public z08() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zbe = r0
            r0 = 2
            r1.zbm = r0
            return
    }

    public static defpackage.y08 b() {
            z08 r0 = defpackage.z08.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz r0 = r0.zbq()
            y08 r0 = (defpackage.y08) r0
            return r0
    }

    public static /* synthetic */ void c(defpackage.z08 r0, defpackage.g28 r1) {
            r1.getClass()
            r0.zbj = r1
            int r1 = r0.zbd
            r1 = r1 | 8
            r0.zbd = r1
            return
    }

    public static /* synthetic */ void d(defpackage.z08 r0, defpackage.q18 r1) {
            r1.getClass()
            r0.zbg = r1
            int r1 = r0.zbd
            r1 = r1 | 1
            r0.zbd = r1
            return
    }

    public final int a() {
            r0 = this;
            int r0 = r0.zbl
            return r0
    }

    public final boolean e() {
            r2 = this;
            int r0 = r2.zbe
            r1 = 6
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.zbf
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        Le:
            r2 = 0
            return r2
    }

    public final boolean f() {
            r2 = this;
            int r0 = r2.zbe
            r1 = 5
            if (r0 != r1) goto Le
            java.lang.Object r2 = r2.zbf
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final java.lang.Object zbb(int r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r10 = r10 + (-1)
            if (r10 == 0) goto L49
            r12 = 2
            if (r10 == r12) goto L2a
            r12 = 3
            if (r10 == r12) goto L24
            r12 = 4
            if (r10 == r12) goto L1c
            r12 = 5
            if (r10 == r12) goto L19
            if (r11 != 0) goto L14
            r10 = 0
            goto L15
        L14:
            r10 = 1
        L15:
            r9.zbm = r10
            r9 = 0
            return r9
        L19:
            z08 r9 = defpackage.z08.zbb
            return r9
        L1c:
            y08 r9 = new y08
            z08 r10 = defpackage.z08.zbb
            r9.<init>(r10)
            return r9
        L24:
            z08 r9 = new z08
            r9.<init>()
            return r9
        L2a:
            java.lang.String r7 = "zbk"
            java.lang.String r8 = "zbl"
            java.lang.String r0 = "zbf"
            java.lang.String r1 = "zbe"
            java.lang.String r2 = "zbd"
            java.lang.String r3 = "zbg"
            java.lang.String r4 = "zbh"
            java.lang.String r5 = "zbj"
            java.lang.String r6 = "zbi"
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            z08 r10 = defpackage.z08.zbb
            java.lang.String r11 = "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005"
            java.lang.Object r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbA(r10, r11, r9)
            return r9
        L49:
            byte r9 = r9.zbm
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            return r9
    }

    public final boolean zbi() {
            r0 = this;
            int r0 = r0.zbd
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
