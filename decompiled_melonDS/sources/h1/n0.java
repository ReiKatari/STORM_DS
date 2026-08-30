package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f5983a = new m0(3, 0, null);

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f5984b = new m0(3, 1, null);

    public static b3.p a(b3.p pVar, p0 p0Var, n1 n1Var, boolean z10, j1.i iVar, boolean z11, mc.q qVar, boolean z12) {
        return pVar.f(new l0(p0Var, n1Var, z10, iVar, z11, f5983a, qVar, z12));
    }

    public static final long b(long j2) {
        float b10;
        float f8 = 0.0f;
        if (Float.isNaN(x4.q.b(j2))) {
            b10 = 0.0f;
        } else {
            b10 = x4.q.b(j2);
        }
        if (!Float.isNaN(x4.q.c(j2))) {
            f8 = x4.q.c(j2);
        }
        return p7.a.b(b10, f8);
    }
}
