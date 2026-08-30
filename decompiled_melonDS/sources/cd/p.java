package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends ec.j implements mc.q {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f2847b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ long f2848c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ dd.l f2849d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j2, dd.l lVar, cc.c cVar) {
        super(3, cVar);
        this.f2848c0 = j2;
        this.f2849d0 = lVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.f2848c0, this.f2849d0, (cc.c) obj3);
        pVar.Z = (zc.u) obj;
        pVar.f2847b0 = (i) obj2;
        return pVar.v(yb.y.f14813a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b2 -> B:23:0x00b5). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 != r4) goto L1e
            long r6 = r0.X
            java.lang.Object r2 = r0.f2847b0
            bd.l r2 = (bd.l) r2
            java.lang.Object r8 = r0.Z
            cd.i r8 = (cd.i) r8
            p7.j.I(r18)
            r9 = r18
            goto Lb5
        L1e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            r1 = 0
            return r1
        L25:
            p7.j.I(r18)
            java.lang.Object r2 = r0.Z
            zc.u r2 = (zc.u) r2
            java.lang.Object r6 = r0.f2847b0
            cd.i r6 = (cd.i) r6
            r7 = 0
            long r9 = r0.f2848c0
            int r7 = wc.b.c(r9, r7)
            if (r7 <= 0) goto Lc0
            dd.l r7 = r0.f2849d0
            cd.h r12 = cd.q.g(r7, r3)
            boolean r7 = r12 instanceof dd.e
            if (r7 == 0) goto L48
            r7 = r12
            dd.e r7 = (dd.e) r7
            goto L49
        L48:
            r7 = r5
        L49:
            if (r7 != 0) goto L56
            dd.g r11 = new dd.g
            r15 = 0
            r16 = 14
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r7 = r11
        L56:
            bd.l r2 = r7.h(r2)
            r8 = r6
            r6 = r9
        L5c:
            hd.e r10 = new hd.e
            cc.g r9 = r0.B
            r9.getClass()
            r10.<init>(r9)
            a0.g r9 = r2.k()
            cd.n r15 = new cd.n
            r11 = 0
            r15.<init>(r8, r5, r11)
            hd.c r11 = new hd.c
            java.lang.Object r12 = r9.B
            bd.h r12 = (bd.h) r12
            r13 = r11
            r11 = r12
            bd.d r12 = bd.d.f2163b0
            r14 = r13
            bd.e r13 = bd.e.f2164b0
            java.lang.Object r9 = r9.L
            r16 = r9
            mc.q r16 = (mc.q) r16
            r9 = r14
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r10.f(r9, r3)
            cd.o r9 = new cd.o
            r9.<init>(r6, r5)
            long r11 = zc.x.C(r6)
            hd.g.a(r10, r11, r9)
            r0.Z = r8
            r0.f2847b0 = r2
            r0.X = r6
            r0.Y = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = hd.e.Y
            java.lang.Object r9 = r9.get(r10)
            boolean r9 = r9 instanceof hd.c
            if (r9 == 0) goto Lae
            java.lang.Object r9 = r10.c(r0)
            goto Lb2
        Lae:
            java.lang.Object r9 = r10.d(r0)
        Lb2:
            if (r9 != r1) goto Lb5
            return r1
        Lb5:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5c
            yb.y r1 = yb.y.f14813a
            return r1
        Lc0:
            zc.p1 r1 = new zc.p1
            java.lang.String r2 = "Timed out immediately"
            r1.<init>(r2, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.p.v(java.lang.Object):java.lang.Object");
    }
}
