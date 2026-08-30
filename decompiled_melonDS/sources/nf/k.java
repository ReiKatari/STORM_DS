package nf;

import java.util.ArrayList;
import java.util.List;
import oe.a0;
import ve.l;
import ve.o;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {
    @va.b("uiSize")

    /* renamed from: a  reason: collision with root package name */
    private final e f10438a;
    @va.b("insets")

    /* renamed from: b  reason: collision with root package name */
    private final nf.a f10439b;
    @va.b("orientation")

    /* renamed from: c  reason: collision with root package name */
    private final String f10440c;
    @va.b("folds")

    /* renamed from: d  reason: collision with root package name */
    private final List<h> f10441d;
    @va.b("displays")

    /* renamed from: e  reason: collision with root package name */
    private final d f10442e;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public k(e eVar, nf.a aVar, String str, ArrayList arrayList, d dVar) {
        str.getClass();
        this.f10438a = eVar;
        this.f10439b = aVar;
        this.f10440c = str;
        this.f10441d = arrayList;
        this.f10442e = dVar;
    }

    public final o a() {
        a0 a10 = this.f10438a.a();
        ve.b a11 = this.f10439b.a();
        bf.a valueOf = bf.a.valueOf(this.f10440c);
        List<h> list = this.f10441d;
        ArrayList arrayList = new ArrayList(m.G(list, 10));
        for (h hVar : list) {
            arrayList.add(new l((bf.a) pc.a.t(hVar.f10430a, bf.a.values()), (ve.k) pc.a.t(hVar.f10431b, ve.k.values()), hVar.f10432c.a()));
        }
        return new o(a10, a11, valueOf, arrayList, this.f10442e.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (nc.k.a(this.f10438a, kVar.f10438a) && nc.k.a(this.f10439b, kVar.f10439b) && nc.k.a(this.f10440c, kVar.f10440c) && nc.k.a(this.f10441d, kVar.f10441d) && nc.k.a(this.f10442e, kVar.f10442e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d4 = w.d.d((this.f10439b.hashCode() + (this.f10438a.hashCode() * 31)) * 31, 31, this.f10440c);
        return this.f10442e.hashCode() + ((this.f10441d.hashCode() + d4) * 31);
    }

    public final String toString() {
        e eVar = this.f10438a;
        nf.a aVar = this.f10439b;
        String str = this.f10440c;
        List<h> list = this.f10441d;
        d dVar = this.f10442e;
        return "UILayoutVariantDto(uiSize=" + eVar + ", insets=" + aVar + ", orientation=" + str + ", folds=" + list + ", displays=" + dVar + ")";
    }
}
