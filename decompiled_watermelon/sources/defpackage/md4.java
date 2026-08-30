package defpackage;

import android.os.HandlerThread;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md4  reason: default package */
/* loaded from: classes.dex */
public final class md4 extends HandlerThread {
    public og1 A;
    public volatile boolean B;
    public boolean L;
    public final o23 R;
    public final ci3 X;
    public final /* synthetic */ od4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [o23, java.lang.Object] */
    public md4(od4 od4Var) {
        super("FrameRenderThread");
        this.Y = od4Var;
        this.B = true;
        this.R = new Object();
        this.X = new ci3(9, od4Var, this);
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.A = new og1(this, getLooper(), 2);
    }
}
