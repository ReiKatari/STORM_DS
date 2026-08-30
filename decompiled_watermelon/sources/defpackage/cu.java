package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cu  reason: default package */
/* loaded from: classes.dex */
public final class cu implements Iterator, Map.Entry {
    public int A;
    public int B = -1;
    public boolean L;
    public final /* synthetic */ eu R;

    public cu(eu euVar) {
        this.R = euVar;
        this.A = euVar.L - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.L) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.B;
                eu euVar = this.R;
                if (b53.x(key, euVar.f(i)) && b53.x(entry.getValue(), euVar.i(this.B))) {
                    return true;
                }
            }
            return false;
        }
        i.n("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.L) {
            return this.R.f(this.B);
        }
        i.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.L) {
            return this.R.i(this.B);
        }
        i.n("This container does not support retaining Map.Entry objects");
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
            eu euVar = this.R;
            Object f = euVar.f(i2);
            Object i3 = euVar.i(this.B);
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
        i.n("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B++;
            this.L = true;
            return this;
        }
        vd6.b();
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
        f81.o();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.L) {
            return this.R.h(this.B, obj);
        }
        i.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
