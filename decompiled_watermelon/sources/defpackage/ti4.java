package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ti4  reason: default package */
/* loaded from: classes.dex */
public final class ti4 implements Serializable {
    public final Object A;
    public final Object B;

    public ti4(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti4)) {
            return false;
        }
        ti4 ti4Var = (ti4) obj;
        if (b53.x(this.A, ti4Var.A) && b53.x(this.B, ti4Var.B)) {
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
