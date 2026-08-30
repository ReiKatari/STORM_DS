package k7;

import android.os.Handler;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ int A = 1;
    public Object B;
    public Object L;
    public Object R;

    public u(zc.h hVar, t tVar, v vVar) {
        this.B = hVar;
        this.L = tVar;
        this.R = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.A) {
            case 0:
                zc.h hVar = (zc.h) this.B;
                try {
                    zc.x.z(hVar.X.m(cc.d.A), new a9.d((t) this.L, hVar, (v) this.R, (cc.c) null, 17));
                    return;
                } catch (Throwable th2) {
                    hVar.n(th2);
                    return;
                }
            default:
                try {
                    obj = ((v5.d) this.B).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.R).post(new m0.h(9, (r0.e) this.L, obj));
                return;
        }
    }

    public /* synthetic */ u() {
    }
}
