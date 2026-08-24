package defpackage;

import me.magnum.melonds.MelonRomDecryptor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ty5  reason: default package */
/* loaded from: classes.dex */
public final class ty5 extends hw6 implements eo2 {
    public final /* synthetic */ MelonRomDecryptor.a X;
    public final /* synthetic */ qa4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty5(MelonRomDecryptor.a aVar, qa4 qa4Var, r41 r41Var) {
        super(2, r41Var);
        this.X = aVar;
        this.Y = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        jg7 jg7Var = jg7.a;
        ((ty5) q((r41) obj2, (w61) obj)).s(jg7Var);
        return jg7Var;
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new ty5(this.X, this.Y, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        MelonRomDecryptor.a aVar = MelonRomDecryptor.a.SUCCESS;
        qa4 qa4Var = this.Y;
        MelonRomDecryptor.a aVar2 = this.X;
        if (aVar2 != aVar && aVar2 != MelonRomDecryptor.a.ALREADY_DECRYPTED) {
            qa4Var.setValue(xc1.ERROR);
        } else {
            qa4Var.setValue(xc1.SUCCESS);
        }
        return jg7.a;
    }
}
