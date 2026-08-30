package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ts5  reason: default package */
/* loaded from: classes.dex */
public final class ts5 implements Map.Entry {
    public final Object A;
    public final Object B;
    public ts5 L;
    public ts5 R;

    public ts5(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ts5) {
                ts5 ts5Var = (ts5) obj;
                if (this.A.equals(ts5Var.A) && this.B.equals(ts5Var.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
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
        return this.B.hashCode() ^ this.A.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.A + "=" + this.B;
    }
}
