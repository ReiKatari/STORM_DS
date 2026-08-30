package ih;

import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements a, Choreographer$VsyncCallback {
    public final x0 A;

    public c(x0 x0Var) {
        this.A = x0Var;
    }

    @Override // ih.a
    public final void a() {
        Choreographer.getInstance().removeVsyncCallback(this);
    }

    @Override // ih.a
    public final void b() {
        Choreographer.getInstance().postVsyncCallback(this);
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        Choreographer.FrameTimeline preferredFrameTimeline;
        long deadlineNanos;
        long frameTimeNanos;
        Long l10;
        Choreographer.FrameTimeline preferredFrameTimeline2;
        long deadlineNanos2;
        frameData.getClass();
        preferredFrameTimeline = frameData.getPreferredFrameTimeline();
        deadlineNanos = preferredFrameTimeline.getDeadlineNanos();
        frameTimeNanos = frameData.getFrameTimeNanos();
        if (deadlineNanos - frameTimeNanos > 13333333) {
            preferredFrameTimeline2 = frameData.getPreferredFrameTimeline();
            deadlineNanos2 = preferredFrameTimeline2.getDeadlineNanos();
            l10 = Long.valueOf(deadlineNanos2);
        } else {
            l10 = null;
        }
        this.A.p(l10);
        Choreographer.getInstance().postVsyncCallback(this);
    }
}
