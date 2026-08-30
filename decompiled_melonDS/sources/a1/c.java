package a1;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {
    public int A;
    public int B = -1;
    public boolean L;
    public final /* synthetic */ e R;

    public c(e eVar) {
        this.R = eVar;
        this.A = eVar.L - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.L) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i2 = this.B;
                e eVar = this.R;
                if (nc.k.a(key, eVar.f(i2)) && nc.k.a(entry.getValue(), eVar.i(this.B))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        a0.j.p("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.L) {
            return this.R.f(this.B);
        }
        a0.j.p("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.L) {
            return this.R.i(this.B);
        }
        a0.j.p("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B < this.A) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.L) {
            int i2 = this.B;
            e eVar = this.R;
            Object f8 = eVar.f(i2);
            Object i10 = eVar.i(this.B);
            int i11 = 0;
            if (f8 == null) {
                hashCode = 0;
            } else {
                hashCode = f8.hashCode();
            }
            if (i10 != null) {
                i11 = i10.hashCode();
            }
            return hashCode ^ i11;
        }
        a0.j.p("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B++;
            this.L = true;
            return this;
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.L) {
            this.R.g(this.B);
            this.B--;
            this.A--;
            this.L = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.L) {
            return this.R.h(this.B, obj);
        }
        a0.j.p("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
