package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z18  reason: default package */
/* loaded from: classes.dex */
public final class z18 extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn {
    private static final defpackage.z18 zbb = null;
    private int zbd;
    private int zbe;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq zbf;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbja zbg;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbdy zbh;
    private defpackage.m28 zbi;
    private byte zbj;

    static {
            z18 r0 = new z18
            r0.<init>()
            defpackage.z18.zbb = r0
            java.lang.Class<z18> r1 = defpackage.z18.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbD(r1, r0)
            return
    }

    public z18() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zbj = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final java.lang.Object zbb(int r8, java.lang.Object r9, java.lang.Object r10) {
            r7 = this;
            int r8 = r8 + (-1)
            if (r8 == 0) goto L45
            r10 = 2
            if (r8 == r10) goto L2a
            r10 = 3
            if (r8 == r10) goto L24
            r10 = 4
            if (r8 == r10) goto L1c
            r10 = 5
            if (r8 == r10) goto L19
            if (r9 != 0) goto L14
            r8 = 0
            goto L15
        L14:
            r8 = 1
        L15:
            r7.zbj = r8
            r7 = 0
            return r7
        L19:
            z18 r7 = defpackage.z18.zbb
            return r7
        L1c:
            w18 r7 = new w18
            z18 r8 = defpackage.z18.zbb
            r7.<init>(r8)
            return r7
        L24:
            z18 r7 = new z18
            r7.<init>()
            return r7
        L2a:
            e08 r4 = defpackage.e08.i
            java.lang.String r5 = "zbi"
            java.lang.String r6 = "zbf"
            java.lang.String r0 = "zbd"
            java.lang.String r1 = "zbg"
            java.lang.String r2 = "zbh"
            java.lang.String r3 = "zbe"
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6}
            z18 r8 = defpackage.z18.zbb
            java.lang.String r9 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003᠌\u0000\u0004ဉ\u0004\u0005ᐉ\u0001"
            java.lang.Object r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbA(r8, r9, r7)
            return r7
        L45:
            byte r7 = r7.zbj
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            return r7
    }
}
