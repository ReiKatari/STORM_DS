package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx  reason: default package */
/* loaded from: classes.dex */
public final class hx implements qh4 {
    public static final hx a = new Object();
    public static final na2 b = na2.c("requestTimeMs");
    public static final na2 c = na2.c("requestUptimeMs");
    public static final na2 d = na2.c("clientInfo");
    public static final na2 e = na2.c("logSource");
    public static final na2 f = na2.c("logSourceName");
    public static final na2 g = na2.c("logEvent");
    public static final na2 h = na2.c("qosTier");

    @Override // defpackage.y32
    public final void encode(Object obj, Object obj2) {
        py3 py3Var = (py3) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(b, ((oy) py3Var).a);
        oy oyVar = (oy) py3Var;
        rh4Var.add(c, oyVar.b);
        rh4Var.add(d, oyVar.c);
        rh4Var.add(e, oyVar.d);
        rh4Var.add(f, oyVar.e);
        rh4Var.add(g, oyVar.f);
        rh4Var.add(h, oyVar.g);
    }
}
