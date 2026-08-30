package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fh3  reason: default package */
/* loaded from: classes.dex */
public final class fh3 extends Number {
    public final String A;

    public fh3(String str) {
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
        if (obj instanceof fh3) {
            return this.A.equals(((fh3) obj).A);
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
            return hk2.J(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.A;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return hk2.J(str).longValue();
        }
    }

    public final String toString() {
        return this.A;
    }
}
