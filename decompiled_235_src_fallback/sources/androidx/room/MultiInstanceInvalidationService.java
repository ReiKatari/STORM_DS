package androidx.room;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends android.app.Service {
    public int A;
    public final java.util.LinkedHashMap B;
    public final defpackage.t84 L;
    public final defpackage.s84 R;

    public MultiInstanceInvalidationService() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.B = r0
            t84 r0 = new t84
            r0.<init>(r1)
            r1.L = r0
            s84 r0 = new s84
            r0.<init>(r1)
            r1.R = r0
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1.getClass()
            s84 r0 = r0.R
            return r0
    }
}
