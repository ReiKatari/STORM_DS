package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rm  reason: default package */
/* loaded from: classes.dex */
public final class rm extends nk6 implements mi2 {
    public io X;
    public j75 Y;
    public int Z;
    public final /* synthetic */ um c0;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ zm6 e0;
    public final /* synthetic */ long f0;
    public final /* synthetic */ mi2 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(um umVar, Object obj, zm6 zm6Var, long j, mi2 mi2Var, j11 j11Var) {
        super(1, j11Var);
        this.c0 = umVar;
        this.d0 = obj;
        this.e0 = zm6Var;
        this.f0 = j;
        this.g0 = mi2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        long j = this.f0;
        mi2 mi2Var = this.g0;
        return new rm(this.c0, this.d0, this.e0, j, mi2Var, (j11) obj).v(o27.a);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [j75, java.lang.Object] */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        io ioVar;
        j75 j75Var;
        zn znVar;
        zm6 zm6Var = this.e0;
        um umVar = this.c0;
        io ioVar2 = umVar.c;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Z;
        try {
            if (i != 0) {
                if (i == 1) {
                    j75Var = this.Y;
                    ioVar = this.X;
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                ioVar2.L = (oo) umVar.a.a.n(this.d0);
                umVar.e.setValue(zm6Var.L);
                umVar.d.setValue(Boolean.TRUE);
                io ioVar3 = new io(ioVar2.A, ioVar2.B.getValue(), jv3.r(ioVar2.L), ioVar2.R, Long.MIN_VALUE, ioVar2.Y);
                ?? obj2 = new Object();
                long j = this.f0;
                qm qmVar = new qm(umVar, ioVar3, this.g0, (Object) obj2, 0);
                this.X = ioVar3;
                this.Y = obj2;
                this.Z = 1;
                if (gk2.q(ioVar3, zm6Var, j, qmVar, this) == p31Var) {
                    return p31Var;
                }
                ioVar = ioVar3;
                j75Var = obj2;
            }
            if (j75Var.A) {
                znVar = zn.BoundReached;
            } else {
                znVar = zn.Finished;
            }
            um.b(umVar);
            return new fo(ioVar, znVar);
        } catch (CancellationException e) {
            um.b(umVar);
            throw e;
        }
    }
}
