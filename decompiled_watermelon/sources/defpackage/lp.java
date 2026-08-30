package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lp  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lp {
    public static /* synthetic */ OutputConfiguration f(int i, Size size) {
        return new OutputConfiguration(i, size);
    }

    public static /* synthetic */ SessionConfiguration g(int i, List list) {
        return new SessionConfiguration(i, list);
    }
}
