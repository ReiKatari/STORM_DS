package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i2 {
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
