package i3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: d  reason: collision with root package name */
    public static final m0 f6659d = new m0();

    /* renamed from: a  reason: collision with root package name */
    public final long f6660a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6661b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6662c;

    public /* synthetic */ m0() {
        this(0.0f, z.d(4278190080L), 0L);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m0) {
                m0 m0Var = (m0) obj;
                if (s.c(this.f6660a, m0Var.f6660a) && h3.b.b(this.f6661b, m0Var.f6661b) && this.f6662c == m0Var.f6662c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = s.f6688i;
        return Float.hashCode(this.f6662c) + w.d.f(this.f6661b, Long.hashCode(this.f6660a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        sb2.append((Object) s.i(this.f6660a));
        sb2.append(", offset=");
        sb2.append((Object) h3.b.g(this.f6661b));
        sb2.append(", blurRadius=");
        return w.d.o(sb2, this.f6662c, ')');
    }

    public m0(float f8, long j2, long j10) {
        this.f6660a = j2;
        this.f6661b = j10;
        this.f6662c = f8;
    }
}
