package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p36  reason: default package */
/* loaded from: classes.dex */
public final class p36 implements Map.Entry {
    public final Object A;
    public final Object B;
    public p36 L;
    public p36 R;

    public p36(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p36) {
                p36 p36Var = (p36) obj;
                if (this.A.equals(p36Var.A) && this.B.equals(p36Var.B)) {
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
