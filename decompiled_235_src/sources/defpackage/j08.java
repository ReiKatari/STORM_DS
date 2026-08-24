package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j08  reason: default package */
/* loaded from: classes.dex */
public final class j08 extends zbuf implements zbvn {
    private static final j08 zbb;
    private int zbd;
    private String zbe = "";
    private int zbf;

    static {
        j08 j08Var = new j08();
        zbb = j08Var;
        zbuf.zbD(j08.class, j08Var);
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
                    return new zbtz(zbb);
                }
                return new j08();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
