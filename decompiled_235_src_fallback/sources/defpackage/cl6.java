package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cl6 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.el6 B;

    public /* synthetic */ cl6(defpackage.el6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.A
            el6 r1 = r1.B
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            rj0 r1 = r1.d
            java.lang.Object r0 = r1.u()
            boolean r0 = r0 instanceof defpackage.sg4
            if (r0 == 0) goto L16
            ll6 r0 = defpackage.ll6.ActionPerformed
            r1.i(r0)
        L16:
            jg7 r1 = defpackage.jg7.a
            return r1
        L19:
            rj0 r1 = r1.d
            java.lang.Object r0 = r1.u()
            boolean r0 = r0 instanceof defpackage.sg4
            if (r0 == 0) goto L28
            ll6 r0 = defpackage.ll6.Dismissed
            r1.i(r0)
        L28:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
    }
}
