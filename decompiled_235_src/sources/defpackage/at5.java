package defpackage;

import android.content.Context;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: at5  reason: default package */
/* loaded from: classes.dex */
public final class at5 implements qn2 {
    public final /* synthetic */ Cheat A;
    public final /* synthetic */ w61 B;
    public final /* synthetic */ hp0 L;
    public final /* synthetic */ Context R;
    public final /* synthetic */ pq5 X;
    public final /* synthetic */ MelonDatabase Y;
    public final /* synthetic */ qa4 Z;
    public final /* synthetic */ qa4 d0;
    public final /* synthetic */ qa4 e0;
    public final /* synthetic */ qa4 f0;
    public final /* synthetic */ om6 g0;

    public at5(Cheat cheat, w61 w61Var, hp0 hp0Var, Context context, pq5 pq5Var, MelonDatabase melonDatabase, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, om6 om6Var) {
        this.A = cheat;
        this.B = w61Var;
        this.L = hp0Var;
        this.R = context;
        this.X = pq5Var;
        this.Y = melonDatabase;
        this.Z = qa4Var;
        this.d0 = qa4Var2;
        this.e0 = qa4Var3;
        this.f0 = qa4Var4;
        this.g0 = om6Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        xe1 xe1Var = xk1.a;
        de1 de1Var = de1.L;
        hp0 hp0Var = this.L;
        Cheat cheat = this.A;
        w61 w61Var = this.B;
        hv.L(w61Var, de1Var, null, new ht5(hp0Var, cheat, booleanValue, w61Var, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, null), 2);
        return jg7.a;
    }
}
