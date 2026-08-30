package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wv0  reason: default package */
/* loaded from: classes.dex */
public abstract class wv0 {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
