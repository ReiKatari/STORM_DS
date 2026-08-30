package me.magnum.melonds.common.workers;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cf.b;
import m5.h;
import me.magnum.melonds.R;
import p8.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RetroAchievementsSubmissionWorker extends CoroutineWorker {

    /* renamed from: g  reason: collision with root package name */
    public final b f9471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroAchievementsSubmissionWorker(Context context, WorkerParameters workerParameters, b bVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        bVar.getClass();
        this.f9471g = bVar;
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
    public final java.lang.Object c(cc.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof de.c
            if (r0 == 0) goto L13
            r0 = r7
            de.c r0 = (de.c) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            de.c r0 = new de.c
            ec.c r7 = (ec.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            p7.j.I(r7)
            goto L46
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            return r3
        L30:
            p7.j.I(r7)
            gd.f r7 = zc.g0.f15015a
            gd.e r7 = gd.e.L
            a9.b r2 = new a9.b
            r5 = 7
            r2.<init>(r5, r3, r6)
            r0.Y = r4
            java.lang.Object r7 = zc.x.F(r7, r2, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            yb.l r7 = (yb.l) r7
            java.lang.Object r7 = r7.A
            boolean r7 = r7 instanceof yb.k
            if (r7 != 0) goto L54
            p8.s r7 = new p8.s
            r7.<init>()
            return r7
        L54:
            p8.r r7 = new p8.r
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker.c(cc.c):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d() {
        Context context = this.f11503a;
        h hVar = new h(context);
        hVar.f9254f = -1;
        hVar.f9253e = h.b(context.getString(R.string.submitting_achievements));
        hVar.m = context.getColor(R.color.melonMain);
        hVar.f9263p.icon = R.drawable.ic_melon_small;
        Notification a10 = hVar.a();
        a10.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new m(200, a10, 1);
        }
        return new m(200, a10, 0);
    }
}
