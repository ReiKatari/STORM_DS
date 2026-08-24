package defpackage;

import android.content.Context;
import java.util.List;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht5  reason: default package */
/* loaded from: classes.dex */
public final class ht5 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ hp0 Y;
    public final /* synthetic */ Cheat Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ w61 e0;
    public final /* synthetic */ Context f0;
    public final /* synthetic */ pq5 g0;
    public final /* synthetic */ MelonDatabase h0;
    public final /* synthetic */ qa4 i0;
    public final /* synthetic */ qa4 j0;
    public final /* synthetic */ qa4 k0;
    public final /* synthetic */ qa4 l0;
    public final /* synthetic */ om6 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht5(hp0 hp0Var, Cheat cheat, boolean z, w61 w61Var, Context context, pq5 pq5Var, MelonDatabase melonDatabase, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, om6 om6Var, r41 r41Var) {
        super(2, r41Var);
        this.Y = hp0Var;
        this.Z = cheat;
        this.d0 = z;
        this.e0 = w61Var;
        this.f0 = context;
        this.g0 = pq5Var;
        this.h0 = melonDatabase;
        this.i0 = qa4Var;
        this.j0 = qa4Var2;
        this.k0 = qa4Var3;
        this.l0 = qa4Var4;
        this.m0 = om6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((ht5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new ht5(this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, r41Var);
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
            List b0 = hf.b0(Cheat.copy$default(this.Z, null, 0L, null, null, null, this.d0, 31, null));
            this.X = 1;
            if (((h16) this.Y).n(b0, this) == x61Var) {
                return x61Var;
            }
        }
        vy7.H(this.Y, this.e0, this.i0, this.j0, this.k0, this.l0, this.g0, this.m0, this.f0, this.h0);
        return jg7.a;
    }
}
