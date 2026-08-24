package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm4  reason: default package */
/* loaded from: classes.dex */
public final class nm4 extends android.os.HandlerThread {
    public defpackage.sk1 A;
    public volatile boolean B;
    public boolean L;
    public final defpackage.w83 R;
    public final defpackage.ap3 X;
    public final /* synthetic */ defpackage.pm4 Y;

    public nm4(defpackage.pm4 r3) {
            r2 = this;
            r2.Y = r3
            java.lang.String r0 = "FrameRenderThread"
            r2.<init>(r0)
            r0 = 1
            r2.B = r0
            w83 r0 = new w83
            r0.<init>()
            r2.R = r0
            ap3 r0 = new ap3
            r1 = 12
            r0.<init>(r1, r3, r2)
            r2.X = r0
            return
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
            r3 = this;
            android.os.Looper r0 = r3.getLooper()
            sk1 r1 = new sk1
            r2 = 2
            r1.<init>(r3, r0, r2)
            r3.A = r1
            return
    }
}
