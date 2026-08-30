package me.magnum.melonds.ui.emulator.rewind.model;

import java.util.ArrayList;
import kh.a;
import wc.b;
import wc.e;
import wc.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RewindWindow {
    public static final int $stable = 8;
    public static final a Companion = new Object();
    private static final int FRAMES_PER_SECOND = 60;
    private final int currentEmulationFrame;
    private final ArrayList<RewindSaveState> rewindStates;

    public RewindWindow(int i2, ArrayList<RewindSaveState> arrayList) {
        arrayList.getClass();
        this.currentEmulationFrame = i2;
        this.rewindStates = arrayList;
    }

    public final int getCurrentEmulationFrame() {
        return this.currentEmulationFrame;
    }

    /* renamed from: getDeltaFromEmulationTimeToRewindState-5sfh64U  reason: not valid java name */
    public final long m15getDeltaFromEmulationTimeToRewindState5sfh64U(RewindSaveState rewindSaveState) {
        rewindSaveState.getClass();
        float frame = ((this.currentEmulationFrame - rewindSaveState.getFrame()) / ((float) FRAMES_PER_SECOND)) * 1000;
        l7.a aVar = b.B;
        return j.m(frame, e.MILLISECONDS);
    }

    public final ArrayList<RewindSaveState> getRewindStates() {
        return this.rewindStates;
    }
}
