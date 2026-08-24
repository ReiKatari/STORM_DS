package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: me0  reason: default package */
/* loaded from: classes.dex */
public interface me0 extends hh7, AutoCloseable {
    boolean E();

    bf0 L();

    Integer Q(ArrayList arrayList, vc0 vc0Var);

    boolean V(List list);

    boolean W();

    Integer d0(CaptureRequest captureRequest, vc0 vc0Var);

    Surface getInputSurface();

    Integer i(CaptureRequest captureRequest, vc0 vc0Var);

    Integer o(ArrayList arrayList, vc0 vc0Var);
}
