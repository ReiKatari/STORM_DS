package nd;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends c1 {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10307l;

    public g0(String str, h0 h0Var) {
        super(str, h0Var, 1);
        this.f10307l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [yb.f, java.lang.Object] */
    @Override // nd.c1
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                ld.e eVar = (ld.e) obj;
                if (this.f10276a.equals(eVar.b())) {
                    g0 g0Var = (g0) obj;
                    if (g0Var.f10307l && Arrays.equals((ld.e[]) this.f10285j.getValue(), (ld.e[]) g0Var.f10285j.getValue())) {
                        int d4 = eVar.d();
                        int i2 = this.f10278c;
                        if (i2 == d4) {
                            for (int i10 = 0; i10 < i2; i10++) {
                                if (nc.k.a(j(i10).b(), eVar.j(i10).b()) && nc.k.a(j(i10).c(), eVar.j(i10).c())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // ld.e
    public final boolean f() {
        return this.f10307l;
    }

    @Override // nd.c1
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
