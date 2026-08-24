package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cb7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cb7 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.eo2 B;
    public final /* synthetic */ defpackage.qa4 L;

    public /* synthetic */ cb7(defpackage.eo2 r1, defpackage.qa4 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.A
            jg7 r1 = defpackage.jg7.a
            qa4 r2 = r3.L
            eo2 r3 = r3.B
            switch(r0) {
                case 0: goto L1f;
                default: goto Lb;
            }
        Lb:
            java.lang.Float r4 = (java.lang.Float) r4
            float r0 = r4.floatValue()
            r2.setValue(r4)
            int r4 = (int) r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "translator_local_voice_pitch_variance"
            r3.o(r0, r4)
            return r1
        L1f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            r2.setValue(r4)
            java.lang.String r0 = "translator_pause_on_translate"
            r3.o(r0, r4)
            return r1
    }
}
