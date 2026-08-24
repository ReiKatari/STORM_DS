package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea0  reason: default package */
/* loaded from: classes.dex */
public abstract class ea0 implements Iterable, Serializable {
    public static final ca0 B = new ca0(aa3.b);
    public static final ba0 L;
    public int A;

    static {
        ba0 cs1Var;
        if (hd.a()) {
            cs1Var = new d90(26);
        } else {
            cs1Var = new cs1(25);
        }
        L = cs1Var;
    }

    public static int b(int i, int i2, int i3) {
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

    public static ca0 c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new ca0(L.b(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract void d(byte[] bArr, int i);

    public abstract byte f(int i);

    public final int hashCode() {
        int i = this.A;
        if (i == 0) {
            int size = size();
            ca0 ca0Var = (ca0) this;
            int g = ca0Var.g();
            int i2 = size;
            for (int i3 = g; i3 < g + size; i3++) {
                i2 = (i2 * 31) + ca0Var.R[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.A = i2;
            return i2;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z90(this);
    }

    public abstract int size();

    public final String toString() {
        ca0 aa0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = qo2.u(this);
        } else {
            ca0 ca0Var = (ca0) this;
            int b = b(0, 47, ca0Var.size());
            if (b == 0) {
                aa0Var = B;
            } else {
                aa0Var = new aa0(ca0Var.R, ca0Var.g(), b);
            }
            concat = qo2.u(aa0Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return i61.n(sb, concat, "\">");
    }
}
