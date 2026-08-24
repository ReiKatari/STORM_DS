package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd7  reason: default package */
/* loaded from: classes.dex */
public class bd7 extends defpackage.yc7 {
    public bd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.e()
        L8:
            boolean r0 = r4.F()
            if (r0 == 0) goto L21
            int r0 = r4.Z()     // Catch: java.lang.NumberFormatException -> L1a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1a
            r3.add(r0)     // Catch: java.lang.NumberFormatException -> L1a
            goto L8
        L1a:
            r3 = move-exception
            ne3 r4 = new ne3
            r4.<init>(r3)
            throw r4
        L21:
            r4.r()
            int r4 = r3.size()
            java.util.concurrent.atomic.AtomicIntegerArray r0 = new java.util.concurrent.atomic.AtomicIntegerArray
            r0.<init>(r4)
            r1 = 0
        L2e:
            if (r1 >= r4) goto L40
            java.lang.Object r2 = r3.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.set(r1, r2)
            int r1 = r1 + 1
            goto L2e
        L40:
            return r0
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerArray r5 = (java.util.concurrent.atomic.AtomicIntegerArray) r5
            r4.h()
            int r3 = r5.length()
            r0 = 0
        La:
            if (r0 >= r3) goto L17
            int r1 = r5.get(r0)
            long r1 = (long) r1
            r4.X(r1)
            int r0 = r0 + 1
            goto La
        L17:
            r4.r()
            return
    }
}
