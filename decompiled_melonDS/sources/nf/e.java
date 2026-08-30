package nf;

import oe.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {
    @va.b("x")

    /* renamed from: a  reason: collision with root package name */
    private final int f10420a;
    @va.b("y")

    /* renamed from: b  reason: collision with root package name */
    private final int f10421b;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public e(int i2, int i10) {
        this.f10420a = i2;
        this.f10421b = i10;
    }

    public final a0 a() {
        return new a0(this.f10420a, this.f10421b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f10420a == eVar.f10420a && this.f10421b == eVar.f10421b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10421b) + (Integer.hashCode(this.f10420a) * 31);
    }

    public final String toString() {
        int i2 = this.f10420a;
        int i10 = this.f10421b;
        return "PointDto(x=" + i2 + ", y=" + i10 + ")";
    }
}
