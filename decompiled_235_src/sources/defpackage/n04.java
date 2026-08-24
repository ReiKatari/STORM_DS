package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n04  reason: default package */
/* loaded from: classes.dex */
public final class n04 implements Map.Entry, bg3 {
    public final p04 A;
    public final int B;
    public final int L;

    public n04(p04 p04Var, int i) {
        p04Var.getClass();
        this.A = p04Var;
        this.B = i;
        this.L = p04Var.d0;
    }

    public final void a() {
        if (this.A.d0 == this.L) {
            return;
        }
        throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (nb3.k(entry.getKey(), getKey()) && nb3.k(entry.getValue(), getValue())) {
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
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        p04 p04Var = this.A;
        p04Var.c();
        Object[] objArr = p04Var.B;
        if (objArr == null) {
            int length = p04Var.A.length;
            if (length >= 0) {
                objArr = new Object[length];
                p04Var.B = objArr;
            } else {
                i.h("capacity must be non-negative.");
                return null;
            }
        }
        int i = this.B;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
