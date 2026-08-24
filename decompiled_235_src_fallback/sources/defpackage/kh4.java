package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh4  reason: default package */
/* loaded from: classes.dex */
public final class kh4 implements defpackage.zc7 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ kh4(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r3, defpackage.ie7 r4) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r2 = r2.B
            r1 = 0
            switch(r0) {
                case 0: goto L24;
                case 1: goto L16;
                default: goto L8;
            }
        L8:
            java.lang.Class r3 = r4.a
            java.lang.Class<java.util.Calendar> r4 = java.util.Calendar.class
            if (r3 == r4) goto L12
            java.lang.Class<java.util.GregorianCalendar> r4 = java.util.GregorianCalendar.class
            if (r3 != r4) goto L15
        L12:
            r1 = r2
            ic3 r1 = (defpackage.ic3) r1
        L15:
            return r1
        L16:
            java.lang.Class r4 = r4.a
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 != r0) goto L23
            yh4 r1 = new yh4
            o67 r2 = (defpackage.o67) r2
            r1.<init>(r3, r2)
        L23:
            return r1
        L24:
            java.lang.Class r3 = r4.a
            java.lang.Class<java.lang.Number> r4 = java.lang.Number.class
            if (r3 != r4) goto L2d
            r1 = r2
            mh4 r1 = (defpackage.mh4) r1
        L2d:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class<java.util.GregorianCalendar> r1 = java.util.GregorianCalendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            java.lang.Object r2 = r2.B
            ic3 r2 = (defpackage.ic3) r2
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
