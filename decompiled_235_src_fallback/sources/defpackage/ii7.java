package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii7  reason: default package */
/* loaded from: classes.dex */
public final class ii7 {
    public final defpackage.ej7 a;
    public final defpackage.kj7 b;
    public final defpackage.li7 c;
    public final defpackage.n55 d;
    public final defpackage.n55 e;
    public final defpackage.n55 f;
    public final int g;
    public final defpackage.sw h;
    public final defpackage.ex6 i;
    public final defpackage.ex6 j;

    public ii7(defpackage.ej7 r1, defpackage.kj7 r2, defpackage.li7 r3, defpackage.n55 r4, defpackage.n55 r5, defpackage.n55 r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            uw r1 = defpackage.ji7.a
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw.b
            int r1 = r2.incrementAndGet(r1)
            r0.g = r1
            r1 = 0
            sw r2 = defpackage.g04.s(r1)
            r0.h = r2
            java.lang.String r2 = "CXCP"
            boolean r3 = defpackage.kj2.F(r2)
            if (r3 == 0) goto L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Configured "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
        L4e:
            hi7 r2 = new hi7
            r2.<init>(r0, r1)
            ex6 r1 = new ex6
            r1.<init>(r2)
            r0.i = r1
            hi7 r1 = new hi7
            r2 = 1
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.j = r2
            hi7 r1 = new hi7
            r2 = 2
            r1.<init>(r0, r2)
            ex6 r0 = new ex6
            r0.<init>(r1)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UseCaseCamera-"
            r0.<init>(r1)
            int r2 = r2.g
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
