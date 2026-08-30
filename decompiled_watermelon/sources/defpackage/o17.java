package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o17  reason: default package */
/* loaded from: classes.dex */
public final class o17 {
    public final ip4 a;
    public final w13 b;
    public final if4 c;
    public final List d;
    public final wd3 e;

    public o17(ip4 ip4Var, w13 w13Var, if4 if4Var, List list, wd3 wd3Var) {
        ip4Var.getClass();
        w13Var.getClass();
        if4Var.getClass();
        list.getClass();
        wd3Var.getClass();
        this.a = ip4Var;
        this.b = w13Var;
        this.c = if4Var;
        this.d = list;
        this.e = wd3Var;
    }

    public static o17 a(o17 o17Var, ip4 ip4Var, if4 if4Var, wd3 wd3Var, int i) {
        List list;
        if ((i & 1) != 0) {
            ip4Var = o17Var.a;
        }
        ip4 ip4Var2 = ip4Var;
        w13 w13Var = o17Var.b;
        if ((i & 4) != 0) {
            if4Var = o17Var.c;
        }
        if4 if4Var2 = if4Var;
        if ((i & 8) != 0) {
            list = o17Var.d;
        } else {
            list = pp1.A;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            wd3Var = o17Var.e;
        }
        wd3 wd3Var2 = wd3Var;
        o17Var.getClass();
        ip4Var2.getClass();
        w13Var.getClass();
        if4Var2.getClass();
        list2.getClass();
        wd3Var2.getClass();
        return new o17(ip4Var2, w13Var, if4Var2, list2, wd3Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o17)) {
            return false;
        }
        o17 o17Var = (o17) obj;
        if (b53.x(this.a, o17Var.a) && b53.x(this.b, o17Var.b) && this.c == o17Var.c && b53.x(this.d, o17Var.d) && b53.x(this.e, o17Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.e.hashCode() + b31.b((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "UILayoutVariant(uiSize=" + this.a + ", uiInsets=" + this.b + ", orientation=" + this.c + ", folds=" + this.d + ", displays=" + this.e + ")";
    }
}
