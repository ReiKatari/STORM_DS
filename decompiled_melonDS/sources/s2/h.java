package s2;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends zb.h implements q2.b {
    public final /* synthetic */ int A;
    public final b B;

    public /* synthetic */ h(b bVar, int i2) {
        this.A = i2;
        this.B = bVar;
    }

    @Override // zb.b
    public final int a() {
        switch (this.A) {
            case 0:
                b bVar = this.B;
                bVar.getClass();
                return bVar.B;
            default:
                b bVar2 = this.B;
                bVar2.getClass();
                return bVar2.B;
        }
    }

    @Override // zb.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                b bVar = this.B;
                Object obj2 = bVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !bVar.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                k kVar = this.B.A;
                l[] lVarArr = new l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lVarArr[i2] = new m(0);
                }
                return new c(kVar, lVarArr);
            default:
                k kVar2 = this.B.A;
                l[] lVarArr2 = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr2[i10] = new m(1);
                }
                return new c(kVar2, lVarArr2);
        }
    }
}
