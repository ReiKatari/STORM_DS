package q8;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                List<f> list = (List) this.B;
                x8.i iVar = (x8.i) this.L;
                p8.b bVar = (p8.b) this.R;
                WorkDatabase workDatabase = (WorkDatabase) this.X;
                for (f fVar : list) {
                    fVar.a(iVar.f14391a);
                }
                i.b(bVar, workDatabase, list);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((CameraCaptureSession.CaptureCallback) ((a0.k) this.B).f9b).onCaptureCompleted((CameraCaptureSession) this.L, (CaptureRequest) this.R, (TotalCaptureResult) this.X);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((a0.k) this.B).f9b).onCaptureProgressed((CameraCaptureSession) this.L, (CaptureRequest) this.R, (CaptureResult) this.X);
                return;
            default:
                ((CameraCaptureSession.CaptureCallback) ((a0.k) this.B).f9b).onCaptureFailed((CameraCaptureSession) this.L, (CaptureRequest) this.R, (CaptureFailure) this.X);
                return;
        }
    }
}
