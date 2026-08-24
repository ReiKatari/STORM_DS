package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs4  reason: default package */
/* loaded from: classes.dex */
public final class fs4 extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ defpackage.uj2 i;

    public /* synthetic */ fs4(defpackage.uj2 r1, int r2) {
            r0 = this;
            r0.h = r2
            r0.i = r1
            r0.<init>()
            return
    }

    @Override // defpackage.uj2
    public final void l(defpackage.ok5 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.h
            uj2 r3 = r3.i
            switch(r0) {
                case 0: goto L1c;
                default: goto L7;
            }
        L7:
            if (r5 != 0) goto La
            goto L1b
        La:
            int r0 = java.lang.reflect.Array.getLength(r5)
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1b
            java.lang.Object r2 = java.lang.reflect.Array.get(r5, r1)
            r3.l(r4, r2)
            int r1 = r1 + 1
            goto Lf
        L1b:
            return
        L1c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            if (r5 != 0) goto L21
            goto L33
        L21:
            java.util.Iterator r5 = r5.iterator()
        L25:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r5.next()
            r3.l(r4, r0)
            goto L25
        L33:
            return
    }
}
