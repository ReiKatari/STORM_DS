package defpackage;

import java.nio.charset.Charset;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nd6  reason: default package */
/* loaded from: classes.dex */
public enum nd6 {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");
    
    private final String lineSeparator;

    nd6(String str) {
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
