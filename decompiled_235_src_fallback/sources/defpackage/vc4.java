package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vc4 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.pp6 B;

    public /* synthetic */ vc4(defpackage.pp6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            pp6 r4 = r4.B
            switch(r0) {
                case 0: goto L25;
                case 1: goto L17;
                default: goto L7;
            }
        L7:
            xo r0 = defpackage.qa6.a
            java.lang.Object r4 = r4.getValue()
            jk4 r4 = (defpackage.jk4) r4
            long r0 = r4.a
            jk4 r4 = new jk4
            r4.<init>(r0)
            return r4
        L17:
            java.lang.Object r4 = r4.getValue()
            jk4 r4 = (defpackage.jk4) r4
            long r0 = r4.a
            jk4 r4 = new jk4
            r4.<init>(r0)
            return r4
        L25:
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r4.next()
            r2 = r1
            sb4 r2 = (defpackage.sb4) r2
            ic4 r2 = r2.B
            java.lang.String r2 = r2.A
            java.lang.String r3 = "composable"
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L34
            r0.add(r1)
            goto L34
        L51:
            return r0
    }
}
