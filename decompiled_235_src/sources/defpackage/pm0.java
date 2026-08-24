package defpackage;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm0  reason: default package */
/* loaded from: classes.dex */
public final class pm0 {
    public final FileInputStream a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public pm0(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        this.a = fileInputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        onUnmappableCharacter.getClass();
        this.b = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(u90.c.c(8196));
        wrap.getClass();
        this.c = wrap;
        wrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d3, code lost:
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(char[] cArr, int i, int i2) {
        int i3;
        CharsetDecoder charsetDecoder;
        int i4;
        char c;
        if (i2 == 0) {
            return 0;
        }
        if (i >= 0 && i < cArr.length && i2 >= 0 && i + i2 <= cArr.length) {
            boolean z = true;
            if (this.d) {
                cArr[i] = this.e;
                i++;
                i2--;
                this.d = false;
                if (i2 == 0) {
                    return 1;
                }
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i5 = -1;
            if (i2 == 1) {
                if (this.d) {
                    this.d = false;
                    c = this.e;
                } else {
                    char[] cArr2 = new char[2];
                    int a = a(cArr2, 0, 2);
                    if (a != -1) {
                        if (a != 1) {
                            if (a == 2) {
                                this.e = cArr2[1];
                                this.d = true;
                                c = cArr2[0];
                            } else {
                                u34.e(a, "Unreachable state: ");
                                return 0;
                            }
                        } else {
                            c = cArr2[0];
                        }
                    } else {
                        c = 65535;
                    }
                }
                if (c == 65535) {
                    if (i3 == 0) {
                        return -1;
                    }
                    return i3;
                }
                cArr[i] = c;
                return i3 + 1;
            }
            CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
            if (wrap.position() != 0) {
                wrap = wrap.slice();
            }
            CharBuffer charBuffer = wrap;
            boolean z2 = false;
            while (true) {
                charsetDecoder = this.b;
                ByteBuffer byteBuffer = this.c;
                CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
                if (decode.isUnderflow()) {
                    if (z2 || !charBuffer.hasRemaining()) {
                        break;
                    }
                    byteBuffer.compact();
                    try {
                        int limit = byteBuffer.limit();
                        int position = byteBuffer.position();
                        if (position <= limit) {
                            i4 = limit - position;
                        } else {
                            i4 = 0;
                        }
                        int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + position, i4);
                        if (read >= 0) {
                            byteBuffer.position(position + read);
                            byteBuffer.flip();
                            read = byteBuffer.remaining();
                        }
                        if (read < 0) {
                            if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                                break;
                            }
                            charsetDecoder.reset();
                            z2 = true;
                        } else {
                            continue;
                        }
                    } finally {
                        byteBuffer.flip();
                    }
                } else if (decode.isOverflow()) {
                    charBuffer.position();
                    break;
                } else {
                    decode.throwException();
                }
            }
            if (z) {
                charsetDecoder.reset();
            }
            if (charBuffer.position() != 0) {
                i5 = charBuffer.position();
            }
            return i5 + i3;
        }
        StringBuilder q = i61.q(i, i2, "Unexpected arguments: ", ", ", ", ");
        q.append(cArr.length);
        throw new IllegalArgumentException(q.toString().toString());
    }
}
