package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vp implements android.window.OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vp(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public final void onBackInvoked() {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto L27;
                case 1: goto L21;
                case 2: goto L19;
                case 3: goto L13;
                case 4: goto Ld;
                default: goto L7;
            }
        L7:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            return
        Ld:
            al4 r1 = (defpackage.al4) r1
            r1.a()
            return
        L13:
            r14 r1 = (defpackage.r14) r1
            r1.a()
            return
        L19:
            z82 r1 = (defpackage.z82) r1
            me.magnum.melonds.ui.layouteditor.b r1 = r1.A
            r1.s()
            return
        L21:
            fr r1 = (defpackage.fr) r1
            r1.G()
            return
        L27:
            on2 r1 = (defpackage.on2) r1
            if (r1 == 0) goto L2e
            r1.c()
        L2e:
            return
    }
}
