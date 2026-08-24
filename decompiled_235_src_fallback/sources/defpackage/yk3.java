package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yk3 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ yk3(me.magnum.melonds.ui.layouteditor.b r1, int r2) {
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
            jg7 r1 = defpackage.jg7.a
            me.magnum.melonds.ui.layouteditor.b r4 = r4.B
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L19;
                case 2: goto L15;
                case 3: goto L11;
                case 4: goto Ld;
                default: goto L9;
            }
        L9:
            me.magnum.melonds.ui.layouteditor.b.n(r4)
            return r1
        Ld:
            me.magnum.melonds.ui.layouteditor.b.c(r4)
            return r1
        L11:
            me.magnum.melonds.ui.layouteditor.b.f(r4)
            return r1
        L15:
            me.magnum.melonds.ui.layouteditor.b.d(r4)
            return r1
        L19:
            me.magnum.melonds.ui.layouteditor.b.l(r4)
            return r1
        L1d:
            bp7 r4 = defpackage.ln2.r(r4)
            r0 = 0
            if (r4 == 0) goto L6f
            ap7 r1 = r4.getViewModelStore()
            boolean r2 = r4 instanceof defpackage.mw2
            if (r2 == 0) goto L34
            r3 = r4
            mw2 r3 = (defpackage.mw2) r3
            yo7 r3 = r3.getDefaultViewModelProviderFactory()
            goto L36
        L34:
            eg1 r3 = defpackage.eg1.b
        L36:
            if (r2 == 0) goto L3f
            mw2 r4 = (defpackage.mw2) r4
            j71 r4 = r4.getDefaultViewModelCreationExtras()
            goto L41
        L3f:
            h71 r4 = defpackage.h71.b
        L41:
            r1.getClass()
            r3.getClass()
            r4.getClass()
            eb r2 = new eb
            r2.<init>(r1, r3, r4)
            java.lang.Class<yl3> r4 = defpackage.yl3.class
            ar0 r4 = defpackage.gh5.a(r4)
            java.lang.String r1 = r4.b()
            if (r1 == 0) goto L69
            java.lang.String r0 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = r0.concat(r1)
            qo7 r4 = r2.G(r4, r0)
            r0 = r4
            yl3 r0 = (defpackage.yl3) r0
            goto L74
        L69:
            java.lang.String r4 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r4)
            goto L74
        L6f:
            java.lang.String r4 = "No view-model store owner found"
            defpackage.i.m(r4)
        L74:
            return r0
    }
}
