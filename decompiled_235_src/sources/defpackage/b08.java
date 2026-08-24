package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b08  reason: default package */
/* loaded from: classes.dex */
public class b08 extends Handler {
    private final Looper zaa;

    public b08(Looper looper) {
        super(looper);
        this.zaa = Looper.getMainLooper();
    }

    public b08(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zaa = Looper.getMainLooper();
    }
}
