package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc7  reason: default package */
/* loaded from: classes.dex */
public final class oc7 implements Serializable {
    public final Object A;
    public final Object B;
    public final Object L;

    public oc7(Object obj, Object obj2, Object obj3) {
        this.A = obj;
        this.B = obj2;
        this.L = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc7)) {
            return false;
        }
        oc7 oc7Var = (oc7) obj;
        if (nb3.k(this.A, oc7Var.A) && nb3.k(this.B, oc7Var.B) && nb3.k(this.L, oc7Var.L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Object obj = this.A;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.B;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj3 = this.L;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "(" + this.A + ", " + this.B + ", " + this.L + ')';
    }
}
