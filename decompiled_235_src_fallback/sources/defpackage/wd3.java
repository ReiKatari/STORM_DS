package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd3  reason: default package */
/* loaded from: classes.dex */
public final class wd3 implements defpackage.lk7 {
    public static final java.text.SimpleDateFormat a = null;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            defpackage.wd3.a = r0
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            return
    }

    @Override // defpackage.y32
    public final void encode(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.util.Date r1 = (java.util.Date) r1
            mk7 r2 = (defpackage.mk7) r2
            java.text.SimpleDateFormat r0 = defpackage.wd3.a
            java.lang.String r0 = r0.format(r1)
            r2.add(r0)
            return
    }
}
