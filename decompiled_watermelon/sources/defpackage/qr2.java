package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker;
import me.magnum.melonds.common.workers.RetroArchShaderInstallWorker;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qr2  reason: default package */
/* loaded from: classes.dex */
public final class qr2 extends ji7 {
    public final Map a;

    public qr2(Map map) {
        this.a = map;
    }

    @Override // defpackage.ji7
    public final mq3 b(Context context, String str, WorkerParameters workerParameters) {
        fw4 fw4Var = (fw4) this.a.get(str);
        if (fw4Var == null) {
            return null;
        }
        a81 a81Var = (a81) fw4Var.get();
        switch (a81Var.a) {
            case 0:
                return new CheatImportWorker(context, workerParameters, (xm0) ((b81) a81Var.b.c).f.get());
            case 1:
                return new RetroAchievementsSubmissionWorker(context, workerParameters, (ud5) ((b81) a81Var.b.c).n.get());
            default:
                return new RetroArchShaderInstallWorker(context, workerParameters, (gf5) ((b81) a81Var.b.c).p.get());
        }
    }
}
