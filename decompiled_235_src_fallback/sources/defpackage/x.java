package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.h0 B;

    public /* synthetic */ x(defpackage.h0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            h0 r3 = r3.B
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            on2 r3 = r3.s0
            r3.c()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        Lf:
            py0 r0 = defpackage.k43.a
            java.lang.Object r0 = defpackage.hf.K(r3, r0)
            n43 r0 = (defpackage.n43) r0
            if (r0 != 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            defpackage.s53.a(r1)
        L2a:
            n43 r1 = r3.u0
            r3.u0 = r0
            if (r1 == 0) goto L49
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L49
            xg1 r0 = r3.w0
            if (r0 != 0) goto L3e
            boolean r1 = r3.D0
            if (r1 != 0) goto L49
        L3e:
            if (r0 == 0) goto L43
            r3.S0(r0)
        L43:
            r0 = 0
            r3.w0 = r0
            r3.b1()
        L49:
            jg7 r3 = defpackage.jg7.a
            return r3
    }
}
