package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu  reason: default package */
/* loaded from: classes.dex */
public final class uu implements Iterator, Map.Entry {
    public int A;
    public int B = -1;
    public boolean L;
    public final /* synthetic */ wu R;

    public uu(wu wuVar) {
        this.R = wuVar;
        this.A = wuVar.L - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.L) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.B;
                wu wuVar = this.R;
                if (nb3.k(key, wuVar.f(i)) && nb3.k(entry.getValue(), wuVar.i(this.B))) {
                    return true;
                }
            }
            return false;
        }
        i.m("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.L) {
            return this.R.f(this.B);
        }
        i.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.L) {
            return this.R.i(this.B);
        }
        i.m("This container does not support retaining Map.Entry objects");
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
        int i = 0;
        if (this.L) {
            int i2 = this.B;
            wu wuVar = this.R;
            Object f = wuVar.f(i2);
            Object i3 = wuVar.i(this.B);
            if (f == null) {
                hashCode = 0;
            } else {
                hashCode = f.hashCode();
            }
            if (i3 != null) {
                i = i3.hashCode();
            }
            return hashCode ^ i;
        }
        i.m("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B++;
            this.L = true;
            return this;
        }
        fa6.c();
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
        e41.m();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.L) {
            return this.R.h(this.B, obj);
        }
        i.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
