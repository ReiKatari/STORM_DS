package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public float f8583a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8584b = true;

    /* renamed from: c  reason: collision with root package name */
    public c f8585c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (Float.compare(this.f8583a, l1Var.f8583a) == 0 && this.f8584b == l1Var.f8584b && nc.k.a(this.f8585c, l1Var.f8585c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e6 = w.d.e(Float.hashCode(this.f8583a) * 31, this.f8584b, 31);
        c cVar = this.f8585c;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return (e6 + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f8583a + ", fill=" + this.f8584b + ", crossAxisAlignment=" + this.f8585c + ", flowLayoutData=null)";
    }
}
