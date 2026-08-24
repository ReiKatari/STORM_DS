package defpackage;

import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy1  reason: default package */
/* loaded from: classes.dex */
public final class wy1 extends az1 {
    public final RewindWindow a;

    public wy1(RewindWindow rewindWindow) {
        rewindWindow.getClass();
        this.a = rewindWindow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wy1) && nb3.k(this.a, ((wy1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowRewindWindow(rewindWindow=" + this.a + ")";
    }
}
