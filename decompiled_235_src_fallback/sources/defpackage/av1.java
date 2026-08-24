package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class av1 implements android.widget.RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.util.LinkedHashMap b;
    public final /* synthetic */ defpackage.qn2 c;

    public /* synthetic */ av1(java.util.LinkedHashMap r1, defpackage.qn2 r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup r3, int r4) {
            r2 = this;
            int r0 = r2.a
            qn2 r1 = r2.c
            java.util.LinkedHashMap r2 = r2.b
            uu1 r1 = (defpackage.uu1) r1
            switch(r0) {
                case 0: goto L20;
                default: goto Lb;
            }
        Lb:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L1f
            r1.g(r2)
        L1f:
            return
        L20:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r3.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L34
            r1.g(r2)
        L34:
            return
    }
}
