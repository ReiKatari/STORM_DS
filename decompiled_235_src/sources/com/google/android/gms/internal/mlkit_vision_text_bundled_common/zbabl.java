package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbabl extends zbub implements zbvn {
    private static final zbabl zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private zbaat zbh;
    private int zbj;
    private int zbk;
    private zbaax zbm;
    private long zbp;
    private byte zbq = 2;
    private String zbi = "";
    private zbun zbl = zbuf.zby();
    private String zbn = "";
    private zbun zbo = zbuf.zby();

    static {
        zbabl zbablVar = new zbabl();
        zbd = zbablVar;
        zbuf.zbD(zbabl.class, zbablVar);
    }

    private zbabl() {
    }

    public static zbabl zbe() {
        return zbd;
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
                            this.zbq = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new zbabk(null);
                }
                return new zbabl();
            }
            return zbuf.zbA(zbd, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0003\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007Л\bᐉ\u0006\tဈ\u0007\n\u001a\u000bဂ\b", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", zbabj.class, "zbm", "zbn", "zbo", "zbp"});
        }
        return Byte.valueOf(this.zbq);
    }

    public final List zbf() {
        return this.zbl;
    }
}
