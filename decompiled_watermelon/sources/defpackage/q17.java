package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q17  reason: default package */
/* loaded from: classes.dex */
public final class q17 {
    public static final int d = 8;
    @r06("uiSize")
    private final jp4 a;
    @r06("orientation")
    private final String b;
    @r06("folds")
    private final List<lv5> c;

    public q17(jp4 jp4Var, String str, List<lv5> list) {
        jp4Var.getClass();
        str.getClass();
        list.getClass();
        this.a = jp4Var;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q17 e(q17 q17Var, jp4 jp4Var, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            jp4Var = q17Var.a;
        }
        if ((i & 2) != 0) {
            str = q17Var.b;
        }
        if ((i & 4) != 0) {
            list = q17Var.c;
        }
        return q17Var.d(jp4Var, str, list);
    }

    public final jp4 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<lv5> c() {
        return this.c;
    }

    public final q17 d(jp4 jp4Var, String str, List<lv5> list) {
        jp4Var.getClass();
        str.getClass();
        list.getClass();
        return new q17(jp4Var, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q17)) {
            return false;
        }
        q17 q17Var = (q17) obj;
        if (b53.x(this.a, q17Var.a) && b53.x(this.b, q17Var.b) && b53.x(this.c, q17Var.c)) {
            return true;
        }
        return false;
    }

    public final List<lv5> f() {
        return this.c;
    }

    public final String g() {
        return this.b;
    }

    public final jp4 h() {
        return this.a;
    }

    public int hashCode() {
        return this.c.hashCode() + ej6.b(this.a.hashCode() * 31, 31, this.b);
    }

    public String toString() {
        jp4 jp4Var = this.a;
        String str = this.b;
        List<lv5> list = this.c;
        return "UILayoutVariantDto35(uiSize=" + jp4Var + ", orientation=" + str + ", folds=" + list + ")";
    }
}
