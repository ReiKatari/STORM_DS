package xa;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 implements ua.v {
    public final /* synthetic */ Class A;
    public final /* synthetic */ Class B;
    public final /* synthetic */ ua.u L;

    public x0(Class cls, Class cls2, ua.u uVar) {
        this.A = cls;
        this.B = cls2;
        this.L = uVar;
    }

    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        Class cls = aVar.f2155a;
        if (cls != this.A && cls != this.B) {
            return null;
        }
        return this.L;
    }

    public final String toString() {
        return "Factory[type=" + this.B.getName() + "+" + this.A.getName() + ",adapter=" + this.L + "]";
    }
}
