package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h32  reason: default package */
/* loaded from: classes.dex */
public final class h32 {
    public static final h32 b = new h32(new lx6((p42) null, (a86) null, (jj0) null, (nl2) null, (LinkedHashMap) null, 127));
    public static final h32 c = new h32(new lx6((p42) null, (a86) null, (jj0) null, (nl2) null, (LinkedHashMap) null, 95));
    public final lx6 a;

    public h32(lx6 lx6Var) {
        this.a = lx6Var;
    }

    public final h32 a(h32 h32Var) {
        boolean z;
        lx6 lx6Var = h32Var.a;
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
        if (!lx6Var.d && !lx6Var2.d) {
            z = false;
        } else {
            z = true;
        }
        return new h32(new lx6(p42Var, a86Var, jj0Var, (nl2) null, z, zt3.n0(lx6Var2.e, lx6Var.e)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h32) && ((h32) obj).a.equals(this.a)) {
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
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(lx6Var.d);
        return sb.toString();
    }
}
