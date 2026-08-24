package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final t84 L = new t84(this);
    public final s84 R = new s84(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.R;
    }
}
