package bd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends h {

    /* renamed from: e0  reason: collision with root package name */
    public final a f2193e0;

    public s(int i2, a aVar) {
        super(i2);
        this.f2193e0 = aVar;
        if (aVar != a.SUSPEND) {
            if (i2 >= 1) {
                return;
            }
            a0.j.e(w.d.m("Buffered channel capacity must be at least 1, but ", i2, " was specified"));
            throw null;
        }
        fj.j.m(nc.u.a(h.class).c(), " instead", "This implementation does not support suspension for senders, use ");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(boolean r17, java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r16
            bd.a r1 = r0.f2193e0
            bd.a r2 = bd.a.DROP_LATEST
            yb.y r8 = yb.y.f14813a
            if (r1 != r2) goto L1b
            r3 = r18
            java.lang.Object r1 = super.a(r3)
            boolean r2 = r1 instanceof bd.n
            if (r2 == 0) goto L1a
            boolean r2 = r1 instanceof bd.m
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r8
        L1a:
            return r1
        L1b:
            r3 = r18
            a0.c r6 = bd.j.f2172d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = bd.h.Y
            java.lang.Object r1 = r1.get(r0)
            bd.p r1 = (bd.p) r1
        L27:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = bd.h.B
            long r4 = r2.getAndIncrement(r0)
            r9 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r9 & r4
            r2 = 0
            boolean r7 = r0.w(r4, r2)
            int r11 = bd.j.f2170b
            long r12 = (long) r11
            long r4 = r9 / r12
            long r14 = r9 % r12
            int r2 = (int) r14
            long r14 = r1.L
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L59
            bd.p r4 = bd.h.c(r0, r4, r1)
            if (r4 != 0) goto L58
            if (r7 == 0) goto L27
            java.lang.Throwable r1 = r0.t()
            bd.m r2 = new bd.m
            r2.<init>(r1)
            return r2
        L58:
            r1 = r4
        L59:
            r4 = r9
            int r9 = bd.h.e(r0, r1, r2, r3, r4, r6, r7)
            if (r9 == 0) goto Lbb
            r3 = 1
            if (r9 == r3) goto Lba
            r3 = 2
            if (r9 == r3) goto L94
            r2 = 3
            if (r9 == r2) goto L8d
            r2 = 4
            if (r9 == r2) goto L76
            r2 = 5
            if (r9 == r2) goto L70
            goto L73
        L70:
            r1.b()
        L73:
            r3 = r18
            goto L27
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = bd.h.L
            long r2 = r2.get(r0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L83
            r1.b()
        L83:
            java.lang.Throwable r1 = r0.t()
            bd.m r2 = new bd.m
            r2.<init>(r1)
            return r2
        L8d:
            java.lang.String r1 = "unexpected"
            a0.j.p(r1)
            r1 = 0
            return r1
        L94:
            if (r7 == 0) goto La3
            r1.i()
            java.lang.Throwable r1 = r0.t()
            bd.m r2 = new bd.m
            r2.<init>(r1)
            return r2
        La3:
            boolean r3 = r6 instanceof zc.v1
            if (r3 == 0) goto Laa
            zc.v1 r6 = (zc.v1) r6
            goto Lab
        Laa:
            r6 = 0
        Lab:
            if (r6 == 0) goto Lb2
            int r3 = r2 + r11
            r6.b(r1, r3)
        Lb2:
            long r3 = r1.L
            long r3 = r3 * r12
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.n(r3)
        Lba:
            return r8
        Lbb:
            r1.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.s.L(boolean, java.lang.Object):java.lang.Object");
    }

    @Override // bd.h, bd.x
    public final Object a(Object obj) {
        return L(false, obj);
    }

    @Override // bd.h, bd.x
    public final Object b(cc.c cVar, Object obj) {
        if (!(L(true, obj) instanceof m)) {
            return yb.y.f14813a;
        }
        throw t();
    }

    @Override // bd.h
    public final boolean z() {
        if (this.f2193e0 == a.DROP_OLDEST) {
            return true;
        }
        return false;
    }
}
