package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om0  reason: default package */
/* loaded from: classes.dex */
public final class om0 implements defpackage.gg3 {
    public static final defpackage.om0 a = null;
    public static final defpackage.x25 b = null;

    static {
            om0 r0 = new om0
            r0.<init>()
            defpackage.om0.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.Char"
            v25 r2 = defpackage.v25.g
            r0.<init>(r1, r2)
            defpackage.om0.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            char r0 = r1.h()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Character r2 = (java.lang.Character) r2
            char r0 = r2.charValue()
            r1.E(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.om0.b
            return r0
    }
}
