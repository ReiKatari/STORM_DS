package jc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import q8.r;
/* loaded from: classes.dex */
public abstract class j extends pc.a {
    public static boolean R(File file) {
        i iVar = i.BOTTOM_UP;
        iVar.getClass();
        f fVar = new f(new h(0, file, iVar));
        while (true) {
            boolean z10 = true;
            while (fVar.hasNext()) {
                File file2 = (File) fVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static String S(File file) {
        Charset charset = vc.a.f13781a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String Q = r.Q(inputStreamReader);
            inputStreamReader.close();
            return Q;
        } finally {
        }
    }

    public static File T(File file) {
        int i2;
        boolean z10;
        int g02;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        char c4 = File.separatorChar;
        boolean z11 = false;
        int g03 = vc.h.g0(c4, 0, 4, path);
        if (g03 == 0) {
            if (path.length() > 1 && path.charAt(1) == c4 && (g02 = vc.h.g0(c4, 2, 4, path)) >= 0) {
                int g04 = vc.h.g0(c4, g02 + 1, 4, path);
                if (g04 >= 0) {
                    i2 = g04 + 1;
                } else {
                    i2 = path.length();
                }
            } else {
                i2 = 1;
            }
        } else if (g03 > 0 && path.charAt(g03 - 1) == ':') {
            i2 = g03 + 1;
        } else if (g03 == -1 && vc.h.b0(path, ':')) {
            i2 = path.length();
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() == 0) {
            z11 = true;
        }
        if (!z11 && !vc.h.b0(file3, c4)) {
            return new File(file3 + c4 + file2);
        }
        return new File(file3 + file2);
    }

    public static void U(File file, String str) {
        Charset charset = vc.a.f13781a;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            V(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void V(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z10;
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i2 = 0;
        int i10 = 0;
        while (i2 < str.length()) {
            int min = Math.min(8192 - i10, str.length() - i2);
            int i11 = i2 + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i2, i11, array, i10);
            allocate.limit(min + i10);
            i10 = 1;
            if (i11 == str.length()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z10).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i10 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i2 = i11;
            } else {
                a0.j.p("Check failed.");
                return;
            }
        }
    }
}
