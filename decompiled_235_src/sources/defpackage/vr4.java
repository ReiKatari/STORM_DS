package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr4  reason: default package */
/* loaded from: classes.dex */
public final class vr4 implements Serializable {
    public final Object A;
    public final Object B;

    public vr4(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr4)) {
            return false;
        }
        vr4 vr4Var = (vr4) obj;
        if (nb3.k(this.A, vr4Var.A) && nb3.k(this.B, vr4Var.B)) {
            return true;
        }
        return false;
    }

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

    public final String toString() {
        return "(" + this.A + ", " + this.B + ')';
    }
}
