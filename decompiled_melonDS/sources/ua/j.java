package ua;

import androidx.fragment.app.b2;
import java.io.IOException;
import xa.g1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            cb.c cVar = new cb.c(new b2(sb2));
            cVar.I(q.LENIENT);
            g1.f14492z.getClass();
            xa.n.f(cVar, this);
            return sb2.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
