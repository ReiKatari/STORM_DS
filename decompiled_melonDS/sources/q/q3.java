package q;

import android.util.Range;
import android.util.Size;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a  reason: collision with root package name */
    public Object f11994a;

    /* renamed from: b  reason: collision with root package name */
    public Object f11995b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11996c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11997d;

    /* renamed from: e  reason: collision with root package name */
    public Object f11998e;

    /* renamed from: f  reason: collision with root package name */
    public Object f11999f;

    /* renamed from: g  reason: collision with root package name */
    public Object f12000g;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(q.q3 r6, bh.a r7, ec.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof bh.h
            if (r0 == 0) goto L16
            r0 = r8
            bh.h r0 = (bh.h) r0
            int r1 = r0.f2267c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2267c0 = r1
            goto L1b
        L16:
            bh.h r0 = new bh.h
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f2267c0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            ac.b r6 = r0.Y
            ac.b r7 = r0.X
            p7.j.I(r8)
            goto L96
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L38:
            bh.a r7 = r0.R
            p7.j.I(r8)
            yb.l r8 = (yb.l) r8
            java.lang.Object r8 = r8.A
            goto L5a
        L42:
            p7.j.I(r8)
            java.lang.Object r8 = r6.f11994a
            cf.b r8 = (cf.b) r8
            oi.b r2 = r7.f2254a
            boolean r5 = r7.f2255b
            r0.R = r7
            r0.f2267c0 = r4
            kf.z r8 = (kf.z) r8
            java.lang.Object r8 = r8.a(r2, r5, r0)
            if (r8 != r1) goto L5a
            goto L93
        L5a:
            java.lang.Throwable r2 = yb.l.a(r8)
            zb.q r4 = zb.q.A
            if (r2 != 0) goto La8
            oi.e r8 = (oi.e) r8
            boolean r2 = r8.f11031a
            if (r2 == 0) goto La2
            ac.b r2 = p7.t.g()
            hh.m0 r4 = new hh.m0
            oi.b r5 = r7.f2254a
            r4.<init>(r5)
            r2.add(r4)
            boolean r4 = r8.f11031a
            if (r4 == 0) goto L9e
            int r8 = r8.f11032b
            if (r8 != 0) goto L9e
            oi.b r8 = r7.f2254a
            long r4 = r8.f11014c
            boolean r7 = r7.f2255b
            r8 = 0
            r0.R = r8
            r0.X = r2
            r0.Y = r2
            r0.f2267c0 = r3
            java.lang.Object r8 = r6.d(r4, r7, r0)
            if (r8 != r1) goto L94
        L93:
            return r1
        L94:
            r6 = r2
            r7 = r6
        L96:
            hh.o0 r8 = (hh.o0) r8
            if (r8 == 0) goto L9d
            r6.add(r8)
        L9d:
            r2 = r7
        L9e:
            ac.b r4 = p7.t.d(r2)
        La2:
            bh.e r6 = new bh.e
            r6.<init>(r4)
            return r6
        La8:
            boolean r6 = r7.f2256c
            oi.b r8 = r7.f2254a
            if (r6 == 0) goto Lb7
            hh.l0 r6 = new hh.l0
            r6.<init>(r8)
            java.util.List r4 = p7.t.x(r6)
        Lb7:
            bh.d r6 = new bh.d
            boolean r7 = r7.f2255b
            bh.a r0 = new bh.a
            r1 = 0
            r0.<init>(r8, r7, r1)
            r6.<init>(r0, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q3.a(q.q3, bh.a, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r12 == r14) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(q.q3 r12, bh.b r13, ec.c r14) {
        /*
            java.lang.Object r0 = r12.f11994a
            cf.b r0 = (cf.b) r0
            boolean r1 = r14 instanceof bh.o
            if (r1 == 0) goto L17
            r1 = r14
            bh.o r1 = (bh.o) r1
            int r2 = r1.f2278b0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f2278b0 = r2
            goto L1c
        L17:
            bh.o r1 = new bh.o
            r1.<init>(r12, r14)
        L1c:
            java.lang.Object r12 = r1.Y
            dc.a r14 = dc.a.COROUTINE_SUSPENDED
            int r2 = r1.f2278b0
            zb.q r3 = zb.q.A
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L34
            oi.i r13 = r1.X
            bh.b r14 = r1.R
            p7.j.I(r12)
            goto L7a
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r12)
            r12 = 0
            return r12
        L3b:
            bh.b r13 = r1.R
            p7.j.I(r12)
            yb.l r12 = (yb.l) r12
            java.lang.Object r12 = r12.A
            goto L5c
        L45:
            p7.j.I(r12)
            oi.h r12 = r13.f2257a
            long r6 = r12.f11039a
            int r12 = r13.f2258b
            r1.R = r13
            r1.f2278b0 = r5
            r2 = r0
            kf.z r2 = (kf.z) r2
            java.lang.Object r12 = r2.q(r6, r12, r1)
            if (r12 != r14) goto L5c
            goto L76
        L5c:
            java.lang.Throwable r2 = yb.l.a(r12)
            if (r2 != 0) goto La1
            oi.i r12 = (oi.i) r12
            oi.h r2 = r13.f2257a
            long r5 = r2.f11041c
            r1.R = r13
            r1.X = r12
            r1.f2278b0 = r4
            kf.z r0 = (kf.z) r0
            java.lang.Object r0 = r0.e(r5, r1)
            if (r0 != r14) goto L77
        L76:
            return r14
        L77:
            r14 = r13
            r13 = r12
            r12 = r0
        L7a:
            xe.c r12 = (xe.c) r12
            if (r12 == 0) goto L96
            hh.t0 r4 = new hh.t0
            oi.h r0 = r14.f2257a
            long r5 = r0.f11039a
            java.lang.String r7 = r0.f11045g
            java.net.URL r8 = r12.f14564e
            java.lang.String r9 = r14.f2259c
            int r10 = r13.f11048a
            int r11 = r13.f11049b
            r4.<init>(r5, r7, r8, r9, r10, r11)
            java.util.List r12 = p7.t.x(r4)
            goto L97
        L96:
            r12 = 0
        L97:
            if (r12 != 0) goto L9a
            goto L9b
        L9a:
            r3 = r12
        L9b:
            bh.e r12 = new bh.e
            r12.<init>(r3)
            return r12
        La1:
            boolean r12 = r13.f2260d
            oi.h r14 = r13.f2257a
            if (r12 == 0) goto Lb2
            hh.s0 r12 = new hh.s0
            long r0 = r14.f11039a
            r12.<init>(r0)
            java.util.List r3 = p7.t.x(r12)
        Lb2:
            bh.d r12 = new bh.d
            int r0 = r13.f2258b
            java.lang.String r13 = r13.f2259c
            bh.b r1 = new bh.b
            r2 = 0
            r1.<init>(r14, r0, r13, r2)
            r12.<init>(r1, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q3.b(q.q3, bh.b, ec.c):java.lang.Object");
    }

    public j0.k c() {
        String str;
        if (((Size) this.f11994a) == null) {
            str = " resolution";
        } else {
            str = "";
        }
        if (((Size) this.f11995b) == null) {
            str = str.concat(" originalConfiguredResolution");
        }
        if (((d0.a0) this.f11996c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Integer) this.f11997d) == null) {
            str = str.concat(" sessionType");
        }
        if (((Range) this.f11998e) == null) {
            str = str.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.f12000g) == null) {
            str = str.concat(" zslDisabled");
        }
        if (str.isEmpty()) {
            return new j0.k((Size) this.f11994a, (Size) this.f11995b, (d0.a0) this.f11996c, ((Integer) this.f11997d).intValue(), (Range) this.f11998e, (j0.r0) this.f11999f, ((Boolean) this.f12000g).booleanValue());
        }
        a0.j.p("Missing required properties:".concat(str));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r18, boolean r20, ec.c r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q3.d(long, boolean, ec.c):java.lang.Object");
    }
}
