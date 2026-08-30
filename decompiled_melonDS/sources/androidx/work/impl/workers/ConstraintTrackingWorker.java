package androidx.work.impl.workers;

import a9.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cc.c;
import java.util.concurrent.ExecutorService;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: g  reason: collision with root package name */
    public final WorkerParameters f1731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f1731g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(androidx.work.impl.workers.ConstraintTrackingWorker r4, p8.u r5, j0.o1 r6, x8.p r7, ec.c r8) {
        /*
            boolean r0 = r8 instanceof a9.c
            if (r0 == 0) goto L13
            r0 = r8
            a9.c r0 = (a9.c) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            a9.c r0 = new a9.c
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.R
            dc.a r8 = dc.a.COROUTINE_SUSPENDED
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            p7.j.I(r4)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L2e:
            p7.j.I(r4)
            a9.e r4 = new a9.e
            r1 = 0
            r4.<init>(r5, r6, r7, r1)
            r0.Y = r2
            java.lang.Object r4 = zc.x.g(r4, r0)
            if (r4 != r8) goto L40
            return r8
        L40:
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.e(androidx.work.impl.workers.ConstraintTrackingWorker, p8.u, j0.o1, x8.p, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(androidx.work.impl.workers.ConstraintTrackingWorker r21, ec.c r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.f(androidx.work.impl.workers.ConstraintTrackingWorker, ec.c):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(c cVar) {
        ExecutorService executorService = this.f11504b.f1716c;
        executorService.getClass();
        return x.F(x.l(executorService), new b(0, null, this), cVar);
    }
}
