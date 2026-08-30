package gk;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: d  reason: collision with root package name */
    public final g f5802d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5803e;

    public s(q0 q0Var, pi.x xVar, n nVar, g gVar, boolean z10) {
        super(q0Var, xVar, nVar);
        this.f5802d = gVar;
        this.f5803e = z10;
    }

    @Override // gk.t
    public final Object a(a0 a0Var, Object[] objArr) {
        e eVar = (e) this.f5802d.d(a0Var);
        cc.c cVar = (cc.c) objArr[objArr.length - 1];
        try {
            if (this.f5803e) {
                eVar.getClass();
                return y0.c(eVar, cVar);
            }
            return y0.b(eVar, cVar);
        } catch (LinkageError e6) {
            throw e6;
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (VirtualMachineError e11) {
            throw e11;
        } catch (Throwable th2) {
            return y0.q(th2, cVar);
        }
    }
}
