package defpackage;

import android.content.Context;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nq5  reason: default package */
/* loaded from: classes.dex */
public final class nq5 implements xm0 {
    public final Context a;
    public final MelonDatabase b;
    public final v16 c;

    public nq5(Context context, MelonDatabase melonDatabase, v16 v16Var) {
        this.a = context;
        this.b = melonDatabase;
        this.c = v16Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.sk0 r17, me.magnum.melonds.domain.model.Cheat r18, defpackage.k11 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof defpackage.xp5
            if (r2 == 0) goto L17
            r2 = r1
            xp5 r2 = (defpackage.xp5) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            xp5 r2 = new xp5
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L32
            if (r4 != r5) goto L2b
            defpackage.me2.a0(r1)
            goto L73
        L2b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L32:
            defpackage.me2.a0(r1)
            rk0 r6 = new rk0
            r1 = r17
            java.lang.Long r1 = r1.a
            r1.getClass()
            long r8 = r1.longValue()
            long r10 = r18.getCheatDatabaseId()
            java.lang.String r12 = r18.getName()
            java.lang.String r13 = r18.getDescription()
            java.lang.String r14 = r18.getCode()
            boolean r15 = r18.getEnabled()
            r7 = 0
            r6.<init>(r7, r8, r10, r12, r13, r14, r15)
            me.magnum.melonds.database.MelonDatabase r1 = r0.b
            mk0 r1 = r1.s()
            r2.Y = r5
            sq5 r4 = r1.a
            x r7 = new x
            r8 = 11
            r7.<init>(r8, r1, r6)
            r1 = 0
            java.lang.Object r1 = defpackage.mh7.Z(r2, r4, r1, r5, r7)
            if (r1 != r3) goto L73
            return r3
        L73:
            v16 r0 = r0.c
            r0.i()
            o27 r0 = defpackage.o27.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.a(sk0, me.magnum.melonds.domain.model.Cheat, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, defpackage.k11 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.yp5
            if (r0 == 0) goto L13
            r0 = r9
            yp5 r0 = (defpackage.yp5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            yp5 r0 = new yp5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.R
            defpackage.me2.a0(r9)
            goto L53
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L30:
            defpackage.me2.a0(r9)
            qk0 r9 = new qk0
            r9.<init>(r8)
            me.magnum.melonds.database.MelonDatabase r2 = r7.b
            pk0 r2 = r2.t()
            r0.R = r8
            r0.Z = r3
            sq5 r4 = r2.a
            x r5 = new x
            r6 = 12
            r5.<init>(r6, r2, r9)
            r9 = 0
            java.lang.Object r9 = defpackage.mh7.Z(r0, r4, r9, r3, r5)
            if (r9 != r1) goto L53
            return r1
        L53:
            java.lang.Number r9 = (java.lang.Number) r9
            long r0 = r9.longValue()
            v16 r7 = r7.c
            r7.i()
            nk0 r7 = new nk0
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            r7.<init>(r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.b(java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r12 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (defpackage.mh7.Z(r0, r10.a, false, true, new defpackage.x(14, r10, r2)) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, defpackage.yj2 r11, defpackage.k11 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.zp5
            if (r0 == 0) goto L13
            r0 = r12
            zp5 r0 = (defpackage.zp5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            zp5 r0 = new zp5
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            me.magnum.melonds.database.MelonDatabase r4 = r9.b
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3a
            if (r2 == r6) goto L34
            if (r2 != r5) goto L2e
            defpackage.me2.a0(r12)
            goto L8a
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            return r7
        L34:
            java.lang.String r10 = r0.R
            defpackage.me2.a0(r12)
            goto L62
        L3a:
            defpackage.me2.a0(r12)
            java.lang.Long r12 = r11.a
            if (r12 != 0) goto L69
            fk2 r12 = new fk2
            java.lang.String r2 = r11.b
            java.lang.String r8 = r11.c
            java.lang.String r11 = r11.d
            r12.<init>(r7, r2, r8, r11)
            ek2 r11 = r4.v()
            r0.R = r10
            r0.Z = r6
            sq5 r2 = r11.a
            gi2 r8 = new gi2
            r8.<init>(r6, r11, r12)
            java.lang.Object r12 = defpackage.mh7.Z(r0, r2, r3, r6, r8)
            if (r12 != r1) goto L62
            goto L89
        L62:
            java.lang.Number r12 = (java.lang.Number) r12
            long r11 = r12.longValue()
            goto L6d
        L69:
            long r11 = r12.longValue()
        L6d:
            uk0 r2 = new uk0
            r2.<init>(r7, r11, r10)
            tk0 r10 = r4.u()
            r0.R = r7
            r0.Z = r5
            sq5 r11 = r10.a
            x r12 = new x
            r4 = 14
            r12.<init>(r4, r10, r2)
            java.lang.Object r10 = defpackage.mh7.Z(r0, r11, r3, r6, r12)
            if (r10 != r1) goto L8a
        L89:
            return r1
        L8a:
            v16 r9 = r9.c
            r9.i()
            o27 r9 = defpackage.o27.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.c(java.lang.String, yj2, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.sk0 r18, defpackage.bm0 r19, defpackage.k11 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.aq5
            if (r3 == 0) goto L19
            r3 = r2
            aq5 r3 = (defpackage.aq5) r3
            int r4 = r3.Y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Y = r4
            goto L1e
        L19:
            aq5 r3 = new aq5
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.R
            p31 r4 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r3.Y
            r6 = 1
            if (r5 == 0) goto L34
            if (r5 != r6) goto L2d
            defpackage.me2.a0(r2)
            goto L6b
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L34:
            defpackage.me2.a0(r2)
            rk0 r7 = new rk0
            r2 = r18
            java.lang.Long r2 = r2.a
            r2.getClass()
            long r9 = r2.longValue()
            java.lang.String r13 = r1.a
            java.lang.String r14 = r1.b
            java.lang.String r15 = r1.c
            r16 = 0
            r8 = 0
            r11 = 0
            r7.<init>(r8, r9, r11, r13, r14, r15, r16)
            me.magnum.melonds.database.MelonDatabase r1 = r0.b
            mk0 r1 = r1.s()
            r3.Y = r6
            sq5 r2 = r1.a
            x r5 = new x
            r8 = 11
            r5.<init>(r8, r1, r7)
            r1 = 0
            java.lang.Object r1 = defpackage.mh7.Z(r3, r2, r1, r6, r5)
            if (r1 != r4) goto L6b
            return r4
        L6b:
            v16 r0 = r0.c
            r0.i()
            o27 r0 = defpackage.o27.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.d(sk0, bm0, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (defpackage.mh7.Z(r3, r5.a, false, true, new defpackage.gi2(1, r5, r2)) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r2 != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017f, code lost:
        if (defpackage.mh7.Z(r3, r2.a, false, true, new defpackage.ik0(r2, r5, 0)) != r4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.yj2 r29, defpackage.k11 r30) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.e(yj2, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(me.magnum.melonds.domain.model.Cheat r8, defpackage.k11 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cq5
            if (r0 == 0) goto L13
            r0 = r9
            cq5 r0 = (defpackage.cq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cq5 r0 = new cq5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            o27 r3 = defpackage.o27.a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            defpackage.me2.a0(r9)
            goto L59
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L30:
            defpackage.me2.a0(r9)
            java.lang.Long r8 = r8.getId()
            if (r8 == 0) goto L5e
            long r8 = r8.longValue()
            me.magnum.melonds.database.MelonDatabase r2 = r7.b
            mk0 r2 = r2.s()
            r0.Y = r4
            sq5 r2 = r2.a
            u4 r5 = new u4
            r6 = 3
            r5.<init>(r6, r8)
            r8 = 0
            java.lang.Object r8 = defpackage.mh7.Z(r0, r2, r8, r4, r5)
            if (r8 != r1) goto L55
            goto L56
        L55:
            r8 = r3
        L56:
            if (r8 != r1) goto L59
            return r1
        L59:
            v16 r7 = r7.c
            r7.i()
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.f(me.magnum.melonds.domain.model.Cheat, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r10, defpackage.k11 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dq5
            if (r0 == 0) goto L13
            r0 = r11
            dq5 r0 = (defpackage.dq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            dq5 r0 = new dq5
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 3
            r4 = 2
            r5 = 0
            me.magnum.melonds.database.MelonDatabase r6 = r9.b
            o27 r7 = defpackage.o27.a
            r8 = 1
            if (r2 == 0) goto L42
            if (r2 == r8) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L33
            defpackage.me2.a0(r11)
            goto L99
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            r9 = 0
            return r9
        L3a:
            defpackage.me2.a0(r11)
            goto L80
        L3e:
            defpackage.me2.a0(r11)
            goto L66
        L42:
            defpackage.me2.a0(r11)
            java.lang.String r11 = "__custom_cheat_database"
            boolean r11 = defpackage.b53.x(r10, r11)
            if (r11 == 0) goto L4e
            return r7
        L4e:
            pk0 r11 = r6.t()
            r0.Y = r8
            sq5 r11 = r11.a
            ok0 r2 = new ok0
            r2.<init>(r10, r5)
            java.lang.Object r10 = defpackage.mh7.Z(r0, r11, r5, r8, r2)
            if (r10 != r1) goto L62
            goto L63
        L62:
            r10 = r7
        L63:
            if (r10 != r1) goto L66
            goto L98
        L66:
            tk0 r10 = r6.u()
            r0.Y = r4
            sq5 r10 = r10.a
            k4 r11 = new k4
            r2 = 28
            r11.<init>(r2)
            java.lang.Object r10 = defpackage.mh7.Z(r0, r10, r5, r8, r11)
            if (r10 != r1) goto L7c
            goto L7d
        L7c:
            r10 = r7
        L7d:
            if (r10 != r1) goto L80
            goto L98
        L80:
            ek2 r10 = r6.v()
            r0.Y = r3
            sq5 r10 = r10.a
            qu1 r11 = new qu1
            r2 = 6
            r11.<init>(r2)
            java.lang.Object r10 = defpackage.mh7.Z(r0, r10, r5, r8, r11)
            if (r10 != r1) goto L95
            goto L96
        L95:
            r10 = r7
        L96:
            if (r10 != r1) goto L99
        L98:
            return r1
        L99:
            v16 r9 = r9.c
            r9.i()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.g(java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.wm5 r11, defpackage.k11 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.eq5
            if (r0 == 0) goto L13
            r0 = r12
            eq5 r0 = (defpackage.eq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            eq5 r0 = new eq5
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r12)
            goto L4e
        L28:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r3
        L2e:
            defpackage.me2.a0(r12)
            me.magnum.melonds.database.MelonDatabase r10 = r10.b
            ek2 r10 = r10.v()
            java.lang.String r12 = r11.a
            java.lang.String r11 = r11.a()
            r0.Y = r4
            sq5 r10 = r10.a
            jk0 r2 = new jk0
            r2.<init>(r12, r4, r11)
            r11 = 0
            java.lang.Object r12 = defpackage.mh7.Z(r0, r10, r4, r11, r2)
            if (r12 != r1) goto L4e
            return r1
        L4e:
            fk2 r12 = (defpackage.fk2) r12
            if (r12 == 0) goto L62
            yj2 r4 = new yj2
            java.lang.Long r5 = r12.a
            java.lang.String r6 = r12.b
            java.lang.String r7 = r12.c
            java.lang.String r8 = r12.d
            pp1 r9 = defpackage.pp1.A
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.h(wm5, k11):java.lang.Object");
    }

    public final u92 i(yj2 yj2Var) {
        yj2Var.getClass();
        Long l = yj2Var.a;
        if (l != null) {
            long longValue = l.longValue();
            ek2 v = this.b.v();
            return new gq5(yg7.a(v.a, true, new String[]{"cheat", "cheat_folder"}, new dk2(0, longValue, v)), 0);
        }
        return np1.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[LOOP:0: B:18:0x005a->B:20:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(defpackage.k11 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jq5
            if (r0 == 0) goto L13
            r0 = r8
            jq5 r0 = (defpackage.jq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            jq5 r0 = new jq5
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r8)
            goto L49
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.me2.a0(r8)
            me.magnum.melonds.database.MelonDatabase r7 = r7.b
            ek2 r7 = r7.v()
            r0.Y = r3
            sq5 r7 = r7.a
            qu1 r8 = new qu1
            r2 = 7
            r8.<init>(r2)
            r2 = 0
            java.lang.Object r8 = defpackage.mh7.Z(r0, r7, r3, r2, r8)
            if (r8 != r1) goto L49
            return r1
        L49:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.uq0.y0(r8, r0)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L5a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r8.next()
            fk2 r0 = (defpackage.fk2) r0
            yj2 r1 = new yj2
            java.lang.Long r2 = r0.a
            java.lang.String r3 = r0.b
            java.lang.String r4 = r0.c
            java.lang.String r5 = r0.d
            pp1 r6 = defpackage.pp1.A
            r1.<init>(r2, r3, r4, r5, r6)
            r7.add(r1)
            goto L5a
        L79:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.j(k11):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[LOOP:0: B:18:0x005f->B:20:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable k(defpackage.wm5 r9, defpackage.k11 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.kq5
            if (r0 == 0) goto L13
            r0 = r10
            kq5 r0 = (defpackage.kq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kq5 r0 = new kq5
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r10)
            goto L4e
        L27:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r8 = 0
            return r8
        L2e:
            defpackage.me2.a0(r10)
            me.magnum.melonds.database.MelonDatabase r8 = r8.b
            mk0 r8 = r8.s()
            java.lang.String r10 = r9.a
            java.lang.String r9 = r9.a()
            r0.Y = r3
            sq5 r8 = r8.a
            jk0 r2 = new jk0
            r4 = 0
            r2.<init>(r10, r4, r9)
            java.lang.Object r10 = defpackage.mh7.Z(r0, r8, r3, r4, r2)
            if (r10 != r1) goto L4e
            return r1
        L4e:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.uq0.y0(r10, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L5f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L80
            java.lang.Object r10 = r9.next()
            rk0 r10 = (defpackage.rk0) r10
            me.magnum.melonds.domain.model.Cheat r0 = new me.magnum.melonds.domain.model.Cheat
            java.lang.Long r1 = r10.a
            long r2 = r10.c
            java.lang.String r4 = r10.d
            java.lang.String r5 = r10.e
            java.lang.String r6 = r10.f
            boolean r7 = r10.g
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.add(r0)
            goto L5f
        L80:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.k(wm5, k11):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
        if (defpackage.mh7.Z(r2, r1.a, false, true, new defpackage.x(11, r1, r11)) == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(me.magnum.melonds.domain.model.Cheat r23, defpackage.k11 r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof defpackage.lq5
            if (r2 == 0) goto L17
            r2 = r1
            lq5 r2 = (defpackage.lq5) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            lq5 r2 = new lq5
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 0
            o27 r6 = defpackage.o27.a
            me.magnum.melonds.database.MelonDatabase r7 = r0.b
            r8 = 2
            r9 = 0
            r10 = 1
            if (r4 == 0) goto L42
            if (r4 == r10) goto L3c
            if (r4 != r8) goto L36
            defpackage.me2.a0(r1)
            r21 = r6
            goto La7
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            return r9
        L3c:
            me.magnum.melonds.domain.model.Cheat r4 = r2.R
            defpackage.me2.a0(r1)
            goto L69
        L42:
            defpackage.me2.a0(r1)
            mk0 r1 = r7.s()
            java.lang.Long r4 = r23.getId()
            r4.getClass()
            long r11 = r4.longValue()
            r4 = r23
            r2.R = r4
            r2.Z = r10
            sq5 r1 = r1.a
            u4 r13 = new u4
            r14 = 4
            r13.<init>(r14, r11)
            java.lang.Object r1 = defpackage.mh7.Z(r2, r1, r10, r5, r13)
            if (r1 != r3) goto L69
            goto La6
        L69:
            rk0 r1 = (defpackage.rk0) r1
            if (r1 != 0) goto L6e
            return r6
        L6e:
            rk0 r11 = new rk0
            java.lang.Long r12 = r4.getId()
            long r13 = r1.b
            r21 = r6
            long r5 = r1.c
            java.lang.String r17 = r4.getName()
            java.lang.String r18 = r4.getDescription()
            java.lang.String r19 = r4.getCode()
            boolean r20 = r4.getEnabled()
            r15 = r5
            r11.<init>(r12, r13, r15, r17, r18, r19, r20)
            mk0 r1 = r7.s()
            r2.R = r9
            r2.Z = r8
            sq5 r4 = r1.a
            x r5 = new x
            r6 = 11
            r5.<init>(r6, r1, r11)
            r1 = 0
            java.lang.Object r1 = defpackage.mh7.Z(r2, r4, r1, r10, r5)
            if (r1 != r3) goto La7
        La6:
            return r3
        La7:
            v16 r0 = r0.c
            r0.i()
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.l(me.magnum.melonds.domain.model.Cheat, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.List r9, defpackage.k11 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.mq5
            if (r0 == 0) goto L13
            r0 = r10
            mq5 r0 = (defpackage.mq5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mq5 r0 = new mq5
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            o27 r3 = defpackage.o27.a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            defpackage.me2.a0(r10)
            goto L83
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r8 = 0
            return r8
        L30:
            defpackage.me2.a0(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.uq0.y0(r9, r2)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L42:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r9.next()
            me.magnum.melonds.domain.model.Cheat r2 = (me.magnum.melonds.domain.model.Cheat) r2
            am0 r5 = new am0
            java.lang.Long r6 = r2.getId()
            r6.getClass()
            long r6 = r6.longValue()
            boolean r2 = r2.getEnabled()
            r5.<init>(r6, r2)
            r10.add(r5)
            goto L42
        L66:
            me.magnum.melonds.database.MelonDatabase r9 = r8.b
            mk0 r9 = r9.s()
            r0.Y = r4
            sq5 r2 = r9.a
            ik0 r5 = new ik0
            r5.<init>(r9, r10, r4)
            r9 = 0
            java.lang.Object r9 = defpackage.mh7.Z(r0, r2, r9, r4, r5)
            p31 r10 = defpackage.p31.COROUTINE_SUSPENDED
            if (r9 != r10) goto L7f
            goto L80
        L7f:
            r9 = r3
        L80:
            if (r9 != r1) goto L83
            return r1
        L83:
            v16 r8 = r8.c
            r8.i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.m(java.util.List, k11):java.lang.Object");
    }
}
