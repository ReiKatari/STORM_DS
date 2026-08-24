package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo3  reason: default package */
/* loaded from: classes.dex */
public final class fo3 extends Number {
    public final String A;

    public fo3(String str) {
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
        if (obj instanceof fo3) {
            return this.A.equals(((fo3) obj).A);
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
            return qo2.D(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.A;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return qo2.D(str).longValue();
        }
    }

    public final String toString() {
        return this.A;
    }
}
