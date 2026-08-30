package u1;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s1 implements y3.e0 {

    /* renamed from: a  reason: collision with root package name */
    public final i1 f13426a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13427b;

    /* renamed from: c  reason: collision with root package name */
    public final q4.e0 f13428c;

    /* renamed from: d  reason: collision with root package name */
    public final mc.a f13429d;

    public s1(i1 i1Var, int i2, q4.e0 e0Var, mc.a aVar) {
        this.f13426a = i1Var;
        this.f13427b = i2;
        this.f13428c = e0Var;
        this.f13429d = aVar;
    }

    @Override // y3.e0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        y3.i1 e6 = u0Var.e(x4.a.a(j2, 0, 0, 0, Preference.DEFAULT_ORDER, 7));
        int min = Math.min(e6.B, x4.a.g(j2));
        return x0Var.u0(e6.A, min, zb.r.A, new f1.s1(this, e6, min));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s1) {
                s1 s1Var = (s1) obj;
                if (!this.f13426a.equals(s1Var.f13426a) || this.f13427b != s1Var.f13427b || !this.f13428c.equals(s1Var.f13428c) || !nc.k.a(this.f13429d, s1Var.f13429d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c4 = w.d.c(this.f13427b, this.f13426a.hashCode() * 31, 31);
        return this.f13429d.hashCode() + ((this.f13428c.hashCode() + c4) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f13426a + ", cursorOffset=" + this.f13427b + ", transformedText=" + this.f13428c + ", textLayoutResultProvider=" + this.f13429d + ')';
    }
}
