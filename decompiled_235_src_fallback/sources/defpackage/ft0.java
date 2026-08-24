package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft0  reason: default package */
/* loaded from: classes.dex */
public final class ft0 implements defpackage.zc7 {
    public final /* synthetic */ int A;
    public final defpackage.ci B;

    public /* synthetic */ ft0(defpackage.ci r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r10, defpackage.ie7 r11) {
            r9 = this;
            int r0 = r9.A
            ci r1 = r9.B
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L77;
                default: goto Lc;
            }
        Lc:
            java.lang.reflect.Type r0 = r11.b
            java.lang.Class r6 = r11.a
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r8 = r7.isAssignableFrom(r6)
            if (r8 != 0) goto L19
            goto L76
        L19:
            java.lang.Class<java.util.Properties> r3 = java.util.Properties.class
            boolean r3 = r3.isAssignableFrom(r6)
            r8 = 1
            if (r3 == 0) goto L2b
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r4]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r5] = r2
            r0[r8] = r2
            goto L40
        L2b:
            java.lang.reflect.Type r0 = defpackage.q60.K(r0, r6, r7)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L3a
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            goto L40
        L3a:
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r4]
            r0[r5] = r2
            r0[r8] = r2
        L40:
            r2 = r0[r5]
            r0 = r0[r8]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 == r3) goto L57
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 != r3) goto L4d
            goto L57
        L4d:
            ie7 r3 = new ie7
            r3.<init>(r2)
            yc7 r3 = r10.d(r3)
            goto L59
        L57:
            yd7 r3 = defpackage.fe7.c
        L59:
            lc3 r6 = new lc3
            r6.<init>(r10, r3, r2, r4)
            ie7 r2 = new ie7
            r2.<init>(r0)
            yc7 r2 = r10.d(r2)
            lc3 r3 = new lc3
            r3.<init>(r10, r2, r0, r4)
            ph4 r10 = r1.l(r11, r5)
            lc3 r11 = new lc3
            r11.<init>(r9, r6, r3, r10)
            r3 = r11
        L76:
            return r3
        L77:
            java.lang.reflect.Type r9 = r11.b
            java.lang.Class r0 = r11.a
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r7 = r6.isAssignableFrom(r0)
            if (r7 != 0) goto L84
            goto Lab
        L84:
            java.lang.reflect.Type r9 = defpackage.q60.K(r9, r0, r6)
            boolean r0 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L94
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            java.lang.reflect.Type[] r9 = r9.getActualTypeArguments()
            r2 = r9[r5]
        L94:
            ie7 r9 = new ie7
            r9.<init>(r2)
            yc7 r9 = r10.d(r9)
            lc3 r0 = new lc3
            r0.<init>(r10, r9, r2, r4)
            ph4 r9 = r1.l(r11, r5)
            et0 r3 = new et0
            r3.<init>(r5, r0, r9)
        Lab:
            return r3
    }
}
