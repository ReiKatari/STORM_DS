package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z3  reason: default package */
/* loaded from: classes.dex */
public final class z3 implements defpackage.fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ z3(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fl1
    public final void dispose() {
            r3 = this;
            int r0 = r3.a
            r1 = 0
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto La4;
                case 1: goto L94;
                case 2: goto L89;
                case 3: goto L78;
                case 4: goto L60;
                case 5: goto L56;
                case 6: goto L46;
                case 7: goto L3e;
                case 8: goto L38;
                case 9: goto L2d;
                case 10: goto L28;
                case 11: goto L1c;
                case 12: goto L16;
                case 13: goto L10;
                default: goto L8;
            }
        L8:
            gx0 r3 = (defpackage.gx0) r3
            n96 r3 = (defpackage.n96) r3
            r3.y(r1)
            return
        L10:
            qn2 r3 = (defpackage.qn2) r3
            r3.g(r1)
            return
        L16:
            lq3 r3 = (defpackage.lq3) r3
            r0 = 1
            r3.f = r0
            return
        L1c:
            pq3 r3 = (defpackage.pq3) r3
            bk1 r0 = r3.c
            if (r0 == 0) goto L25
            r2 = 0
            r0.A = r2
        L25:
            r3.c = r1
            return
        L28:
            aq3 r3 = (defpackage.aq3) r3
            r3.d = r1
            return
        L2d:
            mn2 r3 = (defpackage.mn2) r3
            r3.e()
            android.view.WindowManager r0 = r3.i0
            r0.removeView(r3)
            return
        L38:
            p27 r3 = (defpackage.p27) r3
            r3.o()
            return
        L3e:
            jl1 r3 = (defpackage.jl1) r3
            kl1 r3 = r3.B
            r3.c()
            return
        L46:
            h30 r3 = (defpackage.h30) r3
            vs4 r3 = r3.c
            java.lang.Object r3 = r3.getValue()
            g30 r3 = (defpackage.g30) r3
            if (r3 == 0) goto L55
            r3.close()
        L55:
            return
        L56:
            cv7 r3 = (defpackage.cv7) r3
            r0 = 519(0x207, float:7.27E-43)
            bv7 r3 = r3.a
            r3.f(r0)
            return
        L60:
            hm r3 = (defpackage.hm) r3
            qm6 r0 = r3.e
            h61 r2 = r0.h
            if (r2 == 0) goto L6b
            r2.d()
        L6b:
            r0.a()
            android.view.ActionMode r0 = r3.h
            if (r0 == 0) goto L75
            r0.finish()
        L75:
            r3.h = r1
            return
        L78:
            c05 r3 = (defpackage.c05) r3
            r3.e()
            r0 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r3.setTag(r0, r1)
            android.view.WindowManager r0 = r3.o0
            r0.removeViewImmediate(r3)
            return
        L89:
            mj1 r3 = (defpackage.mj1) r3
            r3.dismiss()
            gj1 r3 = r3.d0
            r3.e()
            return
        L94:
            e9 r3 = (defpackage.e9) r3
            i9 r3 = r3.a
            if (r3 == 0) goto L9e
            r3.b()
            goto La3
        L9e:
            java.lang.String r3 = "Launcher has not been initialized"
            defpackage.i.m(r3)
        La3:
            return
        La4:
            bt r3 = (defpackage.bt) r3
            java.lang.Object r3 = r3.B
            on2 r3 = (defpackage.on2) r3
            r3.c()
            return
    }
}
