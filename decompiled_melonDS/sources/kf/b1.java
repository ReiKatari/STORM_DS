package kf;

import android.content.Context;
import h1.x2;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: g  reason: collision with root package name */
    public static final Type f8142g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8143a;

    /* renamed from: b  reason: collision with root package name */
    public final ua.h f8144b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8146d;

    /* renamed from: c  reason: collision with root package name */
    public final id.c f8145c = new id.c();

    /* renamed from: e  reason: collision with root package name */
    public final cd.q1 f8147e = cd.q.c(zb.q.A);

    /* renamed from: f  reason: collision with root package name */
    public final yb.n f8148f = new yb.n(new s0(0, this));

    static {
        Type type = new bb.a().f2156b;
        type.getClass();
        f8142g = type;
    }

    public b1(Context context, ua.h hVar) {
        this.f8143a = context;
        this.f8144b = hVar;
    }

    public static final List a(b1 b1Var) {
        ArrayList arrayList;
        File file = new File(b1Var.f8143a.getFilesDir(), "layouts.json");
        if (file.isFile()) {
            try {
                List<nf.b> list = (List) b1Var.f8144b.b(new FileReader(file), f8142g);
                if (list != null) {
                    arrayList = new ArrayList(zb.m.G(list, 10));
                    for (nf.b bVar : list) {
                        arrayList.add(bVar.a());
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return arrayList;
                }
            } catch (Exception unused) {
            }
        }
        return zb.q.A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (c(r0) == r1) goto L34;
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
    public final java.lang.Object b(ve.f r12, ec.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof kf.u0
            if (r0 == 0) goto L13
            r0 = r13
            kf.u0 r0 = (kf.u0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.u0 r0 = new kf.u0
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
            ve.f r12 = r0.R
            p7.j.I(r13)
            goto L47
        L39:
            p7.j.I(r13)
            r0.R = r12
            r0.Z = r5
            java.lang.Object r13 = r11.c(r0)
            if (r13 != r1) goto L47
            goto Lb1
        L47:
            cd.q1 r13 = r11.f8147e
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
            ve.f r8 = (ve.f) r8
            java.util.UUID r8 = r8.f13798a
            java.util.UUID r9 = r12.f13798a
            boolean r8 = nc.k.a(r8, r9)
            if (r8 == 0) goto L53
            goto L74
        L73:
            r7 = r6
        L74:
            sd.b r7 = (sd.b) r7
            if (r7 == 0) goto Lb2
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
            kf.a1 r13 = new kf.a1
            r13.<init>(r11, r6)
            java.lang.Object r12 = zc.x.F(r12, r13, r0)
            dc.a r13 = dc.a.COROUTINE_SUSPENDED
            if (r12 != r13) goto Lae
            goto Laf
        Lae:
            r12 = r3
        Laf:
            if (r12 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.b1.b(ve.f, ec.c):java.lang.Object");
    }

    public final Object c(ec.c cVar) {
        gd.f fVar = zc.g0.f15015a;
        Object F = zc.x.F(gd.e.L, new x2(9, (cc.c) null, this), cVar);
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
    public final java.lang.Object d(java.util.UUID r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kf.v0
            if (r0 == 0) goto L13
            r0 = r6
            kf.v0 r0 = (kf.v0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.v0 r0 = new kf.v0
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
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            cd.q1 r6 = r4.f8147e
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
            ve.f r2 = (ve.f) r2
            java.util.UUID r2 = r2.f13798a
            boolean r2 = nc.k.a(r2, r5)
            if (r2 == 0) goto L4a
            goto L6a
        L69:
            r0 = r1
        L6a:
            sd.b r0 = (sd.b) r0
            if (r0 == 0) goto L73
            java.lang.Object r5 = r0.f12866a
            ve.f r5 = (ve.f) r5
            return r5
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.b1.d(java.util.UUID, ec.c):java.lang.Object");
    }

    public final ah.l0 e(UUID uuid) {
        uuid.getClass();
        return new ah.l0(new cd.x(2, new cd.x(6, new cd.v(new x0(this, null, 1), this.f8147e), uuid), new bh.m(2, 4, null)), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ve.f r17, ec.c r18) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.b1.f(ve.f, ec.c):java.lang.Object");
    }
}
