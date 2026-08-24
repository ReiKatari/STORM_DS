package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg3  reason: default package */
/* loaded from: classes.dex */
public final class wg3 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof wg3) {
            if (!nb3.k(this.a, ((wg3) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
