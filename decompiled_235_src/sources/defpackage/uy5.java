package defpackage;

import android.content.Context;
import me.magnum.melonds.MelonRomDecryptor;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy5  reason: default package */
/* loaded from: classes.dex */
public final class uy5 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ a Y;
    public final /* synthetic */ pq5 Z;
    public final /* synthetic */ w61 d0;
    public final /* synthetic */ qa4 e0;
    public final /* synthetic */ qa4 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy5(a aVar, pq5 pq5Var, w61 w61Var, qa4 qa4Var, qa4 qa4Var2, r41 r41Var) {
        super(2, r41Var);
        this.Y = aVar;
        this.Z = pq5Var;
        this.d0 = w61Var;
        this.e0 = qa4Var;
        this.f0 = qa4Var2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((uy5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new uy5(this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
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
            Context requireContext = this.Y.requireContext();
            requireContext.getClass();
            MelonRomDecryptor.a b = MelonRomDecryptor.a.b(requireContext, this.Z.d, new x31(23));
            xe1 xe1Var = xk1.a;
            jv2 jv2Var = e04.a;
            ty5 ty5Var = new ty5(b, this.f0, null);
            this.X = 1;
            if (hv.d0(jv2Var, ty5Var, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
