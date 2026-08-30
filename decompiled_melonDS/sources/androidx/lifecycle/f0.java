package androidx.lifecycle;

import android.os.Looper;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class f0 extends d0 {
    @Override // androidx.lifecycle.d0
    public final void h(Object obj) {
        d0.a("setValue");
        this.f1466g++;
        this.f1464e = obj;
        b(null);
    }

    public final void i(Object obj) {
        boolean z10;
        synchronized (this.f1460a) {
            if (this.f1465f == d0.f1459k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f1465f = obj;
        }
        if (!z10) {
            return;
        }
        r.a D = r.a.D();
        b0 b0Var = this.f1469j;
        r.b bVar = D.f12557b;
        if (bVar.f12560d == null) {
            synchronized (bVar.f12558b) {
                try {
                    if (bVar.f12560d == null) {
                        bVar.f12560d = r.b.D(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f12560d.post(b0Var);
    }
}
