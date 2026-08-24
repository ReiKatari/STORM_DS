package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k2 {
    public static /* synthetic */ OutputConfiguration d(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* bridge */ /* synthetic */ AutofillManager i(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue j(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return AutofillManager.class;
    }
}
