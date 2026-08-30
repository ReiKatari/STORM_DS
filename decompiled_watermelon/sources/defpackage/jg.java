package defpackage;

import android.view.Choreographer;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jg  reason: default package */
/* loaded from: classes.dex */
public final class jg extends nk6 implements aj2 {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((jg) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((jg) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                ((jg) t((j11) obj2, (o31) obj)).v(o27Var);
                return o27Var;
            case 3:
                return ((jg) t((j11) obj2, (o31) obj)).v(o27Var);
            case 4:
                ((jg) t((j11) obj2, (u92) obj)).v(o27Var);
                return o27Var;
            case 5:
                ((jg) t((j11) obj2, (dw5) obj)).v(o27Var);
                return o27Var;
            case ig7.b /* 6 */:
                ((jg) t((j11) obj2, (dw5) obj)).v(o27Var);
                return o27Var;
            case 7:
                return ((jg) t((j11) obj2, (j15) obj)).v(o27Var);
            default:
                ((jg) t((j11) obj2, (dw5) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new jg(2, 0, j11Var);
            case 1:
                return new jg(2, 1, j11Var);
            case 2:
                return new jg(2, 2, j11Var);
            case 3:
                return new jg(2, 3, j11Var);
            case 4:
                return new jg(2, 4, j11Var);
            case 5:
                return new jg(2, 5, j11Var);
            case ig7.b /* 6 */:
                return new jg(2, 6, j11Var);
            case 7:
                return new jg(2, 7, j11Var);
            default:
                return new jg(2, 8, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        MelonEmulator melonEmulator = MelonEmulator.a;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Boolean.valueOf(melonEmulator.debugStepFrame());
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return new Long(melonEmulator.refreshPendingRetroAchievementsSubmissions());
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                melonEmulator.resetEmulation();
                return o27Var;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Choreographer.getInstance();
            case 4:
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return o27Var;
            case 5:
                p31 p31Var6 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return o27Var;
            case ig7.b /* 6 */:
                p31 p31Var7 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return o27Var;
            case 7:
                p31 p31Var8 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return new nc5(new kc5(new UnsupportedOperationException()));
            default:
                p31 p31Var9 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return o27Var;
        }
    }
}
