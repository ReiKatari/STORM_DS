package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud7  reason: default package */
/* loaded from: classes.dex */
public final class ud7 implements defpackage.zc7 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ defpackage.yc7 L;

    public /* synthetic */ ud7(int r1, defpackage.yc7 r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r3
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r4, defpackage.ie7 r5) {
            r3 = this;
            int r4 = r3.A
            yc7 r0 = r3.L
            r1 = 0
            java.lang.Object r2 = r3.B
            switch(r4) {
                case 0: goto L26;
                case 1: goto L15;
                default: goto La;
            }
        La:
            ie7 r2 = (defpackage.ie7) r2
            boolean r3 = r5.equals(r2)
            if (r3 == 0) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            return r0
        L15:
            java.lang.Class r4 = r5.a
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r5 = r2.isAssignableFrom(r4)
            if (r5 != 0) goto L20
            goto L25
        L20:
            et0 r1 = new et0
            r1.<init>(r3, r4)
        L25:
            return r1
        L26:
            java.lang.Class r3 = r5.a
            java.lang.Class r2 = (java.lang.Class) r2
            if (r3 != r2) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.A
            java.lang.String r1 = "]"
            yc7 r2 = r5.L
            java.lang.String r3 = ",adapter="
            java.lang.Object r4 = r5.B
            switch(r0) {
                case 0: goto L30;
                case 1: goto L12;
                default: goto Ld;
            }
        Ld:
            java.lang.String r5 = super.toString()
            return r5
        L12:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Factory[typeHierarchy="
            r5.<init>(r0)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r0 = r4.getName()
            r5.append(r0)
            r5.append(r3)
            r5.append(r2)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            return r5
        L30:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Factory[type="
            r5.<init>(r0)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r0 = r4.getName()
            r5.append(r0)
            r5.append(r3)
            r5.append(r2)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            return r5
    }
}
