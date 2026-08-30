package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h2 {
    public static /* bridge */ /* synthetic */ int a(OutputConfiguration outputConfiguration) {
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    public static /* synthetic */ SessionConfiguration c(int i, ArrayList arrayList, Executor executor, ld ldVar) {
        return new SessionConfiguration(i, arrayList, executor, ldVar);
    }

    public static /* bridge */ /* synthetic */ SessionConfiguration d(Object obj) {
        return (SessionConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout f(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ void p(OutputConfiguration outputConfiguration, String str) {
        outputConfiguration.setPhysicalCameraId(str);
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
