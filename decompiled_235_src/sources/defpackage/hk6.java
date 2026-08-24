package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk6  reason: default package */
/* loaded from: classes.dex */
public final class hk6 extends hw6 implements fo2 {
    public int X;
    public /* synthetic */ j25 Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ float e0;
    public final /* synthetic */ qa4 f0;
    public final /* synthetic */ pp6 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk6(boolean z, float f, qa4 qa4Var, pp6 pp6Var, r41 r41Var) {
        super(3, r41Var);
        this.d0 = z;
        this.e0 = f;
        this.f0 = qa4Var;
        this.g0 = pp6Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j = ((jk4) obj2).a;
        qa4 qa4Var = this.f0;
        pp6 pp6Var = this.g0;
        hk6 hk6Var = new hk6(this.d0, this.e0, qa4Var, pp6Var, (r41) obj3);
        hk6Var.Y = (j25) obj;
        hk6Var.Z = j;
        return hk6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        float intBitsToFloat;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        qa4 qa4Var = this.f0;
        try {
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                j25 j25Var = this.Y;
                long j = this.Z;
                if (this.d0) {
                    intBitsToFloat = this.e0 - Float.intBitsToFloat((int) (j >> 32));
                } else {
                    intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                }
                qa4Var.setValue(new Float(intBitsToFloat - ((Number) this.g0.getValue()).floatValue()));
                this.X = 1;
                if (j25Var.b(this) == x61Var) {
                    return x61Var;
                }
            }
        } catch (tr2 unused) {
            qa4Var.setValue(new Float((float) RecyclerView.B1));
        }
        return jg7.a;
    }
}
