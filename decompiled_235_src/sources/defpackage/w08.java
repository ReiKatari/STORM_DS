package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w08  reason: default package */
/* loaded from: classes.dex */
public final class w08 extends zbuf implements zbvn {
    private static final w08 zbb;
    private int zbd;
    private int zbe = -1;
    private float zbf = 0.3f;
    private int zbg = 5;
    private float zbh = 0.5f;
    private int zbi = 1;
    private boolean zbj = true;
    private float zbk = 0.85f;
    private boolean zbl = true;
    private float zbm;

    static {
        w08 w08Var = new w08();
        zbb = w08Var;
        zbuf.zbD(w08.class, w08Var);
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
                return new w08();
            }
            return zbuf.zbA(zbb, "\u0004\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001င\u0000\u0005ခ\u0001\u0006င\u0002\u0007ခ\u0003\f᠌\u0004\u000eဇ\u0005\u000fခ\u0006\u0010ဇ\u0007\u0011ခ\b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", e08.d, "zbj", "zbk", "zbl", "zbm"});
        }
        return (byte) 1;
    }
}
