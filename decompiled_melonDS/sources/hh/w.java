package hh;

import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends z {

    /* renamed from: a  reason: collision with root package name */
    public final RewindWindow f6583a;

    public w(RewindWindow rewindWindow) {
        rewindWindow.getClass();
        this.f6583a = rewindWindow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && nc.k.a(this.f6583a, ((w) obj).f6583a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6583a.hashCode();
    }

    public final String toString() {
        return "ShowRewindWindow(rewindWindow=" + this.f6583a + ")";
    }
}
