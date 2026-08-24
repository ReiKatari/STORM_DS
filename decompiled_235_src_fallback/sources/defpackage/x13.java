package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x13  reason: default package */
/* loaded from: classes.dex */
public final class x13 extends defpackage.gk2 {
    public final /* synthetic */ int R;
    public final java.lang.Object X;

    public x13(defpackage.s23 r2) {
            r1 = this;
            r0 = 1
            r1.R = r0
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.X = r2
            return
    }

    public x13(defpackage.s23 r2, defpackage.y13 r3) {
            r1 = this;
            r0 = 0
            r1.R = r0
            r1.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.X = r2
            w13 r2 = new w13
            r2.<init>(r1, r0)
            r1.e(r2)
            return
    }

    @Override // defpackage.gk2, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            int r0 = r2.R
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.close()
            return
        L9:
            java.lang.Object r0 = r2.X
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L17
            super.close()
        L17:
            return
    }
}
