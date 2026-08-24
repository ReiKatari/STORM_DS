package me.magnum.melonds;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonRomDecryptor {
    public static final MelonRomDecryptor a = new Object();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface DecryptProgressCallback {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final me.magnum.melonds.a Companion;
        private final int code;
        public static final a SUCCESS = new a("SUCCESS", 0, 0);
        public static final a ALREADY_DECRYPTED = new a("ALREADY_DECRYPTED", 1, 1);
        public static final a ERROR_READING_FILE = new a("ERROR_READING_FILE", 2, -1);
        public static final a ERROR_WRITING_FILE = new a("ERROR_WRITING_FILE", 3, -2);
        public static final a ERROR_NOT_DSI_ROM = new a("ERROR_NOT_DSI_ROM", 4, -3);
        public static final a ERROR_FILE_TOO_SMALL = new a("ERROR_FILE_TOO_SMALL", 5, -4);
        public static final a ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS = new a("ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS", 6, -5);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SUCCESS, ALREADY_DECRYPTED, ERROR_READING_FILE, ERROR_WRITING_FILE, ERROR_NOT_DSI_ROM, ERROR_FILE_TOO_SMALL, ERROR_MODCRYPT_AREA_OUT_OF_BOUNDS};
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, me.magnum.melonds.a] */
        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
            Companion = new Object();
        }

        private a(String str, int i, int i2) {
            this.code = i2;
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final me.magnum.melonds.b Companion;
        private final int code;
        public static final b NOT_ENCRYPTED = new b("NOT_ENCRYPTED", 0, 0);
        public static final b MODCRYPT_ENCRYPTED = new b("MODCRYPT_ENCRYPTED", 1, 1);
        public static final b ERROR_READING_FILE = new b("ERROR_READING_FILE", 2, -1);
        public static final b ERROR_NOT_DSI_ROM = new b("ERROR_NOT_DSI_ROM", 3, -2);
        public static final b ERROR_FILE_TOO_SMALL = new b("ERROR_FILE_TOO_SMALL", 4, -3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NOT_ENCRYPTED, MODCRYPT_ENCRYPTED, ERROR_READING_FILE, ERROR_NOT_DSI_ROM, ERROR_FILE_TOO_SMALL};
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, me.magnum.melonds.b] */
        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
            Companion = new Object();
        }

        private b(String str, int i, int i2) {
            this.code = i2;
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }
    }

    private final native int checkEncryptionFdNative(int i);

    private final native int checkEncryptionNative(String str);

    private final native int decryptRomFdNative(int i, DecryptProgressCallback decryptProgressCallback);

    private final native int decryptRomNative(String str, DecryptProgressCallback decryptProgressCallback);

    public final b a(Context context, Uri uri) {
        b bVar;
        context.getClass();
        uri.getClass();
        if (nb3.k(uri.getScheme(), "dsiware-installed")) {
            return b.NOT_ENCRYPTED;
        }
        String s = l.s(context, uri);
        if (s != null) {
            try {
                me.magnum.melonds.b bVar2 = b.Companion;
                int checkEncryptionNative = checkEncryptionNative(s);
                bVar2.getClass();
                bVar = me.magnum.melonds.b.a(checkEncryptionNative);
            } catch (Throwable unused) {
                bVar = b.ERROR_READING_FILE;
            }
            if (bVar != b.ERROR_READING_FILE) {
                return bVar;
            }
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor != null) {
                me.magnum.melonds.b bVar3 = b.Companion;
                int checkEncryptionFdNative = a.checkEncryptionFdNative(openFileDescriptor.getFd());
                bVar3.getClass();
                b a2 = me.magnum.melonds.b.a(checkEncryptionFdNative);
                openFileDescriptor.close();
                if (a2 != null) {
                    return a2;
                }
            }
            return b.ERROR_READING_FILE;
        } catch (Throwable unused2) {
            return b.ERROR_READING_FILE;
        }
    }

    public final a b(Context context, Uri uri, DecryptProgressCallback decryptProgressCallback) {
        a aVar;
        a aVar2;
        uri.getClass();
        if (nb3.k(uri.getScheme(), "dsiware-installed")) {
            return a.ALREADY_DECRYPTED;
        }
        String s = l.s(context, uri);
        if (s != null) {
            try {
                me.magnum.melonds.a aVar3 = a.Companion;
                int decryptRomNative = decryptRomNative(s, decryptProgressCallback);
                aVar3.getClass();
                aVar = me.magnum.melonds.a.a(decryptRomNative);
            } catch (Throwable unused) {
                aVar = a.ERROR_READING_FILE;
            }
            if (aVar == a.SUCCESS || aVar == a.ALREADY_DECRYPTED) {
                return aVar;
            }
        }
        a aVar4 = null;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
            if (openFileDescriptor != null) {
                me.magnum.melonds.a aVar5 = a.Companion;
                int decryptRomFdNative = a.decryptRomFdNative(openFileDescriptor.getFd(), decryptProgressCallback);
                aVar5.getClass();
                a a2 = me.magnum.melonds.a.a(decryptRomFdNative);
                openFileDescriptor.close();
                aVar4 = a2;
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            Log.w("MelonRomDecryptor", "Direct FD decryption open failed: " + message + ", trying stream copy fallback");
        }
        a aVar6 = a.SUCCESS;
        if (aVar4 != aVar6 && aVar4 != (aVar2 = a.ALREADY_DECRYPTED)) {
            try {
                File cacheDir = context.getCacheDir();
                long currentTimeMillis = System.currentTimeMillis();
                File file = new File(cacheDir, "modcrypt_temp_" + currentTimeMillis + ".nds");
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    f04.w(openInputStream, fileOutputStream);
                    fileOutputStream.close();
                    openInputStream.close();
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    me.magnum.melonds.a aVar7 = a.Companion;
                    int decryptRomNative2 = decryptRomNative(absolutePath, decryptProgressCallback);
                    aVar7.getClass();
                    a a3 = me.magnum.melonds.a.a(decryptRomNative2);
                    if (a3 != aVar6 && a3 != aVar2) {
                        file.delete();
                        return a3;
                    }
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
                    if (openOutputStream != null) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        f04.w(fileInputStream, openOutputStream);
                        fileInputStream.close();
                        openOutputStream.close();
                        file.delete();
                        return aVar6;
                    }
                    file.delete();
                    return a.ERROR_WRITING_FILE;
                }
                return a.ERROR_READING_FILE;
            } catch (Throwable th2) {
                String message2 = th2.getMessage();
                Log.e("MelonRomDecryptor", "Fallback decryption failed: " + message2);
                return a.ERROR_READING_FILE;
            }
        }
        return aVar4;
    }
}
