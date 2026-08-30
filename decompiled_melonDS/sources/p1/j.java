package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f11217a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11218b;

    public j(int i2, int i10) {
        boolean z10;
        this.f11217a = i2;
        this.f11218b = i10;
        if (i2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            k1.b.a("negative start index");
        }
        if (!(i10 >= i2)) {
            k1.b.a("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11217a == jVar.f11217a && this.f11218b == jVar.f11218b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11218b) + (Integer.hashCode(this.f11217a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f11217a);
        sb2.append(", end=");
        return w.d.p(sb2, this.f11218b, ')');
    }
}
