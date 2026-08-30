package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@v81(c = "me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1", f = "SystemPreferencesFragment.kt", l = {39, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SystemPreferencesFragment$backupInternalLayoutLauncher$1$1 extends nk6 implements aj2 {
    public Object X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ SystemPreferencesFragment c0;
    public final /* synthetic */ Uri d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(SystemPreferencesFragment systemPreferencesFragment, Uri uri, j11 j11Var) {
        super(2, j11Var);
        this.c0 = systemPreferencesFragment;
        this.d0 = uri;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((SystemPreferencesFragment$backupInternalLayoutLauncher$1$1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        SystemPreferencesFragment$backupInternalLayoutLauncher$1$1 systemPreferencesFragment$backupInternalLayoutLauncher$1$1 = new SystemPreferencesFragment$backupInternalLayoutLauncher$1$1(this.c0, this.d0, j11Var);
        systemPreferencesFragment$backupInternalLayoutLauncher$1$1.Z = obj;
        return systemPreferencesFragment$backupInternalLayoutLauncher$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (defpackage.tq5.G(r9, r7, r8) == r0) goto L15;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.Z
            o31 r0 = (defpackage.o31) r0
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r8.Y
            o27 r2 = defpackage.o27.a
            r3 = 2
            r4 = 1
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment r5 = r8.c0
            r6 = 0
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            defpackage.me2.a0(r9)
            goto L77
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r6
        L1f:
            java.lang.Object r1 = r8.X
            defpackage.me2.a0(r9)
            goto L5b
        L25:
            defpackage.me2.a0(r9)
            android.net.Uri r9 = r8.d0
            v16 r1 = r5.k()     // Catch: java.lang.Throwable -> L38
            r9.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = "internal_layout.json"
            r1.c(r9, r7)     // Catch: java.lang.Throwable -> L38
            r1 = r2
            goto L3e
        L38:
            r9 = move-exception
            kc5 r1 = new kc5
            r1.<init>(r9)
        L3e:
            boolean r9 = r1 instanceof defpackage.kc5
            if (r9 != 0) goto L5b
            r9 = r1
            o27 r9 = (defpackage.o27) r9
            bb1 r9 = defpackage.tg1.a
            ip2 r9 = defpackage.bt3.a
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$2$1 r7 = new me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$2$1
            r7.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r4
            java.lang.Object r9 = defpackage.tq5.G(r9, r7, r8)
            if (r9 != r0) goto L5b
            goto L76
        L5b:
            java.lang.Throwable r9 = defpackage.nc5.a(r1)
            if (r9 == 0) goto L77
            bb1 r9 = defpackage.tg1.a
            ip2 r9 = defpackage.bt3.a
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$3$1 r4 = new me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1$3$1
            r4.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r3
            java.lang.Object r8 = defpackage.tq5.G(r9, r4, r8)
            if (r8 != r0) goto L77
        L76:
            return r0
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupInternalLayoutLauncher$1$1.v(java.lang.Object):java.lang.Object");
    }
}
