package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cb7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cb7 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ eo2 B;
    public final /* synthetic */ qa4 L;

    public /* synthetic */ cb7(eo2 eo2Var, qa4 qa4Var, int i) {
        this.A = i;
        this.B = eo2Var;
        this.L = qa4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.L;
        eo2 eo2Var = this.B;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                qa4Var.setValue(bool);
                eo2Var.o("translator_pause_on_translate", bool);
                return jg7Var;
            default:
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                qa4Var.setValue(f);
                eo2Var.o("translator_local_voice_pitch_variance", Integer.valueOf((int) floatValue));
                return jg7Var;
        }
    }
}
