package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbe;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v18  reason: default package */
/* loaded from: classes.dex */
public final class v18 extends zbuf implements zbvn {
    private static final v18 zbb;
    private int zbd;
    private zbbe zbe;
    private zbbk zbf;
    private u18 zbg;
    private boolean zbh;
    private byte zbi = 2;

    static {
        v18 v18Var = new v18();
        zbb = v18Var;
        zbuf.zbD(v18.class, v18Var);
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbtz(zbb);
                }
                return new v18();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဇ\u0003\u0003ᐉ\u0002\u0004ဉ\u0001", new Object[]{"zbd", "zbe", "zbh", "zbg", "zbf"});
        }
        return Byte.valueOf(this.zbi);
    }
}
