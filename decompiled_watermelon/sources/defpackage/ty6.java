package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ty6  reason: default package */
/* loaded from: classes.dex */
public final class ty6 implements Serializable {
    public final Object A;
    public final Object B;
    public final Object L;

    public ty6(Object obj, Object obj2, Object obj3) {
        this.A = obj;
        this.B = obj2;
        this.L = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty6)) {
            return false;
        }
        ty6 ty6Var = (ty6) obj;
        if (b53.x(this.A, ty6Var.A) && b53.x(this.B, ty6Var.B) && b53.x(this.L, ty6Var.L)) {
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
