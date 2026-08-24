package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class LibraryVersion {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private static final com.google.android.gms.common.internal.LibraryVersion zzb = null;
    private final java.util.concurrent.ConcurrentHashMap zzc;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.common.internal.LibraryVersion.zza = r0
            com.google.android.gms.common.internal.LibraryVersion r0 = new com.google.android.gms.common.internal.LibraryVersion
            r0.<init>()
            com.google.android.gms.common.internal.LibraryVersion.zzb = r0
            return
    }

    public LibraryVersion() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzc = r0
            return
    }

    public static com.google.android.gms.common.internal.LibraryVersion getInstance() {
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.zzb
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getVersion(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "LibraryVersion"
            java.lang.String r1 = "Failed to get app version for libraryName: "
            java.lang.String r2 = "/"
            java.lang.String r3 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r3)
            java.util.concurrent.ConcurrentHashMap r3 = r8.zzc
            boolean r3 = r3.containsKey(r9)
            if (r3 == 0) goto L1c
            java.util.concurrent.ConcurrentHashMap r8 = r8.zzc
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L1c:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L7c
            r5.<init>(r2)     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L7c
            r5.append(r9)     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L7c
            java.lang.String r2 = ".properties"
            r5.append(r2)     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L7c
            java.lang.String r2 = r5.toString()     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L7c
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r5 = com.google.android.gms.common.internal.LibraryVersion.class
            java.io.InputStream r2 = r5.getResourceAsStream(r2)     // Catch: java.io.IOException -> L79 java.lang.Throwable -> L7c
            if (r2 == 0) goto L65
            r3.load(r2)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = "version"
            java.lang.String r4 = r3.getProperty(r5, r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.<init>()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.append(r9)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.append(r4)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r3.v(r0, r5)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            goto L93
        L5e:
            r8 = move-exception
            goto L77
        L60:
            r3 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
            goto L7f
        L65:
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r5.append(r9)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            r3.w(r0, r5)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60
            goto L93
        L77:
            r4 = r2
            goto La9
        L79:
            r2 = move-exception
            r3 = r2
            goto L7e
        L7c:
            r8 = move-exception
            goto La9
        L7e:
            r2 = r4
        L7f:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            r6.append(r9)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L7c
            r5.e(r0, r1, r3)     // Catch: java.lang.Throwable -> L7c
            r7 = r4
            r4 = r2
            r2 = r7
        L93:
            if (r2 == 0) goto L98
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
        L98:
            if (r4 != 0) goto La3
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zza
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r1.d(r0, r2)
            java.lang.String r4 = "UNKNOWN"
        La3:
            java.util.concurrent.ConcurrentHashMap r8 = r8.zzc
            r8.put(r9, r4)
            return r4
        La9:
            if (r4 == 0) goto Lae
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        Lae:
            throw r8
    }
}
