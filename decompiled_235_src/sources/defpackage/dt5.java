package defpackage;

import android.content.Context;
import java.util.ArrayList;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt5  reason: default package */
/* loaded from: classes.dex */
public final class dt5 implements go2 {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ w61 B;
    public final /* synthetic */ hp0 L;
    public final /* synthetic */ qa4 R;
    public final /* synthetic */ Context X;
    public final /* synthetic */ pq5 Y;
    public final /* synthetic */ qa4 Z;
    public final /* synthetic */ MelonDatabase d0;
    public final /* synthetic */ qa4 e0;
    public final /* synthetic */ qa4 f0;
    public final /* synthetic */ om6 g0;

    public dt5(ArrayList arrayList, w61 w61Var, hp0 hp0Var, qa4 qa4Var, Context context, pq5 pq5Var, qa4 qa4Var2, MelonDatabase melonDatabase, qa4 qa4Var3, qa4 qa4Var4, om6 om6Var) {
        this.A = arrayList;
        this.B = w61Var;
        this.L = hp0Var;
        this.R = qa4Var;
        this.X = context;
        this.Y = pq5Var;
        this.Z = qa4Var2;
        this.d0 = melonDatabase;
        this.e0 = qa4Var3;
        this.f0 = qa4Var4;
        this.g0 = om6Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        lp3 lp3Var = (lp3) obj;
        int intValue = ((Number) obj2).intValue();
        px0 px0Var = (px0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((xq2) px0Var).f(lp3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((xq2) px0Var).d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(i & 1, z)) {
            Cheat cheat = (Cheat) this.A.get(intValue);
            xq2Var.b0(125486896);
            boolean h = xq2Var.h(this.B) | xq2Var.h(this.L) | xq2Var.f(this.R) | xq2Var.h(this.X) | xq2Var.h(this.Y);
            qa4 qa4Var = this.Z;
            boolean f = h | xq2Var.f(qa4Var) | xq2Var.h(this.d0) | xq2Var.f(this.e0) | xq2Var.f(this.f0) | xq2Var.f(this.g0) | xq2Var.f(cheat);
            Object P = xq2Var.P();
            if (f || P == ox0.a) {
                at5 at5Var = new at5(cheat, this.B, this.L, this.X, this.Y, this.d0, this.R, qa4Var, this.e0, this.f0, this.g0);
                xq2Var.l0(at5Var);
                P = at5Var;
            }
            vy7.A(cheat, (qn2) P, xq2Var, 0);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
