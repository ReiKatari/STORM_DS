package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbhf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k08  reason: default package */
/* loaded from: classes.dex */
public final class k08 extends zbuf implements zbvn {
    private static final k08 zbb;
    private int zbd;
    private Object zbf;
    private boolean zbg;
    private zbix zbh;
    private boolean zbi;
    private zbhf zbj;
    private float zbk;
    private boolean zbl;
    private boolean zbm;
    private boolean zbo;
    private float zbp;
    private int zbq;
    private zbbq zbr;
    private int zbe = 0;
    private byte zbs = 2;
    private int zbn = -1;

    static {
        k08 k08Var = new k08();
        zbb = k08Var;
        zbuf.zbD(k08.class, k08Var);
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
                            this.zbs = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbtz(zbb);
                }
                return new k08();
            }
            return zbuf.zbA(zbb, "\u0004\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001м\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0006\u0005င\u0007\u0006ဇ\b\u0007ဇ\u0000\bခ\t\tင\n\nဇ\u0002\u000bဉ\u000b\fခ\u0004\rဇ\u0005\u000e<\u0000", new Object[]{"zbf", "zbe", "zbd", zbafq.class, "zbh", "zbj", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbi", "zbr", "zbk", "zbl", zbcz.class});
        }
        return Byte.valueOf(this.zbs);
    }
}
