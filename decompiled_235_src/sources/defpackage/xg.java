package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg  reason: default package */
/* loaded from: classes.dex */
public final class xg extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ List Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(List list, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = list;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((xg) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((xg) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new xg(this.Y, r41Var, 0);
            default:
                return new xg(this.Y, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        RASimpleRuntimeAchievement rASimpleRuntimeAchievement;
        int i;
        int i2 = this.X;
        List<eb5> list = this.Y;
        MelonEmulator melonEmulator = MelonEmulator.a;
        switch (i2) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new Integer(melonEmulator.discardPendingRetroAchievementsSubmissions(gt0.l1(list)));
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                RASimpleRuntimeAchievement[] runtimeAchievements = melonEmulator.getRuntimeAchievements();
                ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                for (eb5 eb5Var : list) {
                    int length = runtimeAchievements.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            rASimpleRuntimeAchievement = runtimeAchievements[i4];
                            if (rASimpleRuntimeAchievement.getId() != eb5Var.a.a) {
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
                    arrayList.add(new bb5(eb5Var, i, i3));
                }
                return arrayList;
        }
    }
}
