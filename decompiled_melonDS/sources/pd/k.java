package pd;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final FileInputStream f11593a;

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f11594b;

    /* renamed from: c  reason: collision with root package name */
    public final ByteBuffer f11595c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11596d;

    /* renamed from: e  reason: collision with root package name */
    public char f11597e;

    public k(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        this.f11593a = fileInputStream;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        onUnmappableCharacter.getClass();
        this.f11594b = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(e.L.g(8196));
        wrap.getClass();
        this.f11595c = wrap;
        wrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d4, code lost:
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(char[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.k.a(char[], int, int):int");
    }
}
