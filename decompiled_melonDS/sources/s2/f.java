package s2;

import java.util.Iterator;
import java.util.Map;
import o3.f0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends zb.g {
    public final /* synthetic */ int A;
    public final d B;

    public /* synthetic */ f(int i2, d dVar) {
        this.A = i2;
        this.B = dVar;
    }

    @Override // zb.g
    public final int a() {
        switch (this.A) {
            case 0:
                return this.B.Y;
            default:
                return this.B.Y;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.A) {
            case 0:
                this.B.clear();
                return;
            default:
                this.B.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                d dVar = this.B;
                Object obj2 = dVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !dVar.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new f0(this.B);
            default:
                l[] lVarArr = new l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lVarArr[i2] = new m(1);
                }
                return new e(this.B, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.B.remove(entry.getKey(), entry.getValue());
            default:
                d dVar = this.B;
                if (dVar.containsKey(obj)) {
                    dVar.remove(obj);
                    return true;
                }
                return false;
        }
    }
}
