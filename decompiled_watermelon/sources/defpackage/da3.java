package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: da3  reason: default package */
/* loaded from: classes.dex */
public final class da3 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof da3) {
            if (!b53.x(this.a, ((da3) obj).a)) {
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
