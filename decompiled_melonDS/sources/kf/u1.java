package kf;

import android.content.Context;
import g2.p2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u1 implements cf.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8270a;

    /* renamed from: b  reason: collision with root package name */
    public final MelonDatabase f8271b;

    public u1(Context context, MelonDatabase melonDatabase) {
        this.f8270a = context;
        this.f8271b = melonDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, ec.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kf.i1
            if (r0 == 0) goto L13
            r0 = r9
            kf.i1 r0 = (kf.i1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.i1 r0 = new kf.i1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.R
            p7.j.I(r9)
            goto L53
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L30:
            p7.j.I(r9)
            ie.a r9 = new ie.a
            r9.<init>(r8)
            me.magnum.melonds.database.MelonDatabase r2 = r7.f8271b
            he.f r2 = r2.t()
            r0.R = r8
            r0.Z = r3
            k7.t r4 = r2.f6466a
            a7.l r5 = new a7.l
            r6 = 28
            r5.<init>(r6, r2, r9)
            r9 = 0
            java.lang.Object r9 = q8.r.M(r0, r4, r9, r3, r5)
            if (r9 != r1) goto L53
            return r1
        L53:
            java.lang.Number r9 = (java.lang.Number) r9
            long r0 = r9.longValue()
            oe.b r9 = new oe.b
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r9.<init>(r2, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.a(java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r13 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (q8.r.M(r0, r11.f6468a, false, true, new he.g(0, r11, r2)) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, oe.q r12, ec.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof kf.j1
            if (r0 == 0) goto L13
            r0 = r13
            kf.j1 r0 = (kf.j1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.j1 r0 = new kf.j1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            me.magnum.melonds.database.MelonDatabase r4 = r10.f8271b
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2e
            p7.j.I(r13)
            goto L8b
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L35:
            java.lang.String r11 = r0.R
            p7.j.I(r13)
            goto L64
        L3b:
            p7.j.I(r13)
            java.lang.Long r13 = r12.f10950a
            if (r13 != 0) goto L6b
            ie.f r13 = new ie.f
            java.lang.String r2 = r12.f10951b
            java.lang.String r8 = r12.f10952c
            java.lang.String r12 = r12.f10953d
            r13.<init>(r7, r2, r8, r12)
            he.i r12 = r4.v()
            r0.R = r11
            r0.Z = r6
            k7.t r2 = r12.f6470a
            he.g r8 = new he.g
            r9 = 1
            r8.<init>(r9, r12, r13)
            java.lang.Object r13 = q8.r.M(r0, r2, r3, r6, r8)
            if (r13 != r1) goto L64
            goto L8a
        L64:
            java.lang.Number r13 = (java.lang.Number) r13
            long r12 = r13.longValue()
            goto L6f
        L6b:
            long r12 = r13.longValue()
        L6f:
            ie.c r2 = new ie.c
            r2.<init>(r7, r12, r11)
            he.h r11 = r4.u()
            r0.R = r7
            r0.Z = r5
            k7.t r12 = r11.f6468a
            he.g r13 = new he.g
            r4 = 0
            r13.<init>(r4, r11, r2)
            java.lang.Object r11 = q8.r.M(r0, r12, r3, r6, r13)
            if (r11 != r1) goto L8b
        L8a:
            return r1
        L8b:
            yb.y r11 = yb.y.f14813a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.b(java.lang.String, oe.q, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (q8.r.M(r3, r5.f6470a, false, true, new he.g(1, r5, r2)) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
        if (r2 != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0181, code lost:
        if (q8.r.M(r3, r0.f6462a, false, true, new he.a(r0, r5, 0)) != r4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(oe.q r28, ec.c r29) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.c(oe.q, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r11 != r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, ec.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kf.l1
            if (r0 == 0) goto L13
            r0 = r12
            kf.l1 r0 = (kf.l1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.l1 r0 = new kf.l1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 3
            r4 = 2
            r5 = 0
            me.magnum.melonds.database.MelonDatabase r6 = r10.f8271b
            yb.y r7 = yb.y.f14813a
            r8 = 1
            if (r2 == 0) goto L41
            if (r2 == r8) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            p7.j.I(r12)
            return r7
        L32:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L39:
            p7.j.I(r12)
            goto L7f
        L3d:
            p7.j.I(r12)
            goto L66
        L41:
            p7.j.I(r12)
            java.lang.String r12 = "__custom_cheat_database"
            boolean r12 = nc.k.a(r11, r12)
            if (r12 == 0) goto L4d
            goto L98
        L4d:
            he.f r12 = r6.t()
            r0.Y = r8
            k7.t r12 = r12.f6466a
            g2.z1 r2 = new g2.z1
            r9 = 2
            r2.<init>(r11, r9)
            java.lang.Object r11 = q8.r.M(r0, r12, r5, r8, r2)
            if (r11 != r1) goto L62
            goto L63
        L62:
            r11 = r7
        L63:
            if (r11 != r1) goto L66
            goto L97
        L66:
            he.h r11 = r6.u()
            r0.Y = r4
            k7.t r11 = r11.f6468a
            g2.l5 r12 = new g2.l5
            r2 = 6
            r12.<init>(r2)
            java.lang.Object r11 = q8.r.M(r0, r11, r5, r8, r12)
            if (r11 != r1) goto L7b
            goto L7c
        L7b:
            r11 = r7
        L7c:
            if (r11 != r1) goto L7f
            goto L97
        L7f:
            he.i r11 = r6.v()
            r0.Y = r3
            k7.t r11 = r11.f6470a
            g2.l5 r12 = new g2.l5
            r2 = 7
            r12.<init>(r2)
            java.lang.Object r11 = q8.r.M(r0, r11, r5, r8, r12)
            if (r11 != r1) goto L94
            goto L95
        L94:
            r11 = r7
        L95:
            if (r11 != r1) goto L98
        L97:
            return r1
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.d(java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(oe.e0 r7, ec.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kf.m1
            if (r0 == 0) goto L13
            r0 = r8
            kf.m1 r0 = (kf.m1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.m1 r0 = new kf.m1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r8)
            goto L4f
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L2e:
            p7.j.I(r8)
            me.magnum.melonds.database.MelonDatabase r8 = r6.f8271b
            he.i r8 = r8.v()
            java.lang.String r2 = r7.f10923a
            java.lang.String r7 = r7.a()
            r0.Y = r3
            k7.t r8 = r8.f6470a
            he.b r4 = new he.b
            r5 = 1
            r4.<init>(r2, r5, r7)
            r7 = 0
            java.lang.Object r8 = q8.r.M(r0, r8, r3, r7, r4)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            ie.f r8 = (ie.f) r8
            if (r8 == 0) goto L63
            oe.q r0 = new oe.q
            java.lang.Long r1 = r8.f7057a
            java.lang.String r2 = r8.f7058b
            java.lang.String r3 = r8.f7059c
            java.lang.String r4 = r8.f7060d
            zb.q r5 = zb.q.A
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L63:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.e(oe.e0, ec.c):java.lang.Object");
    }

    public final cd.h f(oe.q qVar) {
        qVar.getClass();
        Long l10 = qVar.f10950a;
        if (l10 != null) {
            long longValue = l10.longValue();
            he.i v10 = this.f8271b.v();
            return new o1(q8.r.r(v10.f6470a, true, new String[]{"cheat", "cheat_folder"}, new p2(longValue, v10, 1)), 0);
        }
        return cd.g.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[LOOP:0: B:18:0x005b->B:20:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(ec.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kf.r1
            if (r0 == 0) goto L13
            r0 = r9
            kf.r1 r0 = (kf.r1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.r1 r0 = new kf.r1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r9)
            goto L4a
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L2e:
            p7.j.I(r9)
            me.magnum.melonds.database.MelonDatabase r9 = r8.f8271b
            he.i r9 = r9.v()
            r0.Y = r3
            k7.t r9 = r9.f6470a
            g2.l5 r2 = new g2.l5
            r4 = 8
            r2.<init>(r4)
            r4 = 0
            java.lang.Object r9 = q8.r.M(r0, r9, r3, r4, r2)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zb.m.G(r9, r1)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L5b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r9.next()
            ie.f r1 = (ie.f) r1
            oe.q r2 = new oe.q
            java.lang.Long r3 = r1.f7057a
            java.lang.String r4 = r1.f7058b
            java.lang.String r5 = r1.f7059c
            java.lang.String r6 = r1.f7060d
            zb.q r7 = zb.q.A
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            goto L5b
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.g(ec.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[LOOP:0: B:18:0x0060->B:20:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(oe.e0 r10, ec.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof kf.s1
            if (r0 == 0) goto L13
            r0 = r11
            kf.s1 r0 = (kf.s1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.s1 r0 = new kf.s1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r11)
            goto L4f
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L2e:
            p7.j.I(r11)
            me.magnum.melonds.database.MelonDatabase r11 = r9.f8271b
            he.e r11 = r11.s()
            java.lang.String r2 = r10.f10923a
            java.lang.String r10 = r10.a()
            r0.Y = r3
            k7.t r11 = r11.f6462a
            he.b r4 = new he.b
            r5 = 0
            r4.<init>(r2, r5, r10)
            r10 = 0
            java.lang.Object r11 = q8.r.M(r0, r11, r3, r10, r4)
            if (r11 != r1) goto L4f
            return r1
        L4f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = zb.m.G(r11, r0)
            r10.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L60:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r11.next()
            ie.b r0 = (ie.b) r0
            me.magnum.melonds.domain.model.Cheat r1 = new me.magnum.melonds.domain.model.Cheat
            java.lang.Long r2 = r0.f7043a
            long r3 = r0.f7045c
            java.lang.String r5 = r0.f7046d
            java.lang.String r6 = r0.f7047e
            java.lang.String r7 = r0.f7048f
            boolean r8 = r0.f7049g
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r10.add(r1)
            goto L60
        L81:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.h(oe.e0, ec.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r1 == r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(me.magnum.melonds.domain.model.Cheat r21, ec.c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof kf.t1
            if (r2 == 0) goto L17
            r2 = r1
            kf.t1 r2 = (kf.t1) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            kf.t1 r2 = new kf.t1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            dc.a r3 = dc.a.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 0
            yb.y r6 = yb.y.f14813a
            me.magnum.melonds.database.MelonDatabase r7 = r0.f8271b
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L40
            if (r4 == r9) goto L3a
            if (r4 != r8) goto L33
            p7.j.I(r1)
            return r6
        L33:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            r1 = 0
            return r1
        L3a:
            me.magnum.melonds.domain.model.Cheat r4 = r2.R
            p7.j.I(r1)
            goto L67
        L40:
            p7.j.I(r1)
            he.e r1 = r7.s()
            java.lang.Long r4 = r21.getId()
            r4.getClass()
            long r10 = r4.longValue()
            r4 = r21
            r2.R = r4
            r2.Z = r9
            k7.t r1 = r1.f6462a
            cd.k r12 = new cd.k
            r13 = 2
            r12.<init>(r13, r10)
            java.lang.Object r1 = q8.r.M(r2, r1, r9, r5, r12)
            if (r1 != r3) goto L67
            goto La1
        L67:
            ie.b r1 = (ie.b) r1
            if (r1 != 0) goto L6c
            goto La2
        L6c:
            ie.b r10 = new ie.b
            java.lang.Long r11 = r4.getId()
            long r12 = r1.f7044b
            long r14 = r1.f7045c
            java.lang.String r16 = r4.getName()
            java.lang.String r17 = r4.getDescription()
            java.lang.String r18 = r4.getCode()
            boolean r19 = r4.getEnabled()
            r10.<init>(r11, r12, r14, r16, r17, r18, r19)
            he.e r1 = r7.s()
            r4 = 0
            r2.R = r4
            r2.Z = r8
            k7.t r4 = r1.f6462a
            a7.l r7 = new a7.l
            r8 = 27
            r7.<init>(r8, r1, r10)
            java.lang.Object r1 = q8.r.M(r2, r4, r5, r9, r7)
            if (r1 != r3) goto La2
        La1:
            return r3
        La2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u1.i(me.magnum.melonds.domain.model.Cheat, ec.c):java.lang.Object");
    }

    public final Object j(List list, a9.b bVar) {
        ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Cheat cheat = (Cheat) it.next();
            Long id2 = cheat.getId();
            id2.getClass();
            arrayList.add(new ie.e(id2.longValue(), cheat.getEnabled()));
        }
        he.e s10 = this.f8271b.s();
        Object M = q8.r.M(bVar, s10.f6462a, false, true, new he.a(s10, arrayList, 1));
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        yb.y yVar = yb.y.f14813a;
        if (M != aVar) {
            M = yVar;
        }
        if (M == aVar) {
            return M;
        }
        return yVar;
    }
}
