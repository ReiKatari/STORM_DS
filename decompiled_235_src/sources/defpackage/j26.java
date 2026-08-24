package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j26  reason: default package */
/* loaded from: classes.dex */
public final class j26 {
    public float a = RecyclerView.B1;
    public boolean b = true;
    public lb4 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j26)) {
            return false;
        }
        j26 j26Var = (j26) obj;
        if (Float.compare(this.a, j26Var.a) == 0 && this.b == j26Var.b && nb3.k(this.c, j26Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = xg6.e(Float.hashCode(this.a) * 31, this.b, 31);
        lb4 lb4Var = this.c;
        if (lb4Var == null) {
            hashCode = 0;
        } else {
            hashCode = lb4Var.hashCode();
        }
        return (e + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
