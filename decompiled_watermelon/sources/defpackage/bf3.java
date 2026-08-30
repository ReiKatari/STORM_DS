package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bf3  reason: default package */
/* loaded from: classes.dex */
public final class bf3 extends ra7 {
    public final k43 b;
    public final z33 c;
    public final tf0 d;
    public final w16 e;
    public final UUID f;
    public nd3 g;
    public o17 h;
    public final ee6 i;
    public final q45 j;
    public final ee6 k;
    public final q45 l;
    public final ee6 m;
    public final q45 n;
    public final ee6 o;
    public final q45 p;
    public final ee6 q;
    public final il6 r;
    public final ee6 s;
    public final il6 t;

    public bf3(k43 k43Var, z33 z33Var, tf0 tf0Var, w16 w16Var, pt5 pt5Var) {
        UUID uuid;
        k43Var.getClass();
        z33Var.getClass();
        w16Var.getClass();
        pt5Var.getClass();
        this.b = k43Var;
        this.c = z33Var;
        this.d = tf0Var;
        this.e = w16Var;
        String str = (String) pt5Var.a("layout_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        this.f = uuid;
        ee6 a = fe6.a(null);
        this.i = a;
        this.j = new q45(a);
        ee6 a2 = fe6.a(null);
        this.k = a2;
        this.l = new q45(a2);
        ee6 a3 = fe6.a(null);
        this.m = a3;
        this.n = new q45(a3);
        ee6 a4 = fe6.a(null);
        this.o = a4;
        this.p = new q45(a4);
        this.q = fe6.a(null);
        this.r = new il6(new ki2(this) { // from class: se3
            public final /* synthetic */ bf3 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                bf3 bf3Var = this.B;
                switch (i) {
                    case 0:
                        tq5.w(ua7.a(bf3Var), null, null, new ue3(bf3Var, null, 4), 3);
                        return new q45(bf3Var.q);
                    default:
                        tq5.w(ua7.a(bf3Var), null, null, new ue3(bf3Var, null, 5), 3);
                        return new q45(bf3Var.s);
                }
            }
        });
        this.s = fe6.a(null);
        this.t = new il6(new ki2(this) { // from class: se3
            public final /* synthetic */ bf3 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                bf3 bf3Var = this.B;
                switch (i) {
                    case 0:
                        tq5.w(ua7.a(bf3Var), null, null, new ue3(bf3Var, null, 4), 3);
                        return new q45(bf3Var.q);
                    default:
                        tq5.w(ua7.a(bf3Var), null, null, new ue3(bf3Var, null, 5), 3);
                        return new q45(bf3Var.s);
                }
            }
        });
        Boolean bool = (Boolean) pt5Var.a("is_external");
        if (uuid != null) {
            tq5.w(ua7.a(this), null, null, new ba1(this, uuid, null, 20), 3);
        } else {
            nd3 nd3Var = new nd3(null, null, ld3.CUSTOM, kd3.FOLLOW_SYSTEM, false, 50, qp1.A);
            this.g = nd3Var;
            a.l(null, nd3Var);
        }
        tq5.w(ua7.a(this), null, null, new ue3(this, null, 0), 3);
        tq5.w(ua7.a(this), null, null, new ue3(this, null, 1), 3);
        tq5.w(ua7.a(this), null, null, new ue3(this, null, 2), 3);
        tq5.w(ua7.a(this), null, null, new ue3(this, null, 3), 3);
    }

    public static final void e(bf3 bf3Var, UUID uuid, BackgroundMode backgroundMode) {
        if (uuid == null) {
            ee6 ee6Var = bf3Var.k;
            bs5 bs5Var = new bs5(null, backgroundMode);
            ee6Var.getClass();
            ee6Var.l(null, bs5Var);
            return;
        }
        tq5.w(ua7.a(bf3Var), null, null, new xe3(bf3Var, uuid, backgroundMode, null, 0), 3);
    }

    public static final void f(bf3 bf3Var, UUID uuid, BackgroundMode backgroundMode) {
        if (uuid == null) {
            ee6 ee6Var = bf3Var.m;
            bs5 bs5Var = new bs5(null, backgroundMode);
            ee6Var.getClass();
            ee6Var.l(null, bs5Var);
            return;
        }
        tq5.w(ua7.a(bf3Var), null, null, new xe3(bf3Var, uuid, backgroundMode, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r6, defpackage.k11 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.we3
            if (r0 == 0) goto L13
            r0 = r7
            we3 r0 = (defpackage.we3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            we3 r0 = new we3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r7)
            goto L3c
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r7)
            r0.Y = r4
            z33 r5 = r5.c
            java.lang.Object r7 = r5.c(r6, r0)
            if (r7 != r1) goto L3c
            return r1
        L3c:
            vy r7 = (defpackage.vy) r7
            if (r7 == 0) goto L43
            java.lang.String r5 = r7.b
            return r5
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf3.g(java.util.UUID, k11):java.lang.Object");
    }

    public final void h(ug3 ug3Var, UUID uuid) {
        ee6 ee6Var;
        Object value;
        tc3 tc3Var;
        ee6 ee6Var2;
        Object value2;
        tc3 tc3Var2;
        ug3Var.getClass();
        int i = ve3.a[ug3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                do {
                    ee6Var2 = this.s;
                    value2 = ee6Var2.getValue();
                    tc3 tc3Var3 = (tc3) value2;
                    if (tc3Var3 != null) {
                        tc3Var2 = tc3.a(tc3Var3, uuid, null, 2);
                    } else {
                        tc3Var2 = null;
                    }
                } while (!ee6Var2.j(value2, tc3Var2));
                return;
            }
            i.c();
            return;
        }
        do {
            ee6Var = this.q;
            value = ee6Var.getValue();
            tc3 tc3Var4 = (tc3) value;
            if (tc3Var4 != null) {
                tc3Var = tc3.a(tc3Var4, uuid, null, 2);
            } else {
                tc3Var = null;
            }
        } while (!ee6Var.j(value, tc3Var));
    }

    public final void i(String str) {
        String str2;
        nd3 nd3Var;
        str.getClass();
        while (true) {
            ee6 ee6Var = this.i;
            Object value = ee6Var.getValue();
            nd3 nd3Var2 = (nd3) value;
            if (nd3Var2 != null) {
                str2 = str;
                nd3Var = nd3.a(nd3Var2, null, str2, null, null, false, 0, null, 125);
            } else {
                str2 = str;
                nd3Var = null;
            }
            if (ee6Var.j(value, nd3Var)) {
                return;
            }
            str = str2;
        }
    }
}
