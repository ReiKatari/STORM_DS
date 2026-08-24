package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aq1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;

    public /* synthetic */ aq1(int i, float f) {
        this.A = i;
        this.B = f;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float e0;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        float f = this.B;
        switch (i) {
            case 0:
                op5 op5Var = (op5) obj;
                op5Var.getClass();
                op5Var.t(op5Var.l0.a() * 22.0f * (1.0f - f));
                op5Var.c((f * 0.8f) + 0.2f);
                return jg7Var;
            default:
                no1 no1Var = (no1) obj;
                no1Var.getClass();
                no1.F(no1Var, hv.c(4278782477L), 0L, 0L, RecyclerView.B1, null, 126);
                if (f > RecyclerView.B1) {
                    float f2 = 0.55f * f;
                    no1.D0(no1Var, d90.m(hf.c0(new kt0(kt0.c(f2, hv.c(4281022546L))), new kt0(kt0.c(f2, hv.c(4279309599L)))), RecyclerView.B1, RecyclerView.B1, 14), 0L, 0L, RecyclerView.B1, null, 126);
                    float p = gi2.p(no1Var.e0(1.0f) / no1Var.e0(3.0f), RecyclerView.B1, 1.0f);
                    Float valueOf = Float.valueOf((float) RecyclerView.B1);
                    long j = kt0.b;
                    float f3 = f * 0.12f;
                    vr4 vr4Var = new vr4(valueOf, new kt0(kt0.c(f3, j)));
                    vr4 vr4Var2 = new vr4(Float.valueOf(p), new kt0(kt0.c(f3, j)));
                    Float valueOf2 = Float.valueOf(p);
                    long j2 = kt0.g;
                    vr4[] vr4VarArr = (vr4[]) Arrays.copyOf(new vr4[]{vr4Var, vr4Var2, new vr4(valueOf2, new kt0(j2)), new vr4(Float.valueOf(1.0f), new kt0(j2))}, 4);
                    long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(e0) & 4294967295L);
                    ArrayList arrayList = new ArrayList(vr4VarArr.length);
                    for (vr4 vr4Var3 : vr4VarArr) {
                        arrayList.add(new kt0(((kt0) vr4Var3.B).a));
                    }
                    ArrayList arrayList2 = new ArrayList(vr4VarArr.length);
                    for (vr4 vr4Var4 : vr4VarArr) {
                        arrayList2.add(Float.valueOf(((Number) vr4Var4.A).floatValue()));
                    }
                    no1.D0(no1Var, new bv3(arrayList, arrayList2, floatToRawIntBits, floatToRawIntBits2, 1), 0L, 0L, RecyclerView.B1, null, 126);
                }
                return jg7Var;
        }
    }
}
