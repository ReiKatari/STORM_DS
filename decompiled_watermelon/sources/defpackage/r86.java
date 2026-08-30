package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r86  reason: default package */
/* loaded from: classes.dex */
public final class r86 extends nk6 implements bj2 {
    public int X;
    public /* synthetic */ ht4 Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ float d0;
    public final /* synthetic */ k24 e0;
    public final /* synthetic */ ae6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r86(boolean z, float f, k24 k24Var, ae6 ae6Var, j11 j11Var) {
        super(3, j11Var);
        this.c0 = z;
        this.d0 = f;
        this.e0 = k24Var;
        this.f0 = ae6Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j = ((mb4) obj2).a;
        k24 k24Var = this.e0;
        ae6 ae6Var = this.f0;
        r86 r86Var = new r86(this.c0, this.d0, k24Var, ae6Var, (j11) obj3);
        r86Var.Y = (ht4) obj;
        r86Var.Z = j;
        return r86Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        float intBitsToFloat;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        k24 k24Var = this.e0;
        try {
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                ht4 ht4Var = this.Y;
                long j = this.Z;
                if (this.c0) {
                    intBitsToFloat = this.d0 - Float.intBitsToFloat((int) (j >> 32));
                } else {
                    intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                }
                k24Var.setValue(new Float(intBitsToFloat - ((Number) this.f0.getValue()).floatValue()));
                this.X = 1;
                if (ht4Var.a(this) == p31Var) {
                    return p31Var;
                }
            }
        } catch (ol2 unused) {
            k24Var.setValue(new Float((float) RecyclerView.A1));
        }
        return o27.a;
    }
}
