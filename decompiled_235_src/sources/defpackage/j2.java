package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j2 {
    public static /* synthetic */ SessionConfiguration c(int i, ArrayList arrayList, Executor executor, zd zdVar) {
        return new SessionConfiguration(i, arrayList, executor, zdVar);
    }

    public static /* bridge */ /* synthetic */ SessionConfiguration d(Object obj) {
        return (SessionConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout f(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
