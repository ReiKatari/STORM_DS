package eh;

import oe.a0;
import oe.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f4498a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4499b;

    /* renamed from: c  reason: collision with root package name */
    public final s f4500c;

    public p(a0 a0Var, float f8, s sVar) {
        sVar.getClass();
        this.f4498a = a0Var;
        this.f4499b = f8;
        this.f4500c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (!this.f4498a.equals(pVar.f4498a) || Float.compare(this.f4499b, pVar.f4499b) != 0 || this.f4500c != pVar.f4500c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4500c.hashCode() + w.d.b(this.f4499b, this.f4498a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ButtonCircle(center=" + this.f4498a + ", radiusSquared=" + this.f4499b + ", input=" + this.f4500c + ")";
    }
}
