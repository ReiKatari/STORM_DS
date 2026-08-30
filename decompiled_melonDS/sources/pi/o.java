package pi;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final t f11774d;

    /* renamed from: b  reason: collision with root package name */
    public final List f11775b;

    /* renamed from: c  reason: collision with root package name */
    public final List f11776c;

    static {
        vc.f fVar = t.f11790d;
        f11774d = p7.n.i("application/x-www-form-urlencoded");
    }

    public o(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.f11775b = qi.g.i(arrayList);
        this.f11776c = qi.g.i(arrayList2);
    }

    @Override // pi.b0
    public final long a() {
        return e(null, true);
    }

    @Override // pi.b0
    public final t b() {
        return f11774d;
    }

    @Override // pi.b0
    public final void d(fj.f fVar) {
        e(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(fj.f fVar, boolean z10) {
        fj.e eVar;
        if (z10) {
            eVar = new Object();
        } else {
            fVar.getClass();
            eVar = fVar.b();
        }
        List list = this.f11775b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                eVar.e0(38);
            }
            eVar.k0((String) list.get(i2));
            eVar.e0(61);
            eVar.k0((String) this.f11776c.get(i2));
        }
        if (z10) {
            long j2 = eVar.B;
            eVar.t();
            return j2;
        }
        return 0L;
    }
}
