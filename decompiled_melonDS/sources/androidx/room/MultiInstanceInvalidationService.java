package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import k7.h;
import k7.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final i L = new i(this);
    public final h R = new h(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.R;
    }
}
