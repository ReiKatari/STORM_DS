package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final s f14156c = new s(2, false);

    /* renamed from: d  reason: collision with root package name */
    public static final s f14157d = new s(1, true);

    /* renamed from: a  reason: collision with root package name */
    public final int f14158a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14159b;

    public s(int i2, boolean z10) {
        this.f14158a = i2;
        this.f14159b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f14158a == sVar.f14158a && this.f14159b == sVar.f14159b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14159b) + (Integer.hashCode(this.f14158a) * 31);
    }

    public final String toString() {
        if (equals(f14156c)) {
            return "TextMotion.Static";
        }
        if (equals(f14157d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
