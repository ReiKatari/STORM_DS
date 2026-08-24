package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hx3 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean B;

    public /* synthetic */ hx3(java.util.concurrent.atomic.AtomicBoolean r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.B
            switch(r0) {
                case 0: goto Lc;
                default: goto L8;
            }
        L8:
            r2.set(r1)
            return
        Lc:
            r2.set(r1)
            return
    }
}
