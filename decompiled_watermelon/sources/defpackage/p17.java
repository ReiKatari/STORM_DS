package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p17  reason: default package */
/* loaded from: classes.dex */
public final class p17 {
    @r06("uiSize")
    private final jp4 a;
    @r06("insets")
    private final b23 b;
    @r06("orientation")
    private final String c;
    @r06("folds")
    private final List<lv5> d;
    @r06("displays")
    private final xd3 e;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: p17$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public p17(jp4 jp4Var, b23 b23Var, String str, ArrayList arrayList, xd3 xd3Var) {
        str.getClass();
        this.a = jp4Var;
        this.b = b23Var;
        this.c = str;
        this.d = arrayList;
        this.e = xd3Var;
    }

    public final o17 a() {
        ip4 a2 = this.a.a();
        w13 a3 = this.b.a();
        if4 valueOf = if4.valueOf(this.c);
        List<lv5> list = this.d;
        ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
        for (lv5 lv5Var : list) {
            arrayList.add(new kv5((if4) se.t(lv5Var.a, if4.values()), (jv5) se.t(lv5Var.b, jv5.values()), lv5Var.c.a()));
        }
        return new o17(a2, a3, valueOf, arrayList, this.e.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p17)) {
            return false;
        }
        p17 p17Var = (p17) obj;
        if (b53.x(this.a, p17Var.a) && b53.x(this.b, p17Var.b) && b53.x(this.c, p17Var.c) && b53.x(this.d, p17Var.d) && b53.x(this.e, p17Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + b31.b(ej6.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        jp4 jp4Var = this.a;
        b23 b23Var = this.b;
        String str = this.c;
        List<lv5> list = this.d;
        xd3 xd3Var = this.e;
        return "UILayoutVariantDto(uiSize=" + jp4Var + ", insets=" + b23Var + ", orientation=" + str + ", folds=" + list + ", displays=" + xd3Var + ")";
    }
}
