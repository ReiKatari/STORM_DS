package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p86  reason: default package */
/* loaded from: classes.dex */
public final class p86 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.appcompat.widget.SearchView B;

    public /* synthetic */ p86(androidx.appcompat.widget.SearchView r1, int r2) {
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
            androidx.appcompat.widget.SearchView r1 = r1.B
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            z71 r1 = r1.O0
            boolean r0 = r1 instanceof defpackage.du6
            if (r0 == 0) goto L11
            r0 = 0
            r1.b(r0)
        L11:
            return
        L12:
            r1.s()
            return
    }
}
