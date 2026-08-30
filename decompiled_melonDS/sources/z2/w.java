package z2;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements Map.Entry, oc.c {
    public final Object A;
    public Object B;
    public final /* synthetic */ x L;

    public w(x xVar) {
        this.L = xVar;
        Map.Entry entry = xVar.R;
        entry.getClass();
        this.A = entry.getKey();
        Map.Entry entry2 = xVar.R;
        entry2.getClass();
        this.B = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        x xVar = this.L;
        s sVar = xVar.A;
        if (sVar.e().f14932d == xVar.L) {
            Object obj2 = this.B;
            sVar.put(this.A, obj);
            this.B = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
