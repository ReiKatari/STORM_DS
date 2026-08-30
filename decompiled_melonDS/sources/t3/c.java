package t3;

import android.view.KeyEvent;
import b3.p;
import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {
    public static final long a(int i2) {
        long j2 = (i2 << 32) | (0 & 4294967295L);
        int i10 = a.N;
        return j2;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static final p d(p pVar, l lVar) {
        return pVar.f(new d(lVar, null));
    }

    public static final p e(p pVar, l lVar) {
        return pVar.f(new d(null, lVar));
    }
}
