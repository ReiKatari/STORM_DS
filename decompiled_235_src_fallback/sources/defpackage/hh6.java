package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh6  reason: default package */
/* loaded from: classes.dex */
public final class hh6 implements defpackage.gg3 {
    public static final defpackage.hh6 a = null;
    public static final defpackage.x25 b = null;

    static {
            hh6 r0 = new hh6
            r0.<init>()
            defpackage.hh6.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.Short"
            v25 r2 = defpackage.v25.l
            r0.<init>(r1, r2)
            defpackage.hh6.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            short r0 = r1.Z()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            short r0 = r2.shortValue()
            r1.m(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.hh6.b
            return r0
    }
}
