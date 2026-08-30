package defpackage;

import android.hardware.camera2.CameraCaptureSession;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qb0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qb0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ qb0(Object obj, Object obj2, long j, int i) {
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
                ((kg0) obj2).a.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                return;
            default:
                ((ra5) obj2).B((gb5) obj, j);
                return;
        }
    }
}
