package a7;

import androidx.lifecycle.d1;
import androidx.lifecycle.y0;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f609b = new LinkedHashMap();

    @Override // androidx.lifecycle.y0
    public final void d() {
        LinkedHashMap linkedHashMap = this.f609b;
        for (d1 d1Var : linkedHashMap.values()) {
            d1Var.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        p7.k.f(16);
        sb2.append(p7.k.A(16, identityHashCode & 4294967295L));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f609b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
