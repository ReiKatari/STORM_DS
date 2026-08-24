package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd2  reason: default package */
/* loaded from: classes.dex */
public final class qd2 implements defpackage.qb6 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final defpackage.qn2 c;

    public /* synthetic */ qd2(java.lang.Object r1, defpackage.qn2 r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    public qd2(defpackage.qb6 r2, defpackage.qn2 r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            tb6 r0 = defpackage.tb6.d0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // defpackage.qb6
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L18;
                case 1: goto L11;
                case 2: goto Lb;
                default: goto L5;
            }
        L5:
            rr2 r0 = new rr2
            r0.<init>(r2)
            return r0
        Lb:
            r97 r0 = new r97
            r0.<init>(r2)
            return r0
        L11:
            oc2 r0 = new oc2
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        L18:
            oc2 r0 = new oc2
            r0.<init>(r2)
            return r0
    }
}
