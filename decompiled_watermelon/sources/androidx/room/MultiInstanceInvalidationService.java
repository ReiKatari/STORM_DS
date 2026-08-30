package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final o04 L = new o04(this);
    public final n04 R = new n04(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.R;
    }
}
