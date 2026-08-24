package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbail;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j28  reason: default package */
/* loaded from: classes.dex */
public final class j28 extends zbuf implements zbvn {
    private static final j28 zbb;
    private int zbd;
    private int zbe = 0;
    private Object zbf;
    private zbix zbg;

    static {
        j28 j28Var = new j28();
        zbb = j28Var;
        zbuf.zbD(j28.class, j28Var);
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
                return new j28();
            }
            return zbuf.zbA(zbb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", zbbq.class, zbail.class});
        }
        return (byte) 1;
    }
}
