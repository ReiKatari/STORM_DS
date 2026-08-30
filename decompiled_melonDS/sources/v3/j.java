package v3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final p2.b f13676a = new p2.b(new i[16]);

    /* renamed from: b  reason: collision with root package name */
    public final a1.h0 f13677b = new a1.h0(10);

    public boolean a(a1.q qVar, y3.z zVar, p1.a0 a0Var, boolean z10) {
        p2.b bVar = this.f13676a;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        boolean z11 = false;
        for (int i10 = 0; i10 < i2; i10++) {
            if (!((i) objArr[i10]).a(qVar, zVar, a0Var, z10) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        return z11;
    }

    public void b(p1.a0 a0Var) {
        p2.b bVar = this.f13676a;
        int i2 = bVar.L;
        while (true) {
            i2--;
            if (-1 < i2) {
                if (((i) bVar.A[i2]).f13669d.B == 0) {
                    bVar.k(i2);
                }
            } else {
                return;
            }
        }
    }
}
