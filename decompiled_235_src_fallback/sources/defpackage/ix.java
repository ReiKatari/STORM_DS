package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix  reason: default package */
/* loaded from: classes.dex */
public final class ix implements defpackage.qh4 {
    public static final defpackage.ix a = null;
    public static final defpackage.na2 b = null;
    public static final defpackage.na2 c = null;

    static {
            ix r0 = new ix
            r0.<init>()
            defpackage.ix.a = r0
            java.lang.String r0 = "networkType"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.ix.b = r0
            java.lang.String r0 = "mobileSubtype"
            na2 r0 = defpackage.na2.c(r0)
            defpackage.ix.c = r0
            return
    }

    @Override // defpackage.y32
    public final void encode(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            te4 r2 = (defpackage.te4) r2
            rh4 r3 = (defpackage.rh4) r3
            r1 = r2
            qy r1 = (defpackage.qy) r1
            se4 r1 = r1.a
            na2 r0 = defpackage.ix.b
            r3.add(r0, r1)
            qy r2 = (defpackage.qy) r2
            re4 r1 = r2.b
            na2 r2 = defpackage.ix.c
            r3.add(r2, r1)
            return
    }
}
