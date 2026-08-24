package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker;
import me.magnum.melonds.common.workers.RetroArchShaderInstallWorker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx2  reason: default package */
/* loaded from: classes.dex */
public final class rx2 extends is7 {
    public final Map a;

    public rx2(Map map) {
        this.a = map;
    }

    @Override // defpackage.is7
    public final nx3 g(Context context, String str, WorkerParameters workerParameters) {
        n55 n55Var = (n55) this.a.get(str);
        if (n55Var == null) {
            return null;
        }
        rb1 rb1Var = (rb1) n55Var.get();
        switch (rb1Var.a) {
            case 0:
                return new CheatImportWorker(context, workerParameters, (hp0) ((sb1) rb1Var.b.c).f.get());
            case 1:
                return new RetroAchievementsSubmissionWorker(context, workerParameters, (pn5) ((sb1) rb1Var.b.c).n.get());
            default:
                return new RetroArchShaderInstallWorker(context, workerParameters, (cp5) ((sb1) rb1Var.b.c).p.get());
        }
    }
}
