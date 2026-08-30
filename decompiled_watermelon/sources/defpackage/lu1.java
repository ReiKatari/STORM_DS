package defpackage;

import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lu1  reason: default package */
/* loaded from: classes.dex */
public final class lu1 extends pu1 {
    public final RewindWindow a;

    public lu1(RewindWindow rewindWindow) {
        rewindWindow.getClass();
        this.a = rewindWindow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lu1) && b53.x(this.a, ((lu1) obj).a)) {
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
