package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm7  reason: default package */
/* loaded from: classes.dex */
public abstract class dm7 {
    public final defpackage.wu a;
    public final defpackage.wu b;
    public final defpackage.wu c;

    public dm7(defpackage.wu r1, defpackage.wu r2, defpackage.wu r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public abstract defpackage.em7 a();

    public final java.lang.Class b(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            wu r3 = r3.c
            java.lang.Object r0 = r3.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L43
            java.lang.Package r0 = r4.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r4.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "."
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "Parcelizer"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            java.lang.ClassLoader r2 = r4.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)
            java.lang.String r4 = r4.getName()
            r3.put(r4, r0)
        L43:
            return r0
    }

    public final java.lang.reflect.Method c(java.lang.String r4) {
            r3 = this;
            wu r3 = r3.a
            java.lang.Object r0 = r3.get(r4)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L25
            java.lang.System.currentTimeMillis()
            r0 = 1
            java.lang.Class<dm7> r1 = defpackage.dm7.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.lang.Class r0 = java.lang.Class.forName(r4, r0, r2)
            java.lang.String r2 = "read"
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)
            r3.put(r4, r0)
        L25:
            return r0
    }

    public final java.lang.reflect.Method d(java.lang.Class r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            wu r1 = r3.b
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L29
            java.lang.Class r3 = r3.b(r4)
            java.lang.System.currentTimeMillis()
            java.lang.Class<dm7> r0 = defpackage.dm7.class
            java.lang.Class[] r0 = new java.lang.Class[]{r4, r0}
            java.lang.String r2 = "write"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r2, r0)
            java.lang.String r4 = r4.getName()
            r1.put(r4, r3)
            return r3
        L29:
            return r0
    }

    public abstract boolean e(int r1);

    public final android.os.Parcelable f(android.os.Parcelable r1, int r2) {
            r0 = this;
            boolean r2 = r0.e(r2)
            if (r2 != 0) goto L7
            return r1
        L7:
            em7 r0 = (defpackage.em7) r0
            java.lang.Class<em7> r1 = defpackage.em7.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcel r0 = r0.e
            android.os.Parcelable r0 = r0.readParcelable(r1)
            return r0
    }

    public final defpackage.fm7 g() {
            r3 = this;
            r0 = r3
            em7 r0 = (defpackage.em7) r0
            android.os.Parcel r0 = r0.e
            java.lang.String r0 = r0.readString()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            em7 r2 = r3.a()
            java.lang.reflect.Method r3 = r3.c(r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            fm7 r3 = (defpackage.fm7) r3     // Catch: java.lang.ClassNotFoundException -> L20 java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r3
        L20:
            r3 = move-exception
            goto L28
        L22:
            r3 = move-exception
            goto L2e
        L24:
            r3 = move-exception
            goto L34
        L26:
            r3 = move-exception
            goto L49
        L28:
            java.lang.String r0 = "VersionedParcel encountered ClassNotFoundException"
            defpackage.u34.p(r0, r3)
            return r1
        L2e:
            java.lang.String r0 = "VersionedParcel encountered NoSuchMethodException"
            defpackage.u34.p(r0, r3)
            return r1
        L34:
            java.lang.Throwable r0 = r3.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L42
            java.lang.String r0 = "VersionedParcel encountered InvocationTargetException"
            defpackage.u34.p(r0, r3)
            return r1
        L42:
            java.lang.Throwable r3 = r3.getCause()
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L49:
            java.lang.String r0 = "VersionedParcel encountered IllegalAccessException"
            defpackage.u34.p(r0, r3)
            return r1
    }

    public abstract void h(int r1);

    public final void i(defpackage.fm7 r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lb
            em7 r3 = (defpackage.em7) r3
            android.os.Parcel r3 = r3.e
            r3.writeString(r0)
            return
        Lb:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L79
            java.lang.Class r1 = r3.b(r1)     // Catch: java.lang.ClassNotFoundException -> L79
            java.lang.String r1 = r1.getName()
            r2 = r3
            em7 r2 = (defpackage.em7) r2
            android.os.Parcel r2 = r2.e
            r2.writeString(r1)
            em7 r1 = r3.a()
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            java.lang.reflect.Method r3 = r3.d(r2)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            r3.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L4e java.lang.NoSuchMethodException -> L55 java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L72
            android.os.Parcel r3 = r1.e
            int r4 = r1.i
            if (r4 < 0) goto L4d
            android.util.SparseIntArray r0 = r1.d
            int r4 = r0.get(r4)
            int r0 = r3.dataPosition()
            int r1 = r0 - r4
            r3.setDataPosition(r4)
            r3.writeInt(r1)
            r3.setDataPosition(r0)
        L4d:
            return
        L4e:
            r3 = move-exception
            java.lang.String r4 = "VersionedParcel encountered ClassNotFoundException"
            defpackage.u34.p(r4, r3)
            return
        L55:
            r3 = move-exception
            java.lang.String r4 = "VersionedParcel encountered NoSuchMethodException"
            defpackage.u34.p(r4, r3)
            return
        L5c:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            boolean r4 = r4 instanceof java.lang.RuntimeException
            if (r4 != 0) goto L6b
            java.lang.String r4 = "VersionedParcel encountered InvocationTargetException"
            defpackage.u34.p(r4, r3)
            return
        L6b:
            java.lang.Throwable r3 = r3.getCause()
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
        L72:
            r3 = move-exception
            java.lang.String r4 = "VersionedParcel encountered IllegalAccessException"
            defpackage.u34.p(r4, r3)
            return
        L79:
            r3 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r0 = " does not have a Parcelizer"
            java.lang.String r4 = r4.concat(r0)
            defpackage.u34.p(r4, r3)
            return
    }
}
