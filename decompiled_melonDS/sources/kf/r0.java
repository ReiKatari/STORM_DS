package kf;

import android.content.Context;
import h1.x2;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Type f8262f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8263a;

    /* renamed from: b  reason: collision with root package name */
    public final ua.h f8264b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8266d;

    /* renamed from: c  reason: collision with root package name */
    public final id.c f8265c = new id.c();

    /* renamed from: e  reason: collision with root package name */
    public final cd.q1 f8267e = cd.q.c(zb.q.A);

    static {
        Type type = new bb.a().f2156b;
        type.getClass();
        f8262f = type;
    }

    public r0(Context context, ua.h hVar) {
        this.f8263a = context;
        this.f8264b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (b(r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[LOOP:1: B:31:0x0078->B:32:0x0096, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(oe.a r12, ec.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof kf.o0
            if (r0 == 0) goto L13
            r0 = r13
            kf.o0 r0 = (kf.o0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.o0 r0 = new kf.o0
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            yb.y r3 = yb.y.f14813a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            p7.j.I(r13)
            return r3
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r12)
            return r6
        L33:
            oe.a r12 = r0.R
            p7.j.I(r13)
            goto L47
        L39:
            p7.j.I(r13)
            r0.R = r12
            r0.Z = r5
            java.lang.Object r13 = r11.b(r0)
            if (r13 != r1) goto L47
            goto Lb2
        L47:
            cd.q1 r13 = r11.f8267e
            java.lang.Object r2 = r13.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L53:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r2.next()
            r8 = r7
            sd.b r8 = (sd.b) r8
            boolean r9 = r8.f12867b
            if (r9 != 0) goto L53
            java.lang.Object r8 = r8.f12866a
            oe.a r8 = (oe.a) r8
            java.util.UUID r8 = r8.f10905a
            java.util.UUID r9 = r12.f10905a
            boolean r8 = nc.k.a(r8, r9)
            if (r8 == 0) goto L53
            goto L74
        L73:
            r7 = r6
        L74:
            sd.b r7 = (sd.b) r7
            if (r7 == 0) goto Lb3
        L78:
            java.lang.Object r12 = r13.getValue()
            r2 = r12
            java.util.List r2 = (java.util.List) r2
            int r8 = r2.indexOf(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            java.lang.Object r2 = r7.f12866a
            sd.b r10 = new sd.b
            r10.<init>(r5, r2)
            r9.set(r8, r10)
            boolean r12 = r13.i(r12, r9)
            if (r12 == 0) goto L78
            r0.R = r6
            r0.Z = r4
            gd.f r12 = zc.g0.f15015a
            gd.e r12 = gd.e.L
            a9.k r13 = new a9.k
            r2 = 7
            r13.<init>(r2, r6, r11)
            java.lang.Object r12 = zc.x.F(r12, r13, r0)
            dc.a r13 = dc.a.COROUTINE_SUSPENDED
            if (r12 != r13) goto Laf
            goto Lb0
        Laf:
            r12 = r3
        Lb0:
            if (r12 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.r0.a(oe.a, ec.c):java.lang.Object");
    }

    public final Object b(ec.c cVar) {
        gd.f fVar = zc.g0.f15015a;
        Object F = zc.x.F(gd.e.L, new x2(8, (cc.c) null, this), cVar);
        if (F == dc.a.COROUTINE_SUSPENDED) {
            return F;
        }
        return yb.y.f14813a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kf.p0
            if (r0 == 0) goto L13
            r0 = r6
            kf.p0 r0 = (kf.p0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.p0 r0 = new kf.p0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.UUID r5 = r0.R
            p7.j.I(r6)
            goto L3e
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L30:
            p7.j.I(r6)
            r0.R = r5
            r0.Z = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            cd.q1 r6 = r4.f8267e
            java.lang.Object r6 = r6.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4a:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L69
            java.lang.Object r0 = r6.next()
            r2 = r0
            sd.b r2 = (sd.b) r2
            boolean r3 = r2.f12867b
            if (r3 != 0) goto L4a
            java.lang.Object r2 = r2.f12866a
            oe.a r2 = (oe.a) r2
            java.util.UUID r2 = r2.f10905a
            boolean r2 = nc.k.a(r2, r5)
            if (r2 == 0) goto L4a
            goto L6a
        L69:
            r0 = r1
        L6a:
            sd.b r0 = (sd.b) r0
            if (r0 == 0) goto L73
            java.lang.Object r5 = r0.f12866a
            oe.a r5 = (oe.a) r5
            return r5
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.r0.c(java.util.UUID, ec.c):java.lang.Object");
    }
}
