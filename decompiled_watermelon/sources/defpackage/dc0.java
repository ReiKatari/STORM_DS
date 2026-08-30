package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dc0  reason: default package */
/* loaded from: classes.dex */
public interface dc0 extends m37, AutoCloseable {
    boolean A();

    boolean U();

    Integer X(CaptureRequest captureRequest, na0 na0Var);

    sc0 g0();

    Surface getInputSurface();

    Integer k(CaptureRequest captureRequest, na0 na0Var);

    Integer o(ArrayList arrayList, na0 na0Var);

    Integer y(ArrayList arrayList, na0 na0Var);

    boolean z(List list);
}
