package ac;

import a0.j;
import java.util.ConcurrentModificationException;
import java.util.Map;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements Map.Entry, oc.c {
    public final e A;
    public final int B;
    public final int L;

    public d(e eVar, int i2) {
        eVar.getClass();
        this.A = eVar;
        this.B = i2;
        this.L = eVar.f699b0;
    }

    public final void a() {
        if (this.A.f699b0 == this.L) {
            return;
        }
        throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (k.a(entry.getKey(), getKey()) && k.a(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.A.A[this.B];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.A.B;
        objArr.getClass();
        return objArr[this.B];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i2;
        Object key = getKey();
        int i10 = 0;
        if (key != null) {
            i2 = key.hashCode();
        } else {
            i2 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i10 = value.hashCode();
        }
        return i2 ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.A;
        eVar.c();
        Object[] objArr = eVar.B;
        if (objArr == null) {
            int length = eVar.A.length;
            if (length >= 0) {
                objArr = new Object[length];
                eVar.B = objArr;
            } else {
                j.h("capacity must be non-negative.");
                return null;
            }
        }
        int i2 = this.B;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
