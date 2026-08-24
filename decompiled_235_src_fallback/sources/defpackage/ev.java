package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev  reason: default package */
/* loaded from: classes.dex */
public final class ev implements defpackage.qb6 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ ev(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qb6
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r1 = r2.b
            switch(r0) {
                case 0: goto L29;
                case 1: goto L22;
                case 2: goto L1c;
                case 3: goto L19;
                case 4: goto L11;
                default: goto L7;
            }
        L7:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            w0 r2 = new w0
            r0 = 10
            r2.<init>(r1, r0)
            return r2
        L11:
            kv3 r2 = new kv3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.<init>(r1)
            return r2
        L19:
            java.util.Iterator r1 = (java.util.Iterator) r1
            return r1
        L1c:
            lv3 r0 = new lv3
            r0.<init>(r2)
            return r0
        L22:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
            return r2
        L29:
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            w0 r2 = new w0
            r2.<init>(r1)
            return r2
    }
}
