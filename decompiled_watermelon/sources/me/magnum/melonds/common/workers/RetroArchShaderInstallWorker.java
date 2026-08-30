package me.magnum.melonds.common.workers;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RetroArchShaderInstallWorker extends CoroutineWorker {
    public final gf5 g;
    public long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroArchShaderInstallWorker(Context context, WorkerParameters workerParameters, gf5 gf5Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        gf5Var.getClass();
        this.g = gf5Var;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.j11 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ve5
            if (r0 == 0) goto L13
            r0 = r7
            ve5 r0 = (defpackage.ve5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            ve5 r0 = new ve5
            k11 r7 = (defpackage.k11) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.me2.a0(r7)
            goto L70
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L33:
            defpackage.me2.a0(r7)
            goto L5d
        L37:
            defpackage.me2.a0(r7)
            android.content.Context r7 = r6.a
            r2 = 2131952608(0x7f1303e0, float:1.9541664E38)
            java.lang.String r7 = r7.getString(r2)
            r7.getClass()
            r2 = 0
            xe2 r7 = r6.g(r7, r2, r5)
            r0.Y = r5
            fq3 r7 = r6.b(r7)
            java.lang.Object r7 = defpackage.ep2.j(r7, r0)
            if (r7 != r1) goto L58
            goto L5a
        L58:
            o27 r7 = defpackage.o27.a
        L5a:
            if (r7 != r1) goto L5d
            goto L6f
        L5d:
            bb1 r7 = defpackage.tg1.a
            ha1 r7 = defpackage.ha1.L
            ys3 r2 = new ys3
            r5 = 6
            r2.<init>(r6, r3, r5)
            r0.Y = r4
            java.lang.Object r7 = defpackage.tq5.G(r7, r2, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.common.workers.RetroArchShaderInstallWorker.e(j11):java.lang.Object");
    }

    public final xe2 g(String str, int i, boolean z) {
        Context context = this.a;
        f84 f84Var = new f84(context);
        f84Var.g = -1;
        f84Var.i = f84.b(str);
        f84Var.e = f84.b(context.getString(R.string.video_retroarch_shader_install_notification_title));
        f84Var.n = context.getColor(R.color.melonMain);
        Notification notification = f84Var.q;
        notification.icon = R.drawable.ic_melon_small;
        f84Var.j = 100;
        f84Var.k = i;
        f84Var.l = z;
        notification.flags |= 2;
        Notification a = f84Var.a();
        a.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new xe2(101, a, 1);
        }
        return new xe2(101, a, 0);
    }
}
