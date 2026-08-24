package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh4  reason: default package */
/* loaded from: classes.dex */
public final class zh4 extends defpackage.u28 implements defpackage.d13 {
    public final java.lang.Object d;

    public zh4(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            r1.<init>(r0)
            r1.d = r2
            return
    }

    public static defpackage.d13 c(android.os.IBinder r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            android.os.IInterface r1 = r3.queryLocalInterface(r0)
            boolean r2 = r1 instanceof defpackage.d13
            if (r2 == 0) goto L11
            d13 r1 = (defpackage.d13) r1
            return r1
        L11:
            v28 r1 = new v28
            r1.<init>(r3, r0)
            return r1
    }

    public static java.lang.Object d(defpackage.d13 r8) {
            boolean r0 = r8 instanceof defpackage.zh4
            if (r0 == 0) goto L9
            zh4 r8 = (defpackage.zh4) r8
            java.lang.Object r8 = r8.d
            return r8
        L9:
            android.os.IBinder r8 = r8.asBinder()
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r5 = r2
            r4 = r3
        L1a:
            if (r3 >= r1) goto L2a
            r6 = r0[r3]
            boolean r7 = r6.isSynthetic()
            if (r7 != 0) goto L27
            int r4 = r4 + 1
            r5 = r6
        L27:
            int r3 = r3 + 1
            goto L1a
        L2a:
            r1 = 1
            if (r4 != r1) goto L56
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            boolean r0 = r5.isAccessible()
            if (r0 != 0) goto L50
            r5.setAccessible(r1)
            java.lang.Object r8 = r5.get(r8)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NullPointerException -> L47
            return r8
        L3e:
            r8 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Could not access the field in remoteBinder."
            r0.<init>(r1, r8)
            throw r0
        L47:
            r8 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Binder object is null."
            r0.<init>(r1, r8)
            throw r0
        L50:
            java.lang.String r8 = "IObjectWrapper declared field not private!"
            defpackage.i.h(r8)
            return r2
        L56:
            int r8 = r0.length
            java.lang.String r0 = "Unexpected number of IObjectWrapper declared fields: "
            java.lang.String r8 = defpackage.lb1.g(r8, r0)
            defpackage.i.h(r8)
            return r2
    }
}
