package wa;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements Map.Entry {
    public n A;
    public n B;
    public n L;
    public n R;
    public n X;
    public final Object Y;
    public final boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f14183b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f14184c0;

    public n(boolean z10, n nVar, Object obj, n nVar2, n nVar3) {
        this.A = nVar;
        this.Y = obj;
        this.Z = z10;
        this.f14184c0 = 1;
        this.R = nVar2;
        this.X = nVar3;
        nVar3.R = this;
        nVar2.X = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.Y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f14183b0;
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
        return this.f14183b0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i2 = 0;
        Object obj = this.Y;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f14183b0;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i2 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.Z) {
            m9.o.i("value == null");
            return null;
        }
        Object obj2 = this.f14183b0;
        this.f14183b0 = obj;
        return obj2;
    }

    public final String toString() {
        return this.Y + "=" + this.f14183b0;
    }

    public n(boolean z10) {
        this.Y = null;
        this.Z = z10;
        this.X = this;
        this.R = this;
    }
}
