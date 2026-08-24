package me.magnum.melonds.ui.emulator.rewind.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RewindWindow {
    public static final int $stable = 8;
    public static final defpackage.xp5 Companion = null;
    private static final int FRAMES_PER_SECOND = 60;
    private final int currentEmulationFrame;
    private final java.util.ArrayList<me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState> rewindStates;

    static {
            xp5 r0 = new xp5
            r0.<init>()
            me.magnum.melonds.ui.emulator.rewind.model.RewindWindow.Companion = r0
            return
    }

    public RewindWindow(int r1, java.util.ArrayList<me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState> r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.currentEmulationFrame = r1
            r0.rewindStates = r2
            return
    }

    public final int getCurrentEmulationFrame() {
            r0 = this;
            int r0 = r0.currentEmulationFrame
            return r0
    }

    /* renamed from: getDeltaFromEmulationTimeToRewindState-5sfh64U  reason: not valid java name */
    public final long m5getDeltaFromEmulationTimeToRewindState5sfh64U(me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r2) {
            r1 = this;
            r2.getClass()
            int r1 = r1.currentEmulationFrame
            int r2 = r2.getFrame()
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = 1114636288(0x42700000, float:60.0)
            float r1 = r1 / r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r2
            jd1 r2 = defpackage.oq1.B
            long r1 = (long) r1
            uq1 r0 = defpackage.uq1.MILLISECONDS
            long r1 = defpackage.n16.M(r1, r0)
            return r1
    }

    public final java.util.ArrayList<me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState> getRewindStates() {
            r0 = this;
            java.util.ArrayList<me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState> r0 = r0.rewindStates
            return r0
    }
}
