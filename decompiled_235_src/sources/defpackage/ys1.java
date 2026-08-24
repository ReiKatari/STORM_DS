package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ys1  reason: default package */
/* loaded from: classes.dex */
public final class ys1 extends hv {
    public final /* synthetic */ hv p;
    public final /* synthetic */ ThreadPoolExecutor q;

    public ys1(hv hvVar, ThreadPoolExecutor threadPoolExecutor) {
        this.p = hvVar;
        this.q = threadPoolExecutor;
    }

    @Override // defpackage.hv
    public final void O(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.O(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.hv
    public final void P(eb ebVar) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.P(ebVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
