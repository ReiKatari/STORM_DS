package wa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends Number {
    public final String A;

    public k(String str) {
        this.A = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.A.equals(((k) obj).A);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.A);
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.A;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return i.i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.A;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return i.i(str).longValue();
        }
    }

    public final String toString() {
        return this.A;
    }
}
