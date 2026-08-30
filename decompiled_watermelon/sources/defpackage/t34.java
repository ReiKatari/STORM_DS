package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t34  reason: default package */
/* loaded from: classes.dex */
public final class t34 extends ra7 {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.ra7
    public final void d() {
        LinkedHashMap linkedHashMap = this.b;
        for (za7 za7Var : linkedHashMap.values()) {
            za7Var.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(nl2.Z(System.identityHashCode(this)));
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
