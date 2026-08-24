package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we3  reason: default package */
/* loaded from: classes.dex */
public final class we3 implements defpackage.gg3 {
    public static final defpackage.we3 a = null;
    public static final defpackage.yb6 b = null;

    static {
            we3 r0 = new we3
            r0.<init>()
            defpackage.we3.a = r0
            r0 = 0
            wb6[] r0 = new defpackage.wb6[r0]
            java.lang.String r1 = "kotlinx.serialization.json.JsonNull"
            bc6 r2 = defpackage.bc6.e
            yb6 r0 = defpackage.mp2.m(r1, r2, r0)
            defpackage.we3.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r3) {
            r2 = this;
            defpackage.gi2.l(r3)
            boolean r2 = r3.M()
            if (r2 != 0) goto Lc
            ue3 r2 = defpackage.ue3.INSTANCE
            return r2
        Lc:
            ae3 r2 = new ae3
            r3 = -1
            r0 = 0
            java.lang.String r1 = "Expected 'null' literal"
            java.lang.String r3 = defpackage.hi2.x(r1, r0, r3, r0, r0)
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            ue3 r2 = (defpackage.ue3) r2
            r2.getClass()
            defpackage.gi2.j(r1)
            r1.f()
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            yb6 r0 = defpackage.we3.b
            return r0
    }
}
