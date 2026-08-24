package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbtx {
    public zbtx() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp zbb(java.lang.Class r11) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtx> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtx.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.class
            boolean r0 = r11.equals(r0)
            r3 = 0
            if (r0 == 0) goto L12
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            goto L45
        L12:
            java.lang.Package r0 = r11.getPackage()
            java.lang.Package r4 = r1.getPackage()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L10a
            java.lang.Package r0 = r11.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = r11.getSimpleName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ".BlazeGenerated"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = "Loader"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
        L45:
            r4 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r2)     // Catch: java.lang.ClassNotFoundException -> L7f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61 java.lang.InstantiationException -> L63 java.lang.NoSuchMethodException -> L65 java.lang.ClassNotFoundException -> L7f
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61 java.lang.InstantiationException -> L63 java.lang.NoSuchMethodException -> L65 java.lang.ClassNotFoundException -> L7f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtx r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtx) r0     // Catch: java.lang.reflect.InvocationTargetException -> L5f java.lang.IllegalAccessException -> L61 java.lang.InstantiationException -> L63 java.lang.NoSuchMethodException -> L65 java.lang.ClassNotFoundException -> L7f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = r0.zba()     // Catch: java.lang.ClassNotFoundException -> L7f
            java.lang.Object r0 = r11.cast(r0)     // Catch: java.lang.ClassNotFoundException -> L7f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp) r0     // Catch: java.lang.ClassNotFoundException -> L7f
            return r0
        L5f:
            r0 = move-exception
            goto L67
        L61:
            r0 = move-exception
            goto L6d
        L63:
            r0 = move-exception
            goto L73
        L65:
            r0 = move-exception
            goto L79
        L67:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L7f
            r5.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L7f
            throw r5     // Catch: java.lang.ClassNotFoundException -> L7f
        L6d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L7f
            r5.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L7f
            throw r5     // Catch: java.lang.ClassNotFoundException -> L7f
        L73:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L7f
            r5.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L7f
            throw r5     // Catch: java.lang.ClassNotFoundException -> L7f
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L7f
            r5.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L7f
            throw r5     // Catch: java.lang.ClassNotFoundException -> L7f
        L7f:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r1, r2)
            java.util.Iterator r1 = r0.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L8c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r1.next()     // Catch: java.util.ServiceConfigurationError -> La6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtx r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtx) r0     // Catch: java.util.ServiceConfigurationError -> La6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = r0.zba()     // Catch: java.util.ServiceConfigurationError -> La6
            java.lang.Object r0 = r11.cast(r0)     // Catch: java.util.ServiceConfigurationError -> La6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp) r0     // Catch: java.util.ServiceConfigurationError -> La6
            r2.add(r0)     // Catch: java.util.ServiceConfigurationError -> La6
            goto L8c
        La6:
            r0 = move-exception
            r10 = r0
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE
            java.lang.String r0 = r11.getSimpleName()
            java.lang.String r8 = "load"
            java.lang.String r7 = "Unable to load "
            java.lang.String r9 = r7.concat(r0)
            java.lang.String r7 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            r5.logp(r6, r7, r8, r9, r10)
            goto L8c
        Lc6:
            int r0 = r2.size()
            if (r0 != r4) goto Ld4
            r11 = 0
            java.lang.Object r11 = r2.get(r11)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp) r11
            return r11
        Ld4:
            int r0 = r2.size()
            if (r0 != 0) goto Ldb
            return r3
        Ldb:
            java.lang.String r0 = "combine"
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> Lf2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L102
            java.lang.reflect.Method r11 = r11.getMethod(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Lf2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L102
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> Lf2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L102
            java.lang.Object r11 = r11.invoke(r3, r0)     // Catch: java.lang.reflect.InvocationTargetException -> Lf2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L102
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp) r11     // Catch: java.lang.reflect.InvocationTargetException -> Lf2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L102
            return r11
        Lf2:
            r0 = move-exception
            r11 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lfa:
            r0 = move-exception
            r11 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L102:
            r0 = move-exception
            r11 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L10a:
            java.lang.String r11 = r11.getName()
            defpackage.i.h(r11)
            return r3
    }

    public abstract com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp zba();
}
