package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p08  reason: default package */
/* loaded from: classes.dex */
public final class p08 extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn {
    private static final defpackage.p08 zbb = null;
    private int zbd;
    private java.lang.Object zbe;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun zbf;
    private byte zbg;

    static {
            p08 r0 = new p08
            r0.<init>()
            defpackage.p08.zbb = r0
            java.lang.Class<p08> r1 = defpackage.p08.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbD(r1, r0)
            return
    }

    public p08() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zbd = r0
            r0 = 2
            r1.zbg = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zby()
            r1.zbf = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final java.lang.Object zbb(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int r1 = r1 + (-1)
            if (r1 == 0) goto L3f
            r3 = 2
            if (r1 == r3) goto L2a
            r3 = 3
            if (r1 == r3) goto L24
            r3 = 4
            if (r1 == r3) goto L1c
            r3 = 5
            if (r1 == r3) goto L19
            if (r2 != 0) goto L14
            r1 = 0
            goto L15
        L14:
            r1 = 1
        L15:
            r0.zbg = r1
            r0 = 0
            return r0
        L19:
            p08 r0 = defpackage.p08.zbb
            return r0
        L1c:
            g08 r0 = new g08
            p08 r1 = defpackage.p08.zbb
            r0.<init>(r1)
            return r0
        L24:
            p08 r0 = new p08
            r0.<init>()
            return r0
        L2a:
            java.lang.String r0 = "zbf"
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbadm> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbadm.class
            java.lang.String r2 = "zbe"
            java.lang.String r3 = "zbd"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r0, r1}
            p08 r1 = defpackage.p08.zbb
            java.lang.String r2 = "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001:\u0000\u0003Л"
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbA(r1, r2, r0)
            return r0
        L3f:
            byte r0 = r0.zbg
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }
}
