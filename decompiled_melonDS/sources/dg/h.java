package dg;

import java.util.List;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final int f4101d = 8;
    @va.b("uiSize")

    /* renamed from: a  reason: collision with root package name */
    private final nf.e f4102a;
    @va.b("orientation")

    /* renamed from: b  reason: collision with root package name */
    private final String f4103b;
    @va.b("folds")

    /* renamed from: c  reason: collision with root package name */
    private final List<nf.h> f4104c;

    public h(nf.e eVar, String str, List<nf.h> list) {
        eVar.getClass();
        str.getClass();
        list.getClass();
        this.f4102a = eVar;
        this.f4103b = str;
        this.f4104c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h e(h hVar, nf.e eVar, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar = hVar.f4102a;
        }
        if ((i2 & 2) != 0) {
            str = hVar.f4103b;
        }
        if ((i2 & 4) != 0) {
            list = hVar.f4104c;
        }
        return hVar.d(eVar, str, list);
    }

    public final nf.e a() {
        return this.f4102a;
    }

    public final String b() {
        return this.f4103b;
    }

    public final List<nf.h> c() {
        return this.f4104c;
    }

    public final h d(nf.e eVar, String str, List<nf.h> list) {
        eVar.getClass();
        str.getClass();
        list.getClass();
        return new h(eVar, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (k.a(this.f4102a, hVar.f4102a) && k.a(this.f4103b, hVar.f4103b) && k.a(this.f4104c, hVar.f4104c)) {
            return true;
        }
        return false;
    }

    public final List<nf.h> f() {
        return this.f4104c;
    }

    public final String g() {
        return this.f4103b;
    }

    public final nf.e h() {
        return this.f4102a;
    }

    public int hashCode() {
        return this.f4104c.hashCode() + w.d.d(this.f4102a.hashCode() * 31, 31, this.f4103b);
    }

    public String toString() {
        nf.e eVar = this.f4102a;
        String str = this.f4103b;
        List<nf.h> list = this.f4104c;
        return "UILayoutVariantDto35(uiSize=" + eVar + ", orientation=" + str + ", folds=" + list + ")";
    }
}
