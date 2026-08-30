package u5;

import c8.i;
import c8.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13486a;

    /* renamed from: b  reason: collision with root package name */
    public i f13487b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13488c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f13486a) {
                    return;
                }
                this.f13486a = true;
                this.f13488c = true;
                i iVar = this.f13487b;
                if (iVar != null) {
                    try {
                        Runnable runnable = (Runnable) iVar.B;
                        t tVar = (t) iVar.R;
                        Runnable runnable2 = (Runnable) iVar.L;
                        if (runnable == null) {
                            tVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f13488c = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f13488c = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
