package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m52  reason: default package */
/* loaded from: classes.dex */
public final class m52 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.n52 L;

    public /* synthetic */ m52(defpackage.n52 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.B
            n52 r3 = r3.L
            switch(r0) {
                case 0: goto L3a;
                default: goto L7;
            }
        L7:
            aa7 r4 = (defpackage.aa7) r4
            z42 r0 = defpackage.z42.PreEnter
            z42 r1 = defpackage.z42.Visible
            boolean r0 = r4.b(r0, r1)
            if (r0 == 0) goto L21
            o52 r3 = r3.p0
            ha7 r3 = r3.a
            pj6 r3 = r3.b
            if (r3 == 0) goto L1e
            io6 r3 = r3.b
            goto L39
        L1e:
            io6 r3 = defpackage.i52.c
            goto L39
        L21:
            z42 r0 = defpackage.z42.PostExit
            boolean r4 = r4.b(r1, r0)
            if (r4 == 0) goto L37
            z72 r3 = r3.q0
            ha7 r3 = r3.a
            pj6 r3 = r3.b
            if (r3 == 0) goto L34
            io6 r3 = r3.b
            goto L39
        L34:
            io6 r3 = defpackage.i52.c
            goto L39
        L37:
            io6 r3 = defpackage.i52.c
        L39:
            return r3
        L3a:
            aa7 r4 = (defpackage.aa7) r4
            z42 r0 = defpackage.z42.PreEnter
            z42 r1 = defpackage.z42.Visible
            boolean r0 = r4.b(r0, r1)
            r2 = 0
            if (r0 == 0) goto L52
            o52 r3 = r3.p0
            ha7 r3 = r3.a
            sl0 r3 = r3.c
            if (r3 == 0) goto L67
            rc2 r2 = r3.c
            goto L67
        L52:
            z42 r0 = defpackage.z42.PostExit
            boolean r4 = r4.b(r1, r0)
            if (r4 == 0) goto L65
            z72 r3 = r3.q0
            ha7 r3 = r3.a
            sl0 r3 = r3.c
            if (r3 == 0) goto L67
            rc2 r2 = r3.c
            goto L67
        L65:
            io6 r2 = defpackage.i52.d
        L67:
            if (r2 != 0) goto L6b
            io6 r2 = defpackage.i52.d
        L6b:
            return r2
    }
}
