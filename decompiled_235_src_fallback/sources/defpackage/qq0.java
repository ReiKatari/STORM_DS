package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq0  reason: default package */
/* loaded from: classes.dex */
public final class qq0 implements defpackage.oq0, android.view.Choreographer$VsyncCallback {
    public final defpackage.om2 A;
    public boolean B;

    public qq0(defpackage.om2 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.oq0
    public final void a() {
            r1 = this;
            r0 = 0
            r1.B = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            defpackage.o2.C(r0, r1)
            return
    }

    @Override // defpackage.oq0
    public final void b() {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.B = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            defpackage.o2.t(r0, r1)
            return
    }

    public final void onVsync(android.view.Choreographer.FrameData r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r4.B
            if (r0 != 0) goto L8
            goto L3a
        L8:
            android.view.Choreographer$FrameTimeline r0 = defpackage.o2.g(r5)
            long r0 = defpackage.o2.c(r0)
            long r2 = defpackage.o2.b(r5)
            long r0 = r0 - r2
            r2 = 13333333(0xcb7355, double:6.587542E-317)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L29
            android.view.Choreographer$FrameTimeline r5 = defpackage.o2.g(r5)
            long r0 = defpackage.o2.c(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L2a
        L29:
            r5 = 0
        L2a:
            om2 r0 = r4.A
            r0.a(r5)
            boolean r5 = r4.B
            if (r5 == 0) goto L3a
            android.view.Choreographer r5 = android.view.Choreographer.getInstance()
            defpackage.o2.t(r5, r4)
        L3a:
            return
    }
}
