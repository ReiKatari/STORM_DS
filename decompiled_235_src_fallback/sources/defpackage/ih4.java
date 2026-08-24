package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih4  reason: default package */
/* loaded from: classes.dex */
public final class ih4 extends defpackage.hh4 {
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r1, java.util.concurrent.Executor r2, java.util.function.IntConsumer r3) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L7
            r0.performHandwritingGesture(r1, r2, r3)
        L7:
            return
    }

    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture r1, android.os.CancellationSignal r2) {
            r0 = this;
            lf5 r0 = r0.b
            if (r0 == 0) goto L9
            boolean r0 = r0.previewHandwritingGesture(r1, r2)
            return r0
        L9:
            r0 = 0
            return r0
    }
}
