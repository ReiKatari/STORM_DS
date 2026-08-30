package defpackage;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gk0  reason: default package */
/* loaded from: classes.dex */
public final class gk0 {
    public final FileInputStream a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public gk0(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        this.a = fileInputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        onUnmappableCharacter.getClass();
        this.b = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(n70.c.c(8196));
        wrap.getClass();
        this.c = wrap;
        wrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d3, code lost:
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(char[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk0.a(char[], int, int):int");
    }
}
