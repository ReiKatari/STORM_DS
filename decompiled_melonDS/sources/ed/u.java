package ed;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements cc.e {
    public final Object A;
    public final ThreadLocal B;
    public final v L;

    public u(Object obj, ThreadLocal threadLocal) {
        this.A = obj;
        this.B = threadLocal;
        this.L = new v(threadLocal);
    }

    @Override // cc.g
    public final cc.g H(cc.g gVar) {
        return pc.a.G(this, gVar);
    }

    @Override // cc.g
    public final Object L(Object obj, mc.p pVar) {
        return pVar.j(obj, this);
    }

    @Override // cc.e
    public final cc.f getKey() {
        return this.L;
    }

    @Override // cc.g
    public final cc.g m(cc.f fVar) {
        if (this.L.equals(fVar)) {
            return cc.h.A;
        }
        return this;
    }

    @Override // cc.g
    public final cc.e t(cc.f fVar) {
        if (this.L.equals(fVar)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.A + ", threadLocal = " + this.B + ')';
    }
}
