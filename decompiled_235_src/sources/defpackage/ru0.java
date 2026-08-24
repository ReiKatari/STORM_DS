package defpackage;

import android.util.Size;
import java.util.Comparator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru0  reason: default package */
/* loaded from: classes.dex */
public final class ru0 implements Comparator {
    public final boolean a;

    public ru0(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.a) {
            return signum * (-1);
        }
        return signum;
    }
}
