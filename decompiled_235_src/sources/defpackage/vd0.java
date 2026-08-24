package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.work.impl.WorkDatabase;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vd0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ vd0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        Object obj = this.X;
        Object obj2 = this.R;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                ((ti0) obj4).a.onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
                return;
            case 1:
                ((ti0) obj4).a.onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
                return;
            default:
                List<e66> list = (List) obj4;
                gw7 gw7Var = (gw7) obj3;
                az0 az0Var = (az0) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                for (e66 e66Var : list) {
                    e66Var.d(gw7Var.a);
                }
                h66.b(az0Var, workDatabase, list);
                return;
        }
    }
}
