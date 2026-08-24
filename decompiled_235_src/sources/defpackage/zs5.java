package defpackage;

import android.content.Context;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zs5  reason: default package */
/* loaded from: classes.dex */
public final class zs5 extends hw6 implements eo2 {
    public final /* synthetic */ w61 X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ pq5 Z;
    public final /* synthetic */ MelonDatabase d0;
    public final /* synthetic */ hp0 e0;
    public final /* synthetic */ qa4 f0;
    public final /* synthetic */ qa4 g0;
    public final /* synthetic */ qa4 h0;
    public final /* synthetic */ qa4 i0;
    public final /* synthetic */ om6 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs5(w61 w61Var, Context context, pq5 pq5Var, MelonDatabase melonDatabase, hp0 hp0Var, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, om6 om6Var, r41 r41Var) {
        super(2, r41Var);
        this.X = w61Var;
        this.Y = context;
        this.Z = pq5Var;
        this.d0 = melonDatabase;
        this.e0 = hp0Var;
        this.f0 = qa4Var;
        this.g0 = qa4Var2;
        this.h0 = qa4Var3;
        this.i0 = qa4Var4;
        this.j0 = om6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((zs5) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new zs5(this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        vy7.H(this.e0, this.X, this.f0, this.g0, this.h0, this.i0, this.Z, this.j0, this.Y, this.d0);
        return jg7.a;
    }
}
