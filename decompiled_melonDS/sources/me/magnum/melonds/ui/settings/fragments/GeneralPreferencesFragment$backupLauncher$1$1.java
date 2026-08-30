package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
import mc.p;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@ec.e(c = "me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1", f = "GeneralPreferencesFragment.kt", l = {40, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class GeneralPreferencesFragment$backupLauncher$1$1 extends ec.j implements p {
    public Object X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ GeneralPreferencesFragment f9595b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Uri f9596c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralPreferencesFragment$backupLauncher$1$1(GeneralPreferencesFragment generalPreferencesFragment, Uri uri, cc.c cVar) {
        super(2, cVar);
        this.f9595b0 = generalPreferencesFragment;
        this.f9596c0 = uri;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((GeneralPreferencesFragment$backupLauncher$1$1) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        GeneralPreferencesFragment$backupLauncher$1$1 generalPreferencesFragment$backupLauncher$1$1 = new GeneralPreferencesFragment$backupLauncher$1$1(this.f9595b0, this.f9596c0, cVar);
        generalPreferencesFragment$backupLauncher$1$1.Z = obj;
        return generalPreferencesFragment$backupLauncher$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (zc.x.F(r9, r7, r8) == r0) goto L15;
     */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.Z
            zc.u r0 = (zc.u) r0
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r8.Y
            yb.y r2 = yb.y.f14813a
            r3 = 2
            r4 = 1
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment r5 = r8.f9595b0
            r6 = 0
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            p7.j.I(r9)
            goto L79
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            return r6
        L1f:
            java.lang.Object r1 = r8.X
            p7.j.I(r9)
            goto L5d
        L25:
            p7.j.I(r9)
            android.net.Uri r9 = r8.f9596c0
            kf.x1 r1 = r5.f9591c0     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            r1.a(r9)     // Catch: java.lang.Throwable -> L33
            r1 = r2
            goto L40
        L33:
            r9 = move-exception
            goto L3b
        L35:
            java.lang.String r9 = "settingsBackupManager"
            nc.k.f(r9)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L3b:
            yb.k r1 = new yb.k
            r1.<init>(r9)
        L40:
            boolean r9 = r1 instanceof yb.k
            if (r9 != 0) goto L5d
            r9 = r1
            yb.y r9 = (yb.y) r9
            gd.f r9 = zc.g0.f15015a
            ad.e r9 = ed.n.f4465a
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$2$1 r7 = new me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$2$1
            r7.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r4
            java.lang.Object r9 = zc.x.F(r9, r7, r8)
            if (r9 != r0) goto L5d
            goto L78
        L5d:
            java.lang.Throwable r9 = yb.l.a(r1)
            if (r9 == 0) goto L79
            gd.f r9 = zc.g0.f15015a
            ad.e r9 = ed.n.f4465a
            me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$3$1 r4 = new me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1$3$1
            r4.<init>(r5, r6)
            r8.Z = r6
            r8.X = r1
            r8.Y = r3
            java.lang.Object r9 = zc.x.F(r9, r4, r8)
            if (r9 != r0) goto L79
        L78:
            return r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1.v(java.lang.Object):java.lang.Object");
    }
}
