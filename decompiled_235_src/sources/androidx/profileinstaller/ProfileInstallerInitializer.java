package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements j53 {
    @Override // defpackage.j53
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.j53
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new kv2(this, context.getApplicationContext()));
        return new Object();
    }
}
