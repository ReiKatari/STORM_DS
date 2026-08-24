package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx  reason: default package */
/* loaded from: classes.dex */
public final class gx implements defpackage.qh4 {
    public static final defpackage.gx a = null;
    public static final defpackage.na2 b = null;
    public static final defpackage.na2 c = null;
    public static final defpackage.na2 d = null;
    public static final defpackage.na2 e = null;
    public static final defpackage.na2 f = null;
    public static final defpackage.na2 g = null;
    public static final defpackage.na2 h = null;

    static {
            gx r0 = new gx
            r0.<init>()
            defpackage.gx.a = r0
            java.lang.String r0 = "eventTimeMs"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.gx.b = r0
            java.lang.String r0 = "eventCode"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.gx.c = r0
            java.lang.String r0 = "eventUptimeMs"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.gx.d = r0
            java.lang.String r0 = "sourceExtension"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.gx.e = r0
            java.lang.String r0 = "sourceExtensionJsonProto3"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.gx.f = r0
            java.lang.String r0 = "timezoneOffsetSeconds"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.gx.g = r0
            java.lang.String r0 = "networkConnectionInfo"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.gx.h = r0
            return
    }

    @Override // defpackage.y32
    public final void encode(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            oy3 r3 = (defpackage.oy3) r3
            rh4 r4 = (defpackage.rh4) r4
            r2 = r3
            ny r2 = (defpackage.ny) r2
            long r0 = r2.a
            na2 r2 = defpackage.gx.b
            r4.add(r2, r0)
            ny r3 = (defpackage.ny) r3
            java.lang.Integer r2 = r3.b
            na2 r0 = defpackage.gx.c
            r4.add(r0, r2)
            na2 r2 = defpackage.gx.d
            long r0 = r3.c
            r4.add(r2, r0)
            na2 r2 = defpackage.gx.e
            byte[] r0 = r3.d
            r4.add(r2, r0)
            na2 r2 = defpackage.gx.f
            java.lang.String r0 = r3.e
            r4.add(r2, r0)
            na2 r2 = defpackage.gx.g
            long r0 = r3.f
            r4.add(r2, r0)
            na2 r2 = defpackage.gx.h
            te4 r3 = r3.g
            r4.add(r2, r3)
            return
    }
}
