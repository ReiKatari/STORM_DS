package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv1  reason: default package */
/* loaded from: classes.dex */
public final class xv1 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.nx1 B;

    public /* synthetic */ xv1(defpackage.nx1 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r5, defpackage.r41 r6) {
            r4 = this;
            int r6 = r4.A
            jg7 r0 = defpackage.jg7.a
            nx1 r4 = r4.B
            switch(r6) {
                case 0: goto L53;
                default: goto L9;
            }
        L9:
            l95 r5 = (defpackage.l95) r5
            boolean r6 = r5 instanceof defpackage.p85
            if (r6 == 0) goto L21
            java.util.List r6 = r4.o
            p85 r5 = (defpackage.p85) r5
            long r1 = r5.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            java.util.ArrayList r5 = defpackage.gt0.U0(r5, r6)
            r4.o = r5
            goto L52
        L21:
            boolean r6 = r5 instanceof defpackage.t85
            if (r6 == 0) goto L37
            java.util.List r6 = r4.o
            t85 r5 = (defpackage.t85) r5
            long r1 = r5.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            java.util.ArrayList r5 = defpackage.gt0.T0(r6, r5)
            r4.o = r5
            goto L52
        L37:
            boolean r6 = r5 instanceof defpackage.s85
            if (r6 == 0) goto L52
            java.util.List r6 = r4.p
            gx1 r1 = new gx1
            s85 r5 = (defpackage.s85) r5
            long r2 = r5.a
            vr0 r5 = defpackage.u83.a
            s83 r5 = r5.b()
            r1.<init>(r2, r5)
            java.util.ArrayList r5 = defpackage.gt0.U0(r1, r6)
            r4.p = r5
        L52:
            return r0
        L53:
            ba5 r5 = (defpackage.ba5) r5
            yt1 r5 = defpackage.yt1.A
            r4.o = r5
            return r0
    }
}
