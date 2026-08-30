package e7;

import a7.h0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p7.t;
import zb.l;
import zb.m;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends a7.f {

    /* renamed from: q  reason: collision with root package name */
    public final h0 f4375q;

    public a(Class cls) {
        super(true);
        this.f4375q = new h0(cls);
    }

    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // a7.k0
    public final String b() {
        return "List<" + this.f4375q.f575r.getName() + "}>";
    }

    @Override // a7.k0
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        h0 h0Var = this.f4375q;
        if (list != null) {
            return l.e0(list, t.x(h0Var.g(str)));
        }
        return t.x(h0Var.g(str));
    }

    @Override // a7.k0
    public final Object d(String str) {
        return t.x(this.f4375q.g(str));
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        ArrayList arrayList;
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        bundle.putSerializable(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return nc.k.a(this.f4375q, ((a) obj).f4375q);
    }

    @Override // a7.f
    public final /* bridge */ /* synthetic */ Object g() {
        return q.A;
    }

    @Override // a7.f
    public final List h(Object obj) {
        List<Enum> list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(m.G(list, 10));
            for (Enum r12 : list) {
                arrayList.add(r12.toString());
            }
            return arrayList;
        }
        return q.A;
    }

    public final int hashCode() {
        return this.f4375q.f579q.hashCode();
    }
}
