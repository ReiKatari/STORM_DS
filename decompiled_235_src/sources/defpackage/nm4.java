package defpackage;

import android.os.HandlerThread;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm4  reason: default package */
/* loaded from: classes.dex */
public final class nm4 extends HandlerThread {
    public sk1 A;
    public volatile boolean B;
    public boolean L;
    public final w83 R;
    public final ap3 X;
    public final /* synthetic */ pm4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [w83, java.lang.Object] */
    public nm4(pm4 pm4Var) {
        super("FrameRenderThread");
        this.Y = pm4Var;
        this.B = true;
        this.R = new Object();
        this.X = new ap3(12, pm4Var, this);
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.A = new sk1(this, getLooper(), 2);
    }
}
