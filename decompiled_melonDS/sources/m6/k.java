package m6;

import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends k7.w {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k7.w f9285j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f9286k;

    public k(k7.w wVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f9285j = wVar;
        this.f9286k = threadPoolExecutor;
    }

    @Override // k7.w
    public final void x(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f9286k;
        try {
            this.f9285j.x(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // k7.w
    public final void y(b9.e eVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f9286k;
        try {
            this.f9285j.y(eVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
