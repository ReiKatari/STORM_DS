package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix  reason: default package */
/* loaded from: classes.dex */
public final class ix implements qh4 {
    public static final ix a = new Object();
    public static final na2 b = na2.c("networkType");
    public static final na2 c = na2.c("mobileSubtype");

    @Override // defpackage.y32
    public final void encode(Object obj, Object obj2) {
        te4 te4Var = (te4) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(b, ((qy) te4Var).a);
        rh4Var.add(c, ((qy) te4Var).b);
    }
}
