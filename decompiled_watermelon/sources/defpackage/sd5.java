package defpackage;

import me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sd5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sd5 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RetroAchievementsProfilePreference B;

    public /* synthetic */ sd5(RetroAchievementsProfilePreference retroAchievementsProfilePreference, int i) {
        this.A = i;
        this.B = retroAchievementsProfilePreference;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        o27 o27Var = o27.a;
        RetroAchievementsProfilePreference retroAchievementsProfilePreference = this.B;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    mj2.b(false, ct3.H0(-1902335821, new sd5(retroAchievementsProfilePreference, 1), sk2Var), sk2Var, 48, 1);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z2)) {
                    b25 b25Var = (b25) retroAchievementsProfilePreference.A.getValue();
                    if (b25Var == null) {
                        sk2Var2.X(-392934622);
                        sk2Var2.p(false);
                    } else {
                        sk2Var2.X(-392934621);
                        cg2.g(b25Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    }
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
