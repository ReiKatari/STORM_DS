package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow7  reason: default package */
/* loaded from: classes.dex */
public final class ow7 {
    public final defpackage.zb6 a;
    public final defpackage.n61 b;
    public final android.os.Handler c;
    public final defpackage.ec3 d;

    public ow7(java.util.concurrent.ExecutorService r3) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.c = r0
            ec3 r0 = new ec3
            r0.<init>(r2)
            r2.d = r0
            zb6 r0 = new zb6
            r1 = 0
            r0.<init>(r3, r1)
            r2.a = r0
            n61 r3 = defpackage.f04.F(r0)
            r2.b = r3
            return
    }
}
