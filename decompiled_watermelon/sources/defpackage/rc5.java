package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rc5  reason: default package */
/* loaded from: classes.dex */
public final class rc5 {
    public final HashSet a = new HashSet();

    public final void a() {
        if (hk2.d == null) {
            hk2.d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == hk2.d) {
            Iterator it = this.a.iterator();
            if (!it.hasNext()) {
                return;
            }
            throw b31.m(it);
        }
        i.n("Must be called on the Main thread.");
    }
}
