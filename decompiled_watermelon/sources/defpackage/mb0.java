package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.work.impl.WorkDatabase;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mb0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mb0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ mb0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
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
                ((kg0) obj4).a.onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
                return;
            case 1:
                ((kg0) obj4).a.onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
                return;
            default:
                List<zu5> list = (List) obj4;
                gh7 gh7Var = (gh7) obj3;
                ew0 ew0Var = (ew0) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                for (zu5 zu5Var : list) {
                    zu5Var.a(gh7Var.a);
                }
                bv5.b(ew0Var, workDatabase, list);
                return;
        }
    }
}
