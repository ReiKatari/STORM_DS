package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xp {
    public static /* synthetic */ OutputConfiguration f(int i, Size size) {
        return new OutputConfiguration(i, size);
    }

    public static /* synthetic */ SessionConfiguration g(int i, List list) {
        return new SessionConfiguration(i, list);
    }
}
