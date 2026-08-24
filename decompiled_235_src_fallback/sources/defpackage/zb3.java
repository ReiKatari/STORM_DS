package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb3  reason: default package */
/* loaded from: classes.dex */
public final class zb3 {
    public final defpackage.m16 a;
    public final defpackage.nc7 b;
    public final java.util.LinkedHashMap c;
    public final java.util.concurrent.locks.ReentrantLock d;
    public final defpackage.ns1 e;
    public final defpackage.ns1 f;
    public final java.lang.Object g;

    public zb3(defpackage.m16 r12, java.util.LinkedHashMap r13, java.util.LinkedHashMap r14, java.lang.String... r15) {
            r11 = this;
            r11.<init>()
            r11.a = r12
            nc7 r9 = new nc7
            boolean r10 = r12.k
            a0 r0 = new a0
            r7 = 0
            r8 = 23
            r1 = 1
            java.lang.Class<zb3> r3 = defpackage.zb3.class
            java.lang.String r4 = "notifyInvalidatedObservers"
            java.lang.String r5 = "notifyInvalidatedObservers(Ljava/util/Set;)V"
            r6 = 0
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r0
            r0 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.b = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r11.c = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r11.d = r1
            ns1 r1 = new ns1
            r2 = 23
            r1.<init>(r11, r2)
            r11.e = r1
            ns1 r1 = new ns1
            r2 = 24
            r1.<init>(r11, r2)
            r11.f = r1
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r1.getClass()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r11.g = r1
            er2 r1 = new er2
            r2 = 6
            r1.<init>(r11, r2)
            r0.k = r1
            return
    }

    public final java.lang.Object a(defpackage.hw6 r1) {
            r0 = this;
            nc7 r0 = r0.b
            java.lang.Object r0 = r0.f(r1)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Lb
            return r0
        Lb:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
