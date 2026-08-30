package me.magnum.melonds.ui.emulator.rewind.model;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RewindWindow {
    public static final int $stable = 8;
    public static final zf5 Companion = new Object();
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
    public final long m12getDeltaFromEmulationTimeToRewindState5sfh64U(RewindSaveState rewindSaveState) {
        rewindSaveState.getClass();
        hm1 hm1Var = im1.B;
        return b53.l0(((this.currentEmulationFrame - rewindSaveState.getFrame()) / 60.0f) * 1000.0f, om1.MILLISECONDS);
    }

    public final ArrayList<RewindSaveState> getRewindStates() {
        return this.rewindStates;
    }
}
