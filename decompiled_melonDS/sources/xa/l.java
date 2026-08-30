package xa;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements ua.v {
    public static final k L = new k(0);
    public static final k R = new k(0);
    public final p1.a0 A;
    public final ConcurrentHashMap B = new ConcurrentHashMap();

    public l(p1.a0 a0Var) {
        this.A = a0Var;
    }

    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        va.a aVar2 = (va.a) aVar.f2155a.getAnnotation(va.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.A, hVar, aVar, aVar2, true);
    }

    public final ua.u b(p1.a0 a0Var, ua.h hVar, bb.a aVar, va.a aVar2, boolean z10) {
        ji.h hVar2;
        k kVar;
        ua.u uVar;
        Object d4 = a0Var.w(new bb.a(aVar2.value()), true).d();
        boolean nullSafe = aVar2.nullSafe();
        if (d4 instanceof ua.u) {
            uVar = (ua.u) d4;
        } else if (d4 instanceof ua.v) {
            ua.v vVar = (ua.v) d4;
            if (z10) {
                ua.v vVar2 = (ua.v) this.B.putIfAbsent(aVar.f2155a, vVar);
                if (vVar2 != null) {
                    vVar = vVar2;
                }
            }
            uVar = vVar.a(hVar, aVar);
        } else {
            boolean z11 = d4 instanceof ji.h;
            if (!z11 && !z11) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + d4.getClass().getName() + " as a @JsonAdapter for " + wa.i.k(aVar.f2156b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            ji.h hVar3 = null;
            if (z11) {
                hVar2 = (ji.h) d4;
            } else {
                hVar2 = null;
            }
            if (z11) {
                hVar3 = (ji.h) d4;
            }
            ji.h hVar4 = hVar3;
            if (z10) {
                kVar = L;
            } else {
                kVar = R;
            }
            b0 b0Var = new b0(hVar2, hVar4, hVar, aVar, kVar, nullSafe);
            nullSafe = false;
            uVar = b0Var;
        }
        if (uVar != null && nullSafe) {
            return uVar.a();
        }
        return uVar;
    }
}
