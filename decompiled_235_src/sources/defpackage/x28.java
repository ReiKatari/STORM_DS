package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x28  reason: default package */
/* loaded from: classes.dex */
public class x28 extends Handler {
    private final Looper zza;

    public x28(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public x28(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
