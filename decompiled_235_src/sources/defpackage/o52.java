package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o52  reason: default package */
/* loaded from: classes.dex */
public final class o52 {
    public static final o52 b = new o52(new ha7((i92) null, (pj6) null, (sl0) null, (z56) null, (LinkedHashMap) null, 127));
    public final ha7 a;

    public o52(ha7 ha7Var) {
        this.a = ha7Var;
    }

    public final o52 a(o52 o52Var) {
        ha7 ha7Var = o52Var.a;
        i92 i92Var = ha7Var.a;
        ha7 ha7Var2 = this.a;
        if (i92Var == null) {
            i92Var = ha7Var2.a;
        }
        pj6 pj6Var = ha7Var.b;
        if (pj6Var == null) {
            pj6Var = ha7Var2.b;
        }
        sl0 sl0Var = ha7Var.c;
        if (sl0Var == null) {
            sl0Var = ha7Var2.c;
        }
        z56 z56Var = ha7Var.d;
        if (z56Var == null) {
            z56Var = ha7Var2.d;
        }
        return new o52(new ha7(i92Var, pj6Var, sl0Var, z56Var, c14.o0(ha7Var2.f, ha7Var.f), 32));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o52) && ((o52) obj).a.equals(this.a)) {
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
        ha7 ha7Var = this.a;
        i92 i92Var = ha7Var.a;
        String str4 = null;
        if (i92Var != null) {
            str = i92Var.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        pj6 pj6Var = ha7Var.b;
        if (pj6Var != null) {
            str2 = pj6Var.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        sl0 sl0Var = ha7Var.c;
        if (sl0Var != null) {
            str3 = sl0Var.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        z56 z56Var = ha7Var.d;
        if (z56Var != null) {
            str4 = z56Var.toString();
        }
        sb.append(str4);
        return sb.toString();
    }
}
