package defpackage;

import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq0  reason: default package */
/* loaded from: classes.dex */
public final class qq0 implements oq0, Choreographer$VsyncCallback {
    public final om2 A;
    public boolean B;

    public qq0(om2 om2Var) {
        this.A = om2Var;
    }

    @Override // defpackage.oq0
    public final void a() {
        this.B = false;
        Choreographer.getInstance().removeVsyncCallback(this);
    }

    @Override // defpackage.oq0
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
