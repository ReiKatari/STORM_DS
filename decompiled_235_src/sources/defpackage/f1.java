package defpackage;

import java.io.InputStream;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f1  reason: default package */
/* loaded from: classes.dex */
public final class f1 extends nc1 {
    public final Object t;

    public f1(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "origin");
        this.t = inputStream;
    }

    public final String toString() {
        return getClass().getSimpleName() + "[" + this.t.toString() + "]";
    }
}
