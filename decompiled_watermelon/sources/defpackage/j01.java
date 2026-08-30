package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j01  reason: default package */
/* loaded from: classes.dex */
public final class j01 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ long Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(hv1 hv1Var, fv1 fv1Var, long j, jb4 jb4Var, lb4 lb4Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = hv1Var;
        this.d0 = fv1Var;
        this.Z = j;
        this.e0 = jb4Var;
        this.f0 = lb4Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((j01) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((j01) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        switch (i) {
            case 0:
                j01 j01Var = new j01((k01) obj4, (s37) obj3, (v50) obj2, this.Z, j11Var);
                j01Var.c0 = obj;
                return j01Var;
            default:
                return new j01((hv1) this.c0, (fv1) obj4, this.Z, (jb4) obj3, (lb4) obj2, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        CancellationException cancellationException;
        boolean z;
        Object e;
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        switch (i) {
            case 0:
                k01 k01Var = (k01) obj4;
                l50 l50Var = k01Var.o0;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            try {
                                me2.a0(obj);
                            } catch (Throwable th) {
                                th = th;
                                cancellationException = null;
                                k01Var.r0 = false;
                                l50Var.a(cancellationException);
                                k01Var.p0 = false;
                                throw th;
                            }
                        } else {
                            i.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        me2.a0(obj);
                        c63 D = ln2.D(((o31) this.c0).w());
                        try {
                            k01Var.r0 = true;
                            ax5 ax5Var = k01Var.k0;
                            r24 r24Var = r24.Default;
                            i01 i01Var = new i01((s37) obj3, k01Var, (v50) obj2, this.Z, D, (j11) null);
                            this.Y = 1;
                            if (ax5Var.f(r24Var, i01Var, this) == p31Var) {
                                return p31Var;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cancellationException = null;
                            k01Var.r0 = false;
                            l50Var.a(cancellationException);
                            k01Var.p0 = false;
                            throw th;
                        }
                    }
                    l50Var.b();
                    k01Var.r0 = false;
                    l50Var.a(null);
                    k01Var.p0 = false;
                    return o27.a;
                } catch (CancellationException e2) {
                    cancellationException = e2;
                    try {
                        throw cancellationException;
                    } catch (Throwable th3) {
                        th = th3;
                        k01Var.r0 = false;
                        l50Var.a(cancellationException);
                        k01Var.p0 = false;
                        throw th;
                    }
                }
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        e = ((nc5) obj).A;
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    ra4 ra4Var = ((hv1) this.c0).i;
                    fv1 fv1Var = (fv1) obj4;
                    String str = fv1Var.a;
                    String str2 = fv1Var.b;
                    long j = fv1Var.c;
                    String str3 = fv1Var.f;
                    jb4 jb4Var = (jb4) obj3;
                    if (jb4Var == jb4.HARDCORE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.Y = 1;
                    e = ra4Var.e(str, str2, j, str3, this.Z, z, jb4Var, (lb4) obj2, this);
                    if (e == p31Var2) {
                        return p31Var2;
                    }
                }
                return new nc5(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(k01 k01Var, s37 s37Var, v50 v50Var, long j, j11 j11Var) {
        super(2, j11Var);
        this.d0 = k01Var;
        this.e0 = s37Var;
        this.f0 = v50Var;
        this.Z = j;
    }
}
