package me.magnum.melonds.common.workers;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsSubmissionWorker extends CoroutineWorker {
    public final pn5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsSubmissionWorker(Context context, WorkerParameters workerParameters, pn5 pn5Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        pn5Var.getClass();
        this.g = pn5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r41 r41Var) {
        go5 go5Var;
        Object obj;
        int i;
        if (r41Var instanceof go5) {
            go5Var = (go5) r41Var;
            int i2 = go5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                go5Var.Y = i2 - Integer.MIN_VALUE;
                obj = go5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = go5Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    ns3 ns3Var = new ns3(this, null, 6);
                    go5Var.Y = 1;
                    obj = hv.d0(de1Var, ns3Var, go5Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                if (((hm5) obj).A instanceof em5) {
                    return new lx3();
                }
                return new Object();
            }
        }
        go5Var = new go5(this, (s41) r41Var);
        obj = go5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = go5Var.Y;
        if (i == 0) {
        }
        if (((hm5) obj).A instanceof em5) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object f() {
        Context context = this.a;
        xg4 xg4Var = new xg4(context, "channel_cheat_importing");
        xg4Var.h = -1;
        xg4Var.e = xg4.b(context.getString(R.string.submitting_achievements));
        xg4Var.q = context.getColor(R.color.melonMain);
        xg4Var.t.icon = R.drawable.ic_melon_small;
        Notification a = xg4Var.a();
        a.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new wj2(MlKitException.CODE_SCANNER_UNAVAILABLE, a, 1);
        }
        return new wj2(MlKitException.CODE_SCANNER_UNAVAILABLE, a, 0);
    }
}
