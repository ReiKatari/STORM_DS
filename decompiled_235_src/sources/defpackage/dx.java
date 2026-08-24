package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx  reason: default package */
/* loaded from: classes.dex */
public final class dx implements qh4 {
    public static final dx a = new Object();
    public static final na2 b = na2.c("sdkVersion");
    public static final na2 c = na2.c("model");
    public static final na2 d = na2.c("hardware");
    public static final na2 e = na2.c("device");
    public static final na2 f = na2.c("product");
    public static final na2 g = na2.c("osBuild");
    public static final na2 h = na2.c("manufacturer");
    public static final na2 i = na2.c("fingerprint");
    public static final na2 j = na2.c("locale");
    public static final na2 k = na2.c("country");
    public static final na2 l = na2.c("mccMnc");
    public static final na2 m = na2.c("applicationBuild");

    @Override // defpackage.y32
    public final void encode(Object obj, Object obj2) {
        be beVar = (be) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(b, ((ox) beVar).a);
        ox oxVar = (ox) beVar;
        rh4Var.add(c, oxVar.b);
        rh4Var.add(d, oxVar.c);
        rh4Var.add(e, oxVar.d);
        rh4Var.add(f, oxVar.e);
        rh4Var.add(g, oxVar.f);
        rh4Var.add(h, oxVar.g);
        rh4Var.add(i, oxVar.h);
        rh4Var.add(j, oxVar.i);
        rh4Var.add(k, oxVar.j);
        rh4Var.add(l, oxVar.k);
        rh4Var.add(m, oxVar.l);
    }
}
