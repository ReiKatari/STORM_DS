package jb;

import a0.j;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f7793a = new HashSet();

    public final void a() {
        if (d0.d.f3345f == null) {
            d0.d.f3345f = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == d0.d.f3345f) {
            Iterator it = this.f7793a.iterator();
            if (!it.hasNext()) {
                return;
            }
            throw w.d.k(it);
        }
        j.p("Must be called on the Main thread.");
    }
}
