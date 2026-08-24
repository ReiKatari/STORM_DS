package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v04  reason: default package */
/* loaded from: classes.dex */
public final class v04 implements Map.Entry, zf3 {
    public final Object A;
    public final Object B;

    public v04(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v04)) {
            return false;
        }
        v04 v04Var = (v04) obj;
        if (nb3.k(this.A, v04Var.A) && nb3.k(this.B, v04Var.B)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.A;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.B;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.A + ", value=" + this.B + ')';
    }
}
