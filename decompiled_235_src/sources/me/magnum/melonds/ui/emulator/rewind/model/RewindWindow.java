package me.magnum.melonds.ui.emulator.rewind.model;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RewindWindow {
    public static final int $stable = 8;
    public static final xp5 Companion = new Object();
    private static final int FRAMES_PER_SECOND = 60;
    private final int currentEmulationFrame;
    private final ArrayList<RewindSaveState> rewindStates;

    public RewindWindow(int i, ArrayList<RewindSaveState> arrayList) {
        arrayList.getClass();
        this.currentEmulationFrame = i;
        this.rewindStates = arrayList;
    }

    public final int getCurrentEmulationFrame() {
        return this.currentEmulationFrame;
    }

    /* renamed from: getDeltaFromEmulationTimeToRewindState-5sfh64U  reason: not valid java name */
    public final long m5getDeltaFromEmulationTimeToRewindState5sfh64U(RewindSaveState rewindSaveState) {
        rewindSaveState.getClass();
        jd1 jd1Var = oq1.B;
        return n16.M(((this.currentEmulationFrame - rewindSaveState.getFrame()) / 60.0f) * 1000.0f, uq1.MILLISECONDS);
    }

    public final ArrayList<RewindSaveState> getRewindStates() {
        return this.rewindStates;
    }
}
