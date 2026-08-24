package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mu1 implements android.content.DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.ac b;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity c;
    public final /* synthetic */ defpackage.on2 d;

    public /* synthetic */ mu1(defpackage.ac r2, me.magnum.melonds.ui.emulator.EmulatorActivity r3, defpackage.on2 r4) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            return
    }

    public /* synthetic */ mu1(defpackage.on2 r2, defpackage.ac r3, me.magnum.melonds.ui.emulator.EmulatorActivity r4) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.d = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r7) {
            r6 = this;
            int r7 = r6.a
            r0 = -1
            r1 = -3
            r2 = -2
            on2 r3 = r6.d
            me.magnum.melonds.ui.emulator.EmulatorActivity r4 = r6.c
            ac r6 = r6.b
            switch(r7) {
                case 0: goto L40;
                default: goto Le;
            }
        Le:
            int r7 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            android.widget.Button r7 = r6.h(r2)
            r2 = 1
            if (r7 == 0) goto L1f
            ru1 r5 = new ru1
            r5.<init>(r6, r4, r3, r2)
            r7.setOnClickListener(r5)
        L1f:
            android.widget.Button r7 = r6.h(r1)
            if (r7 == 0) goto L2d
            su1 r1 = new su1
            r1.<init>(r4, r6, r2)
            r7.setOnClickListener(r1)
        L2d:
            android.widget.Button r7 = r6.h(r0)
            if (r7 == 0) goto L3c
            tu1 r0 = new tu1
            r1 = 2
            r0.<init>(r4, r1)
            r7.setOnClickListener(r0)
        L3c:
            r4.T0(r6)
            return
        L40:
            int r7 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7 = 0
            if (r3 == 0) goto L53
            android.widget.Button r2 = r6.h(r2)
            if (r2 == 0) goto L53
            ru1 r5 = new ru1
            r5.<init>(r6, r4, r3, r7)
            r2.setOnClickListener(r5)
        L53:
            android.widget.Button r1 = r6.h(r1)
            if (r1 == 0) goto L61
            su1 r2 = new su1
            r2.<init>(r4, r6, r7)
            r1.setOnClickListener(r2)
        L61:
            android.widget.Button r0 = r6.h(r0)
            if (r0 == 0) goto L6f
            tu1 r1 = new tu1
            r1.<init>(r4, r7)
            r0.setOnClickListener(r1)
        L6f:
            r4.T0(r6)
            return
    }
}
