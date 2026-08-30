package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import mc.p;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupExternalLayoutLauncher$1$1", f = "SystemPreferencesFragment.kt", l = {56, 64}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SystemPreferencesFragment$backupExternalLayoutLauncher$1$1 extends ec.j implements p {
    public Object X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ SystemPreferencesFragment f9608b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Uri f9609c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(SystemPreferencesFragment systemPreferencesFragment, Uri uri, cc.c cVar) {
        super(2, cVar);
        this.f9608b0 = systemPreferencesFragment;
        this.f9609c0 = uri;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((SystemPreferencesFragment$backupExternalLayoutLauncher$1$1) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        SystemPreferencesFragment$backupExternalLayoutLauncher$1$1 systemPreferencesFragment$backupExternalLayoutLauncher$1$1 = new SystemPreferencesFragment$backupExternalLayoutLauncher$1$1(this.f9608b0, this.f9609c0, cVar);
        systemPreferencesFragment$backupExternalLayoutLauncher$1$1.Z = obj;
        return systemPreferencesFragment$backupExternalLayoutLauncher$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (zc.x.F(r10, r7, r9) == r0) goto L15;
     */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.Z
            zc.u r0 = (zc.u) r0
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r9.Y
            yb.y r2 = yb.y.f14813a
            r3 = 2
            r4 = 1
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment r5 = r9.f9608b0
            r6 = 0
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            p7.j.I(r10)
            goto L80
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            return r6
        L1f:
            java.lang.Object r1 = r9.X
            p7.j.I(r10)
            goto L64
        L25:
            p7.j.I(r10)
            android.net.Uri r10 = r9.f9609c0
            kf.x1 r1 = r5.Y     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3c
            r10.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = "external_layout.json"
            java.lang.String r8 = "EXTERNAL"
            r1.b(r10, r7, r8)     // Catch: java.lang.Throwable -> L3a
            r1 = r2
            goto L47
        L3a:
            r10 = move-exception
            goto L42
        L3c:
            java.lang.String r10 = "settingsBackupManager"
            nc.k.f(r10)     // Catch: java.lang.Throwable -> L3a
            throw r6     // Catch: java.lang.Throwable -> L3a
        L42:
            yb.k r1 = new yb.k
            r1.<init>(r10)
        L47:
            boolean r10 = r1 instanceof yb.k
            if (r10 != 0) goto L64
            r10 = r1
            yb.y r10 = (yb.y) r10
            gd.f r10 = zc.g0.f15015a
            ad.e r10 = ed.n.f4465a
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$2$1 r7 = new me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$2$1
            r7.<init>(r5, r6)
            r9.Z = r6
            r9.X = r1
            r9.Y = r4
            java.lang.Object r10 = zc.x.F(r10, r7, r9)
            if (r10 != r0) goto L64
            goto L7f
        L64:
            java.lang.Throwable r10 = yb.l.a(r1)
            if (r10 == 0) goto L80
            gd.f r10 = zc.g0.f15015a
            ad.e r10 = ed.n.f4465a
            me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$3$1 r4 = new me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupExternalLayoutLauncher$1$1$3$1
            r4.<init>(r5, r6)
            r9.Z = r6
            r9.X = r1
            r9.Y = r3
            java.lang.Object r10 = zc.x.F(r10, r4, r9)
            if (r10 != r0) goto L80
        L7f:
            return r0
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment$backupExternalLayoutLauncher$1$1.v(java.lang.Object):java.lang.Object");
    }
}
