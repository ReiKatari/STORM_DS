package androidx.profileinstaller;

import ad.f;
import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import y7.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // y7.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // y7.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new f(this, context.getApplicationContext()));
        return new Object();
    }
}
