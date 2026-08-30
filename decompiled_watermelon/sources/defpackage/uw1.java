package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uw1  reason: default package */
/* loaded from: classes.dex */
public final class uw1 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ boolean d0;
    public Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(hv1 hv1Var, rg5 rg5Var, boolean z, String str, j11 j11Var) {
        super(2, j11Var);
        this.Z = hv1Var;
        this.c0 = rg5Var;
        this.d0 = z;
        this.e0 = str;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((uw1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((uw1) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((uw1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((uw1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        boolean z = this.d0;
        Object obj2 = this.c0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                uw1 uw1Var = new uw1((hv1) obj3, (rg5) obj2, z, j11Var);
                uw1Var.e0 = obj;
                return uw1Var;
            case 1:
                return new uw1((hv1) obj3, (rg5) obj2, this.d0, (String) this.e0, j11Var);
            case 2:
                return new uw1((um) this.e0, this.d0, (xy6) obj3, (ki2) obj2, j11Var);
            default:
                return new uw1((k24) obj3, z, (l14) obj2, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object kc5Var;
        Object V;
        float f;
        l33 it4Var;
        int i = this.X;
        o27 o27Var = o27.a;
        boolean z = this.d0;
        Object obj2 = this.c0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                o31 o31Var = (o31) this.e0;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            me2.a0(obj);
                            V = obj;
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        tw1 tw1Var = new tw1((hv1) obj3, (rg5) obj2, this.d0, null, 1);
                        this.e0 = null;
                        this.Y = 1;
                        V = ln2.V(12000L, tw1Var, this);
                        if (V == p31Var) {
                            return p31Var;
                        }
                    }
                    kc5Var = (a25) V;
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                return new nc5(kc5Var);
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
                ud5 ud5Var = ((hv1) obj3).g;
                this.Y = 1;
                if (((dl) ud5Var).z(((rg5) obj2).i, z, (String) this.e0, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    um umVar = (um) this.e0;
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = RecyclerView.A1;
                    }
                    this.Y = 1;
                    if (um.c(umVar, new Float(f), (xy6) obj3, null, this, 12) == p31Var3) {
                        return p31Var3;
                    }
                }
                ((ki2) obj2).c();
                return o27Var;
            default:
                k24 k24Var = (k24) obj3;
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        k24Var = (k24) this.e0;
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    jt4 jt4Var = (jt4) k24Var.getValue();
                    if (jt4Var != null) {
                        l14 l14Var = (l14) obj2;
                        if (z) {
                            it4Var = new kt4(jt4Var);
                        } else {
                            it4Var = new it4(jt4Var);
                        }
                        if (l14Var != null) {
                            this.e0 = k24Var;
                            this.Y = 1;
                            if (l14Var.a(it4Var, this) == p31Var4) {
                                return p31Var4;
                            }
                        }
                    } else {
                        return o27Var;
                    }
                }
                k24Var.setValue(null);
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(hv1 hv1Var, rg5 rg5Var, boolean z, j11 j11Var) {
        super(2, j11Var);
        this.Z = hv1Var;
        this.c0 = rg5Var;
        this.d0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(um umVar, boolean z, xy6 xy6Var, ki2 ki2Var, j11 j11Var) {
        super(2, j11Var);
        this.e0 = umVar;
        this.d0 = z;
        this.Z = xy6Var;
        this.c0 = ki2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(k24 k24Var, boolean z, l14 l14Var, j11 j11Var) {
        super(2, j11Var);
        this.Z = k24Var;
        this.d0 = z;
        this.c0 = l14Var;
    }
}
