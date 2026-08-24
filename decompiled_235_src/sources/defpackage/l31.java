package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l31  reason: default package */
/* loaded from: classes.dex */
public final class l31 {
    public final u70 a;
    public final rj0 b;

    public l31(u70 u70Var, rj0 rj0Var) {
        this.a = u70Var;
        this.b = rj0Var;
    }

    public final String toString() {
        String str;
        String str2;
        rj0 rj0Var = this.b;
        r61 r61Var = (r61) rj0Var.X.Z(r61.L);
        if (r61Var != null) {
            str = r61Var.B;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        g04.y(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        if (str != null) {
            str2 = lb1.A("[", str, "](");
        } else {
            str2 = "(";
        }
        sb.append(str2);
        sb.append("currentBounds()=");
        sb.append(this.a.c());
        sb.append(", continuation=");
        sb.append(rj0Var);
        sb.append(')');
        return sb.toString();
    }
}
