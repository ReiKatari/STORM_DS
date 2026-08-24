package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av  reason: default package */
/* loaded from: classes.dex */
public class av implements defpackage.zc7 {
    public av() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r2, defpackage.ie7 r3) {
            r1 = this;
            java.lang.reflect.Type r1 = r3.b
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 != 0) goto L15
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L13
            r0 = r1
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L15
        L13:
            r1 = 0
            return r1
        L15:
            if (r3 == 0) goto L1e
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            goto L24
        L1e:
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r1 = r1.getComponentType()
        L24:
            ie7 r3 = new ie7
            r3.<init>(r1)
            yc7 r3 = r2.d(r3)
            bv r0 = new bv
            java.lang.Class r1 = defpackage.q60.J(r1)
            r0.<init>(r2, r3, r1)
            return r0
    }
}
