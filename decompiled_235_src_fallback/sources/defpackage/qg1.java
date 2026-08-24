package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg1  reason: default package */
/* loaded from: classes.dex */
public final class qg1 implements defpackage.li7 {
    public final defpackage.n55 a;
    public final defpackage.kj7 b;
    public volatile defpackage.ri7 c;
    public final java.util.concurrent.atomic.AtomicBoolean d;

    public qg1(defpackage.n55 r1, defpackage.kj7 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.d = r1
            return
    }

    public static final defpackage.ri7 k(defpackage.qg1 r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.d
            boolean r0 = r0.get()
            if (r0 != 0) goto L2e
            ri7 r0 = r2.c
            if (r0 == 0) goto Ld
            return r0
        Ld:
            n55 r0 = r2.a
            java.lang.Object r0 = r0.get()
            ri7 r0 = (defpackage.ri7) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.d
            boolean r1 = r1.get()
            if (r1 != 0) goto L23
            r2.c = r0
            r0.getClass()
            return r0
        L23:
            r0.close()
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "UseCaseCameraRequestControl closed during initialization"
            r2.<init>(r0)
            throw r2
        L2e:
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "UseCaseCameraRequestControl is closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // defpackage.li7
    public final defpackage.jg1 a() {
            r4 = this;
            ri7 r0 = r4.c
            if (r0 == 0) goto L9
            jg1 r4 = r0.a()
            return r4
        L9:
            kj7 r0 = r4.b
            o41 r0 = r0.f
            ng1 r1 = new ng1
            r2 = 2
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            kg1 r4 = defpackage.hv.i(r0, r3, r3, r1, r4)
            return r4
    }

    @Override // defpackage.li7
    public final java.lang.Object c(defpackage.hw6 r5) {
            r4 = this;
            ri7 r0 = r4.c
            if (r0 == 0) goto L9
            java.lang.Object r4 = r0.c(r5)
            return r4
        L9:
            kj7 r0 = r4.b
            s37 r0 = r0.e
            n61 r0 = defpackage.f04.F(r0)
            ng1 r1 = new ng1
            r2 = 0
            r3 = 0
            r1.<init>(r4, r2, r3)
            java.lang.Object r4 = defpackage.hv.d0(r0, r1, r5)
            return r4
    }

    @Override // defpackage.li7
    public final void close() {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.d
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            return
        La:
            kj7 r0 = r4.b
            o41 r0 = r0.f
            y3 r1 = new y3
            r2 = 8
            r3 = 0
            r1.<init>(r3, r4, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    @Override // defpackage.li7
    public final defpackage.jg1 d(defpackage.kd0 r8, java.util.Map r9) {
            r7 = this;
            ri7 r0 = r7.c
            if (r0 == 0) goto L9
            jg1 r7 = r0.d(r8, r9)
            return r7
        L9:
            kj7 r0 = r7.b
            o41 r0 = r0.f
            b0 r1 = new b0
            r6 = 23
            r3 = 0
            r2 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7 = 3
            kg1 r7 = defpackage.hv.i(r0, r3, r3, r1, r7)
            return r7
    }

    @Override // defpackage.li7
    public final defpackage.jg1 e(int r4) {
            r3 = this;
            ri7 r0 = r3.c
            if (r0 == 0) goto L9
            jg1 r3 = r0.e(r4)
            return r3
        L9:
            kj7 r0 = r3.b
            o41 r0 = r0.f
            l7 r1 = new l7
            r2 = 0
            r1.<init>(r3, r2, r4)
            r3 = 3
            kg1 r3 = defpackage.hv.i(r0, r2, r2, r1, r3)
            return r3
    }

    @Override // defpackage.li7
    public final defpackage.jg1 f(java.util.List r8, defpackage.ki7 r9) {
            r7 = this;
            r9.getClass()
            ri7 r0 = r7.c
            if (r0 == 0) goto Lc
            jg1 r7 = r0.f(r8, r9)
            return r7
        Lc:
            kj7 r0 = r7.b
            o41 r0 = r0.f
            b0 r1 = new b0
            r6 = 22
            r3 = 0
            r2 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7 = 3
            kg1 r7 = defpackage.hv.i(r0, r3, r3, r1, r7)
            return r7
    }

    @Override // defpackage.li7
    public final defpackage.jg1 g(java.util.LinkedHashSet r4, boolean r5) {
            r3 = this;
            ri7 r0 = r3.c
            if (r0 == 0) goto L9
            jg1 r3 = r0.g(r4, r5)
            return r3
        L9:
            kj7 r0 = r3.b
            o41 r0 = r0.f
            pg1 r1 = new pg1
            r2 = 0
            r1.<init>(r3, r2, r5, r4)
            r3 = 3
            kg1 r3 = defpackage.hv.i(r0, r2, r2, r1, r3)
            return r3
    }

    @Override // defpackage.li7
    public final defpackage.jg1 h(java.util.Map r9, defpackage.ki7 r10, defpackage.xy0 r11) {
            r8 = this;
            r10.getClass()
            r11.getClass()
            ri7 r0 = r8.c
            if (r0 == 0) goto Lf
            jg1 r8 = r0.h(r9, r10, r11)
            return r8
        Lf:
            kj7 r0 = r8.b
            o41 r0 = r0.f
            og1 r1 = new og1
            r3 = 0
            r7 = 1
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 3
            r9 = 0
            kg1 r8 = defpackage.hv.i(r0, r9, r9, r1, r8)
            return r8
    }

    @Override // defpackage.li7
    public final defpackage.jg1 i(java.util.Map r9, defpackage.ki7 r10, defpackage.xy0 r11) {
            r8 = this;
            r10.getClass()
            r11.getClass()
            ri7 r0 = r8.c
            if (r0 == 0) goto Lf
            jg1 r8 = r0.i(r9, r10, r11)
            return r8
        Lf:
            kj7 r0 = r8.b
            o41 r0 = r0.f
            og1 r1 = new og1
            r3 = 0
            r7 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 3
            r9 = 0
            kg1 r8 = defpackage.hv.i(r0, r9, r9, r1, r8)
            return r8
    }

    @Override // defpackage.li7
    public final defpackage.jg1 j() {
            r4 = this;
            ri7 r0 = r4.c
            if (r0 == 0) goto L9
            jg1 r4 = r0.j()
            return r4
        L9:
            kj7 r0 = r4.b
            o41 r0 = r0.f
            ng1 r1 = new ng1
            r2 = 1
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            kg1 r4 = defpackage.hv.i(r0, r3, r3, r1, r4)
            return r4
    }
}
