package u1;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements y3.e0 {

    /* renamed from: a  reason: collision with root package name */
    public final i1 f13305a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13306b;

    /* renamed from: c  reason: collision with root package name */
    public final q4.e0 f13307c;

    /* renamed from: d  reason: collision with root package name */
    public final mc.a f13308d;

    public f0(i1 i1Var, int i2, q4.e0 e0Var, mc.a aVar) {
        this.f13305a = i1Var;
        this.f13306b = i2;
        this.f13307c = e0Var;
        this.f13308d = aVar;
    }

    @Override // y3.e0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        long j10;
        if (u0Var.g0(x4.a.g(j2)) < x4.a.h(j2)) {
            j10 = j2;
        } else {
            j10 = j2;
            j2 = x4.a.a(j10, 0, Preference.DEFAULT_ORDER, 0, 0, 13);
        }
        y3.i1 e6 = u0Var.e(j2);
        int min = Math.min(e6.A, x4.a.h(j10));
        return x0Var.u0(min, e6.B, zb.r.A, new l1.n1(this, x0Var, e6, min, 2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (!this.f13305a.equals(f0Var.f13305a) || this.f13306b != f0Var.f13306b || !this.f13307c.equals(f0Var.f13307c) || !nc.k.a(this.f13308d, f0Var.f13308d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c4 = w.d.c(this.f13306b, this.f13305a.hashCode() * 31, 31);
        return this.f13308d.hashCode() + ((this.f13307c.hashCode() + c4) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f13305a + ", cursorOffset=" + this.f13306b + ", transformedText=" + this.f13307c + ", textLayoutResultProvider=" + this.f13308d + ')';
    }
}
