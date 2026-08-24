package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ii extends po2 implements qn2 {
    public final /* synthetic */ et3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(et3 et3Var) {
        super(1, mb3.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.d0 = et3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float[] fArr = ((v24) obj).a;
        jk3 jk3Var = (jk3) this.d0.n0.getValue();
        if (jk3Var != null) {
            if (!jk3Var.t()) {
                jk3Var = null;
            }
            if (jk3Var != null) {
                jk3Var.k(fArr);
            }
        }
        return jg7.a;
    }
}
