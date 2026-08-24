package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbadm extends zbub implements zbvn {
    private static final zbadm zbd;
    private int zbe;
    private Object zbg;
    private Object zbi;
    private zbtc zbl;
    private zbxb zbm;
    private int zbn;
    private int zbo;
    private boolean zbp;
    private int zbq;
    private zbtc zbr;
    private int zbf = 0;
    private int zbh = 0;
    private byte zbs = 2;
    private String zbj = "FaceAttributesClientBrainEmbedder";
    private String zbk = "";

    static {
        zbadm zbadmVar = new zbadm();
        zbd = zbadmVar;
        zbuf.zbD(zbadm.class, zbadmVar);
    }

    private zbadm() {
        zbtc zbtcVar = zbtc.zbb;
        this.zbl = zbtcVar;
        this.zbp = true;
        this.zbq = 1;
        this.zbr = zbtcVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zbs = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new zbadl(null);
                }
                return new zbadm();
            }
            return zbuf.zbA(zbd, "\u0004\r\u0002\u0001\u0002\u0010\r\u0000\u0000\u0001\u0002<\u0000\u0003;\u0000\u0004ဇ\u0006\u0005᠌\u0007\u0007м\u0001\b;\u0001\tဈ\u0000\nဈ\u0001\fင\u0004\rဉ\u0003\u000eည\b\u000fည\u0002\u0010င\u0005", new Object[]{"zbg", "zbf", "zbi", "zbh", "zbe", zbabp.class, "zbp", "zbq", zbadk.zba, zbadz.class, "zbj", "zbk", "zbn", "zbm", "zbr", "zbl", "zbo"});
        }
        return Byte.valueOf(this.zbs);
    }
}
