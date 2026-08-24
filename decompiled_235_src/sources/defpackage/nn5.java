package defpackage;

import me.magnum.melonds.ui.settings.preferences.RetroAchievementsProfilePreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nn5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nn5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RetroAchievementsProfilePreference B;

    public /* synthetic */ nn5(RetroAchievementsProfilePreference retroAchievementsProfilePreference, int i) {
        this.A = i;
        this.B = retroAchievementsProfilePreference;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        RetroAchievementsProfilePreference retroAchievementsProfilePreference = this.B;
        px0 px0Var = (px0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(-1902335821, new nn5(retroAchievementsProfilePreference, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(intValue & 1, z2)) {
                    lb5 lb5Var = (lb5) retroAchievementsProfilePreference.A.getValue();
                    if (lb5Var == null) {
                        xq2Var2.b0(-392934622);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-392934621);
                        nj2.d(lb5Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    }
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
