package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z36  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z36 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.on2 B;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment L;
    public final /* synthetic */ android.net.Uri R;

    public /* synthetic */ z36(me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment r2, android.net.Uri r3, defpackage.on2 r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.B = r4
            return
    }

    public /* synthetic */ z36(defpackage.on2 r2, me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment r3, android.net.Uri r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            int r2 = r1.A
            android.net.Uri r3 = r1.R
            me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment r0 = r1.L
            on2 r1 = r1.B
            switch(r2) {
                case 0: goto L2b;
                default: goto Lb;
            }
        Lb:
            r1.c()
            jd6 r1 = r0.k()
            r3.getClass()
            org.json.JSONObject r2 = r1.d()
            java.lang.String r2 = r2.toString()
            r2.getClass()
            r1.p(r3, r2)
            jd6 r1 = r0.k()
            r1.i()
            return
        L2b:
            jd6 r2 = r0.k()
            r2.m(r3)
            r1.c()
            jd6 r1 = r0.k()
            r1.i()
            return
    }
}
