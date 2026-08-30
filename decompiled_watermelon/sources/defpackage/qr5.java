package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qr5  reason: default package */
/* loaded from: classes.dex */
public final class qr5 {
    public float a = RecyclerView.A1;
    public boolean b = true;
    public b53 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr5)) {
            return false;
        }
        qr5 qr5Var = (qr5) obj;
        if (Float.compare(this.a, qr5Var.a) == 0 && this.b == qr5Var.b && b53.x(this.c, qr5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = ej6.c(Float.hashCode(this.a) * 31, this.b, 31);
        b53 b53Var = this.c;
        if (b53Var == null) {
            hashCode = 0;
        } else {
            hashCode = b53Var.hashCode();
        }
        return (c + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
