package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qe3  reason: default package */
/* loaded from: classes.dex */
public final class qe3 extends df3 {
    public final boolean A;
    public final String B;

    public qe3(boolean z, Object obj) {
        obj.getClass();
        this.A = z;
        this.B = obj.toString();
    }

    @Override // defpackage.df3
    public final String a() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qe3.class == obj.getClass()) {
                qe3 qe3Var = (qe3) obj;
                if (this.A == qe3Var.A && nb3.k(this.B, qe3Var.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() + (Boolean.hashCode(this.A) * 31);
    }

    @Override // defpackage.df3
    public final String toString() {
        boolean z = this.A;
        String str = this.B;
        if (z) {
            StringBuilder sb = new StringBuilder();
            os6.a(sb, str);
            return sb.toString();
        }
        return str;
    }
}
