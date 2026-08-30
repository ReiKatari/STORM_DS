package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kt3  reason: default package */
/* loaded from: classes.dex */
public final class kt3 implements Map.Entry, h93 {
    public final mt3 A;
    public final int B;
    public final int L;

    public kt3(mt3 mt3Var, int i) {
        mt3Var.getClass();
        this.A = mt3Var;
        this.B = i;
        this.L = mt3Var.c0;
    }

    public final void a() {
        if (this.A.c0 == this.L) {
            return;
        }
        throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (b53.x(entry.getKey(), getKey()) && b53.x(entry.getValue(), getValue())) {
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
        mt3 mt3Var = this.A;
        mt3Var.c();
        Object[] objArr = mt3Var.B;
        if (objArr == null) {
            int length = mt3Var.A.length;
            if (length >= 0) {
                objArr = new Object[length];
                mt3Var.B = objArr;
            } else {
                i.i("capacity must be non-negative.");
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
