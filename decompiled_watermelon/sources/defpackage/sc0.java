package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sc0  reason: default package */
/* loaded from: classes.dex */
public interface sc0 extends m37 {
    CaptureRequest.Builder B(TotalCaptureResult totalCaptureResult);

    boolean C(g03 g03Var, ArrayList arrayList, cc0 cc0Var);

    void D();

    void F(int i);

    void J();

    boolean R(s32 s32Var);

    boolean T(g16 g16Var);

    CaptureRequest.Builder V(int i);

    boolean Z(ArrayList arrayList, cc0 cc0Var);

    boolean d(List list, cc0 cc0Var);

    boolean i(ArrayList arrayList, cc0 cc0Var);

    boolean j0(InputConfiguration inputConfiguration, ArrayList arrayList, cc0 cc0Var);

    String w();
}
