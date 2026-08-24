package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaz extends zbub implements zbvn {
    private static final zbaz zbd;
    private byte zbe = 2;

    static {
        zbaz zbazVar = new zbaz();
        zbd = zbazVar;
        zbuf.zbD(zbaz.class, zbazVar);
    }

    private zbaz() {
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
                            this.zbe = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new zbay(null);
                }
                return new zbaz();
            }
            return zbuf.zbA(zbd, "\u0001\u0000", null);
        }
        return Byte.valueOf(this.zbe);
    }
}
