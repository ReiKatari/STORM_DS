package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbdy;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbja;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z18  reason: default package */
/* loaded from: classes.dex */
public final class z18 extends zbuf implements zbvn {
    private static final z18 zbb;
    private int zbd;
    private int zbe;
    private zbafq zbf;
    private zbja zbg;
    private zbdy zbh;
    private m28 zbi;
    private byte zbj = 2;

    static {
        z18 z18Var = new z18();
        zbb = z18Var;
        zbuf.zbD(z18.class, z18Var);
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
                            this.zbj = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbtz(zbb);
                }
                return new z18();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003᠌\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zbd", "zbg", "zbh", "zbe", e08.i, "zbi", "zbf"});
        }
        return Byte.valueOf(this.zbj);
    }
}
