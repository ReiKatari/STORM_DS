package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import y7.b;
import zb.q;
import zi.e;
import zi.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class PlatformInitializer implements b {
    @Override // y7.b
    public final List a() {
        return q.A;
    }

    @Override // y7.b
    public final Object b(Context context) {
        e eVar;
        context.getClass();
        f fVar = f.f15151a;
        f fVar2 = f.f15151a;
        if (fVar2 != null) {
            eVar = (e) fVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.a(context);
        }
        return f.f15151a;
    }
}
