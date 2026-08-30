package s6;

import android.content.Context;
import androidx.work.WorkerParameters;
import cf.b;
import java.util.Map;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker;
import nb.c;
import p7.n;
import p8.u;
import rd.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d  reason: collision with root package name */
    public final Map f12834d;

    public a(Map map) {
        this.f12834d = map;
    }

    @Override // p7.n
    public final u f(Context context, String str, WorkerParameters workerParameters) {
        c cVar = (c) this.f12834d.get(str);
        if (cVar == null) {
            return null;
        }
        e eVar = (e) cVar.get();
        switch (eVar.f12659a) {
            case 0:
                return new CheatImportWorker(context, workerParameters, (cf.a) eVar.f12660b.f12661a.f12666d.get());
            default:
                return new RetroAchievementsSubmissionWorker(context, workerParameters, (b) eVar.f12660b.f12661a.f12673k.get());
        }
    }
}
