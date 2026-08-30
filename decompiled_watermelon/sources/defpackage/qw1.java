package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qw1  reason: default package */
/* loaded from: classes.dex */
public final class qw1 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ w92 Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ hv1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw1(int i, j11 j11Var, hv1 hv1Var) {
        super(3, j11Var);
        this.X = i;
        this.d0 = hv1Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        hv1 hv1Var = this.d0;
        w92 w92Var = (w92) obj;
        j11 j11Var = (j11) obj3;
        switch (i) {
            case 0:
                qw1 qw1Var = new qw1(0, j11Var, hv1Var);
                qw1Var.Z = w92Var;
                qw1Var.c0 = obj2;
                return qw1Var.v(o27Var);
            case 1:
                qw1 qw1Var2 = new qw1(1, j11Var, hv1Var);
                qw1Var2.Z = w92Var;
                qw1Var2.c0 = obj2;
                return qw1Var2.v(o27Var);
            default:
                qw1 qw1Var3 = new qw1(2, j11Var, hv1Var);
                qw1Var3.Z = w92Var;
                qw1Var3.c0 = obj2;
                return qw1Var3.v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        UUID uuid;
        u92 ja2Var;
        ti5 ti5Var;
        st1 st1Var;
        ti5 ti5Var2;
        u92 ln0Var;
        rg5 rg5Var;
        int i = this.X;
        o27 o27Var = o27.a;
        hv1 hv1Var = this.d0;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var = this.Z;
                ja2 ja2Var2 = new ja2(hv1Var.q.e((UUID) this.c0), new rw1(0, (j11) null, hv1Var));
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (se.s(w92Var, ja2Var2, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var2 = this.Z;
                rg5 rg5Var2 = (rg5) this.c0;
                if (rg5Var2 != null && (ti5Var = rg5Var2.f) != null) {
                    uuid = ti5Var.c;
                } else {
                    uuid = null;
                }
                if (uuid == null) {
                    ja2Var = hv1.t(hv1Var);
                } else {
                    ja2Var = new ja2(hv1Var.q.e(uuid), new rw1(1, (j11) null, hv1Var));
                }
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (se.s(w92Var2, ja2Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var3 = this.Z;
                wt1 wt1Var = (wt1) this.c0;
                if (wt1Var instanceof st1) {
                    st1Var = (st1) wt1Var;
                } else {
                    st1Var = null;
                }
                if (st1Var != null && (rg5Var = st1Var.a) != null) {
                    ti5Var2 = rg5Var.f;
                } else {
                    ti5Var2 = null;
                }
                w16 w16Var = hv1Var.c;
                if (ti5Var2 == null) {
                    ln0Var = ((b56) w16Var).i;
                } else {
                    b56 b56Var = (b56) w16Var;
                    b56Var.getClass();
                    ln0Var = new ln0(5, new u92[]{b56Var.i, b56Var.E(), b56Var.D(), b56Var.C()}, new x46(b56Var, ti5Var2, null));
                }
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (se.s(w92Var3, ln0Var, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
        }
    }
}
