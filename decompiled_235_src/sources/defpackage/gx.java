package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx  reason: default package */
/* loaded from: classes.dex */
public final class gx implements qh4 {
    public static final gx a = new Object();
    public static final na2 b = na2.c("eventTimeMs");
    public static final na2 c = na2.c("eventCode");
    public static final na2 d = na2.c("eventUptimeMs");
    public static final na2 e = na2.c("sourceExtension");
    public static final na2 f = na2.c("sourceExtensionJsonProto3");
    public static final na2 g = na2.c("timezoneOffsetSeconds");
    public static final na2 h = na2.c("networkConnectionInfo");

    @Override // defpackage.y32
    public final void encode(Object obj, Object obj2) {
        oy3 oy3Var = (oy3) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(b, ((ny) oy3Var).a);
        ny nyVar = (ny) oy3Var;
        rh4Var.add(c, nyVar.b);
        rh4Var.add(d, nyVar.c);
        rh4Var.add(e, nyVar.d);
        rh4Var.add(f, nyVar.e);
        rh4Var.add(g, nyVar.f);
        rh4Var.add(h, nyVar.g);
    }
}
