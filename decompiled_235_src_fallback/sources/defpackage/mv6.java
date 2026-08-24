package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mv6 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ig1 B;

    public /* synthetic */ mv6(defpackage.ig1 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.A
            ig1 r1 = r1.B
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r1.b()
            return
        Lb:
            r1.a()
            return
    }
}
