package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kn0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.xn0 B;
    public final /* synthetic */ defpackage.qn2 L;

    public /* synthetic */ kn0(defpackage.xn0 r1, defpackage.qn2 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r7 = this;
            int r0 = r7.A
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            r3 = 0
            r4 = 1
            qn2 r5 = r7.L
            xn0 r7 = r7.B
            switch(r0) {
                case 0: goto L3c;
                default: goto Le;
            }
        Le:
            vs4 r0 = r7.e
            vs4 r6 = r7.b
            java.lang.Object r6 = r6.getValue()
            c37 r6 = (defpackage.c37) r6
            fp r6 = r6.a
            java.lang.String r6 = r6.B
            boolean r6 = defpackage.qs6.v0(r6)
            if (r6 == 0) goto L28
            wn0 r2 = defpackage.wn0.CANNOT_BE_EMPTY
            r0.setValue(r2)
            goto L2c
        L28:
            r0.setValue(r2)
            r3 = r4
        L2c:
            boolean r0 = r7.b()
            if (r3 == 0) goto L3b
            if (r0 == 0) goto L3b
            jo0 r7 = r7.a()
            r5.g(r7)
        L3b:
            return r1
        L3c:
            vs4 r0 = r7.e
            vs4 r6 = r7.b
            java.lang.Object r6 = r6.getValue()
            c37 r6 = (defpackage.c37) r6
            fp r6 = r6.a
            java.lang.String r6 = r6.B
            boolean r6 = defpackage.qs6.v0(r6)
            if (r6 == 0) goto L56
            wn0 r2 = defpackage.wn0.CANNOT_BE_EMPTY
            r0.setValue(r2)
            goto L5a
        L56:
            r0.setValue(r2)
            r3 = r4
        L5a:
            boolean r0 = r7.b()
            if (r3 == 0) goto L69
            if (r0 == 0) goto L69
            jo0 r7 = r7.a()
            r5.g(r7)
        L69:
            return r1
    }
}
