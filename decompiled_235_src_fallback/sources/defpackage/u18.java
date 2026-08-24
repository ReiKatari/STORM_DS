package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u18  reason: default package */
/* loaded from: classes.dex */
public final class u18 extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn {
    private static final defpackage.u18 zbb = null;
    private int zbd;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbk zbe;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix zbf;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq zbg;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix zbh;
    private byte zbi;

    static {
            u18 r0 = new u18
            r0.<init>()
            defpackage.u18.zbb = r0
            java.lang.Class<u18> r1 = defpackage.u18.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbD(r1, r0)
            return
    }

    public u18() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zbi = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final java.lang.Object zbb(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2 + (-1)
            if (r2 == 0) goto L41
            r4 = 2
            if (r2 == r4) goto L2a
            r4 = 3
            if (r2 == r4) goto L24
            r4 = 4
            if (r2 == r4) goto L1c
            r4 = 5
            if (r2 == r4) goto L19
            if (r3 != 0) goto L14
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            r1.zbi = r2
            r1 = 0
            return r1
        L19:
            u18 r1 = defpackage.u18.zbb
            return r1
        L1c:
            g08 r1 = new g08
            u18 r2 = defpackage.u18.zbb
            r1.<init>(r2)
            return r1
        L24:
            u18 r1 = new u18
            r1.<init>()
            return r1
        L2a:
            java.lang.String r1 = "zbg"
            java.lang.String r2 = "zbh"
            java.lang.String r3 = "zbd"
            java.lang.String r4 = "zbe"
            java.lang.String r0 = "zbf"
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r0, r1, r2}
            u18 r2 = defpackage.u18.zbb
            java.lang.String r3 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003"
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbA(r2, r3, r1)
            return r1
        L41:
            byte r1 = r1.zbi
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }
}
