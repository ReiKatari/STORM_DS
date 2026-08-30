package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g01  reason: default package */
/* loaded from: classes.dex */
public final class g01 {
    public final q50 a;
    public final ih0 b;

    public g01(q50 q50Var, ih0 ih0Var) {
        this.a = q50Var;
        this.b = ih0Var;
    }

    public final String toString() {
        String str;
        String str2;
        ih0 ih0Var = this.b;
        j31 j31Var = (j31) ih0Var.X.I(j31.L);
        if (j31Var != null) {
            str = j31Var.B;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        iq2.g(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        if (str != null) {
            str2 = wh1.A("[", str, "](");
        } else {
            str2 = "(";
        }
        sb.append(str2);
        sb.append("currentBounds()=");
        sb.append(this.a.c());
        sb.append(", continuation=");
        sb.append(ih0Var);
        sb.append(')');
        return sb.toString();
    }
}
