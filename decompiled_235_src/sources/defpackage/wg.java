package defpackage;

import android.view.Choreographer;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg  reason: default package */
/* loaded from: classes.dex */
public final class wg extends hw6 implements eo2 {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((wg) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((wg) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                ((wg) q((r41) obj2, (w61) obj)).s(jg7Var);
                return jg7Var;
            case 3:
                return ((wg) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((wg) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 5:
                ((wg) q((r41) obj2, (le2) obj)).s(jg7Var);
                return jg7Var;
            case 6:
                ((wg) q((r41) obj2, (p76) obj)).s(jg7Var);
                return jg7Var;
            case 7:
                ((wg) q((r41) obj2, (p76) obj)).s(jg7Var);
                return jg7Var;
            case 8:
                return ((wg) q((r41) obj2, (ta5) obj)).s(jg7Var);
            default:
                ((wg) q((r41) obj2, (p76) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new wg(2, r41Var, 0);
            case 1:
                return new wg(2, r41Var, 1);
            case 2:
                return new wg(2, r41Var, 2);
            case 3:
                return new wg(2, r41Var, 3);
            case 4:
                return new wg(2, r41Var, 4);
            case 5:
                return new wg(2, r41Var, 5);
            case 6:
                return new wg(2, r41Var, 6);
            case 7:
                return new wg(2, r41Var, 7);
            case 8:
                return new wg(2, r41Var, 8);
            default:
                return new wg(2, r41Var, 9);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        MelonEmulator melonEmulator = MelonEmulator.a;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(melonEmulator.debugStepFrame());
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new Long(melonEmulator.refreshPendingRetroAchievementsSubmissions());
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                melonEmulator.resetEmulation();
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(melonEmulator.takeScreenshot());
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Choreographer.getInstance();
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return jg7Var;
            case 6:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return jg7Var;
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return jg7Var;
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return new hm5(new em5(new UnsupportedOperationException()));
            default:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return jg7Var;
        }
    }
}
