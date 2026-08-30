package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: se5  reason: default package */
/* loaded from: classes.dex */
public abstract class se5 extends ra7 {
    public final ud5 b;
    public final w16 c;
    public final ee6 d;
    public final il6 e;
    public final c46 f;
    public final o45 g;
    public kd6 h;

    public se5(ud5 ud5Var, w16 w16Var) {
        ud5Var.getClass();
        w16Var.getClass();
        this.b = ud5Var;
        this.c = w16Var;
        this.d = fe6.a(lp5.a);
        this.e = new il6(new bz2(13, this));
        c46 b = d46.b(0, 1, h60.DROP_OLDEST, 1);
        this.f = b;
        this.g = new o45(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object l(defpackage.se5 r4, defpackage.rg5 r5, boolean r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ne5
            if (r0 == 0) goto L13
            r0 = r7
            ne5 r0 = (defpackage.ne5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ne5 r0 = new ne5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            defpackage.me2.a0(r7)
            nc5 r7 = (defpackage.nc5) r7
            java.lang.Object r4 = r7.A
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L32:
            defpackage.me2.a0(r7)
            ud5 r4 = r4.b
            java.lang.String r5 = r5.i
            r0.Y = r3
            dl r4 = (defpackage.dl) r4
            java.lang.Object r4 = r4.p(r5, r6, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se5.l(se5, rg5, boolean, k11):java.lang.Object");
    }

    public abstract Object e(ArrayList arrayList, Map map, k11 k11Var);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.j15 r8, defpackage.j11 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.me5
            if (r0 == 0) goto L14
            r0 = r9
            me5 r0 = (defpackage.me5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me5 r0 = new me5
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.R
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            defpackage.me2.a0(r9)
            nc5 r9 = (defpackage.nc5) r9
            java.lang.Object r7 = r9.A
            return r7
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L34:
            defpackage.me2.a0(r9)
            long r8 = r8.a
            r6.Y = r2
            r5 = 25
            ud5 r7 = r7.b
            r1 = r7
            dl r1 = (defpackage.dl) r1
            r4 = 1
            r2 = r8
            java.lang.Object r7 = r1.o(r2, r4, r5, r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se5.f(j15, j11):java.lang.Object");
    }

    public abstract Object g(rg5 rg5Var, k11 k11Var);

    public abstract rg5 h();

    public abstract Serializable i(k11 k11Var);

    public abstract Serializable j(k11 k11Var);

    public Object k(rg5 rg5Var, boolean z, j11 j11Var) {
        return l(this, rg5Var, z, (k11) j11Var);
    }

    public final void m() {
        kd6 kd6Var = this.h;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.h = tq5.w(ua7.a(this), null, null, new qe5(this, null), 3);
    }
}
