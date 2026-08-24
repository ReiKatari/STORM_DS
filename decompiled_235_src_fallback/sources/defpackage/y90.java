package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y90  reason: default package */
/* loaded from: classes.dex */
public final class y90 implements defpackage.gg3 {
    public static final defpackage.y90 a = null;
    public static final defpackage.x25 b = null;

    static {
            y90 r0 = new y90
            r0.<init>()
            defpackage.y90.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.Byte"
            v25 r2 = defpackage.v25.f
            r0.<init>(r1, r2)
            defpackage.y90.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            byte r0 = r1.Y()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            byte r0 = r2.byteValue()
            r1.o(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.y90.b
            return r0
    }
}
