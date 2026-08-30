package n1;

import h1.j2;
import h1.u1;
import q1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements u1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9839a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u1 f9840b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j2 f9841c;

    public /* synthetic */ s(u1 u1Var, j2 j2Var, int i2) {
        this.f9839a = i2;
        this.f9841c = j2Var;
        this.f9840b = u1Var;
    }

    @Override // h1.u1
    public final float a(float f8) {
        switch (this.f9839a) {
            case 0:
                return this.f9840b.a(f8);
            default:
                return this.f9840b.a(f8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    public final int b(int i2) {
        Object obj;
        switch (this.f9839a) {
            case 0:
                x xVar = (x) this.f9841c;
                p i10 = xVar.i();
                if (i10.f9810k.isEmpty()) {
                    return 0;
                }
                int g10 = xVar.g();
                if (i2 <= e() && g10 <= i2) {
                    ?? r02 = i10.f9810k;
                    int size = r02.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            obj = r02.get(i11);
                            if (((q) obj).f9816a != i2) {
                                i11++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    q qVar = (q) obj;
                    if (qVar == null) {
                        return 0;
                    }
                    return qVar.f9827l;
                }
                return ((i2 - xVar.g()) * l0.f.K(i10)) - xVar.h();
            default:
                a0 a0Var = (a0) this.f9841c;
                return (int) (p7.j.h(p7.m.r(a0Var) + pc.a.M(((a0Var.p() * (i2 - a0Var.k())) - (a0Var.l() * a0Var.p())) + 0), a0Var.f12100h, a0Var.f12099g) - p7.m.r(a0Var));
        }
    }

    public final int c() {
        switch (this.f9839a) {
            case 0:
                return ((x) this.f9841c).g();
            default:
                return ((a0) this.f9841c).f12097e;
        }
    }

    public final int d() {
        switch (this.f9839a) {
            case 0:
                return ((x) this.f9841c).h();
            default:
                return ((a0) this.f9841c).f12098f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    public final int e() {
        switch (this.f9839a) {
            case 0:
                q qVar = (q) zb.l.a0(((x) this.f9841c).i().f9810k);
                if (qVar != null) {
                    return qVar.f9816a;
                }
                return 0;
            default:
                return ((q1.g) zb.l.Z(((a0) this.f9841c).m().f12173a)).f12133a;
        }
    }

    public final void f(int i2) {
        switch (this.f9839a) {
            case 0:
                ((x) this.f9841c).k(i2);
                return;
            default:
                a0 a0Var = (a0) this.f9841c;
                a0Var.u(i2, 0 / a0Var.p(), true);
                return;
        }
    }
}
