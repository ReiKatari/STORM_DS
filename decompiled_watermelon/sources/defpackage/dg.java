package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg  reason: default package */
/* loaded from: classes.dex */
public final class dg implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vp4 vp4Var, j11 j11Var) {
        int i = this.a;
        Object obj = this.b;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                Object m = ve2.m(vp4Var, new cg((eg) obj, null, 0), j11Var);
                if (m == p31.COROUTINE_SUSPENDED) {
                    return m;
                }
                return o27Var;
            case 1:
                Object d = xm6.d(vp4Var, null, new he1((ke1) obj, 2), j11Var, 7);
                if (d == p31.COROUTINE_SUSPENDED) {
                    return d;
                }
                return o27Var;
            case 2:
                Object k = iq2.k(new ba1(vp4Var, (ya1) obj, null, 23), j11Var);
                if (k == p31.COROUTINE_SUSPENDED) {
                    return k;
                }
                return o27Var;
            case 3:
                Object R0 = ((uk6) vp4Var).R0(new cg((o21) obj, null, 2), j11Var);
                if (R0 == p31.COROUTINE_SUSPENDED) {
                    return R0;
                }
                return o27Var;
            case 4:
                Object m2 = ve2.m(vp4Var, new lj3((mh6) obj, null, 2), j11Var);
                if (m2 == p31.COROUTINE_SUSPENDED) {
                    return m2;
                }
                return o27Var;
            case 5:
                Object m3 = ve2.m(vp4Var, new cg(new fa5(1, (eo6) obj, eo6.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 3), null, 1), j11Var);
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                if (m3 != p31Var) {
                    m3 = o27Var;
                }
                if (m3 == p31Var) {
                    return m3;
                }
                return o27Var;
            case ig7.b /* 6 */:
                bq6 bq6Var = (bq6) obj;
                qh qhVar = bq6Var.A;
                zp6 zp6Var = bq6Var.z;
                uk6 uk6Var = (uk6) vp4Var;
                uk6Var.getClass();
                Object m4 = ve2.m(vp4Var, new lj3(new sh(l.P(uk6Var).v0), qhVar, zp6Var, null), j11Var);
                if (m4 != p31.COROUTINE_SUSPENDED) {
                    m4 = o27Var;
                }
                if (m4 == p31.COROUTINE_SUSPENDED) {
                    return m4;
                }
                return o27Var;
            default:
                Object k2 = iq2.k(new ug(vp4Var, (vo6) obj, null, 5), j11Var);
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                if (k2 != p31Var2) {
                    k2 = o27Var;
                }
                if (k2 == p31Var2) {
                    return k2;
                }
                return o27Var;
        }
    }
}
