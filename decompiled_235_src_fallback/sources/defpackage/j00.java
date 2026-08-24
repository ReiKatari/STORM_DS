package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j00  reason: default package */
/* loaded from: classes.dex */
public final class j00 implements defpackage.fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ j00(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // defpackage.fl1
    public final void dispose() {
            r4 = this;
            int r0 = r4.a
            r1 = 0
            java.lang.Object r2 = r4.c
            java.lang.Object r4 = r4.b
            switch(r0) {
                case 0: goto Lc1;
                case 1: goto Lb3;
                case 2: goto La9;
                case 3: goto La1;
                case 4: goto L7d;
                case 5: goto L75;
                case 6: goto L5b;
                case 7: goto L51;
                case 8: goto L47;
                case 9: goto L2e;
                case 10: goto L24;
                default: goto La;
            }
        La:
            dv7 r4 = (defpackage.dv7) r4
            android.view.View r2 = (android.view.View) r2
            int r0 = r4.u
            int r0 = r0 + (-1)
            r4.u = r0
            if (r0 != 0) goto L23
            java.util.WeakHashMap r0 = defpackage.ao7.a
            defpackage.sn7.c(r2, r1)
            defpackage.ao7.p(r2, r1)
            k83 r4 = r4.v
            r2.removeOnAttachStateChangeListener(r4)
        L23:
            return
        L24:
            ga7 r4 = (defpackage.ga7) r4
            ca7 r2 = (defpackage.ca7) r2
            mm6 r4 = r4.i
            r4.remove(r2)
            return
        L2e:
            ga7 r4 = (defpackage.ga7) r4
            w97 r2 = (defpackage.w97) r2
            r4.getClass()
            vs4 r0 = r2.b
            java.lang.Object r0 = r0.getValue()
            v97 r0 = (defpackage.v97) r0
            if (r0 == 0) goto L46
            ca7 r0 = r0.A
            mm6 r4 = r4.i
            r4.remove(r0)
        L46:
            return
        L47:
            ga7 r4 = (defpackage.ga7) r4
            ga7 r2 = (defpackage.ga7) r2
            mm6 r4 = r4.j
            r4.remove(r2)
            return
        L51:
            f47 r4 = (defpackage.f47) r4
            mm6 r4 = r4.c
            qn2 r2 = (defpackage.qn2) r2
            r4.remove(r2)
            return
        L5b:
            qa4 r4 = (defpackage.qa4) r4
            java.lang.Object r0 = r4.getValue()
            l25 r0 = (defpackage.l25) r0
            if (r0 == 0) goto L74
            k25 r3 = new k25
            r3.<init>(r0)
            r94 r2 = (defpackage.r94) r2
            if (r2 == 0) goto L71
            r2.b(r3)
        L71:
            r4.setValue(r1)
        L74:
            return
        L75:
            e00 r4 = (defpackage.e00) r4
            ax0 r2 = (defpackage.ax0) r2
            r4.b(r2)
            return
        L7d:
            pp6 r4 = (defpackage.pp6) r4
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L89:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r4.next()
            sb4 r0 = (defpackage.sb4) r0
            r1 = r2
            uw0 r1 = (defpackage.uw0) r1
            vb4 r1 = r1.b()
            r1.c(r0)
            goto L89
        La0:
            return
        La1:
            rr3 r4 = (defpackage.rr3) r4
            ka4 r4 = r4.L
            r4.k(r2)
            return
        La9:
            g53 r4 = (defpackage.g53) r4
            e53 r2 = (defpackage.e53) r2
            ua4 r4 = r4.a
            r4.j(r2)
            return
        Lb3:
            sb4 r4 = (defpackage.sb4) r4
            uk1 r4 = r4.d0
            java.lang.Object r4 = r4.k
            ku3 r4 = (defpackage.ku3) r4
            cj1 r2 = (defpackage.cj1) r2
            r4.c(r2)
            return
        Lc1:
            e00 r4 = (defpackage.e00) r4
            pw0 r2 = (defpackage.pw0) r2
            r4.b(r2)
            return
    }
}
