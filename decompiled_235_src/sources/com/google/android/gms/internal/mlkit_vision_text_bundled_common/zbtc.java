package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbtc implements Iterable, Serializable {
    public static final zbtc zbb = new zbtb(zbuo.zbb);
    private int zba = 0;

    static {
        int i = zbsm.zba;
    }

    public static int zbh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    e41.q(lb1.j("Beginning index larger than ending index: ", i, i2, ", "));
                    return 0;
                }
                e41.q(lb1.j("End index: ", i2, i3, " >= "));
                return 0;
            }
            e41.q(lb1.k("Beginning index: ", i, " < 0"));
            return 0;
        }
        return i4;
    }

    public static zbtc zbj(byte[] bArr, int i, int i2) {
        zbh(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zbtb(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zba;
        if (i == 0) {
            int zbd = zbd();
            i = zbe(zbd, 0, zbd);
            if (i == 0) {
                i = 1;
            }
            this.zba = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zbsu(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zbd = zbd();
        if (zbd() <= 50) {
            concat = zbwj.zba(this);
        } else {
            concat = zbwj.zba(zbf(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zbd);
        sb.append(" contents=\"");
        return i61.n(sb, concat, "\">");
    }

    public abstract byte zba(int i);

    public abstract byte zbb(int i);

    public abstract int zbd();

    public abstract int zbe(int i, int i2, int i3);

    public abstract zbtc zbf(int i, int i2);

    public abstract void zbg(zbst zbstVar);

    public final int zbi() {
        return this.zba;
    }
}
