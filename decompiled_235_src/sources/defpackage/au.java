package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillManager$AutofillCallback;
import android.view.autofill.AutofillValue;
import java.lang.invoke.MethodHandles;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: au  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class au {
    public static /* bridge */ /* synthetic */ boolean A(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public static /* bridge */ /* synthetic */ void B(AutofillManager autofillManager, AutofillManager$AutofillCallback autofillManager$AutofillCallback) {
        autofillManager.registerCallback(autofillManager$AutofillCallback);
    }

    public static /* bridge */ /* synthetic */ boolean C(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public static /* bridge */ /* synthetic */ boolean D(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public static /* bridge */ /* synthetic */ AutofillId b(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager$AutofillCallback c(Object obj) {
        return (AutofillManager$AutofillCallback) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ String h(Class cls) {
        return cls.getTypeName();
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup k(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* bridge */ /* synthetic */ void n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }

    public static /* bridge */ /* synthetic */ void p(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static /* bridge */ /* synthetic */ void q(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static /* bridge */ /* synthetic */ void u(AutofillManager autofillManager, AutofillManager$AutofillCallback autofillManager$AutofillCallback) {
        autofillManager.unregisterCallback(autofillManager$AutofillCallback);
    }
}
