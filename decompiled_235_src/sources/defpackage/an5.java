package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: an5  reason: default package */
/* loaded from: classes.dex */
public final class an5 extends hw6 implements qn2 {
    public int X;
    public final /* synthetic */ bn5 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ArrayList d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an5(bn5 bn5Var, long j, ArrayList arrayList, r41 r41Var) {
        super(1, r41Var);
        this.Y = bn5Var;
        this.Z = j;
        this.d0 = arrayList;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        long j = this.Z;
        ArrayList arrayList = this.d0;
        return new an5(this.Y, j, arrayList, (r41) obj).s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            this.X = 1;
            if (vm5.J(this.Y, this.Z, this.d0, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
