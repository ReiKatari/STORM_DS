package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbix extends zbuf implements zbvn {
    private static final zbix zbb;
    private int zbd;
    private zbiw zbg;
    private zbhl zbh;
    private zbhl zbi;
    private zbalp zbj;
    private float zbm;
    private boolean zbp;
    private zbxb zbq;
    private String zbe = "";
    private String zbf = "";
    private String zbk = "en";
    private int zbl = -1;
    private zbun zbn = zbuf.zby();
    private zbun zbo = zbuf.zby();
    private int zbr = -1;

    static {
        zbix zbixVar = new zbix();
        zbb = zbixVar;
        zbuf.zbD(zbix.class, zbixVar);
    }

    private zbix() {
    }

    public static zbiu zba() {
        return (zbiu) zbb.zbq();
    }

    public static /* synthetic */ void zbd(zbix zbixVar, String str) {
        zbixVar.zbd |= 1;
        zbixVar.zbe = "PassThroughCoarseClassifier";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new zbiu(null);
                }
                return new zbix();
            }
            return zbuf.zbA(zbb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0007\u0003ခ\b\u0004\u001a\u0005\u001a\u0006ဉ\u0002\bဇ\t\tဉ\n\nဉ\u0003\u000bဈ\u0006\fဉ\u0004\rင\u000b\u000eဉ\u0005\u000fဈ\u0001", new Object[]{"zbd", "zbe", "zbl", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbh", "zbk", "zbi", "zbr", "zbj", "zbf"});
        }
        return (byte) 1;
    }
}
