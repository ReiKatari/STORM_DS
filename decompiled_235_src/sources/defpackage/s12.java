package defpackage;

import defpackage.sz1;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s12  reason: default package */
/* loaded from: classes.dex */
public final class s12 implements ne2 {
    public final /* synthetic */ sz1 A;
    public final /* synthetic */ nv4 B;
    public final /* synthetic */ pq5 L;

    public s12(sz1 sz1Var, nv4 nv4Var, pq5 pq5Var) {
        this.A = sz1Var;
        this.B = nv4Var;
        this.L = pq5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    @Override // defpackage.ne2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bv4 bv4Var, r41 r41Var) {
        r12 r12Var;
        Object obj;
        int i;
        if (r41Var instanceof r12) {
            r12Var = (r12) r41Var;
            int i2 = r12Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r12Var.Y = i2 - Integer.MIN_VALUE;
                obj = r12Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = r12Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.A.Q0.l(bv4Var);
                    sz1 sz1Var = this.A;
                    sz1Var.e1(new pb5(bv4Var.c.a, sz1Var.o.a()), "pending_snapshot_changed");
                    lc5 lc5Var = bv4Var.c;
                    int i3 = lc5Var.a;
                    xv2 xv2Var = this.A.m;
                    if (i3 == 0) {
                        gd5 gd5Var = bv4Var.a;
                        xv2Var.b(gd5Var.a, gd5Var.c);
                        q33 q33Var = this.A.g0;
                        int i4 = bv4Var.c.a;
                        synchronized (q33Var) {
                            if (q33Var.A && i4 == 0) {
                                q33Var.A = false;
                                sz1 sz1Var2 = this.A;
                                hv.L(sz1Var2.z, null, null, new a12(sz1Var2, this.B, (r41) null), 3);
                                return jg7.a;
                            }
                            if (this.A.o.a()) {
                                sz1 sz1Var3 = this.A;
                                gd5 gd5Var2 = bv4Var.a;
                                r12Var.Y = 1;
                                obj = sz1Var3.N0(gd5Var2, r12Var);
                                if (obj == x61Var) {
                                    return x61Var;
                                }
                            }
                        }
                    } else {
                        gd5 gd5Var3 = bv4Var.a;
                        xv2Var.c(lc5Var.b, lc5Var.c, gd5Var3.a, gd5Var3.c, this.L.a);
                    }
                    return jg7.a;
                }
                if (((Boolean) obj).booleanValue()) {
                    sz1 sz1Var4 = this.A;
                    sz1Var4.G = sz1.b.ONLINE_LIVE;
                    sz1Var4.w.d = false;
                }
                return jg7.a;
            }
        }
        r12Var = new r12(this, r41Var);
        obj = r12Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = r12Var.Y;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return jg7.a;
    }
}
