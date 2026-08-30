package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wh extends lj2 implements mi2 {
    public final /* synthetic */ cm3 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(cm3 cm3Var) {
        super(1, a53.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.c0 = cm3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        float[] fArr = ((kv3) obj).a;
        rd3 rd3Var = (rd3) this.c0.m0.getValue();
        if (rd3Var != null) {
            if (!rd3Var.c0()) {
                rd3Var = null;
            }
            if (rd3Var != null) {
                rd3Var.H(fArr);
            }
        }
        return o27.a;
    }
}
