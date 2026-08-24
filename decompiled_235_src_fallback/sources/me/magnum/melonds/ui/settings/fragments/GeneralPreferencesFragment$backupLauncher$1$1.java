package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1", f = "GeneralPreferencesFragment.kt", l = {42, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class GeneralPreferencesFragment$backupLauncher$1$1 extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.Object X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment d0;
    public final /* synthetic */ android.net.Uri e0;

    public GeneralPreferencesFragment$backupLauncher$1$1(me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r1, android.net.Uri r2, defpackage.r41 r3) {
            r0 = this;
            r0.d0 = r1
            r0.e0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1 r0 = (me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1 r0 = new me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r1 = r2.d0
            android.net.Uri r2 = r2.e0
            r0.<init>(r1, r2, r3)
            r0.Z = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.Z
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            jg7 r2 = defpackage.jg7.a
            r3 = 2
            r4 = 1
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r5 = r8.d0
            r6 = 0
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            defpackage.oi2.Y(r9)
            goto L79
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r6
        L1f:
            java.lang.Object r1 = r8.X
            defpackage.oi2.Y(r9)
            goto L5d
        L25:
            defpackage.oi2.Y(r9)
            android.net.Uri r9 = r8.e0
            jd6 r1 = r5.f0     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            r1.b(r9)     // Catch: java.lang.Throwable -> L33
            r1 = r2
            goto L40
        L33:
            r9 = move-exception
            goto L3b
        L35:
            java.lang.String r9 = "settingsBackupManager"
            defpackage.nb3.a0(r9)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L3b:
            em5 r1 = new em5
            r1.<init>(r9)
        L40:
            boolean r9 = r1 instanceof defpackage.em5
            if (r9 != 0) goto L5d
            r9 = r1
            jg7 r9 = (defpackage.jg7) r9
            xe1 r9 = defpackage.xk1.a
            jv2 r9 = defpackage.e04.a
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$2$1 r7 = new me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$2$1
            r7.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r4
            java.lang.Object r9 = defpackage.hv.d0(r9, r7, r8)
            if (r9 != r0) goto L5d
            goto L78
        L5d:
            java.lang.Throwable r9 = defpackage.hm5.a(r1)
            if (r9 == 0) goto L79
            xe1 r9 = defpackage.xk1.a
            jv2 r9 = defpackage.e04.a
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$3$1 r4 = new me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$3$1
            r4.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r3
            java.lang.Object r8 = defpackage.hv.d0(r9, r4, r8)
            if (r8 != r0) goto L79
        L78:
            return r0
        L79:
            return r2
    }
}
