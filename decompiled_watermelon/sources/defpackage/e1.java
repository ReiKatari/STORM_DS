package defpackage;

import java.io.InputStream;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e1  reason: default package */
/* loaded from: classes.dex */
public final class e1 extends mh7 {
    public final Object u;

    public e1(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "origin");
        this.u = inputStream;
    }

    public final String toString() {
        return getClass().getSimpleName() + "[" + this.u.toString() + "]";
    }
}
