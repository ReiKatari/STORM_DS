package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow7  reason: default package */
/* loaded from: classes.dex */
public final class ow7 {
    public final zb6 a;
    public final n61 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ec3 d = new ec3(this);

    public ow7(ExecutorService executorService) {
        zb6 zb6Var = new zb6(executorService, 0);
        this.a = zb6Var;
        this.b = f04.F(zb6Var);
    }
}
