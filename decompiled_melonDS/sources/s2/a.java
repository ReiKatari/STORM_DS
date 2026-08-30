package s2;

import a1.t;
import o3.f0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends t implements oc.c {
    public final f0 R;
    public Object X;

    public a(f0 f0Var, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.R = f0Var;
        this.X = obj2;
    }

    @Override // a1.t, java.util.Map.Entry
    public final Object getValue() {
        return this.X;
    }

    @Override // a1.t, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i2;
        Object obj2 = this.X;
        this.X = obj;
        e eVar = (e) this.R.B;
        d dVar = eVar.R;
        Object obj3 = this.B;
        if (!dVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = eVar.L;
        if (z10) {
            if (z10) {
                l lVar = eVar.A[eVar.B];
                Object obj4 = lVar.A[lVar.L];
                dVar.put(obj3, obj);
                if (obj4 != null) {
                    i2 = obj4.hashCode();
                } else {
                    i2 = 0;
                }
                eVar.c(i2, dVar.L, obj4, 0);
            } else {
                fj.j.l();
                return null;
            }
        } else {
            dVar.put(obj3, obj);
        }
        eVar.Z = dVar.X;
        return obj2;
    }
}
