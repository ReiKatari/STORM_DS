package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm5  reason: default package */
/* loaded from: classes.dex */
public final class lm5 {
    public final HashSet a = new HashSet();

    public final void a() {
        if (ej2.e == null) {
            ej2.e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == ej2.e) {
            Iterator it = this.a.iterator();
            if (!it.hasNext()) {
                return;
            }
            throw i61.j(it);
        }
        i.m("Must be called on the Main thread.");
    }
}
