package defpackage;

import android.util.Size;
import java.util.Comparator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: es0  reason: default package */
/* loaded from: classes.dex */
public final class es0 implements Comparator {
    public final boolean a;

    public es0(boolean z) {
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
