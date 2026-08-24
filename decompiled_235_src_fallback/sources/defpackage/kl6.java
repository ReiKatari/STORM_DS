package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl6  reason: default package */
/* loaded from: classes.dex */
public final class kl6 implements android.os.Handler.Callback {
    public final /* synthetic */ defpackage.u2 a;

    public kl6(defpackage.u2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            u2 r2 = r2.a
            java.lang.Object r3 = r3.obj
            if (r3 == 0) goto L10
            defpackage.u34.a()
            return r1
        L10:
            java.lang.Object r2 = r2.b
            monitor-enter(r2)
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }
}
