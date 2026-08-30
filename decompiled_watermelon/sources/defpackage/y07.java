package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y07  reason: default package */
/* loaded from: classes.dex */
public final class y07 {
    public final pd2 a;
    public final pe2 b;
    public final int c;
    public final int d;
    public final Object e;

    public y07(pd2 pd2Var, pe2 pe2Var, int i, int i2, Object obj) {
        this.a = pd2Var;
        this.b = pe2Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y07)) {
            return false;
        }
        y07 y07Var = (y07) obj;
        if (b53.x(this.a, y07Var.a) && b53.x(this.b, y07Var.b) && this.c == y07Var.c && this.d == y07Var.d && b53.x(this.e, y07Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        pd2 pd2Var = this.a;
        if (pd2Var == null) {
            hashCode = 0;
        } else {
            hashCode = pd2Var.hashCode();
        }
        int a = wh1.a(this.d, wh1.a(this.c, ((hashCode * 31) + this.b.A) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else if (i != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
