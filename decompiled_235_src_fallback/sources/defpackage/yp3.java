package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp3  reason: default package */
/* loaded from: classes.dex */
public final class yp3 implements java.util.Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.ei b;

    public /* synthetic */ yp3(defpackage.ei r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.a
            ei r1 = r1.b
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L49;
                case 2: goto L28;
                default: goto L7;
            }
        L7:
            gq3 r3 = (defpackage.gq3) r3
            java.lang.Object r3 = r3.getKey()
            int r3 = r1.e(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            gq3 r2 = (defpackage.gq3) r2
            java.lang.Object r2 = r2.getKey()
            int r1 = r1.e(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.g04.z(r3, r1)
            return r1
        L28:
            gq3 r3 = (defpackage.gq3) r3
            java.lang.Object r3 = r3.getKey()
            int r3 = r1.e(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            gq3 r2 = (defpackage.gq3) r2
            java.lang.Object r2 = r2.getKey()
            int r1 = r1.e(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.g04.z(r3, r1)
            return r1
        L49:
            gq3 r2 = (defpackage.gq3) r2
            java.lang.Object r2 = r2.getKey()
            int r2 = r1.e(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            gq3 r3 = (defpackage.gq3) r3
            java.lang.Object r3 = r3.getKey()
            int r1 = r1.e(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.g04.z(r2, r1)
            return r1
        L6a:
            gq3 r2 = (defpackage.gq3) r2
            java.lang.Object r2 = r2.getKey()
            int r2 = r1.e(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            gq3 r3 = (defpackage.gq3) r3
            java.lang.Object r3 = r3.getKey()
            int r1 = r1.e(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.g04.z(r2, r1)
            return r1
    }
}
