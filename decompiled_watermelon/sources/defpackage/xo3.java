package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xo3  reason: default package */
/* loaded from: classes.dex */
public final class xo3 implements Map.Entry {
    public xo3 A;
    public xo3 B;
    public xo3 L;
    public xo3 R;
    public xo3 X;
    public final Object Y;
    public final boolean Z;
    public Object c0;
    public int d0;

    public xo3(boolean z, xo3 xo3Var, Object obj, xo3 xo3Var2, xo3 xo3Var3) {
        this.A = xo3Var;
        this.Y = obj;
        this.Z = z;
        this.d0 = 1;
        this.R = xo3Var2;
        this.X = xo3Var3;
        xo3Var3.R = this;
        xo3Var2.X = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.Y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.c0;
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
        return this.c0;
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
        Object obj2 = this.c0;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.Z) {
            c44.i("value == null");
            return null;
        }
        Object obj2 = this.c0;
        this.c0 = obj;
        return obj2;
    }

    public final String toString() {
        return this.Y + "=" + this.c0;
    }

    public xo3(boolean z) {
        this.Y = null;
        this.Z = z;
        this.X = this;
        this.R = this;
    }
}
