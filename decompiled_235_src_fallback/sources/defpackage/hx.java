package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx  reason: default package */
/* loaded from: classes.dex */
public final class hx implements defpackage.qh4 {
    public static final defpackage.hx a = null;
    public static final defpackage.na2 b = null;
    public static final defpackage.na2 c = null;
    public static final defpackage.na2 d = null;
    public static final defpackage.na2 e = null;
    public static final defpackage.na2 f = null;
    public static final defpackage.na2 g = null;
    public static final defpackage.na2 h = null;

    static {
            hx r0 = new hx
            r0.<init>()
            defpackage.hx.a = r0
            java.lang.String r0 = "requestTimeMs"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.hx.b = r0
            java.lang.String r0 = "requestUptimeMs"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.hx.c = r0
            java.lang.String r0 = "clientInfo"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.hx.d = r0
            java.lang.String r0 = "logSource"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.hx.e = r0
            java.lang.String r0 = "logSourceName"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.hx.f = r0
            java.lang.String r0 = "logEvent"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.hx.g = r0
            java.lang.String r0 = "qosTier"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.hx.h = r0
            return
    }

    @Override // defpackage.y32
    public final void encode(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            py3 r3 = (defpackage.py3) r3
            rh4 r4 = (defpackage.rh4) r4
            r2 = r3
            oy r2 = (defpackage.oy) r2
            long r0 = r2.a
            na2 r2 = defpackage.hx.b
            r4.add(r2, r0)
            oy r3 = (defpackage.oy) r3
            long r0 = r3.b
            na2 r2 = defpackage.hx.c
            r4.add(r2, r0)
            na2 r2 = defpackage.hx.d
            wx r0 = r3.c
            r4.add(r2, r0)
            na2 r2 = defpackage.hx.e
            java.lang.Integer r0 = r3.d
            r4.add(r2, r0)
            na2 r2 = defpackage.hx.f
            java.lang.String r0 = r3.e
            r4.add(r2, r0)
            na2 r2 = defpackage.hx.g
            java.util.ArrayList r0 = r3.f
            r4.add(r2, r0)
            na2 r2 = defpackage.hx.h
            q65 r3 = r3.g
            r4.add(r2, r3)
            return
    }
}
