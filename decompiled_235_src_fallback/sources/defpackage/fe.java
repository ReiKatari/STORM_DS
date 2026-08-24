package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.on2 B;

    public /* synthetic */ fe(int r1, defpackage.on2 r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.A
            on2 r1 = r1.B
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L1b;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Lb;
                default: goto L7;
            }
        L7:
            r1.c()
            return
        Lb:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.c()
            return
        L11:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r1.c()
            return
        L17:
            r1.c()
            return
        L1b:
            r1.c()
            return
        L1f:
            r1.c()
            return
    }
}
