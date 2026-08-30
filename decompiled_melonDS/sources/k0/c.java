package k0;

import android.util.Size;
import java.util.Comparator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7942a;

    public c(boolean z10) {
        this.f7942a = z10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.f7942a) {
            return signum * (-1);
        }
        return signum;
    }
}
