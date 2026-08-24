package defpackage;

import java.nio.charset.Charset;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp6  reason: default package */
/* loaded from: classes.dex */
public enum dp6 {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");
    
    private final String lineSeparator;

    dp6(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.lineSeparator = str;
    }

    public byte[] getBytes(Charset charset) {
        return this.lineSeparator.getBytes(charset);
    }

    public String getString() {
        return this.lineSeparator;
    }
}
