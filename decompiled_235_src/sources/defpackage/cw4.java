package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cw4  reason: default package */
/* loaded from: classes.dex */
public final class cw4 extends e1 {
    public final /* synthetic */ int A;
    public final aw4 B;

    public /* synthetic */ cw4(int i, aw4 aw4Var) {
        this.A = i;
        this.B = aw4Var;
    }

    @Override // defpackage.e1
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
                aw4 aw4Var = this.B;
                Object obj2 = aw4Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !aw4Var.containsKey(entry.getKey())) {
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
                return new dw4(this.B);
            default:
                bc7[] bc7VarArr = new bc7[8];
                for (int i = 0; i < 8; i++) {
                    bc7VarArr[i] = new cc7(1);
                }
                return new bw4(this.B, bc7VarArr);
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
                aw4 aw4Var = this.B;
                if (!aw4Var.containsKey(obj)) {
                    return false;
                }
                aw4Var.remove(obj);
                return true;
        }
    }
}
