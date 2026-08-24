package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx  reason: default package */
/* loaded from: classes.dex */
public final class fx implements defpackage.qh4 {
    public static final defpackage.fx a = null;
    public static final defpackage.na2 b = null;
    public static final defpackage.na2 c = null;

    static {
            fx r0 = new fx
            r0.<init>()
            defpackage.fx.a = r0
            java.lang.String r0 = "clientType"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.fx.b = r0
            java.lang.String r0 = "androidClientInfo"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.fx.c = r0
            return
    }

    @Override // defpackage.y32
    public final void encode(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            rr0 r2 = (defpackage.rr0) r2
            rh4 r3 = (defpackage.rh4) r3
            r1 = r2
            wx r1 = (defpackage.wx) r1
            qr0 r1 = r1.a
            na2 r0 = defpackage.fx.b
            r3.add(r0, r1)
            wx r2 = (defpackage.wx) r2
            ox r1 = r2.b
            na2 r2 = defpackage.fx.c
            r3.add(r2, r1)
            return
    }
}
