package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rm7 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment B;

    public /* synthetic */ rm7(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            int r2 = r0.A
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r0 = r0.B
            switch(r2) {
                case 0: goto L25;
                case 1: goto L1e;
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            r0.D()
            return
        Lb:
            ae6 r0 = r0.h0
            if (r0 == 0) goto L17
            monitor-enter(r0)
            java.io.File r1 = r0.a     // Catch: java.lang.Throwable -> L15
            r1.delete()     // Catch: java.lang.Throwable -> L15
        L15:
            monitor-exit(r0)
            return
        L17:
            java.lang.String r0 = "shaderCompatibilityLog"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
        L1e:
            r2 = 1
            r0.D0 = r2
            r1.dismiss()
            return
        L25:
            r0.D()
            return
    }
}
