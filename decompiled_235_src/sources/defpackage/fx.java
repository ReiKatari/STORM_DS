package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx  reason: default package */
/* loaded from: classes.dex */
public final class fx implements qh4 {
    public static final fx a = new Object();
    public static final na2 b = na2.c("clientType");
    public static final na2 c = na2.c("androidClientInfo");

    @Override // defpackage.y32
    public final void encode(Object obj, Object obj2) {
        rr0 rr0Var = (rr0) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(b, ((wx) rr0Var).a);
        rh4Var.add(c, ((wx) rr0Var).b);
    }
}
