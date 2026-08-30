package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f9961a;

    public n1(mc.a aVar) {
        this.f9961a = new s0(aVar);
    }

    public abstract o1 a(Object obj);

    public v2 b() {
        return this.f9961a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v2 c(o1 o1Var, v2 v2Var) {
        i0 i0Var = null;
        if (v2Var instanceof i0) {
            if (o1Var.f9966c) {
                i0Var = (i0) v2Var;
                i0Var.f9928a.setValue(o1Var.c());
            }
        } else if (v2Var instanceof u2) {
            if ((o1Var.f9965b || o1Var.f9970g != null) && !o1Var.f9966c) {
                u2 u2Var = (u2) v2Var;
                if (nc.k.a(o1Var.c(), u2Var.f10063a)) {
                    i0Var = u2Var;
                }
            }
        } else if (v2Var instanceof c0) {
            o1Var.getClass();
        }
        if (i0Var == null) {
            if (o1Var.f9966c) {
                Object obj = o1Var.f9970g;
                e eVar = (e) o1Var.f9969f;
                if (eVar == null) {
                    eVar = e.Z;
                }
                return new i0(new f1(obj, eVar));
            }
            return new u2(o1Var.c());
        }
        return i0Var;
    }
}
