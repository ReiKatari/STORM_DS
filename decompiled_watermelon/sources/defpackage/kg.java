package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kg  reason: default package */
/* loaded from: classes.dex */
public final class kg extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ List Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg(List list, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = list;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((kg) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((kg) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new kg(this.Y, j11Var, 0);
            default:
                return new kg(this.Y, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        RASimpleRuntimeAchievement rASimpleRuntimeAchievement;
        int i;
        int i2 = this.X;
        List<u15> list = this.Y;
        MelonEmulator melonEmulator = MelonEmulator.a;
        switch (i2) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return new Integer(melonEmulator.discardPendingRetroAchievementsSubmissions(tq0.o1(list)));
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                RASimpleRuntimeAchievement[] runtimeAchievements = melonEmulator.getRuntimeAchievements();
                ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
                for (u15 u15Var : list) {
                    int length = runtimeAchievements.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            rASimpleRuntimeAchievement = runtimeAchievements[i4];
                            if (rASimpleRuntimeAchievement.getId() != u15Var.a.a) {
                                i4++;
                            }
                        } else {
                            rASimpleRuntimeAchievement = null;
                        }
                    }
                    if (rASimpleRuntimeAchievement != null) {
                        i = rASimpleRuntimeAchievement.getValue();
                    } else {
                        i = 0;
                    }
                    if (rASimpleRuntimeAchievement != null) {
                        i3 = rASimpleRuntimeAchievement.getTarget();
                    }
                    arrayList.add(new r15(u15Var, i, i3));
                }
                return arrayList;
        }
    }
}
