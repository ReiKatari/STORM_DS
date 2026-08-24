package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv3  reason: default package */
/* loaded from: classes.dex */
public final class zv3 implements Map.Entry {
    public zv3 A;
    public zv3 B;
    public zv3 L;
    public zv3 R;
    public zv3 X;
    public final Object Y;
    public final boolean Z;
    public Object d0;
    public int e0;

    public zv3(boolean z, zv3 zv3Var, Object obj, zv3 zv3Var2, zv3 zv3Var3) {
        this.A = zv3Var;
        this.Y = obj;
        this.Z = z;
        this.e0 = 1;
        this.R = zv3Var2;
        this.X = zv3Var3;
        zv3Var3.R = this;
        zv3Var2.X = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.Y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.d0;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.d0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.Y;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.d0;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.Z) {
            u34.x("value == null");
            return null;
        }
        Object obj2 = this.d0;
        this.d0 = obj;
        return obj2;
    }

    public final String toString() {
        return this.Y + "=" + this.d0;
    }

    public zv3(boolean z) {
        this.Y = null;
        this.Z = z;
        this.X = this;
        this.R = this;
    }
}
