package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nh7  reason: default package */
/* loaded from: classes.dex */
public final class nh7 {
    public final k06 a;
    public final g31 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final kr2 d = new kr2(this);

    public nh7(ExecutorService executorService) {
        k06 k06Var = new k06(executorService, 0);
        this.a = k06Var;
        this.b = w81.n(k06Var);
    }
}
