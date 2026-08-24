package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r18  reason: default package */
/* loaded from: classes.dex */
public final class r18 extends zbuf implements zbvn {
    private static final r18 zbb;
    private int zbd;
    private String zbe = "";
    private int zbf;
    private float zbg;
    private long zbh;
    private boolean zbi;
    private float zbj;
    private float zbk;
    private long zbl;
    private int zbm;
    private long zbn;

    static {
        r18 r18Var = new r18();
        zbb = r18Var;
        zbuf.zbD(r18.class, r18Var);
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
                return new r18();
            }
            return zbuf.zbA(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ခ\u0005\u0007ခ\u0006\bဂ\u0007\tင\b\nဂ\t", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn"});
        }
        return (byte) 1;
    }
}
