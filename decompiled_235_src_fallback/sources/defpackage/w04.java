package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w04  reason: default package */
/* loaded from: classes.dex */
public final class w04 implements defpackage.gg3 {
    public final defpackage.gg3 a;
    public final defpackage.gg3 b;
    public final /* synthetic */ int c;
    public final defpackage.yb6 d;

    public w04(defpackage.gg3 r1, defpackage.gg3 r2, byte r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public w04(defpackage.gg3 r7, defpackage.gg3 r8, int r9) {
            r6 = this;
            r6.c = r9
            r0 = 0
            r7.getClass()
            r8.getClass()
            switch(r9) {
                case 1: goto L23;
                default: goto Lc;
            }
        Lc:
            r6.<init>(r7, r8, r0)
            bt6 r9 = defpackage.bt6.g
            wb6[] r0 = new defpackage.wb6[r0]
            bi2 r1 = new bi2
            r2 = 21
            r1.<init>(r2, r7, r8)
            java.lang.String r7 = "kotlin.collections.Map.Entry"
            yb6 r7 = defpackage.mp2.l(r7, r9, r0, r1)
            r6.d = r7
            return
        L23:
            r6.<init>(r7, r8, r0)
            wb6[] r9 = new defpackage.wb6[r0]
            java.lang.String r1 = "kotlin.Pair"
            boolean r0 = defpackage.qs6.v0(r1)
            if (r0 != 0) goto L5b
            br0 r5 = new br0
            r5.<init>(r1)
            java.lang.String r0 = "first"
            wb6 r7 = r7.e()
            defpackage.br0.a(r5, r0, r7)
            java.lang.String r7 = "second"
            wb6 r8 = r8.e()
            defpackage.br0.a(r5, r7, r8)
            yb6 r0 = new yb6
            bt6 r2 = defpackage.bt6.e
            java.util.ArrayList r7 = r5.c
            int r3 = r7.size()
            java.util.List r4 = defpackage.fv.T0(r9)
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
            return
        L5b:
            java.lang.String r6 = "Blank serial names are prohibited"
            defpackage.i.h(r6)
            r6 = 0
            throw r6
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r8) {
            r7 = this;
            wb6 r0 = r7.e()
            ux0 r8 = r8.c(r0)
            r8.getClass()
            java.lang.Object r1 = defpackage.ge7.j
            r2 = r1
            r3 = r2
        Lf:
            wb6 r4 = r7.e()
            int r4 = r8.q(r4)
            r5 = -1
            if (r4 == r5) goto L47
            r5 = 0
            if (r4 == 0) goto L39
            r3 = 1
            if (r4 != r3) goto L2d
            wb6 r4 = r7.e()
            gg3 r6 = r7.b
            gg3 r6 = (defpackage.gg3) r6
            java.lang.Object r3 = r8.G(r4, r3, r6, r5)
            goto Lf
        L2d:
            fc6 r7 = new fc6
            java.lang.String r8 = "Invalid index: "
            java.lang.String r8 = defpackage.lb1.g(r4, r8)
            r7.<init>(r8)
            throw r7
        L39:
            wb6 r2 = r7.e()
            gg3 r4 = r7.a
            gg3 r4 = (defpackage.gg3) r4
            r6 = 0
            java.lang.Object r2 = r8.G(r2, r6, r4, r5)
            goto Lf
        L47:
            if (r2 == r1) goto L67
            if (r3 == r1) goto L5f
            int r7 = r7.c
            switch(r7) {
                case 0: goto L56;
                default: goto L50;
            }
        L50:
            vr4 r7 = new vr4
            r7.<init>(r2, r3)
            goto L5b
        L56:
            v04 r7 = new v04
            r7.<init>(r2, r3)
        L5b:
            r8.a(r0)
            return r7
        L5f:
            fc6 r7 = new fc6
            java.lang.String r8 = "Element 'value' is missing"
            r7.<init>(r8)
            throw r7
        L67:
            fc6 r7 = new fc6
            java.lang.String r8 = "Element 'key' is missing"
            r7.<init>(r8)
            throw r7
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r6, java.lang.Object r7) {
            r5 = this;
            wb6 r0 = r5.e()
            vx0 r6 = r6.c(r0)
            wb6 r0 = r5.e()
            gg3 r1 = r5.a
            gg3 r1 = (defpackage.gg3) r1
            int r2 = r5.c
            switch(r2) {
                case 0: goto L1e;
                default: goto L15;
            }
        L15:
            r3 = r7
            vr4 r3 = (defpackage.vr4) r3
            r3.getClass()
            java.lang.Object r3 = r3.A
            goto L28
        L1e:
            r3 = r7
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r3.getClass()
            java.lang.Object r3 = r3.getKey()
        L28:
            r4 = 0
            r6.w(r0, r4, r1, r3)
            wb6 r0 = r5.e()
            gg3 r1 = r5.b
            gg3 r1 = (defpackage.gg3) r1
            switch(r2) {
                case 0: goto L3f;
                default: goto L37;
            }
        L37:
            vr4 r7 = (defpackage.vr4) r7
            r7.getClass()
            java.lang.Object r7 = r7.B
            goto L48
        L3f:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            r7.getClass()
            java.lang.Object r7 = r7.getValue()
        L48:
            r2 = 1
            r6.w(r0, r2, r1, r7)
            wb6 r5 = r5.e()
            r6.a(r5)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r1 = this;
            int r0 = r1.c
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            yb6 r1 = r1.d
            return r1
        L8:
            yb6 r1 = r1.d
            return r1
    }
}
