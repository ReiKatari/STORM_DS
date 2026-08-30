package defpackage;

import android.content.Context;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z33  reason: default package */
/* loaded from: classes.dex */
public final class z33 {
    public static final Type g;
    public final Context a;
    public final qo2 b;
    public final v16 c;
    public boolean e;
    public final b34 d = new b34();
    public final ee6 f = fe6.a(pp1.A);

    static {
        Type type = new n07().b;
        type.getClass();
        g = type;
    }

    public z33(Context context, qo2 qo2Var, v16 v16Var) {
        this.a = context;
        this.b = qo2Var;
        this.c = v16Var;
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
    public final java.lang.Object a(defpackage.vy r12, defpackage.k11 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.w33
            if (r0 == 0) goto L13
            r0 = r13
            w33 r0 = (defpackage.w33) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            w33 r0 = new w33
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            o27 r3 = defpackage.o27.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.me2.a0(r13)
            return r3
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            return r6
        L33:
            vy r12 = r0.R
            defpackage.me2.a0(r13)
            goto L47
        L39:
            defpackage.me2.a0(r13)
            r0.R = r12
            r0.Z = r5
            java.lang.Object r13 = r11.b(r0)
            if (r13 != r1) goto L47
            goto Lb3
        L47:
            ee6 r13 = r11.f
            java.lang.Object r2 = r13.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L53:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r2.next()
            r8 = r7
            dd1 r8 = (defpackage.dd1) r8
            boolean r9 = r8.b
            if (r9 != 0) goto L53
            java.lang.Object r8 = r8.a
            vy r8 = (defpackage.vy) r8
            java.util.UUID r8 = r8.a
            java.util.UUID r9 = r12.a
            boolean r8 = defpackage.b53.x(r8, r9)
            if (r8 == 0) goto L53
            goto L74
        L73:
            r7 = r6
        L74:
            dd1 r7 = (defpackage.dd1) r7
            if (r7 == 0) goto Lb4
        L78:
            java.lang.Object r12 = r13.getValue()
            r2 = r12
            java.util.List r2 = (java.util.List) r2
            int r8 = r2.indexOf(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            java.lang.Object r2 = r7.a
            dd1 r10 = new dd1
            r10.<init>(r5, r2)
            r9.set(r8, r10)
            boolean r12 = r13.j(r12, r9)
            if (r12 == 0) goto L78
            r0.R = r6
            r0.Z = r4
            bb1 r12 = defpackage.tg1.a
            ha1 r12 = defpackage.ha1.L
            x3 r13 = new x3
            r2 = 10
            r13.<init>(r11, r6, r2)
            java.lang.Object r11 = defpackage.tq5.G(r12, r13, r0)
            p31 r12 = defpackage.p31.COROUTINE_SUSPENDED
            if (r11 != r12) goto Lb0
            goto Lb1
        Lb0:
            r11 = r3
        Lb1:
            if (r11 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z33.a(vy, k11):java.lang.Object");
    }

    public final Object b(k11 k11Var) {
        bb1 bb1Var = tg1.a;
        Object G = tq5.G(ha1.L, new wx1(this, (j11) null, 9), k11Var);
        if (G == p31.COROUTINE_SUSPENDED) {
            return G;
        }
        return o27.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r6, defpackage.k11 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.x33
            if (r0 == 0) goto L13
            r0 = r7
            x33 r0 = (defpackage.x33) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            x33 r0 = new x33
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.util.UUID r6 = r0.R
            defpackage.me2.a0(r7)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L30:
            defpackage.me2.a0(r7)
            r0.R = r6
            r0.Z = r4
            java.lang.Object r7 = r5.b(r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            ee6 r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L68
            java.lang.Object r7 = r5.next()
            r0 = r7
            dd1 r0 = (defpackage.dd1) r0
            boolean r1 = r0.b
            if (r1 != 0) goto L4a
            java.lang.Object r0 = r0.a
            vy r0 = (defpackage.vy) r0
            java.util.UUID r0 = r0.a
            boolean r0 = defpackage.b53.x(r0, r6)
            if (r0 == 0) goto L4a
            goto L69
        L68:
            r7 = r3
        L69:
            dd1 r7 = (defpackage.dd1) r7
            if (r7 == 0) goto L72
            java.lang.Object r5 = r7.a
            vy r5 = (defpackage.vy) r5
            return r5
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z33.c(java.util.UUID, k11):java.lang.Object");
    }
}
