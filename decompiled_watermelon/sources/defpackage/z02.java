package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z02  reason: default package */
/* loaded from: classes.dex */
public final class z02 {
    public static final z02 b = new z02(new lx6((p42) null, (a86) null, (jj0) null, (nl2) null, (LinkedHashMap) null, 127));
    public final lx6 a;

    public z02(lx6 lx6Var) {
        this.a = lx6Var;
    }

    public final z02 a(z02 z02Var) {
        lx6 lx6Var = z02Var.a;
        p42 p42Var = lx6Var.a;
        lx6 lx6Var2 = this.a;
        if (p42Var == null) {
            p42Var = lx6Var2.a;
        }
        a86 a86Var = lx6Var.b;
        if (a86Var == null) {
            a86Var = lx6Var2.b;
        }
        jj0 jj0Var = lx6Var.c;
        if (jj0Var == null) {
            jj0Var = lx6Var2.c;
        }
        return new z02(new lx6(p42Var, a86Var, jj0Var, (nl2) null, zt3.n0(lx6Var2.e, lx6Var.e), 32));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z02) && ((z02) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        lx6 lx6Var = this.a;
        p42 p42Var = lx6Var.a;
        if (p42Var != null) {
            str = p42Var.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        a86 a86Var = lx6Var.b;
        if (a86Var != null) {
            str2 = a86Var.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        jj0 jj0Var = lx6Var.c;
        if (jj0Var != null) {
            str3 = jj0Var.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
