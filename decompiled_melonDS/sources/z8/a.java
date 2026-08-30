package z8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import k7.a0;
import l0.e;
import zc.q;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f14969a;

    /* renamed from: b  reason: collision with root package name */
    public final q f14970b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f14971c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final e f14972d = new e(2, this);

    public a(ExecutorService executorService) {
        a0 a0Var = new a0(executorService, 1);
        this.f14969a = a0Var;
        this.f14970b = x.l(a0Var);
    }
}
