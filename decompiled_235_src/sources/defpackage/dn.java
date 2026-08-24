package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn  reason: default package */
/* loaded from: classes.dex */
public final class dn extends hw6 implements qn2 {
    public uo X;
    public zg5 Y;
    public int Z;
    public final /* synthetic */ gn d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ jz6 f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ qn2 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(gn gnVar, Object obj, jz6 jz6Var, long j, qn2 qn2Var, r41 r41Var) {
        super(1, r41Var);
        this.d0 = gnVar;
        this.e0 = obj;
        this.f0 = jz6Var;
        this.g0 = j;
        this.h0 = qn2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        long j = this.g0;
        qn2 qn2Var = this.h0;
        return new dn(this.d0, this.e0, this.f0, j, qn2Var, (r41) obj).s(jg7.a);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [zg5, java.lang.Object] */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        uo uoVar;
        zg5 zg5Var;
        mo moVar;
        jz6 jz6Var = this.f0;
        gn gnVar = this.d0;
        uo uoVar2 = gnVar.c;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Z;
        try {
            if (i != 0) {
                if (i == 1) {
                    zg5Var = this.Y;
                    uoVar = this.X;
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                uoVar2.L = (ap) gnVar.a.a.g(this.e0);
                gnVar.e.setValue(jz6Var.L);
                gnVar.d.setValue(Boolean.TRUE);
                uo uoVar3 = new uo(uoVar2.A, uoVar2.B.getValue(), nw7.R(uoVar2.L), uoVar2.R, Long.MIN_VALUE, uoVar2.Y);
                ?? obj2 = new Object();
                long j = this.g0;
                cn cnVar = new cn(gnVar, uoVar3, this.h0, (Object) obj2, 0);
                this.X = uoVar3;
                this.Y = obj2;
                this.Z = 1;
                if (kj2.k(uoVar3, jz6Var, j, cnVar, this) == x61Var) {
                    return x61Var;
                }
                uoVar = uoVar3;
                zg5Var = obj2;
            }
            if (zg5Var.A) {
                moVar = mo.BoundReached;
            } else {
                moVar = mo.Finished;
            }
            gn.b(gnVar);
            return new ro(uoVar, moVar);
        } catch (CancellationException e) {
            gn.b(gnVar);
            throw e;
        }
    }
}
