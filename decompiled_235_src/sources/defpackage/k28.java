package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaiv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k28  reason: default package */
/* loaded from: classes.dex */
public final class k28 extends zbuf implements zbvn {
    private static final k28 zbb;
    private int zbd;
    private zbaiv zbe;
    private String zbf = "";
    private int zbg;
    private boolean zbh;
    private int zbi;

    static {
        k28 k28Var = new k28();
        zbb = k28Var;
        zbuf.zbD(k28.class, k28Var);
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
                return new k28();
            }
            return zbuf.zbA(zbb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", e08.k});
        }
        return (byte) 1;
    }
}
