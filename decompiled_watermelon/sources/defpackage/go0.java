package defpackage;

import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: go0  reason: default package */
/* loaded from: classes.dex */
public final class go0 implements eo0, Choreographer$VsyncCallback {
    public final oh2 A;
    public boolean B;

    public go0(oh2 oh2Var) {
        this.A = oh2Var;
    }

    @Override // defpackage.eo0
    public final void a() {
        this.B = false;
        Choreographer.getInstance().removeVsyncCallback(this);
    }

    @Override // defpackage.eo0
    public final void b() {
        if (this.B) {
            return;
        }
        this.B = true;
        Choreographer.getInstance().postVsyncCallback(this);
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        Choreographer.FrameTimeline preferredFrameTimeline;
        long deadlineNanos;
        long frameTimeNanos;
        Long l;
        Choreographer.FrameTimeline preferredFrameTimeline2;
        long deadlineNanos2;
        frameData.getClass();
        if (this.B) {
            preferredFrameTimeline = frameData.getPreferredFrameTimeline();
            deadlineNanos = preferredFrameTimeline.getDeadlineNanos();
            frameTimeNanos = frameData.getFrameTimeNanos();
            if (deadlineNanos - frameTimeNanos > 13333333) {
                preferredFrameTimeline2 = frameData.getPreferredFrameTimeline();
                deadlineNanos2 = preferredFrameTimeline2.getDeadlineNanos();
                l = Long.valueOf(deadlineNanos2);
            } else {
                l = null;
            }
            this.A.a(l);
            if (this.B) {
                Choreographer.getInstance().postVsyncCallback(this);
            }
        }
    }
}
