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
public final class RetroArchShaderInstallWorker extends CoroutineWorker {
    public final cp5 g;
    public long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroArchShaderInstallWorker(Context context, WorkerParameters workerParameters, cp5 cp5Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        cp5Var.getClass();
        this.g = cp5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r7 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r7 != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r41 r41Var) {
        qo5 qo5Var;
        int i;
        if (r41Var instanceof qo5) {
            qo5Var = (qo5) r41Var;
            int i2 = qo5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qo5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = qo5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = qo5Var.Y;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            obj.getClass();
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    String string = this.a.getString(R.string.video_retroarch_shader_downloading);
                    string.getClass();
                    wj2 g = g(string, 0, true);
                    qo5Var.Y = 1;
                    Object m = gi2.m(b(g), qo5Var);
                    if (m != x61Var) {
                        m = jg7.a;
                    }
                }
                xe1 xe1Var = xk1.a;
                de1 de1Var = de1.L;
                ns3 ns3Var = new ns3(this, null, 7);
                qo5Var.Y = 2;
                obj = hv.d0(de1Var, ns3Var, qo5Var);
            }
        }
        qo5Var = new qo5(this, (s41) r41Var);
        Object obj2 = qo5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = qo5Var.Y;
        if (i == 0) {
        }
        xe1 xe1Var2 = xk1.a;
        de1 de1Var2 = de1.L;
        ns3 ns3Var2 = new ns3(this, null, 7);
        qo5Var.Y = 2;
        obj2 = hv.d0(de1Var2, ns3Var2, qo5Var);
    }

    public final wj2 g(String str, int i, boolean z) {
        Context context = this.a;
        xg4 xg4Var = new xg4(context, "channel_cheat_importing");
        xg4Var.h = -1;
        xg4Var.k = xg4.b(str);
        xg4Var.e = xg4.b(context.getString(R.string.video_retroarch_shader_install_notification_title));
        xg4Var.q = context.getColor(R.color.melonMain);
        xg4Var.t.icon = R.drawable.ic_melon_small;
        xg4Var.l = 100;
        xg4Var.m = i;
        xg4Var.n = z;
        xg4Var.c(2);
        Notification a = xg4Var.a();
        a.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new wj2(MlKitException.NOT_ENOUGH_SPACE, a, 1);
        }
        return new wj2(MlKitException.NOT_ENOUGH_SPACE, a, 0);
    }
}
