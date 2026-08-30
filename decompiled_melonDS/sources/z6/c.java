package z6;

import a0.j;
import androidx.lifecycle.d1;
import androidx.lifecycle.x;
import b9.e;
import nc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14967a;

    public c(x xVar, d1 d1Var) {
        this.f14967a = xVar;
        d1Var.getClass();
        w6.a aVar = w6.a.f14160b;
        aVar.getClass();
        e eVar = new e(d1Var, b.f14965c, aVar);
        nc.e a10 = u.a(b.class);
        String b10 = a10.b();
        if (b10 != null) {
            b bVar = (b) eVar.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10);
        } else {
            j.h("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Object obj = this.f14967a;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}}");
        return sb2.toString();
    }
}
