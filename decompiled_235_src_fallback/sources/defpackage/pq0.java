package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq0  reason: default package */
/* loaded from: classes.dex */
public final class pq0 implements defpackage.oq0, android.view.Choreographer.FrameCallback {
    public final defpackage.om2 A;
    public boolean B;
    public long L;
    public int R;
    public long X;
    public final long[] Y;

    public pq0(defpackage.om2 r3) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r0 = 16666666(0xfe502a, double:8.234427E-317)
            r2.L = r0
            r3 = 11
            long[] r3 = new long[r3]
            r2.Y = r3
            return
    }

    @Override // defpackage.oq0
    public final void a() {
            r1 = this;
            r0 = 0
            r1.B = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.removeFrameCallback(r1)
            return
    }

    @Override // defpackage.oq0
    public final void b() {
            r2 = this;
            boolean r0 = r2.B
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.B = r0
            r0 = 16666666(0xfe502a, double:8.234427E-317)
            r2.L = r0
            r0 = 0
            r2.X = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.postFrameCallback(r2)
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r6) {
            r5 = this;
            boolean r0 = r5.B
            if (r0 != 0) goto L5
            goto L5a
        L5:
            long r0 = r5.X
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2d
            int r2 = r5.R
            int r3 = r2 + 1
            r5.R = r3
            long r0 = r6 - r0
            long[] r4 = r5.Y
            r4[r2] = r0
            int r0 = r4.length
            if (r3 != r0) goto L2d
            int r0 = r4.length
            r1 = 1
            if (r0 <= r1) goto L23
            java.util.Arrays.sort(r4)
        L23:
            int r0 = r4.length
            int r0 = r0 / 2
            r0 = r4[r0]
            r5.L = r0
            r0 = 0
            r5.R = r0
        L2d:
            r5.X = r6
            long r0 = r5.L
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 13333333(0xcb7355, double:6.587542E-317)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L3e
            goto L3f
        L3e:
            r2 = r1
        L3f:
            if (r2 == 0) goto L4a
            long r0 = r2.longValue()
            long r0 = r0 + r6
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L4a:
            om2 r6 = r5.A
            r6.a(r1)
            boolean r6 = r5.B
            if (r6 == 0) goto L5a
            android.view.Choreographer r6 = android.view.Choreographer.getInstance()
            r6.postFrameCallback(r5)
        L5a:
            return
    }
}
