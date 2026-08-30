package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final ue.a f6517a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6518b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6519c;

    /* renamed from: d  reason: collision with root package name */
    public final ve.d f6520d;

    /* renamed from: e  reason: collision with root package name */
    public final ve.n f6521e;

    public e1(ue.a aVar, int i2, boolean z10, ve.d dVar, ve.n nVar) {
        aVar.getClass();
        dVar.getClass();
        this.f6517a = aVar;
        this.f6518b = i2;
        this.f6519c = z10;
        this.f6520d = dVar;
        this.f6521e = nVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e1) {
                e1 e1Var = (e1) obj;
                if (this.f6517a != e1Var.f6517a || this.f6518b != e1Var.f6518b || this.f6519c != e1Var.f6519c || this.f6520d != e1Var.f6520d || !this.f6521e.equals(e1Var.f6521e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e6 = w.d.e(w.d.c(this.f6518b, this.f6517a.hashCode() * 31, 31), this.f6519c, 31);
        return this.f6521e.hashCode() + ((this.f6520d.hashCode() + e6) * 31);
    }

    public final String toString() {
        return "RuntimeInputLayoutConfiguration(softInputBehaviour=" + this.f6517a + ", softInputOpacity=" + this.f6518b + ", isHapticFeedbackEnabled=" + this.f6519c + ", layoutOrientation=" + this.f6520d + ", layout=" + this.f6521e + ")";
    }
}
