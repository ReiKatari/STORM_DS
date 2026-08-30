package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xm4  reason: default package */
/* loaded from: classes.dex */
public final class xm4 extends d1 {
    public final /* synthetic */ int A;
    public final vm4 B;

    public /* synthetic */ xm4(int i, vm4 vm4Var) {
        this.A = i;
        this.B = vm4Var;
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

    @Override // defpackage.d1
    public final int b() {
        switch (this.A) {
            case 0:
                return this.B.Y;
            default:
                return this.B.Y;
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
                vm4 vm4Var = this.B;
                Object obj2 = vm4Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !vm4Var.containsKey(entry.getKey())) {
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
                return new ym4(this.B);
            default:
                gy6[] gy6VarArr = new gy6[8];
                for (int i = 0; i < 8; i++) {
                    gy6VarArr[i] = new hy6(1);
                }
                return new wm4(this.B, gy6VarArr);
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
                vm4 vm4Var = this.B;
                if (!vm4Var.containsKey(obj)) {
                    return false;
                }
                vm4Var.remove(obj);
                return true;
        }
    }
}
