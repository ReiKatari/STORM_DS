package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1", f = "SystemPreferencesFragment.kt", l = {40, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SystemPreferencesFragment$backupInternalLayoutLauncher$1$1 extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.Object X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment d0;
    public final /* synthetic */ android.net.Uri e0;

    public SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment r1, android.net.Uri r2, defpackage.r41 r3) {
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
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1 r0 = (me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1 r0 = new me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment r1 = r2.d0
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
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment r5 = r8.d0
            r6 = 0
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            defpackage.oi2.Y(r9)
            goto L77
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r6
        L1f:
            java.lang.Object r1 = r8.X
            defpackage.oi2.Y(r9)
            goto L5b
        L25:
            defpackage.oi2.Y(r9)
            android.net.Uri r9 = r8.e0
            jd6 r1 = r5.k()     // Catch: java.lang.Throwable -> L38
            r9.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = "internal_layout.json"
            r1.c(r9, r7)     // Catch: java.lang.Throwable -> L38
            r1 = r2
            goto L3e
        L38:
            r9 = move-exception
            em5 r1 = new em5
            r1.<init>(r9)
        L3e:
            boolean r9 = r1 instanceof defpackage.em5
            if (r9 != 0) goto L5b
            r9 = r1
            jg7 r9 = (defpackage.jg7) r9
            xe1 r9 = defpackage.xk1.a
            jv2 r9 = defpackage.e04.a
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$2$1 r7 = new me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$2$1
            r7.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r4
            java.lang.Object r9 = defpackage.hv.d0(r9, r7, r8)
            if (r9 != r0) goto L5b
            goto L76
        L5b:
            java.lang.Throwable r9 = defpackage.hm5.a(r1)
            if (r9 == 0) goto L77
            xe1 r9 = defpackage.xk1.a
            jv2 r9 = defpackage.e04.a
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$3$1 r4 = new me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$3$1
            r4.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r3
            java.lang.Object r8 = defpackage.hv.d0(r9, r4, r8)
            if (r8 != r0) goto L77
        L76:
            return r0
        L77:
            return r2
    }
}
