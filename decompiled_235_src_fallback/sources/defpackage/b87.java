package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b87  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b87 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar B;

    public /* synthetic */ b87(androidx.appcompat.widget.Toolbar r1, int r2) {
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
            androidx.appcompat.widget.Toolbar r1 = r1.B
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r1.o()
            return
        Lb:
            d87 r1 = r1.L0
            if (r1 != 0) goto L11
            r1 = 0
            goto L13
        L11:
            o44 r1 = r1.B
        L13:
            if (r1 == 0) goto L18
            r1.collapseActionView()
        L18:
            return
    }
}
