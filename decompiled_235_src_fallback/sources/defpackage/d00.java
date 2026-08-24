package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d00  reason: default package */
/* loaded from: classes.dex */
public final class d00 extends defpackage.dl4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ d00(java.lang.Object r1, int r2) {
            r0 = this;
            r0.d = r2
            r0.e = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    public /* synthetic */ d00(java.lang.Object r1, boolean r2, int r3) {
            r0 = this;
            r0.d = r3
            r0.e = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.dl4
    public void a() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r1 = r1.e
            d2 r1 = (defpackage.d2) r1
            r1.l()
            return
    }

    @Override // defpackage.dl4
    public final void b() {
            r4 = this;
            int r0 = r4.d
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r4.e
            switch(r0) {
                case 0: goto L58;
                case 1: goto L42;
                case 2: goto L32;
                case 3: goto L2c;
                case 4: goto L26;
                default: goto L9;
            }
        L9:
            me.magnum.melonds.ui.romlist.a r3 = (me.magnum.melonds.ui.romlist.a) r3
            tz5 r4 = r3.j()
            tp6 r4 = r4.G
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            int r3 = r0.size()
            if (r3 > r2) goto L1e
            goto L25
        L1e:
            java.util.List r0 = defpackage.gt0.E0(r0)
            r4.m(r1, r0)
        L25:
            return
        L26:
            hg r3 = (defpackage.hg) r3
            r3.g(r4)
            return
        L2c:
            rc4 r3 = (defpackage.rc4) r3
            r3.d()
            return
        L32:
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r3 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r3
            me.magnum.melonds.ui.layouteditor.b r4 = r3.F0
            if (r4 == 0) goto L3c
            r4.s()
            return
        L3c:
            java.lang.String r4 = "layoutEditorManager"
            defpackage.nb3.a0(r4)
            throw r1
        L42:
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r3
            vs4 r4 = r3.L1
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L50
            r3.N()
            goto L57
        L50:
            sz1 r4 = r3.W()
            r4.M0(r2)
        L57:
            return
        L58:
            d2 r3 = (defpackage.d2) r3
            r3.m()
            return
    }

    @Override // defpackage.dl4
    public void c(defpackage.b00 r2) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r1 = r1.e
            d2 r1 = (defpackage.d2) r1
            r1.n(r2)
            return
    }

    @Override // defpackage.dl4
    public void d(defpackage.b00 r1) {
            r0 = this;
            int r1 = r0.d
            switch(r1) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r0.e
            d2 r0 = (defpackage.d2) r0
            r0.o()
            return
    }
}
