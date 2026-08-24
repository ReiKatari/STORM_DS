package me.magnum.melonds;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonRomDecryptor {
    public static final me.magnum.melonds.MelonRomDecryptor a = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface DecryptProgressCallback {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.MelonRomDecryptor.a[] $VALUES = null;
        public static final me.magnum.melonds.MelonRomDecryptor.a ALREADY_DECRYPTED = null;
        public static final me.magnum.melonds.a Companion = null;
        public static final me.magnum.melonds.MelonRomDecryptor.a ERROR_FILE_TOO_SMALL = null;
        public static final me.magnum.melonds.MelonRomDecryptor.a ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS = null;
        public static final me.magnum.melonds.MelonRomDecryptor.a ERROR_NOT_DSI_ROM = null;
        public static final me.magnum.melonds.MelonRomDecryptor.a ERROR_READING_FILE = null;
        public static final me.magnum.melonds.MelonRomDecryptor.a ERROR_WRITING_FILE = null;
        public static final me.magnum.melonds.MelonRomDecryptor.a SUCCESS = null;
        private final int code;

        private static final /* synthetic */ me.magnum.melonds.MelonRomDecryptor.a[] $values() {
                me.magnum.melonds.MelonRomDecryptor$a r0 = me.magnum.melonds.MelonRomDecryptor.a.SUCCESS
                me.magnum.melonds.MelonRomDecryptor$a r1 = me.magnum.melonds.MelonRomDecryptor.a.ALREADY_DECRYPTED
                me.magnum.melonds.MelonRomDecryptor$a r2 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_READING_FILE
                me.magnum.melonds.MelonRomDecryptor$a r3 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_WRITING_FILE
                me.magnum.melonds.MelonRomDecryptor$a r4 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_NOT_DSI_ROM
                me.magnum.melonds.MelonRomDecryptor$a r5 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_FILE_TOO_SMALL
                me.magnum.melonds.MelonRomDecryptor$a r6 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS
                me.magnum.melonds.MelonRomDecryptor$a[] r0 = new me.magnum.melonds.MelonRomDecryptor.a[]{r0, r1, r2, r3, r4, r5, r6}
                return r0
        }

        static {
                me.magnum.melonds.MelonRomDecryptor$a r0 = new me.magnum.melonds.MelonRomDecryptor$a
                java.lang.String r1 = "SUCCESS"
                r2 = 0
                r0.<init>(r1, r2, r2)
                me.magnum.melonds.MelonRomDecryptor.a.SUCCESS = r0
                me.magnum.melonds.MelonRomDecryptor$a r0 = new me.magnum.melonds.MelonRomDecryptor$a
                java.lang.String r1 = "ALREADY_DECRYPTED"
                r2 = 1
                r0.<init>(r1, r2, r2)
                me.magnum.melonds.MelonRomDecryptor.a.ALREADY_DECRYPTED = r0
                me.magnum.melonds.MelonRomDecryptor$a r0 = new me.magnum.melonds.MelonRomDecryptor$a
                r1 = 2
                r2 = -1
                java.lang.String r3 = "ERROR_READING_FILE"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.a.ERROR_READING_FILE = r0
                me.magnum.melonds.MelonRomDecryptor$a r0 = new me.magnum.melonds.MelonRomDecryptor$a
                r1 = 3
                r2 = -2
                java.lang.String r3 = "ERROR_WRITING_FILE"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.a.ERROR_WRITING_FILE = r0
                me.magnum.melonds.MelonRomDecryptor$a r0 = new me.magnum.melonds.MelonRomDecryptor$a
                r1 = 4
                r2 = -3
                java.lang.String r3 = "ERROR_NOT_DSI_ROM"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.a.ERROR_NOT_DSI_ROM = r0
                me.magnum.melonds.MelonRomDecryptor$a r0 = new me.magnum.melonds.MelonRomDecryptor$a
                r1 = 5
                r2 = -4
                java.lang.String r3 = "ERROR_FILE_TOO_SMALL"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.a.ERROR_FILE_TOO_SMALL = r0
                me.magnum.melonds.MelonRomDecryptor$a r0 = new me.magnum.melonds.MelonRomDecryptor$a
                r1 = 6
                r2 = -5
                java.lang.String r3 = "ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.a.ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS = r0
                me.magnum.melonds.MelonRomDecryptor$a[] r0 = $values()
                me.magnum.melonds.MelonRomDecryptor.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.MelonRomDecryptor.a.$ENTRIES = r0
                me.magnum.melonds.a r0 = new me.magnum.melonds.a
                r0.<init>()
                me.magnum.melonds.MelonRomDecryptor.a.Companion = r0
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.MelonRomDecryptor.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.MelonRomDecryptor.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.MelonRomDecryptor$a> r0 = me.magnum.melonds.MelonRomDecryptor.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.MelonRomDecryptor$a r1 = (me.magnum.melonds.MelonRomDecryptor.a) r1
                return r1
        }

        public static me.magnum.melonds.MelonRomDecryptor.a[] values() {
                me.magnum.melonds.MelonRomDecryptor$a[] r0 = me.magnum.melonds.MelonRomDecryptor.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.MelonRomDecryptor$a[] r0 = (me.magnum.melonds.MelonRomDecryptor.a[]) r0
                return r0
        }

        public final int getCode() {
                r0 = this;
                int r0 = r0.code
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum b extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.MelonRomDecryptor.b[] $VALUES = null;
        public static final me.magnum.melonds.b Companion = null;
        public static final me.magnum.melonds.MelonRomDecryptor.b ERROR_FILE_TOO_SMALL = null;
        public static final me.magnum.melonds.MelonRomDecryptor.b ERROR_NOT_DSI_ROM = null;
        public static final me.magnum.melonds.MelonRomDecryptor.b ERROR_READING_FILE = null;
        public static final me.magnum.melonds.MelonRomDecryptor.b MODCRYPT_ENCRYPTED = null;
        public static final me.magnum.melonds.MelonRomDecryptor.b NOT_ENCRYPTED = null;
        private final int code;

        private static final /* synthetic */ me.magnum.melonds.MelonRomDecryptor.b[] $values() {
                me.magnum.melonds.MelonRomDecryptor$b r0 = me.magnum.melonds.MelonRomDecryptor.b.NOT_ENCRYPTED
                me.magnum.melonds.MelonRomDecryptor$b r1 = me.magnum.melonds.MelonRomDecryptor.b.MODCRYPT_ENCRYPTED
                me.magnum.melonds.MelonRomDecryptor$b r2 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_READING_FILE
                me.magnum.melonds.MelonRomDecryptor$b r3 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_NOT_DSI_ROM
                me.magnum.melonds.MelonRomDecryptor$b r4 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_FILE_TOO_SMALL
                me.magnum.melonds.MelonRomDecryptor$b[] r0 = new me.magnum.melonds.MelonRomDecryptor.b[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                me.magnum.melonds.MelonRomDecryptor$b r0 = new me.magnum.melonds.MelonRomDecryptor$b
                java.lang.String r1 = "NOT_ENCRYPTED"
                r2 = 0
                r0.<init>(r1, r2, r2)
                me.magnum.melonds.MelonRomDecryptor.b.NOT_ENCRYPTED = r0
                me.magnum.melonds.MelonRomDecryptor$b r0 = new me.magnum.melonds.MelonRomDecryptor$b
                java.lang.String r1 = "MODCRYPT_ENCRYPTED"
                r2 = 1
                r0.<init>(r1, r2, r2)
                me.magnum.melonds.MelonRomDecryptor.b.MODCRYPT_ENCRYPTED = r0
                me.magnum.melonds.MelonRomDecryptor$b r0 = new me.magnum.melonds.MelonRomDecryptor$b
                r1 = 2
                r2 = -1
                java.lang.String r3 = "ERROR_READING_FILE"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.b.ERROR_READING_FILE = r0
                me.magnum.melonds.MelonRomDecryptor$b r0 = new me.magnum.melonds.MelonRomDecryptor$b
                r1 = 3
                r2 = -2
                java.lang.String r3 = "ERROR_NOT_DSI_ROM"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.b.ERROR_NOT_DSI_ROM = r0
                me.magnum.melonds.MelonRomDecryptor$b r0 = new me.magnum.melonds.MelonRomDecryptor$b
                r1 = 4
                r2 = -3
                java.lang.String r3 = "ERROR_FILE_TOO_SMALL"
                r0.<init>(r3, r1, r2)
                me.magnum.melonds.MelonRomDecryptor.b.ERROR_FILE_TOO_SMALL = r0
                me.magnum.melonds.MelonRomDecryptor$b[] r0 = $values()
                me.magnum.melonds.MelonRomDecryptor.b.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.MelonRomDecryptor.b.$ENTRIES = r0
                me.magnum.melonds.b r0 = new me.magnum.melonds.b
                r0.<init>()
                me.magnum.melonds.MelonRomDecryptor.b.Companion = r0
                return
        }

        b(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.MelonRomDecryptor.b.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.MelonRomDecryptor.b valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.MelonRomDecryptor$b> r0 = me.magnum.melonds.MelonRomDecryptor.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.MelonRomDecryptor$b r1 = (me.magnum.melonds.MelonRomDecryptor.b) r1
                return r1
        }

        public static me.magnum.melonds.MelonRomDecryptor.b[] values() {
                me.magnum.melonds.MelonRomDecryptor$b[] r0 = me.magnum.melonds.MelonRomDecryptor.b.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.MelonRomDecryptor$b[] r0 = (me.magnum.melonds.MelonRomDecryptor.b[]) r0
                return r0
        }

        public final int getCode() {
                r0 = this;
                int r0 = r0.code
                return r0
        }
    }

    static {
            me.magnum.melonds.MelonRomDecryptor r0 = new me.magnum.melonds.MelonRomDecryptor
            r0.<init>()
            me.magnum.melonds.MelonRomDecryptor.a = r0
            return
    }

    private final native int checkEncryptionFdNative(int r1);

    private final native int checkEncryptionNative(java.lang.String r1);

    private final native int decryptRomFdNative(int r1, me.magnum.melonds.MelonRomDecryptor.DecryptProgressCallback r2);

    private final native int decryptRomNative(java.lang.String r1, me.magnum.melonds.MelonRomDecryptor.DecryptProgressCallback r2);

    public final me.magnum.melonds.MelonRomDecryptor.b a(android.content.Context r3, android.net.Uri r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "dsiware-installed"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L15
            me.magnum.melonds.MelonRomDecryptor$b r2 = me.magnum.melonds.MelonRomDecryptor.b.NOT_ENCRYPTED
            return r2
        L15:
            java.lang.String r0 = defpackage.l.s(r3, r4)
            if (r0 == 0) goto L30
            me.magnum.melonds.b r1 = me.magnum.melonds.MelonRomDecryptor.b.Companion     // Catch: java.lang.Throwable -> L29
            int r2 = r2.checkEncryptionNative(r0)     // Catch: java.lang.Throwable -> L29
            r1.getClass()     // Catch: java.lang.Throwable -> L29
            me.magnum.melonds.MelonRomDecryptor$b r2 = me.magnum.melonds.b.a(r2)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            me.magnum.melonds.MelonRomDecryptor$b r2 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_READING_FILE
        L2b:
            me.magnum.melonds.MelonRomDecryptor$b r0 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_READING_FILE
            if (r2 == r0) goto L30
            return r2
        L30:
            android.content.ContentResolver r2 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r4, r3)     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L5c
            me.magnum.melonds.b r3 = me.magnum.melonds.MelonRomDecryptor.b.Companion     // Catch: java.lang.Throwable -> L55
            me.magnum.melonds.MelonRomDecryptor r4 = me.magnum.melonds.MelonRomDecryptor.a     // Catch: java.lang.Throwable -> L55
            int r0 = r2.getFd()     // Catch: java.lang.Throwable -> L55
            int r4 = r4.checkEncryptionFdNative(r0)     // Catch: java.lang.Throwable -> L55
            r3.getClass()     // Catch: java.lang.Throwable -> L55
            me.magnum.melonds.MelonRomDecryptor$b r3 = me.magnum.melonds.b.a(r4)     // Catch: java.lang.Throwable -> L55
            r2.close()     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L61
            goto L5c
        L55:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r4 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Throwable -> L5f
            throw r4     // Catch: java.lang.Throwable -> L5f
        L5c:
            me.magnum.melonds.MelonRomDecryptor$b r3 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_READING_FILE     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            me.magnum.melonds.MelonRomDecryptor$b r3 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_READING_FILE
        L61:
            return r3
    }

    public final me.magnum.melonds.MelonRomDecryptor.a b(android.content.Context r10, android.net.Uri r11, me.magnum.melonds.MelonRomDecryptor.DecryptProgressCallback r12) {
            r9 = this;
            java.lang.String r0 = "MelonRomDecryptor"
            java.lang.String r1 = "modcrypt_temp_"
            r11.getClass()
            java.lang.String r2 = r11.getScheme()
            java.lang.String r3 = "dsiware-installed"
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L16
            me.magnum.melonds.MelonRomDecryptor$a r9 = me.magnum.melonds.MelonRomDecryptor.a.ALREADY_DECRYPTED
            return r9
        L16:
            java.lang.String r2 = defpackage.l.s(r10, r11)
            if (r2 == 0) goto L35
            me.magnum.melonds.a r3 = me.magnum.melonds.MelonRomDecryptor.a.Companion     // Catch: java.lang.Throwable -> L2a
            int r2 = r9.decryptRomNative(r2, r12)     // Catch: java.lang.Throwable -> L2a
            r3.getClass()     // Catch: java.lang.Throwable -> L2a
            me.magnum.melonds.MelonRomDecryptor$a r2 = me.magnum.melonds.a.a(r2)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            me.magnum.melonds.MelonRomDecryptor$a r2 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_READING_FILE
        L2c:
            me.magnum.melonds.MelonRomDecryptor$a r3 = me.magnum.melonds.MelonRomDecryptor.a.SUCCESS
            if (r2 == r3) goto L34
            me.magnum.melonds.MelonRomDecryptor$a r3 = me.magnum.melonds.MelonRomDecryptor.a.ALREADY_DECRYPTED
            if (r2 != r3) goto L35
        L34:
            return r2
        L35:
            r2 = 0
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "rw"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r11, r4)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L7d
            me.magnum.melonds.a r4 = me.magnum.melonds.MelonRomDecryptor.a.Companion     // Catch: java.lang.Throwable -> L5c
            me.magnum.melonds.MelonRomDecryptor r5 = me.magnum.melonds.MelonRomDecryptor.a     // Catch: java.lang.Throwable -> L5c
            int r6 = r3.getFd()     // Catch: java.lang.Throwable -> L5c
            int r5 = r5.decryptRomFdNative(r6, r12)     // Catch: java.lang.Throwable -> L5c
            r4.getClass()     // Catch: java.lang.Throwable -> L5c
            me.magnum.melonds.MelonRomDecryptor$a r4 = me.magnum.melonds.a.a(r5)     // Catch: java.lang.Throwable -> L5c
            r3.close()     // Catch: java.lang.Throwable -> L5a
            r2 = r4
            goto L7d
        L5a:
            r3 = move-exception
            goto L63
        L5c:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L5e
        L5e:
            r5 = move-exception
            defpackage.ge7.t(r3, r4)     // Catch: java.lang.Throwable -> L5a
            throw r5     // Catch: java.lang.Throwable -> L5a
        L63:
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Direct FD decryption open failed: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ", trying stream copy fallback"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r0, r3)
        L7d:
            me.magnum.melonds.MelonRomDecryptor$a r3 = me.magnum.melonds.MelonRomDecryptor.a.SUCCESS
            if (r2 == r3) goto L13d
            me.magnum.melonds.MelonRomDecryptor$a r4 = me.magnum.melonds.MelonRomDecryptor.a.ALREADY_DECRYPTED
            if (r2 != r4) goto L87
            goto L13d
        L87:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lde
            java.io.File r5 = r10.getCacheDir()     // Catch: java.lang.Throwable -> Lde
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lde
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lde
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lde
            r8.append(r6)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = ".nds"
            r8.append(r1)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> Lde
            r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> Lde
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lde
            java.io.InputStream r1 = r1.openInputStream(r11)     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto L122
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L113
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L113
            defpackage.f04.w(r1, r5)     // Catch: java.lang.Throwable -> L115
            r5.close()     // Catch: java.lang.Throwable -> L113
            r1.close()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Lde
            r1.getClass()     // Catch: java.lang.Throwable -> Lde
            me.magnum.melonds.a r5 = me.magnum.melonds.MelonRomDecryptor.a.Companion     // Catch: java.lang.Throwable -> Ld2
            int r9 = r9.decryptRomNative(r1, r12)     // Catch: java.lang.Throwable -> Ld2
            r5.getClass()     // Catch: java.lang.Throwable -> Ld2
            me.magnum.melonds.MelonRomDecryptor$a r9 = me.magnum.melonds.a.a(r9)     // Catch: java.lang.Throwable -> Ld2
            goto Ld4
        Ld2:
            me.magnum.melonds.MelonRomDecryptor$a r9 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_READING_FILE     // Catch: java.lang.Throwable -> Lde
        Ld4:
            if (r9 == r3) goto Le0
            if (r9 != r4) goto Ld9
            goto Le0
        Ld9:
            r2.delete()     // Catch: java.lang.Throwable -> Lde
            r3 = r9
            goto L13c
        Lde:
            r9 = move-exception
            goto L125
        Le0:
            android.content.ContentResolver r9 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "wt"
            java.io.OutputStream r9 = r9.openOutputStream(r11, r10)     // Catch: java.lang.Throwable -> Lde
            if (r9 == 0) goto L10d
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lfe
            r10.<init>(r2)     // Catch: java.lang.Throwable -> Lfe
            defpackage.f04.w(r10, r9)     // Catch: java.lang.Throwable -> L100
            r10.close()     // Catch: java.lang.Throwable -> Lfe
            r9.close()     // Catch: java.lang.Throwable -> Lde
            r2.delete()     // Catch: java.lang.Throwable -> Lde
            goto L13c
        Lfe:
            r10 = move-exception
            goto L107
        L100:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L102
        L102:
            r12 = move-exception
            defpackage.ge7.t(r10, r11)     // Catch: java.lang.Throwable -> Lfe
            throw r12     // Catch: java.lang.Throwable -> Lfe
        L107:
            throw r10     // Catch: java.lang.Throwable -> L108
        L108:
            r11 = move-exception
            defpackage.ge7.t(r9, r10)     // Catch: java.lang.Throwable -> Lde
            throw r11     // Catch: java.lang.Throwable -> Lde
        L10d:
            r2.delete()     // Catch: java.lang.Throwable -> Lde
            me.magnum.melonds.MelonRomDecryptor$a r9 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_WRITING_FILE     // Catch: java.lang.Throwable -> Lde
            return r9
        L113:
            r9 = move-exception
            goto L11c
        L115:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L117
        L117:
            r10 = move-exception
            defpackage.ge7.t(r5, r9)     // Catch: java.lang.Throwable -> L113
            throw r10     // Catch: java.lang.Throwable -> L113
        L11c:
            throw r9     // Catch: java.lang.Throwable -> L11d
        L11d:
            r10 = move-exception
            defpackage.ge7.t(r1, r9)     // Catch: java.lang.Throwable -> Lde
            throw r10     // Catch: java.lang.Throwable -> Lde
        L122:
            me.magnum.melonds.MelonRomDecryptor$a r9 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_READING_FILE     // Catch: java.lang.Throwable -> Lde
            return r9
        L125:
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Fallback decryption failed: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.e(r0, r9)
            me.magnum.melonds.MelonRomDecryptor$a r3 = me.magnum.melonds.MelonRomDecryptor.a.ERROR_READING_FILE
        L13c:
            return r3
        L13d:
            return r2
    }
}
