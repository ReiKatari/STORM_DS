package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he3  reason: default package */
/* loaded from: classes.dex */
public final class he3 implements defpackage.gg3 {
    public static final defpackage.he3 a = null;
    public static final defpackage.yb6 b = null;

    static {
            he3 r0 = new he3
            r0.<init>()
            defpackage.he3.a = r0
            dz4 r0 = defpackage.dz4.f
            r1 = 0
            wb6[] r1 = new defpackage.wb6[r1]
            v83 r2 = new v83
            r3 = 4
            r2.<init>(r3)
            java.lang.String r3 = "kotlinx.serialization.json.JsonElement"
            yb6 r0 = defpackage.mp2.l(r3, r0, r1, r2)
            defpackage.he3.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r1) {
            r0 = this;
            yd3 r0 = defpackage.gi2.l(r1)
            de3 r0 = r0.y()
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            de3 r2 = (defpackage.de3) r2
            r2.getClass()
            defpackage.gi2.j(r1)
            boolean r0 = r2 instanceof defpackage.df3
            if (r0 == 0) goto L12
            gf3 r0 = defpackage.gf3.a
            r1.j(r0, r2)
            return
        L12:
            boolean r0 = r2 instanceof defpackage.ye3
            if (r0 == 0) goto L1c
            bf3 r0 = defpackage.bf3.a
            r1.j(r0, r2)
            return
        L1c:
            boolean r0 = r2 instanceof defpackage.nd3
            if (r0 == 0) goto L26
            qd3 r0 = defpackage.qd3.a
            r1.j(r0, r2)
            return
        L26:
            defpackage.i.d()
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            yb6 r0 = defpackage.he3.b
            return r0
    }
}
