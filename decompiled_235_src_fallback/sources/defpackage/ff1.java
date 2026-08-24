package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ff1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.fragment.app.h B;
    public final /* synthetic */ androidx.fragment.app.b0 L;

    public /* synthetic */ ff1(androidx.fragment.app.h r1, androidx.fragment.app.b0 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            androidx.fragment.app.b0 r1 = r2.L
            androidx.fragment.app.h r2 = r2.B
            switch(r0) {
                case 0: goto L14;
                default: goto L9;
            }
        L9:
            java.util.ArrayList r0 = r2.b
            r0.remove(r1)
            java.util.ArrayList r2 = r2.c
            r2.remove(r1)
            return
        L14:
            r2.a(r1)
            return
    }
}
