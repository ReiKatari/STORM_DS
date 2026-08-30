package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ax1  reason: default package */
/* loaded from: classes.dex */
public final class ax1 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ hv1 Y;
    public final /* synthetic */ fv1 Z;
    public final /* synthetic */ long c0;
    public final /* synthetic */ long d0;
    public final /* synthetic */ long e0;
    public final /* synthetic */ long f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(hv1 hv1Var, fv1 fv1Var, long j, long j2, long j3, long j4, j11 j11Var) {
        super(2, j11Var);
        this.Y = hv1Var;
        this.Z = fv1Var;
        this.c0 = j;
        this.d0 = j2;
        this.e0 = j3;
        this.f0 = j4;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((ax1) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new ax1(this.Y, this.Z, this.c0, this.d0, this.e0, this.f0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object obj2;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        fv1 fv1Var = this.Z;
        hv1 hv1Var = this.Y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    me2.a0(obj);
                    obj2 = ((nc5) obj).A;
                    me2.a0(obj2);
                    return o27.a;
                }
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            me2.a0(obj);
        } else {
            me2.a0(obj);
            b74 b74Var = hv1Var.h;
            v15 v15Var = new v15(fv1Var.c, this.c0, true, false);
            this.X = 1;
            if (b74Var.b(v15Var, this) == p31Var) {
                return p31Var;
            }
        }
        ra4 ra4Var = hv1Var.i;
        String str = fv1Var.a;
        String str2 = fv1Var.b;
        long j = fv1Var.c;
        String str3 = fv1Var.f;
        jb4 jb4Var = jb4.SOFTCORE;
        lb4 lb4Var = fv1Var.e;
        this.X = 2;
        Object b = ra4Var.b(str, str2, j, this.c0, str3, this.d0, this.e0, this.f0, jb4Var, lb4Var, this);
        if (b == p31Var) {
            return p31Var;
        }
        obj2 = b;
        me2.a0(obj2);
        return o27.a;
    }
}
