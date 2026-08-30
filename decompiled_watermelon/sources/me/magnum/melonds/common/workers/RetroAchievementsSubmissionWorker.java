package me.magnum.melonds.common.workers;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RetroAchievementsSubmissionWorker extends CoroutineWorker {
    public final ud5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsSubmissionWorker(Context context, WorkerParameters workerParameters, ud5 ud5Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        ud5Var.getClass();
        this.g = ud5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.j11 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.le5
            if (r0 == 0) goto L13
            r0 = r7
            le5 r0 = (defpackage.le5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            le5 r0 = new le5
            k11 r7 = (defpackage.k11) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            defpackage.me2.a0(r7)
            goto L46
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L30:
            defpackage.me2.a0(r7)
            bb1 r7 = defpackage.tg1.a
            ha1 r7 = defpackage.ha1.L
            ys3 r2 = new ys3
            r5 = 5
            r2.<init>(r6, r3, r5)
            r0.Y = r4
            java.lang.Object r7 = defpackage.tq5.G(r7, r2, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            nc5 r7 = (defpackage.nc5) r7
            java.lang.Object r6 = r7.A
            boolean r6 = r6 instanceof defpackage.kc5
            if (r6 != 0) goto L54
            kq3 r6 = new kq3
            r6.<init>()
            return r6
        L54:
            jq3 r6 = new jq3
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker.e(j11):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object f() {
        Context context = this.a;
        f84 f84Var = new f84(context);
        f84Var.g = -1;
        f84Var.e = f84.b(context.getString(R.string.submitting_achievements));
        f84Var.n = context.getColor(R.color.melonMain);
        f84Var.q.icon = R.drawable.ic_melon_small;
        Notification a = f84Var.a();
        a.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new xe2(200, a, 1);
        }
        return new xe2(200, a, 0);
    }
}
