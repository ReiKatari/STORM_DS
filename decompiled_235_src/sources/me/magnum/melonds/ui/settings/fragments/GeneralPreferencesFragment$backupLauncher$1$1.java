package me.magnum.melonds.ui.settings.fragments;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment$backupLauncher$1$1", f = "GeneralPreferencesFragment.kt", l = {42, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class GeneralPreferencesFragment$backupLauncher$1$1 extends hw6 implements eo2 {
    public Object X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ GeneralPreferencesFragment d0;
    public final /* synthetic */ Uri e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralPreferencesFragment$backupLauncher$1$1(GeneralPreferencesFragment generalPreferencesFragment, Uri uri, r41 r41Var) {
        super(2, r41Var);
        this.d0 = generalPreferencesFragment;
        this.e0 = uri;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((GeneralPreferencesFragment$backupLauncher$1$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        GeneralPreferencesFragment$backupLauncher$1$1 generalPreferencesFragment$backupLauncher$1$1 = new GeneralPreferencesFragment$backupLauncher$1$1(this.d0, this.e0, r41Var);
        generalPreferencesFragment$backupLauncher$1$1.Z = obj;
        return generalPreferencesFragment$backupLauncher$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (defpackage.hv.d0(r9, r7, r8) == r0) goto L15;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object em5Var;
        jd6 jd6Var;
        w61 w61Var = (w61) this.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        jg7 jg7Var = jg7.a;
        GeneralPreferencesFragment generalPreferencesFragment = this.d0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    oi2.Y(obj);
                    return jg7Var;
                }
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            em5Var = this.X;
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            Uri uri = this.e0;
            try {
                jd6Var = generalPreferencesFragment.f0;
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (jd6Var != null) {
                jd6Var.b(uri);
                em5Var = jg7Var;
                if (!(em5Var instanceof em5)) {
                    jg7 jg7Var2 = (jg7) em5Var;
                    xe1 xe1Var = xk1.a;
                    jv2 jv2Var = e04.a;
                    GeneralPreferencesFragment$backupLauncher$1$1$2$1 generalPreferencesFragment$backupLauncher$1$1$2$1 = new GeneralPreferencesFragment$backupLauncher$1$1$2$1(generalPreferencesFragment, null);
                    this.Z = null;
                    this.X = em5Var;
                    this.Y = 1;
                }
            } else {
                nb3.a0("settingsBackupManager");
                throw null;
            }
        }
        if (hm5.a(em5Var) != null) {
            xe1 xe1Var2 = xk1.a;
            jv2 jv2Var2 = e04.a;
            GeneralPreferencesFragment$backupLauncher$1$1$3$1 generalPreferencesFragment$backupLauncher$1$1$3$1 = new GeneralPreferencesFragment$backupLauncher$1$1$3$1(generalPreferencesFragment, null);
            this.Z = null;
            this.X = em5Var;
            this.Y = 2;
            if (hv.d0(jv2Var2, generalPreferencesFragment$backupLauncher$1$1$3$1, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7Var;
    }
}
