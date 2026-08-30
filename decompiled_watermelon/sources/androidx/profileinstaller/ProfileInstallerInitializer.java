package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements gz2 {
    @Override // defpackage.gz2
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.gz2
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new jp2(this, context.getApplicationContext()));
        return new jo1(18);
    }
}
