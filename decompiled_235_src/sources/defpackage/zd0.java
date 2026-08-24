package defpackage;

import android.hardware.camera2.CameraCaptureSession;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ zd0(Object obj, Object obj2, long j, int i) {
        this.A = i;
        this.L = obj;
        this.R = obj2;
        this.B = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        long j = this.B;
        Object obj = this.R;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                ((ti0) obj2).a.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                return;
            default:
                ((jk5) obj2).n((yk5) obj, j);
                return;
        }
    }
}
