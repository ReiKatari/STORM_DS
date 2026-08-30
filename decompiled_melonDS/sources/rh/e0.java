package rh;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import cd.q1;
import java.util.UUID;
import kf.b1;
import kf.r0;
import oe.h0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final b1 f12726b;

    /* renamed from: c  reason: collision with root package name */
    public final r0 f12727c;

    /* renamed from: d  reason: collision with root package name */
    public final d5.f f12728d;

    /* renamed from: e  reason: collision with root package name */
    public ve.f f12729e;

    /* renamed from: f  reason: collision with root package name */
    public ve.o f12730f;

    /* renamed from: g  reason: collision with root package name */
    public final q1 f12731g;

    /* renamed from: h  reason: collision with root package name */
    public final cd.y0 f12732h;

    /* renamed from: i  reason: collision with root package name */
    public final q1 f12733i;

    /* renamed from: j  reason: collision with root package name */
    public final cd.y0 f12734j;

    /* renamed from: k  reason: collision with root package name */
    public final q1 f12735k;

    /* renamed from: l  reason: collision with root package name */
    public final cd.y0 f12736l;
    public final q1 m;

    /* renamed from: n  reason: collision with root package name */
    public final cd.y0 f12737n;

    /* renamed from: o  reason: collision with root package name */
    public final q1 f12738o;

    /* renamed from: p  reason: collision with root package name */
    public final yb.n f12739p;

    /* renamed from: q  reason: collision with root package name */
    public final q1 f12740q;

    /* renamed from: r  reason: collision with root package name */
    public final yb.n f12741r;

    public e0(b1 b1Var, r0 r0Var, d5.f fVar, p0 p0Var) {
        UUID uuid;
        b1Var.getClass();
        r0Var.getClass();
        p0Var.getClass();
        this.f12726b = b1Var;
        this.f12727c = r0Var;
        this.f12728d = fVar;
        q1 c4 = cd.q.c(null);
        this.f12731g = c4;
        this.f12732h = new cd.y0(c4);
        q1 c10 = cd.q.c(null);
        this.f12733i = c10;
        this.f12734j = new cd.y0(c10);
        q1 c11 = cd.q.c(null);
        this.f12735k = c11;
        this.f12736l = new cd.y0(c11);
        q1 c12 = cd.q.c(null);
        this.m = c12;
        this.f12737n = new cd.y0(c12);
        this.f12738o = cd.q.c(null);
        this.f12739p = new yb.n(new mc.a(this) { // from class: rh.w
            public final /* synthetic */ e0 B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                switch (r2) {
                    case 0:
                        e0 e0Var = this.B;
                        zc.x.v(s0.h(e0Var), null, null, new y(e0Var, null, 4), 3);
                        return new cd.y0(e0Var.f12738o);
                    default:
                        e0 e0Var2 = this.B;
                        zc.x.v(s0.h(e0Var2), null, null, new y(e0Var2, null, 5), 3);
                        return new cd.y0(e0Var2.f12740q);
                }
            }
        });
        this.f12740q = cd.q.c(null);
        this.f12741r = new yb.n(new mc.a(this) { // from class: rh.w
            public final /* synthetic */ e0 B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                switch (r2) {
                    case 0:
                        e0 e0Var = this.B;
                        zc.x.v(s0.h(e0Var), null, null, new y(e0Var, null, 4), 3);
                        return new cd.y0(e0Var.f12738o);
                    default:
                        e0 e0Var2 = this.B;
                        zc.x.v(s0.h(e0Var2), null, null, new y(e0Var2, null, 5), 3);
                        return new cd.y0(e0Var2.f12740q);
                }
            }
        });
        String str = (String) p0Var.a("layout_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        if (uuid != null) {
            zc.x.v(s0.h(this), null, null, new mh.m(this, uuid, null, 8), 3);
        } else {
            ve.f fVar2 = new ve.f(null, null, ve.e.CUSTOM, ve.d.FOLLOW_SYSTEM, false, 50, zb.r.A);
            this.f12729e = fVar2;
            c4.k(null, fVar2);
        }
        zc.x.v(s0.h(this), null, null, new y(this, null, 0), 3);
        zc.x.v(s0.h(this), null, null, new y(this, null, 1), 3);
        zc.x.v(s0.h(this), null, null, new y(this, null, 2), 3);
        zc.x.v(s0.h(this), null, null, new y(this, null, 3), 3);
    }

    public static final void e(e0 e0Var, UUID uuid, ve.a aVar) {
        if (uuid == null) {
            q1 q1Var = e0Var.f12733i;
            h0 h0Var = new h0(null, aVar);
            q1Var.getClass();
            q1Var.k(null, h0Var);
            return;
        }
        zc.x.v(s0.h(e0Var), null, null, new b0(e0Var, uuid, aVar, null, 0), 3);
    }

    public static final void f(e0 e0Var, UUID uuid, ve.a aVar) {
        if (uuid == null) {
            q1 q1Var = e0Var.f12735k;
            h0 h0Var = new h0(null, aVar);
            q1Var.getClass();
            q1Var.k(null, h0Var);
            return;
        }
        zc.x.v(s0.h(e0Var), null, null, new b0(e0Var, uuid, aVar, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rh.a0
            if (r0 == 0) goto L13
            r0 = r6
            rh.a0 r0 = (rh.a0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            rh.a0 r0 = new rh.a0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r6)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r6)
            r0.Y = r3
            kf.r0 r6 = r4.f12727c
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            oe.a r6 = (oe.a) r6
            if (r6 == 0) goto L43
            java.lang.String r5 = r6.f10906b
            return r5
        L43:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.e0.g(java.util.UUID, ec.c):java.lang.Object");
    }

    public final void h(sh.d dVar, UUID uuid) {
        q1 q1Var;
        Object value;
        sh.b bVar;
        q1 q1Var2;
        Object value2;
        sh.b bVar2;
        dVar.getClass();
        int i2 = z.f12746a[dVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                do {
                    q1Var2 = this.f12740q;
                    value2 = q1Var2.getValue();
                    sh.b bVar3 = (sh.b) value2;
                    if (bVar3 != null) {
                        bVar2 = sh.b.a(bVar3, uuid, null, 2);
                    } else {
                        bVar2 = null;
                    }
                } while (!q1Var2.i(value2, bVar2));
                return;
            }
            m9.o.o();
            return;
        }
        do {
            q1Var = this.f12738o;
            value = q1Var.getValue();
            sh.b bVar4 = (sh.b) value;
            if (bVar4 != null) {
                bVar = sh.b.a(bVar4, uuid, null, 2);
            } else {
                bVar = null;
            }
        } while (!q1Var.i(value, bVar));
    }
}
