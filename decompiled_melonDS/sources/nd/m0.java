package nd;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 implements tc.d {

    /* renamed from: a  reason: collision with root package name */
    public final tc.d f10333a;

    public m0(tc.d dVar) {
        dVar.getClass();
        this.f10333a = dVar;
    }

    @Override // tc.d
    public final List a() {
        return this.f10333a.a();
    }

    @Override // tc.d
    public final boolean b() {
        return this.f10333a.b();
    }

    @Override // tc.d
    public final nc.e c() {
        return this.f10333a.c();
    }

    public final boolean equals(Object obj) {
        m0 m0Var;
        tc.d dVar;
        tc.d dVar2;
        if (obj != null) {
            nc.e eVar = null;
            if (obj instanceof m0) {
                m0Var = (m0) obj;
            } else {
                m0Var = null;
            }
            if (m0Var != null) {
                dVar = m0Var.f10333a;
            } else {
                dVar = null;
            }
            tc.d dVar3 = this.f10333a;
            if (nc.k.a(dVar3, dVar)) {
                nc.e c4 = dVar3.c();
                if (c4 instanceof nc.e) {
                    if (obj instanceof tc.d) {
                        dVar2 = (tc.d) obj;
                    } else {
                        dVar2 = null;
                    }
                    if (dVar2 != null) {
                        eVar = dVar2.c();
                    }
                    if (eVar != null && (eVar instanceof nc.e)) {
                        Class cls = c4.f10259a;
                        cls.getClass();
                        Class cls2 = eVar.f10259a;
                        cls2.getClass();
                        return cls.equals(cls2);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10333a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f10333a;
    }
}
