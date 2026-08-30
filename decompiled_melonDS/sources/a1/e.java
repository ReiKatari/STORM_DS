package a1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends w0 implements Map {
    public wa.m R;
    public b X;
    public d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w0 w0Var) {
        super(0);
        int i2 = w0Var.L;
        b(this.L + i2);
        if (this.L == 0) {
            if (i2 > 0) {
                zb.k.g(0, 0, i2, w0Var.A, this.A);
                zb.k.i(w0Var.B, this.B, 0, 0, i2 << 1);
                this.L = i2;
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < i2; i10++) {
            put(w0Var.f(i10), w0Var.i(i10));
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        wa.m mVar = this.R;
        if (mVar == null) {
            wa.m mVar2 = new wa.m(2, this);
            this.R = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public final boolean j(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i2 = this.L;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i2 != this.L) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.X;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.X = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final boolean l(Collection collection) {
        int i2 = this.L;
        for (int i10 = i2 - 1; i10 >= 0; i10--) {
            if (!collection.contains(f(i10))) {
                g(i10);
            }
        }
        if (i2 != this.L) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.L);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.Y;
        if (dVar == null) {
            d dVar2 = new d(this);
            this.Y = dVar2;
            return dVar2;
        }
        return dVar;
    }
}
