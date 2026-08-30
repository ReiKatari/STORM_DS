package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x70  reason: default package */
/* loaded from: classes.dex */
public abstract class x70 implements Iterable, Serializable {
    public static final v70 B = new v70(s33.b);
    public static final u70 L;
    public int A;

    static {
        u70 y60Var;
        if (tc.a()) {
            y60Var = new sn1(24);
        } else {
            y60Var = new y60(24);
        }
        L = y60Var;
    }

    public static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    f81.q(wh1.f(i, i2, "Beginning index larger than ending index: ", ", "));
                    return 0;
                }
                f81.q(wh1.f(i2, i3, "End index: ", " >= "));
                return 0;
            }
            f81.q(wh1.j("Beginning index: ", i, " < 0"));
            return 0;
        }
        return i4;
    }

    public static v70 d(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new v70(L.c(bArr, i, i2));
    }

    public abstract byte b(int i);

    public final int hashCode() {
        int i = this.A;
        if (i == 0) {
            int size = size();
            v70 v70Var = (v70) this;
            int k = v70Var.k();
            int i2 = size;
            for (int i3 = k; i3 < k + size; i3++) {
                i2 = (i2 * 31) + v70Var.R[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.A = i2;
            return i2;
        }
        return i;
    }

    public abstract void i(int i, byte[] bArr);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s70(this);
    }

    public abstract byte j(int i);

    public abstract int size();

    public final String toString() {
        v70 t70Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = oo2.B(this);
        } else {
            v70 v70Var = (v70) this;
            int c = c(0, 47, v70Var.size());
            if (c == 0) {
                t70Var = B;
            } else {
                t70Var = new t70(v70Var.R, v70Var.k(), c);
            }
            concat = oo2.B(t70Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return b31.q(sb, concat, "\">");
    }
}
