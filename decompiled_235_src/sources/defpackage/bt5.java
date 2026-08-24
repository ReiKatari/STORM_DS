package defpackage;

import android.content.Context;
import android.widget.Toast;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt5  reason: default package */
/* loaded from: classes.dex */
public final class bt5 extends hw6 implements eo2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ zg5 Y;
    public final /* synthetic */ Context Z;
    public final /* synthetic */ qa4 d0;
    public final /* synthetic */ w61 e0;
    public final /* synthetic */ pq5 f0;
    public final /* synthetic */ MelonDatabase g0;
    public final /* synthetic */ hp0 h0;
    public final /* synthetic */ qa4 i0;
    public final /* synthetic */ qa4 j0;
    public final /* synthetic */ qa4 k0;
    public final /* synthetic */ qa4 l0;
    public final /* synthetic */ om6 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt5(boolean z, zg5 zg5Var, Context context, qa4 qa4Var, w61 w61Var, pq5 pq5Var, MelonDatabase melonDatabase, hp0 hp0Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, qa4 qa4Var5, om6 om6Var, r41 r41Var) {
        super(2, r41Var);
        this.X = z;
        this.Y = zg5Var;
        this.Z = context;
        this.d0 = qa4Var;
        this.e0 = w61Var;
        this.f0 = pq5Var;
        this.g0 = melonDatabase;
        this.h0 = hp0Var;
        this.i0 = qa4Var2;
        this.j0 = qa4Var3;
        this.k0 = qa4Var4;
        this.l0 = qa4Var5;
        this.m0 = om6Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((bt5) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new bt5(this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        this.d0.setValue(Boolean.FALSE);
        boolean z = this.X;
        Context context = this.Z;
        if (!z && !this.Y.A) {
            Toast.makeText(context, "Чит-коды подключены из встроенной базы Action Replay.", 1).show();
        } else {
            Toast.makeText(context, "База читов Action Replay успешно синхронизирована!", 1).show();
        }
        vy7.H(this.h0, this.e0, this.i0, this.j0, this.k0, this.l0, this.f0, this.m0, this.Z, this.g0);
        return jg7.a;
    }
}
