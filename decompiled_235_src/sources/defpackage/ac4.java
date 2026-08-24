package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac4  reason: default package */
/* loaded from: classes.dex */
public final class ac4 extends qo7 {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.qo7
    public final void d() {
        LinkedHashMap linkedHashMap = this.b;
        for (ap7 ap7Var : linkedHashMap.values()) {
            ap7Var.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        g04.y(16);
        sb.append(jx2.R(16, identityHashCode & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
