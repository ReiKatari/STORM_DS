package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd7  reason: default package */
/* loaded from: classes.dex */
public final class cd7 extends defpackage.yc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.yc7 b;

    public /* synthetic */ cd7(defpackage.yc7 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r5) {
            r4 = this;
            int r0 = r4.a
            yc7 r4 = r4.b
            switch(r0) {
                case 0: goto L17;
                default: goto L7;
            }
        L7:
            java.lang.Object r4 = r4.b(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong
            long r0 = r4.longValue()
            r5.<init>(r0)
            return r5
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.e()
        L1f:
            boolean r1 = r5.F()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.b(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto L1f
        L37:
            r5.r()
            int r4 = r0.size()
            java.util.concurrent.atomic.AtomicLongArray r5 = new java.util.concurrent.atomic.AtomicLongArray
            r5.<init>(r4)
            r1 = 0
        L44:
            if (r1 >= r4) goto L56
            java.lang.Object r2 = r0.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r5.set(r1, r2)
            int r1 = r1 + 1
            goto L44
        L56:
            return r5
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.a
            yc7 r4 = r4.b
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            java.util.concurrent.atomic.AtomicLong r6 = (java.util.concurrent.atomic.AtomicLong) r6
            long r0 = r6.get()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r4.c(r5, r6)
            return
        L15:
            java.util.concurrent.atomic.AtomicLongArray r6 = (java.util.concurrent.atomic.AtomicLongArray) r6
            r5.h()
            int r0 = r6.length()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L2f
            long r2 = r6.get(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.c(r5, r2)
            int r1 = r1 + 1
            goto L1f
        L2f:
            r5.r()
            return
    }
}
