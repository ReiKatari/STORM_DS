package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qb4  reason: default package */
/* loaded from: classes.dex */
public final class qb4 implements java.util.Comparator {
    public static final defpackage.qb4 b = null;
    public static final defpackage.qb4 c = null;
    public final /* synthetic */ int a;

    static {
            qb4 r0 = new qb4
            r1 = 0
            r0.<init>(r1)
            defpackage.qb4.b = r0
            qb4 r0 = new qb4
            r1 = 1
            r0.<init>(r1)
            defpackage.qb4.c = r0
            return
    }

    public /* synthetic */ qb4(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r1.getClass()
            r2.getClass()
            int r0 = r2.compareTo(r1)
            return r0
        L14:
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r1.getClass()
            r2.getClass()
            int r0 = r1.compareTo(r2)
            return r0
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            qb4 r0 = defpackage.qb4.b
            return r0
        L8:
            qb4 r0 = defpackage.qb4.c
            return r0
    }
}
