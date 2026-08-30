package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ow1  reason: default package */
/* loaded from: classes.dex */
public final class ow1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ hv1 Z;
    public final /* synthetic */ fv1 c0;
    public final /* synthetic */ long d0;
    public final /* synthetic */ long e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow1(hv1 hv1Var, fv1 fv1Var, long j, long j2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = hv1Var;
        this.c0 = fv1Var;
        this.d0 = j;
        this.e0 = j2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ow1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ow1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ow1(this.Z, this.c0, this.d0, this.e0, j11Var, 0);
            default:
                return new ow1(this.Z, this.c0, this.d0, this.e0, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z;
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        ((nc5) obj).getClass();
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ra4 ra4Var = this.Z.i;
                fv1 fv1Var = this.c0;
                String str = fv1Var.a;
                String str2 = fv1Var.b;
                long j = fv1Var.c;
                String str3 = fv1Var.f;
                jb4 jb4Var = fv1Var.d;
                if (jb4Var == jb4.HARDCORE) {
                    z = true;
                } else {
                    z = false;
                }
                lb4 lb4Var = fv1Var.e;
                this.Y = 1;
                if (ra4Var.d(str, str2, j, str3, this.d0, this.e0, z, jb4Var, lb4Var, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            default:
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
                bb1 bb1Var = tg1.a;
                ha1 ha1Var = ha1.L;
                ow1 ow1Var = new ow1(this.Z, this.c0, this.d0, this.e0, null, 0);
                this.Y = 1;
                if (tq5.G(ha1Var, ow1Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
